package com.trainee.mylol;

import com.trainee.mylol.client.StaticDataClient;
import com.trainee.mylol.service.StaticDataService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableCaching
public class MylolApplication {

    public static void main(String[] args) {
        SpringApplication.run(MylolApplication.class, args);
    }

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }

    @Bean
    public CommandLineRunner loadChampions(StaticDataService staticDataService, StaticDataClient staticDataClient) {
        return (args) -> {
            staticDataService.setChampions(staticDataClient.getChampions().getData());
        };
    }

}
