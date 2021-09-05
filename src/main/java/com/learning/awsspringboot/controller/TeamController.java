package com.learning.awsspringboot.controller;

import com.learning.awsspringboot.teams.TeamDto;
import com.learning.awsspringboot.teams.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/team")
public class TeamController {

  @Autowired
  private TeamService teamService;

  @GetMapping("/{id}")
  @ResponseStatus(value = HttpStatus.NOT_FOUND)
  public ResponseEntity<TeamDto> getTeamById(@PathVariable("id") Integer teamId) {
    return new ResponseEntity(teamService.getTeamById(teamId), HttpStatus.OK);
  }
}
