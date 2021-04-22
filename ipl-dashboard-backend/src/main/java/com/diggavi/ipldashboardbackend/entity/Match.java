package com.diggavi.ipldashboardbackend.entity;

import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Match
 */
@Entity
@Table(name = "MATCH")
public class Match {

    @Id
    private String id;
    private String city;
    private LocalDate date;
    private String playerOfMatch;
    private String venue;
    private String neutralVenue;
    private String firstTeamToBat;
    private String secondTeamToBat;
    private String tossWinner;
    private String tossDecision;
    private String winner;
    private String result;
    private String resultMargin;
    private String eliminator;
    private String method;
    private String umpire1;
    private String umpire2;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getPlayerOfMatch() {
        return playerOfMatch;
    }

    public void setPlayerOfMatch(String playerOfMatch) {
        this.playerOfMatch = playerOfMatch;
    }

    public String getVenue() {
        return venue;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }

    public String getNeutralVenue() {
        return neutralVenue;
    }

    public void setNeutralVenue(String neutralVenue) {
        this.neutralVenue = neutralVenue;
    }

    public String getFirstTeamToBat() {
        return firstTeamToBat;
    }

    public void setFirstTeamToBat(String firstTeamToBat) {
        this.firstTeamToBat = firstTeamToBat;
    }

    public String getSecondTeamToBat() {
        return secondTeamToBat;
    }

    public void setSecondTeamToBat(String secondTeamToBat) {
        this.secondTeamToBat = secondTeamToBat;
    }

    public String getTossWinner() {
        return tossWinner;
    }

    public void setTossWinner(String tossWinner) {
        this.tossWinner = tossWinner;
    }

    public String getTossDecision() {
        return tossDecision;
    }

    public void setTossDecision(String tossDecision) {
        this.tossDecision = tossDecision;
    }

    public String getWinner() {
        return winner;
    }

    public void setWinner(String winner) {
        this.winner = winner;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getResultMargin() {
        return resultMargin;
    }

    public void setResultMargin(String resultMargin) {
        this.resultMargin = resultMargin;
    }

    public String getEliminator() {
        return eliminator;
    }

    public void setEliminator(String eliminator) {
        this.eliminator = eliminator;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getUmpire1() {
        return umpire1;
    }

    public void setUmpire1(String umpire1) {
        this.umpire1 = umpire1;
    }

    public String getUmpire2() {
        return umpire2;
    }

    public void setUmpire2(String umpire2) {
        this.umpire2 = umpire2;
    }

    @Override
    public String toString() {
        return "Match [firstTeamToBat=" + firstTeamToBat + ", secondTeamToBat=" + secondTeamToBat + ", tossWinner="
                + tossWinner + "]";
    }

}