package com.trainee.mylol.client;

import com.fasterxml.jackson.databind.ObjectMapper;
import static com.trainee.mylol.constant.RequestConstants.ACCEPT;
import static com.trainee.mylol.constant.RequestConstants.API_KEY;
import static com.trainee.mylol.constant.RequestConstants.DATA_BY_ID;
import static com.trainee.mylol.constant.RequestConstants.LOCALE;
import static com.trainee.mylol.constant.RequestConstants.TAGS;
import com.trainee.mylol.model.riot.ChampionDTO;
import com.trainee.mylol.model.riot.ChampionListDTO;
import com.trainee.mylol.model.riot.JsonChampionDTO;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

@Service
public class StaticDataClient {

    private final String PT_BR = "pt_BR";
    private final String INFO = "info";

    @Value("${mylol.apikey}")
    private String key;
    @Value("${mylol.url.staticdata.champions}")
    private String champions;

    @Autowired
    private RestTemplate restTemplate;

    @Cacheable("champions")
    public ChampionDTO getChampionByChampionId(Long championId) {

        HttpHeaders headers = new HttpHeaders();
        headers.add(ACCEPT, MediaType.APPLICATION_JSON_VALUE);

        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(champions)
                .path(String.valueOf(championId))
                .queryParam(LOCALE, PT_BR)
                .queryParam(TAGS, INFO)
                .queryParam(API_KEY, key);

        HttpEntity<?> entity = new HttpEntity<>(headers);

        HttpEntity<ChampionDTO> response = restTemplate.exchange(
                builder.toUriString(),
                HttpMethod.GET,
                entity,
                ChampionDTO.class
        );

        return response.getBody();
    }
    
    public ChampionListDTO getChampions() throws IOException {

        HttpHeaders headers = new HttpHeaders();
        headers.add(ACCEPT, MediaType.APPLICATION_JSON_UTF8_VALUE);

        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(champions)
                .queryParam(API_KEY, key);

        HttpEntity<?> entity = new HttpEntity<>(headers);

        
        HttpEntity<String> response = restTemplate.exchange(
                builder.toUriString(),
                HttpMethod.GET,
                entity,
                String.class
        );
        
        String json = response.getBody();
        
        ObjectMapper mapper = new ObjectMapper();

        JsonChampionDTO readValue = mapper.readValue(json, JsonChampionDTO.class);
        ChampionListDTO championListDTO = new ChampionListDTO();
        championListDTO.setData(readValue.getData());

        return championListDTO;
    }
}
