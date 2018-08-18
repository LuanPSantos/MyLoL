package com.trainee.mylol.client;

import static com.trainee.mylol.constant.RequestConstants.ACCEPT;
import static com.trainee.mylol.constant.RequestConstants.API_KEY;
import com.trainee.mylol.model.riot.LeaguePositionDTO;
import java.util.Set;
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
public class LeagueClient {

    @Value("${mylol.apikey}")
    private String key;
    @Value("${mylol.url.league.bysummonerid}")
    private String bySummonerIdUrl;
    
    @Autowired
    private RestTemplate restTemplate;

    public Set<LeaguePositionDTO> getLeaguePositionBySummonerId(Long summonerId) {

        HttpHeaders headers = new HttpHeaders();
        headers.add(ACCEPT, MediaType.APPLICATION_JSON_VALUE);

        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(bySummonerIdUrl)
                .path(String.valueOf(summonerId))
                .queryParam(API_KEY, key);

        HttpEntity<?> entity = new HttpEntity<>(headers);

        HttpEntity<Set<LeaguePositionDTO>> response = restTemplate.exchange(
                builder.toUriString(),
                HttpMethod.GET,
                entity,
                new ParameterizedTypeReference<Set<LeaguePositionDTO>>() {}
        );

        return response.getBody();
    }
}
