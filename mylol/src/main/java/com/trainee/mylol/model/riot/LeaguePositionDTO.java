package com.trainee.mylol.model.riot;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.Objects;

@JsonIgnoreProperties(ignoreUnknown = true)
public class LeaguePositionDTO {

    private String rank;
    private String queueType;
    private boolean hotStreak;
    private MiniSeriesDTO miniSeries;
    private int wins;
    private boolean veteran;
    private int losses;
    private boolean freshBlood;
    private String leagueId;
    private String playerOrTeamName;
    private boolean inactive;
    private String playerOrTeamId;
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

    public boolean isHotStreak() {
        return hotStreak;
    }

    public void setHotStreak(boolean hotStreak) {
        this.hotStreak = hotStreak;
    }

    public MiniSeriesDTO getMiniSeries() {
        return miniSeries;
    }

    public void setMiniSeries(MiniSeriesDTO miniSeries) {
        this.miniSeries = miniSeries;
    }

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public boolean isVeteran() {
        return veteran;
    }

    public void setVeteran(boolean veteran) {
        this.veteran = veteran;
    }

    public int getLosses() {
        return losses;
    }

    public void setLosses(int losses) {
        this.losses = losses;
    }

    public boolean isFreshBlood() {
        return freshBlood;
    }

    public void setFreshBlood(boolean freshBlood) {
        this.freshBlood = freshBlood;
    }

    public String getLeagueId() {
        return leagueId;
    }

    public void setLeagueId(String leagueId) {
        this.leagueId = leagueId;
    }

    public String getPlayerOrTeamName() {
        return playerOrTeamName;
    }

    public void setPlayerOrTeamName(String playerOrTeamName) {
        this.playerOrTeamName = playerOrTeamName;
    }

    public boolean isInactive() {
        return inactive;
    }

    public void setInactive(boolean inactive) {
        this.inactive = inactive;
    }

    public String getPlayerOrTeamId() {
        return playerOrTeamId;
    }

    public void setPlayerOrTeamId(String playerOrTeamId) {
        this.playerOrTeamId = playerOrTeamId;
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
        int hash = 5;
        hash = 59 * hash + Objects.hashCode(this.rank);
        hash = 59 * hash + Objects.hashCode(this.queueType);
        hash = 59 * hash + (this.hotStreak ? 1 : 0);
        hash = 59 * hash + Objects.hashCode(this.miniSeries);
        hash = 59 * hash + this.wins;
        hash = 59 * hash + (this.veteran ? 1 : 0);
        hash = 59 * hash + this.losses;
        hash = 59 * hash + (this.freshBlood ? 1 : 0);
        hash = 59 * hash + Objects.hashCode(this.leagueId);
        hash = 59 * hash + Objects.hashCode(this.playerOrTeamName);
        hash = 59 * hash + (this.inactive ? 1 : 0);
        hash = 59 * hash + Objects.hashCode(this.playerOrTeamId);
        hash = 59 * hash + Objects.hashCode(this.leagueName);
        hash = 59 * hash + Objects.hashCode(this.tier);
        hash = 59 * hash + this.leaguePoints;
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
        final LeaguePositionDTO other = (LeaguePositionDTO) obj;
        if (this.hotStreak != other.hotStreak) {
            return false;
        }
        if (this.wins != other.wins) {
            return false;
        }
        if (this.veteran != other.veteran) {
            return false;
        }
        if (this.losses != other.losses) {
            return false;
        }
        if (this.freshBlood != other.freshBlood) {
            return false;
        }
        if (this.inactive != other.inactive) {
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
        if (!Objects.equals(this.leagueId, other.leagueId)) {
            return false;
        }
        if (!Objects.equals(this.playerOrTeamName, other.playerOrTeamName)) {
            return false;
        }
        if (!Objects.equals(this.playerOrTeamId, other.playerOrTeamId)) {
            return false;
        }
        if (!Objects.equals(this.leagueName, other.leagueName)) {
            return false;
        }
        if (!Objects.equals(this.tier, other.tier)) {
            return false;
        }
        return Objects.equals(this.miniSeries, other.miniSeries);
    }

    @Override
    public String toString() {
        return "LeaguePositionDTO{" + "rank=" + rank + ", queueType=" + queueType + ", hotStreak=" + hotStreak + ", miniSeries=" + miniSeries + ", wins=" + wins + ", veteran=" + veteran + ", losses=" + losses + ", freshBlood=" + freshBlood + ", leagueId=" + leagueId + ", playerOrTeamName=" + playerOrTeamName + ", inactive=" + inactive + ", playerOrTeamId=" + playerOrTeamId + ", leagueName=" + leagueName + ", tier=" + tier + ", leaguePoints=" + leaguePoints + '}';
    }
}
