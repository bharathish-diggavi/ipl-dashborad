package com.diggavi.ipldashboardbackend.batchprocessing;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.diggavi.ipldashboardbackend.entity.Match;
import com.diggavi.ipldashboardbackend.entity.Team;
import com.diggavi.ipldashboardbackend.repositories.MatchRepository;
import com.diggavi.ipldashboardbackend.repositories.TeamRepository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.BatchStatus;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.listener.JobExecutionListenerSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class JobCompletionNotificationListener extends JobExecutionListenerSupport {

    private static final Logger log = LoggerFactory.getLogger(JobCompletionNotificationListener.class);

    private final MatchRepository matchRepository;
    private final TeamRepository teamRepository;

    @Autowired
    public JobCompletionNotificationListener(MatchRepository matchRepository, TeamRepository teamRepository) {
        this.matchRepository = matchRepository;
        this.teamRepository = teamRepository;
    }

    @Override
    public void afterJob(JobExecution jobExecution) {
        if (jobExecution.getStatus() == BatchStatus.COMPLETED) {
            log.info("!!! JOB FINISHED! Time to verify the results");

            List<Match> list = matchRepository.findAll();
            Map<String, Team> map = new HashMap<>();
            list.forEach(this::logMatch);

            list.stream().forEach(match -> {
                if (map.containsKey(match.getFirstTeamToBat())) {
                    Team team = map.get(match.getFirstTeamToBat());
                    team.setTotlaMatches(team.getTotlaMatches() + 1);
                    if (match.getFirstTeamToBat().equals(match.getWinner())) {
                        team.setTotalWins(team.getTotalWins() + 1);
                    }
                    map.put(match.getFirstTeamToBat(), team);
                } else {
                    map.put(match.getFirstTeamToBat(), new Team(match.getFirstTeamToBat()));
                }
                if (map.containsKey(match.getSecondTeamToBat())) {
                    Team team = map.get(match.getSecondTeamToBat());
                    team.setTotlaMatches(team.getTotlaMatches() + 1);
                    if (match.getSecondTeamToBat().equals(match.getWinner())) {
                        team.setTotalWins(team.getTotalWins() + 1);
                    }
                    map.put(match.getSecondTeamToBat(), team);
                } else {
                    map.put(match.getSecondTeamToBat(), new Team(match.getSecondTeamToBat()));
                }
            });

            map.forEach((k, v) -> teamRepository.save(v));

        }
    }

    private void logMatch(Match match) {
        log.info(match.toString());
    }
}
