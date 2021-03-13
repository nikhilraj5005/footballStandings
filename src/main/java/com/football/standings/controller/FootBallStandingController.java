package com.football.standings.controller;

import com.football.standings.dto.TeamStandingDto;

import com.football.standings.model.TeamStandingRequest;
import com.football.standings.service.TeamStandingService;

import javax.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/api/service/v1/team/standing")
public class FootBallStandingController {

  @Autowired
  TeamStandingService teamStandingService;

  @GetMapping
  public ResponseEntity<TeamStandingDto> getStandings(@Valid TeamStandingRequest teamStandingRequest) {
    log.info("Request {}", teamStandingRequest.toString());
    return ResponseEntity.ok(teamStandingService.getTeamStanding(teamStandingRequest));
  }


}
