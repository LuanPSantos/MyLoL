package com.trainee.mylol.model.riot;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ChampionDTO {

    private InfoDTO info;
    private List<String> enemytips;
    private StatsDTO stats;
    private String name;
    private String title;
    private ImageDTO image;
    private List<String> tags;
    private String partype;
    private List<SkinDTO> skins;
    private PassiveDTO passive;
    private List<RecommendedDTO> recommended;
    private List<String> allytips;
    private Long key; // Key na verdade é o ID numerico
    private String lore;
    private String id; // o ID é a key Stirng... vai saber porque eles fizeram assim!
    private String blurb;
    private List<ChampionSpellDTO> spells;

    public InfoDTO getInfo() {
        return info;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public Long getKey() {
        return key;
    }

    public void setKey(Long key) {
        this.key = key;
    }

    public String getLore() {
        return lore;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBlurb() {
        return blurb;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 17 * hash + this.key.intValue();
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ChampionDTO other = (ChampionDTO) obj;
        return (this.id == null ? other.id == null : this.id.equals(other.id));
    }

    @Override
    public String toString() {
        return "ChampionDTO{" + "info=" + info + ", enemytips=" + enemytips + ", stats=" + stats + ", name=" + name + ", title=" + title + ", image=" + image + ", tags=" + tags + ", partype=" + partype + ", skins=" + skins + ", passive=" + passive + ", recommended=" + recommended + ", allytips=" + allytips + ", key=" + key + ", lore=" + lore + ", id=" + id + ", blurb=" + blurb + ", spells=" + spells + '}';
    }
}
