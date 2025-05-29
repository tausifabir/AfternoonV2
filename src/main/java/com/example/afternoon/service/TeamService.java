package com.example.afternoon.service;

import com.example.afternoon.dto.TeamDto;
import com.example.afternoon.entity.Team;
import java.util.List;

public interface TeamService {

  Team create(TeamDto teamDto);

  TeamDto getTeamById(Long id);

  List<TeamDto> getAllTeams();
}
