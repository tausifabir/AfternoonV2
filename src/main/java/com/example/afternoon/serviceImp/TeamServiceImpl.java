package com.example.afternoon.serviceImp;

import com.example.afternoon.dto.TeamDto;
import com.example.afternoon.entity.Team;
import com.example.afternoon.repository.TeamRepository;
import com.example.afternoon.service.TeamService;
import com.fasterxml.jackson.databind.util.BeanUtil;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class TeamServiceImpl implements TeamService {

  private final TeamRepository teamRepository;

  public TeamServiceImpl(TeamRepository teamRepository) {
    this.teamRepository = teamRepository;
  }


  @Override
  public Team create(TeamDto teamDto) {


    return null;
  }

  @Override
  public TeamDto getTeamById(Long id) {
    return null;
  }

  @Override
  public List<TeamDto> getAllTeams() {
    return List.of();
  }
}
