package com.trainee.mylol.client;


import static com.trainee.mylol.client.HeaderConstants.ACCEPT;
import static com.trainee.mylol.client.HeaderConstants.API_KEY;
import com.trainee.mylol.model.riot.SummonerDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

@Service
public class SummonerClient {
    
    @Value("${mylol.apikey}")
    private String key;
    @Value("${mylol.url.summoner.byname}")
    private String byNameUrl;
    
    @Autowired
    private RestTemplate restTemplate;

    public SummonerDTO getSummonerByName(String name) {

        HttpHeaders headers = new HttpHeaders();
        headers.add(ACCEPT, MediaType.APPLICATION_JSON_VALUE);

        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(byNameUrl)
                .path(name.replaceAll(" ", ""))
                .queryParam(API_KEY, key);

        HttpEntity<?> entity = new HttpEntity<>(headers);

        HttpEntity<SummonerDTO> response = restTemplate.exchange(
                builder.toUriString(),
                HttpMethod.GET,
                entity,
                SummonerDTO.class
        );

        return response.getBody();
    }
}
