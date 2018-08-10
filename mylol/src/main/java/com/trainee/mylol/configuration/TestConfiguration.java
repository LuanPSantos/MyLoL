package com.trainee.mylol.configuration;

import com.trainee.mylol.client.SummonerClient;
import org.mockito.Mockito;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

@Profile("test")
@Configuration
public class TestConfiguration {

    @Bean
    @Primary
    public SummonerClient summonerClient(){
        return Mockito.mock(SummonerClient.class);
    }
}
