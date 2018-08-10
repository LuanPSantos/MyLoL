package com.trainee.mylol.service;

import com.trainee.mylol.client.ChampionMasteryClient;
import com.trainee.mylol.client.LeagueClient;
import com.trainee.mylol.client.StaticDataClient;
import com.trainee.mylol.client.SummonerClient;
import com.trainee.mylol.model.LeaguePosition;
import com.trainee.mylol.model.Summoner;
import com.trainee.mylol.model.riot.ChampionDTO;
import com.trainee.mylol.model.riot.ChampionMasteryDTO;
import com.trainee.mylol.model.riot.LeaguePositionDTO;
import com.trainee.mylol.model.riot.SummonerDTO;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class SummonerService {
    
    private final String SUFFIX = "_0.jpg";

    @Autowired
    private SummonerClient summonerClient;
    @Autowired
    private LeagueClient leagueClient;
    @Autowired
    private ChampionMasteryClient championMasteryClient;
    @Autowired
    private StaticDataClient staticDataClient;
    
    @Value("${mylol.url.base}")
    private String urlBase;
    @Value("${mylol.url.static.path}")
    private String staticPath;

    public Summoner getSummonerByName(String name) {
        SummonerDTO summonerDTO = summonerClient.getSummonerByName(name);
        Set<LeaguePositionDTO> leaguePositionDTOs = leagueClient.getLeaguePositionBySummonerId(summonerDTO.getId());
        List<ChampionMasteryDTO> championMasteryDTOs = championMasteryClient.getLeaguePositionBySummonerId(summonerDTO.getId());        
        ChampionMasteryDTO championMasteryDTO = championMasteryDTOs.get(0);
        ChampionDTO championDTO = staticDataClient.getChampionByChampionId(championMasteryDTO.getChampionId());
        

        Summoner summoner = new Summoner();
        parseSummonerDtoToSummoner(summonerDTO, summoner);
        parseLeaguePositionDtoToSummoner(leaguePositionDTOs, summoner);
        parseChampionDtoToSummoner(championDTO, summoner);

        return summoner;
    }

    private void parseSummonerDtoToSummoner(SummonerDTO summonerDTO, Summoner summoner) {
        if (summonerDTO != null) {
            summoner.setId(summonerDTO.getId());
            summoner.setName(summonerDTO.getName());
            summoner.setProfileIconId(summonerDTO.getProfileIconId());
            summoner.setSummonerLevel(summonerDTO.getSummonerLevel());
            summoner.setAccountId(summonerDTO.getAccountId());
        }
    }

    private void parseLeaguePositionDtoToSummoner(Set<LeaguePositionDTO> leaguePositionDTOs, Summoner summoner) {
        Set<LeaguePosition> leaguePositions = new HashSet<>();
        if(leaguePositionDTOs != null){
            leaguePositionDTOs.forEach(leaguePositionDTO -> {
                LeaguePosition leaguePosition = new LeaguePosition();
                
                leaguePosition.setQueueType(leaguePositionDTO.getQueueType());
                leaguePosition.setWins(leaguePositionDTO.getWins());
                leaguePosition.setLosses(leaguePositionDTO.getLosses());
                leaguePosition.setLeagueName(leaguePositionDTO.getLeagueName());
                leaguePosition.setRank(leaguePositionDTO.getRank());
                leaguePosition.setTier(leaguePositionDTO.getTier());
                leaguePosition.setLeaguePoints(leaguePositionDTO.getLeaguePoints());
                
                leaguePositions.add(leaguePosition);
            });
        }
        
        summoner.setLeaguePositions(leaguePositions);
    }

    private void parseChampionDtoToSummoner(ChampionDTO championDTO, Summoner summoner) {
        if(championDTO != null){
            summoner.setSplashURL(urlBase + staticPath + championDTO.getKey() + SUFFIX);
        }
    }
}
