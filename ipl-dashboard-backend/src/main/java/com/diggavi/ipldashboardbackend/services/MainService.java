package com.diggavi.ipldashboardbackend.services;

import java.util.List;

import com.diggavi.ipldashboardbackend.entity.Team;
import com.diggavi.ipldashboardbackend.repositories.MatchRepository;
import com.diggavi.ipldashboardbackend.repositories.TeamRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MainService {

    private final TeamRepository teamRepository;
    private final MatchRepository matchRepository;

    @Autowired
    public MainService(TeamRepository teamRepository, MatchRepository matchRepository) {
        this.teamRepository = teamRepository;
        this.matchRepository = matchRepository;
    }

    public List<Team> getAllTeams() {
        return teamRepository.findAll();
    }

}
