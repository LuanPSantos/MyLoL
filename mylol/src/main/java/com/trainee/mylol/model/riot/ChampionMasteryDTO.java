package com.trainee.mylol.model.riot;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ChampionMasteryDTO {

    private boolean chestGranted;
    private int championLevel;
    private int championPoints;
    private long championId;
    private long playerId;
    private long championPointsUntilNextLevel;
    private int tokensEarned;
    private long championPointsSinceLastLevel;
    private long lastPlayTime;

    public boolean isChestGranted() {
        return chestGranted;
    }

    public void setChestGranted(boolean chestGranted) {
        this.chestGranted = chestGranted;
    }

    public int getChampionLevel() {
        return championLevel;
    }

    public void setChampionLevel(int championLevel) {
        this.championLevel = championLevel;
    }

    public int getChampionPoints() {
        return championPoints;
    }

    public void setChampionPoints(int championPoints) {
        this.championPoints = championPoints;
    }

    public long getChampionId() {
        return championId;
    }

    public void setChampionId(long championId) {
        this.championId = championId;
    }

    public long getPlayerId() {
        return playerId;
    }

    public void setPlayerId(long playerId) {
        this.playerId = playerId;
    }

    public long getChampionPointsUntilNextLevel() {
        return championPointsUntilNextLevel;
    }

    public void setChampionPointsUntilNextLevel(long championPointsUntilNextLevel) {
        this.championPointsUntilNextLevel = championPointsUntilNextLevel;
    }

    public int getTokensEarned() {
        return tokensEarned;
    }

    public void setTokensEarned(int tokensEarned) {
        this.tokensEarned = tokensEarned;
    }

    public long getChampionPointsSinceLastLevel() {
        return championPointsSinceLastLevel;
    }

    public void setChampionPointsSinceLastLevel(long championPointsSinceLastLevel) {
        this.championPointsSinceLastLevel = championPointsSinceLastLevel;
    }

    public long getLastPlayTime() {
        return lastPlayTime;
    }

    public void setLastPlayTime(long lastPlayTime) {
        this.lastPlayTime = lastPlayTime;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + (this.chestGranted ? 1 : 0);
        hash = 97 * hash + this.championLevel;
        hash = 97 * hash + this.championPoints;
        hash = 97 * hash + (int) (this.championId ^ (this.championId >>> 32));
        hash = 97 * hash + (int) (this.playerId ^ (this.playerId >>> 32));
        hash = 97 * hash + (int) (this.championPointsUntilNextLevel ^ (this.championPointsUntilNextLevel >>> 32));
        hash = 97 * hash + this.tokensEarned;
        hash = 97 * hash + (int) (this.championPointsSinceLastLevel ^ (this.championPointsSinceLastLevel >>> 32));
        hash = 97 * hash + (int) (this.lastPlayTime ^ (this.lastPlayTime >>> 32));
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
        final ChampionMasteryDTO other = (ChampionMasteryDTO) obj;
        if (this.chestGranted != other.chestGranted) {
            return false;
        }
        if (this.championLevel != other.championLevel) {
            return false;
        }
        if (this.championPoints != other.championPoints) {
            return false;
        }
        if (this.championId != other.championId) {
            return false;
        }
        if (this.playerId != other.playerId) {
            return false;
        }
        if (this.championPointsUntilNextLevel != other.championPointsUntilNextLevel) {
            return false;
        }
        if (this.tokensEarned != other.tokensEarned) {
            return false;
        }
        if (this.championPointsSinceLastLevel != other.championPointsSinceLastLevel) {
            return false;
        }
        return this.lastPlayTime == other.lastPlayTime;
    }

    @Override
    public String toString() {
        return "ChampionMasteryDTO{" + "chestGranted=" + chestGranted + ", championLevel=" + championLevel + ", championPoints=" + championPoints + ", championId=" + championId + ", playerId=" + playerId + ", championPointsUntilNextLevel=" + championPointsUntilNextLevel + ", tokensEarned=" + tokensEarned + ", championPointsSinceLastLevel=" + championPointsSinceLastLevel + ", lastPlayTime=" + lastPlayTime + '}';
    }
}
