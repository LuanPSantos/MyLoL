package com.trainee.mylol.model.riot;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.Map;

/**
 *
 * @author luan
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ChampionListDTO {

    private Map<String, ChampionDTO> data;

    public Map<String, ChampionDTO> getData() {
        return data;
    }

    public void setData(Map<String, ChampionDTO> data) {
        this.data = data;
    }
}
