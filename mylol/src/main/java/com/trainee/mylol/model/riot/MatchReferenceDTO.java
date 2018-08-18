package com.trainee.mylol.model.riot;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MatchReferenceDTO {

    private String lane;
    private long gameId;
    private Long champion;
    private String platformId;
    private int season;
    private int queue;
    private String role;
    private long timestamp;

    public String getLane() {
        return lane;
    }

    public void setLane(String lane) {
        this.lane = lane;
    }

    public long getGameId() {
        return gameId;
    }

    public void setGameId(long gameId) {
        this.gameId = gameId;
    }

    public Long getChampion() {
        return champion;
    }

    public void setChampion(Long champion) {
        this.champion = champion;
    }

    public String getPlatformId() {
        return platformId;
    }

    public void setPlatformId(String platformId) {
        this.platformId = platformId;
    }

    public int getSeason() {
        return season;
    }

    public void setSeason(int season) {
        this.season = season;
    }

    public int getQueue() {
        return queue;
    }

    public void setQueue(int queue) {
        this.queue = queue;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + (int) (this.gameId ^ (this.gameId >>> 32));
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
        final MatchReferenceDTO other = (MatchReferenceDTO) obj;
        return this.gameId == other.gameId;
    }

    @Override
    public String toString() {
        return "MatchReferenceDTO{" + "lane=" + lane + ", gameId=" + gameId + ", champion=" + champion + ", platformId=" + platformId + ", season=" + season + ", queue=" + queue + ", role=" + role + ", timestamp=" + timestamp + '}';
    }
}
