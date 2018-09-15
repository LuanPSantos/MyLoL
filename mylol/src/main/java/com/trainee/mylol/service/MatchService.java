package com.trainee.mylol.service;

import com.trainee.mylol.client.MatchClient;
import static com.trainee.mylol.constant.FileConstants.SUFFIX_PNG;
import com.trainee.mylol.model.MatchItem;
import com.trainee.mylol.model.riot.ChampionDTO;
import com.trainee.mylol.model.riot.MatchReferenceDTO;
import com.trainee.mylol.model.riot.MatchlistDTO;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class MatchService {

    @Value("${mylol.url.static.path.champion}")
    private String staticPathChampion;
    @Value("${mylol.url.match.bygameid}")
    private String matchByGameId;
    @Value("${mylol.url.base}")
    private String urlBase;

    @Autowired
    private MatchClient matchClient;
    @Autowired
    private StaticDataService staticDataService;

    public List<MatchItem> getMatchList(Long accountId, Integer beginIndex, Integer endIndex) {
        MatchlistDTO matchList = matchClient.getMatchList(accountId, beginIndex, endIndex);

        List<MatchItem> matchItems = matchList.getMatches().stream().map((MatchReferenceDTO match) -> {
            MatchItem matchItem = new MatchItem();

            ChampionDTO championDTO = staticDataService.getChampionById(match.getChampion());
            matchItem.setTimestamp(match.getTimestamp());
            matchItem.setChampionImageURL(urlBase + staticPathChampion + championDTO.getId() + SUFFIX_PNG);
            matchItem.setChampionName(championDTO.getName());
            matchItem.setGameURL(matchByGameId + accountId);

            return matchItem;
        }).collect(Collectors.toList());

        return matchItems;
    }
}
