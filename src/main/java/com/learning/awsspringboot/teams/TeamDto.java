package com.learning.awsspringboot.teams;

import com.learning.awsspringboot.players.PlayerDto;
import java.util.List;
import java.util.stream.Collectors;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class TeamDto {

  private String teamName;
  private String establishmentYear;
  private List<PlayerDto> teamSquad;

  public static TeamDto from(TeamEntity teamEntity) {
    return TeamDto.builder()
        .teamName(teamEntity.getTeamName())
        .establishmentYear(teamEntity.getEstablishmentYear())
        .teamSquad(teamEntity.getTeamSquad().stream()
            .map(PlayerDto::from)
            .collect(Collectors.toList()))
        .build();
  }
}
