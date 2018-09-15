package com.trainee.mylol.service;

import com.trainee.mylol.model.riot.ChampionDTO;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;
import org.springframework.stereotype.Service;

/**
 *
 * @author Luan
 */
@Service
public class StaticDataService {

    private Map<String, ChampionDTO> champions = new LinkedHashMap<>();

    public ChampionDTO getChampionById(Long id) {
        
        ChampionDTO championDTO = champions.values().stream().filter(champion -> Objects.equals(champion.getKey(), id)).collect(Collectors.toList()).get(0);
        
        return championDTO;
    }

    public void setChampions(Map<String, ChampionDTO> champions) {
        this.champions = champions;
    }
}
