package com.diggavi.ipldashboardbackend.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TEAM_DETAILS")
public class Team {

    @Id
    @GeneratedValue
    private long id;
    private String name;
    private long totlaMatches;
    private long totalWins;

    public Team() {
    }

    public Team(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getTotlaMatches() {
        return totlaMatches;
    }

    public void setTotlaMatches(long totlaMatches) {
        this.totlaMatches = totlaMatches;
    }

    public long getTotalWins() {
        return totalWins;
    }

    public void setTotalWins(long totalWins) {
        this.totalWins = totalWins;
    }

    @Override
    public String toString() {
        return "Team [id=" + id + ", name=" + name + ", totalWins=" + totalWins + ", totlaMatches=" + totlaMatches
                + "]";
    }
}
