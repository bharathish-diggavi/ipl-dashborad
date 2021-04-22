package com.diggavi.ipldashboardbackend.repositories;

import com.diggavi.ipldashboardbackend.entity.Match;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MatchRepository extends JpaRepository<Match, String> {

}
