package com.trainee.mylol.model;

import java.util.Objects;

public class MatchItem {

    private String championName;
    private String championImageURL;
    private Long timestamp;
    private String gameURL;

    public String getChampionName() {
        return championName;
    }

    public void setChampionName(String championName) {
        this.championName = championName;
    }

    public String getChampionImageURL() {
        return championImageURL;
    }

    public void setChampionImageURL(String championImageURL) {
        this.championImageURL = championImageURL;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getGameURL() {
        return gameURL;
    }

    public void setGameURL(String gameURL) {
        this.gameURL = gameURL;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 47 * hash + Objects.hashCode(this.championName);
        hash = 47 * hash + Objects.hashCode(this.championImageURL);
        hash = 47 * hash + Objects.hashCode(this.timestamp);
        hash = 47 * hash + Objects.hashCode(this.gameURL);
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
        final MatchItem other = (MatchItem) obj;
        if (!Objects.equals(this.championImageURL, other.championImageURL)) {
            return false;
        }
        if (!Objects.equals(this.championName, other.championName)) {
            return false;
        }
        if (!Objects.equals(this.timestamp, other.timestamp)) {
            return false;
        }
        if (!Objects.equals(this.gameURL, other.gameURL)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "MatchItem{" + "championName=" + championName + ", championImageURL=" + championImageURL + ", timestamp=" + timestamp + ", gameURL=" + gameURL + '}';
    }
}
