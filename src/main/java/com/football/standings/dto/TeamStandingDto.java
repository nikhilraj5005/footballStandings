package com.football.standings.dto;

import com.football.standings.model.TeamStanding;

import java.util.Objects;
import lombok.Data;

@Data
public class TeamStandingDto {

  private String country;
  private String league;
  private String team;
  private int overallPosition;

  public static TeamStandingDto from(TeamStanding teamStanding) {
    TeamStandingDto dto = new TeamStandingDto();
    if (Objects.nonNull(teamStanding)) {
      dto.setCountry("(" + teamStanding.getCountryId() + ") - " + teamStanding.getCountryName());
      dto.setLeague("(" + teamStanding.getLeagueId() + ") - " + teamStanding.getLeagueName());
      dto.setTeam("(" + teamStanding.getTeamId() + ") - " + teamStanding.getTeamName());
      dto.setOverallPosition(teamStanding.getOverallPosition());
    }
    return dto;
  }
}
