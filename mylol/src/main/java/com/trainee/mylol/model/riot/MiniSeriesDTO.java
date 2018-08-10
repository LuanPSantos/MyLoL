package com.trainee.mylol.model.riot;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.Objects;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MiniSeriesDTO {

    private int wins;
    private int losses;
    private int target;
    private String progress;

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

    public int getTarget() {
        return target;
    }

    public void setTarget(int target) {
        this.target = target;
    }

    public String getProgress() {
        return progress;
    }

    public void setProgress(String progress) {
        this.progress = progress;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + this.wins;
        hash = 79 * hash + this.losses;
        hash = 79 * hash + this.target;
        hash = 79 * hash + Objects.hashCode(this.progress);
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
        final MiniSeriesDTO other = (MiniSeriesDTO) obj;
        if (this.wins != other.wins) {
            return false;
        }
        if (this.losses != other.losses) {
            return false;
        }
        if (this.target != other.target) {
            return false;
        }
        if (!Objects.equals(this.progress, other.progress)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "MiniSeriesDTO{" + "wins=" + wins + ", losses=" + losses + ", target=" + target + ", progress=" + progress + '}';
    }

}
