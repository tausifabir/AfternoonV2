package com.example.afternoon.controller;

import com.example.afternoon.dto.TeamDto;
import com.example.afternoon.entity.Team;
import com.example.afternoon.service.TeamService;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/team")
public class TeamResource {

  private final TeamService teamService;

  public TeamResource(TeamService teamService) {
    this.teamService = teamService;
  }

  @PostMapping("/create")
  public Team createTeam(@RequestBody TeamDto teamDto) {
    return teamService.create(teamDto);
  }

  @GetMapping("/get/{id}")
  public TeamDto getTeamById(@PathVariable Long id) {
    return teamService.getTeamById(id);
  }

  @GetMapping("/all")
  public List<TeamDto> getAllTeams() {
    return teamService.getAllTeams();
  }
}
