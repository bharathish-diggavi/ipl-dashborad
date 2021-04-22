package com.diggavi.ipldashboardbackend.restcontrollers;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import com.diggavi.ipldashboardbackend.entity.Team;
import com.diggavi.ipldashboardbackend.services.MainService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class TeamController {

    private final MainService mainService;

    @Autowired
    public TeamController(MainService mainService) {
        this.mainService = mainService;
    }

    @GetMapping(value = "/teams")
    public List<Team> getMethodName(@RequestParam(defaultValue = "") String param) {
        return mainService.getAllTeams();
    }

}
