package com.diggavi.ipldashboardbackend.batchprocessing;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import com.diggavi.ipldashboardbackend.entity.Match;
import com.diggavi.ipldashboardbackend.model.MatchInput;

import org.springframework.batch.item.ItemProcessor;

public class MatchInputProcessor implements ItemProcessor<MatchInput, Match> {

    @Override
    public Match process(MatchInput matchInput) throws Exception {
        Match match = new Match();
        match.setId(matchInput.getId());
        match.setCity(matchInput.getCity());
        match.setPlayerOfMatch(matchInput.getPlayerOfMatch());
        match.setVenue(matchInput.getVenue());
        match.setNeutralVenue(matchInput.getNeutralVenue());
        match.setTossWinner(matchInput.getTossWinner());
        match.setTossDecision(matchInput.getTossDecision());
        match.setWinner(matchInput.getWinner());
        match.setResult(matchInput.getResult());
        match.setResultMargin(matchInput.getResultMargin());
        match.setEliminator(matchInput.getEliminator());
        match.setMethod(matchInput.getMethod());
        match.setUmpire1(matchInput.getUmpire1());
        match.setUmpire2(matchInput.getUmpire2());

        String firstTeamToBat, secondTeamToBat;
        if ((matchInput.getTeam1().equals(matchInput.getTossWinner()) && "bat".equals(matchInput.getTossDecision()))
                || matchInput.getTeam2().equals(matchInput.getTossWinner())
                        && "field".equals(matchInput.getTossDecision())) {
            firstTeamToBat = matchInput.getTeam1();
            secondTeamToBat = matchInput.getTeam2();
        } else {
            firstTeamToBat = matchInput.getTeam2();
            secondTeamToBat = matchInput.getTeam1();
        }
        match.setFirstTeamToBat(firstTeamToBat);
        match.setSecondTeamToBat(secondTeamToBat);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate date = LocalDate.parse(matchInput.getDate(), formatter);
        match.setDate(date);

        return match;
    }

}
