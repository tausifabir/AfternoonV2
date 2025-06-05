package com.example.afternoon.serviceImp;

import com.example.afternoon.dto.TeamDto;
import com.example.afternoon.entity.Team;
import com.example.afternoon.exception.ResourceNotFoundException;
import com.example.afternoon.repository.TeamRepository;
import com.example.afternoon.service.TeamService;
import java.util.ArrayList;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor

public class TeamServiceImpl implements TeamService {

  private final TeamRepository teamRepository;


  @Override
  public Team create(TeamDto teamDto) {
    Team team = new Team();
    BeanUtils.copyProperties(teamDto, team);
    return this.teamRepository.save(team);
  }

  @Override
  public TeamDto getTeamById(Long id) {
    Team team = this.teamRepository
            .findById(id).orElseThrow(() -> new ResourceNotFoundException("Team not found by this id:" + id));
    TeamDto teamDto = new TeamDto();
    BeanUtils.copyProperties(team, teamDto);
    return teamDto;
  }

  @Override
  public List<TeamDto> getAllTeams() {
    List<Team> teamList =
        teamRepository.findAll();

    List<TeamDto> teamDtoList = new ArrayList<>();

    if (teamList.isEmpty()) {
      return teamDtoList;
    }
    teamList.forEach(team -> {
      TeamDto teamDto = new TeamDto();
      BeanUtils.copyProperties(team, teamDto);
      teamDtoList.add(teamDto);
    });

    return teamDtoList;
  }
}
