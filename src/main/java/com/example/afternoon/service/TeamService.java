package com.example.afternoon.service;

import com.example.afternoon.dto.TeamDto;
import com.example.afternoon.entity.Team;
import java.util.List;

public interface TeamService {

  public Team create(TeamDto teamDto);

  public TeamDto getTeamById(Long id);

  public List<TeamDto> getAllTeams();
}
