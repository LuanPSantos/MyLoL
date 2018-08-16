package com.trainee.mylol.model;

import java.util.Objects;
import java.util.Set;

public class Summoner {

    private Long id;
    private Long accountId;
    private String name;
    private String profileIconURL;
    private Long summonerLevel;
    private Set<LeaguePosition> leaguePositions;
    private String splashURL;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProfileIconURL() {
        return profileIconURL;
    }

    public void setProfileIconURL(String profileIconURL) {
        this.profileIconURL = profileIconURL;
    }

    public Long getSummonerLevel() {
        return summonerLevel;
    }

    public void setSummonerLevel(Long summonerLevel) {
        this.summonerLevel = summonerLevel;
    }

    public Set<LeaguePosition> getLeaguePositions() {
        return leaguePositions;
    }

    public void setLeaguePositions(Set<LeaguePosition> leaguePositions) {
        this.leaguePositions = leaguePositions;
    }

    public String getSplashURL() {
        return splashURL;
    }

    public void setSplashURL(String splashURL) {
        this.splashURL = splashURL;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.id);
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
        final Summoner other = (Summoner) obj;
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return "Summoner{" + "id=" + id + ", accountId=" + accountId + ", name=" + name + ", profileIconURL=" + profileIconURL + ", summonerLevel=" + summonerLevel + ", leaguePositions=" + leaguePositions + ", splashURL=" + splashURL + '}';
    }
}
