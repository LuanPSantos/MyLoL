package com.trainee.mylol.service;

import com.trainee.mylol.MylolApplication;
import com.trainee.mylol.client.SummonerClient;
import com.trainee.mylol.model.Summoner;
import com.trainee.mylol.model.riot.SummonerDTO;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ActiveProfiles("test")
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = MylolApplication.class)
public class SummonerServiceTest {

    @Autowired
    private SummonerClient summonerClient;

    @Autowired
    private SummonerService summonerService;

    @Test
    public void shouldReturnTheRequestedObject() {
//        SummonerDTO summonerDTO = getSummonerDTO();
//        Mockito.when(summonerClient.getSummonerByName("0hora")).thenReturn(summonerDTO);
//
//        Summoner summoner = summonerService.getSummonerByName("0hora");
//
//        assertEquals(summoner.getAccountId(), summoner.getAccountId());
//        assertEquals(summoner.getId(), summoner.getId());
//        assertEquals(summoner.getName(), summoner.getName());
//        assertEquals(summoner.getProfileIconId(), summoner.getProfileIconId());
//        assertEquals(summoner.getSummonerLevel(), summoner.getSummonerLevel());
    }

    private SummonerDTO getSummonerDTO() {
        SummonerDTO summonerDTO = new SummonerDTO();
        summonerDTO.setAccountId(1l);
        summonerDTO.setId(2l);
        summonerDTO.setName("0hora");
        summonerDTO.setProfileIconId(3);
        summonerDTO.setRevisionDate(4l);
        summonerDTO.setSummonerLevel(5l);

        return summonerDTO;
    }
}
