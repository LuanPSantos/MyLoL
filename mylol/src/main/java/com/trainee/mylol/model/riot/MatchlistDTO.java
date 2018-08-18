package com.trainee.mylol.model.riot;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;
import java.util.Objects;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MatchlistDTO {

    private List<MatchReferenceDTO> matches;
    private int totalGames;
    private int startIndex;
    private int endIndex;

    public List<MatchReferenceDTO> getMatches() {
        return matches;
    }

    public void setMatches(List<MatchReferenceDTO> matches) {
        this.matches = matches;
    }

    public int getTotalGames() {
        return totalGames;
    }

    public void setTotalGames(int totalGames) {
        this.totalGames = totalGames;
    }

    public int getStartIndex() {
        return startIndex;
    }

    public void setStartIndex(int startIndex) {
        this.startIndex = startIndex;
    }

    public int getEndIndex() {
        return endIndex;
    }

    public void setEndIndex(int endIndex) {
        this.endIndex = endIndex;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Objects.hashCode(this.matches);
        hash = 31 * hash + this.totalGames;
        hash = 31 * hash + this.startIndex;
        hash = 31 * hash + this.endIndex;
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
        final MatchlistDTO other = (MatchlistDTO) obj;
        if (this.totalGames != other.totalGames) {
            return false;
        }
        if (this.startIndex != other.startIndex) {
            return false;
        }
        if (this.endIndex != other.endIndex) {
            return false;
        }
        if (!Objects.equals(this.matches, other.matches)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "MatchlistDTO{" + "matches=" + matches + ", totalGames=" + totalGames + ", startIndex=" + startIndex + ", endIndex=" + endIndex + '}';
    }
}
