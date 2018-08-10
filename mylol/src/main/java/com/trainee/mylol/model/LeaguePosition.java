package com.trainee.mylol.model;

import java.util.Objects;

public class LeaguePosition {

    private String rank;
    private String queueType;
    private int wins;
    private int losses;
    private String leagueName;
    private String tier;
    private int leaguePoints;

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getQueueType() {
        return queueType;
    }

    public void setQueueType(String queueType) {
        this.queueType = queueType;
    }

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public int getLosses() {
        return losses;
    }

    public void setLosses(int losses) {
        this.losses = losses;
    }

    public String getLeagueName() {
        return leagueName;
    }

    public void setLeagueName(String leagueName) {
        this.leagueName = leagueName;
    }

    public String getTier() {
        return tier;
    }

    public void setTier(String tier) {
        this.tier = tier;
    }

    public int getLeaguePoints() {
        return leaguePoints;
    }

    public void setLeaguePoints(int leaguePoints) {
        this.leaguePoints = leaguePoints;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 13 * hash + Objects.hashCode(this.rank);
        hash = 13 * hash + Objects.hashCode(this.queueType);
        hash = 13 * hash + this.wins;
        hash = 13 * hash + this.losses;
        hash = 13 * hash + Objects.hashCode(this.leagueName);
        hash = 13 * hash + Objects.hashCode(this.tier);
        hash = 13 * hash + this.leaguePoints;
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
        final LeaguePosition other = (LeaguePosition) obj;
        if (this.wins != other.wins) {
            return false;
        }
        if (this.losses != other.losses) {
            return false;
        }
        if (this.leaguePoints != other.leaguePoints) {
            return false;
        }
        if (!Objects.equals(this.rank, other.rank)) {
            return false;
        }
        if (!Objects.equals(this.queueType, other.queueType)) {
            return false;
        }
        if (!Objects.equals(this.leagueName, other.leagueName)) {
            return false;
        }
        return Objects.equals(this.tier, other.tier);
    }

    @Override
    public String toString() {
        return "LeaguePosition{" + "rank=" + rank + ", queueType=" + queueType + ", wins=" + wins + ", losses=" + losses + ", leagueName=" + leagueName + ", tier=" + tier + ", leaguePoints=" + leaguePoints + '}';
    }

}
