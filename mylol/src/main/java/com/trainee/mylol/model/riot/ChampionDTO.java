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
    private String key;
    private String lore;
    private int id;
    private String blurb;
    private List<ChampionSpellDTO> spells;

    public InfoDTO getInfo() {
        return info;
    }

    public void setInfo(InfoDTO info) {
        this.info = info;
    }

    public List<String> getEnemytips() {
        return enemytips;
    }

    public void setEnemytips(List<String> enemytips) {
        this.enemytips = enemytips;
    }

    public StatsDTO getStats() {
        return stats;
    }

    public void setStats(StatsDTO stats) {
        this.stats = stats;
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

    public void setTitle(String title) {
        this.title = title;
    }

    public ImageDTO getImage() {
        return image;
    }

    public void setImage(ImageDTO image) {
        this.image = image;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public String getPartype() {
        return partype;
    }

    public void setPartype(String partype) {
        this.partype = partype;
    }

    public List<SkinDTO> getSkins() {
        return skins;
    }

    public void setSkins(List<SkinDTO> skins) {
        this.skins = skins;
    }

    public PassiveDTO getPassive() {
        return passive;
    }

    public void setPassive(PassiveDTO passive) {
        this.passive = passive;
    }

    public List<RecommendedDTO> getRecommended() {
        return recommended;
    }

    public void setRecommended(List<RecommendedDTO> recommended) {
        this.recommended = recommended;
    }

    public List<String> getAllytips() {
        return allytips;
    }

    public void setAllytips(List<String> allytips) {
        this.allytips = allytips;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getLore() {
        return lore;
    }

    public void setLore(String lore) {
        this.lore = lore;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBlurb() {
        return blurb;
    }

    public void setBlurb(String blurb) {
        this.blurb = blurb;
    }

    public List<ChampionSpellDTO> getSpells() {
        return spells;
    }

    public void setSpells(List<ChampionSpellDTO> spells) {
        this.spells = spells;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 17 * hash + this.id;
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
        return this.id == other.id;
    }

    @Override
    public String toString() {
        return "ChampionDTO{" + "info=" + info + ", enemytips=" + enemytips + ", stats=" + stats + ", name=" + name + ", title=" + title + ", image=" + image + ", tags=" + tags + ", partype=" + partype + ", skins=" + skins + ", passive=" + passive + ", recommended=" + recommended + ", allytips=" + allytips + ", key=" + key + ", lore=" + lore + ", id=" + id + ", blurb=" + blurb + ", spells=" + spells + '}';
    }
}
