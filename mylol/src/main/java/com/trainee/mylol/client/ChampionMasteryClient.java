package com.trainee.mylol.client;

import static com.trainee.mylol.constant.RequestConstants.ACCEPT;
import static com.trainee.mylol.constant.RequestConstants.API_KEY;
import com.trainee.mylol.model.riot.ChampionMasteryDTO;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

@Service
public class ChampionMasteryClient {

    @Value("${mylol.apikey}")
    private String key;
    @Value("${mylol.url.championmastery.bysummonerid}")
    private String champitonMasteryBySummonerId;
    
    @Autowired
    private RestTemplate restTemplate;

    public List<ChampionMasteryDTO> getLeaguePositionBySummonerId(Long summonerId) {

        HttpHeaders headers = new HttpHeaders();
        headers.add(ACCEPT, MediaType.APPLICATION_JSON_VALUE);

        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(champitonMasteryBySummonerId)
                .path(String.valueOf(summonerId))
                .queryParam(API_KEY, key);

        HttpEntity<?> entity = new HttpEntity<>(headers);

        HttpEntity<List<ChampionMasteryDTO>> response = restTemplate.exchange(
                builder.toUriString(),
                HttpMethod.GET,
                entity,
                new ParameterizedTypeReference<List<ChampionMasteryDTO>>() {}
        );

        return response.getBody();
    }
}
