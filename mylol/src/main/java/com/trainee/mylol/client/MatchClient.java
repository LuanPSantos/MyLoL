package com.trainee.mylol.client;

import static com.trainee.mylol.constant.RequestConstants.ACCEPT;
import static com.trainee.mylol.constant.RequestConstants.API_KEY;
import com.trainee.mylol.model.riot.MatchlistDTO;
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
public class MatchClient {

    @Value("${mylol.apikey}")
    private String key;
    @Value("${mylol.url.match.byaccountid}")
    private String matchByAccountId;

    @Autowired
    private RestTemplate restTemplate;

    public MatchlistDTO getMatchList(Long accountId, Integer beginIndex, Integer endIndex) {

        HttpHeaders headers = new HttpHeaders();
        headers.add(ACCEPT, MediaType.APPLICATION_JSON_VALUE);

        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(matchByAccountId)
                .path(String.valueOf(accountId))
                .queryParam("beginIndex", beginIndex)
                .queryParam("endIndex", endIndex)
                .queryParam(API_KEY, key);

        HttpEntity<?> entity = new HttpEntity<>(headers);

        HttpEntity<MatchlistDTO> response = restTemplate.exchange(
                builder.toUriString(),
                HttpMethod.GET,
                entity,
                MatchlistDTO.class
        );

        return response.getBody();
    }
}
