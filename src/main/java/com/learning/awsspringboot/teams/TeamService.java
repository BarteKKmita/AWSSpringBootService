package com.learning.awsspringboot.teams;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeamService {

  @Autowired
  private TeamRepository teamRepository;

  public TeamDto getTeamById(Integer id) {
    TeamEntity team = teamRepository.getById(id);
    return TeamDto.from(team);
  }
}
