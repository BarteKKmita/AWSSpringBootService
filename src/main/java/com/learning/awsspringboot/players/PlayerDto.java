package com.learning.awsspringboot.players;

import com.learning.awsspringboot.teams.TeamEntity;
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
public class PlayerDto {

  private String playerName;
  private String playerSurname;
  private int playerGoalsCount;
  private String teamName;

  public static PlayerDto from(PlayerEntity player) {
    return PlayerDto.builder()
        .playerName(player.getPlayerName())
        .playerSurname(player.getPlayerSurname())
        .playerGoalsCount(player.getPlayerGoalsCount())
        .teamName(player.getPlayerTeam().getTeamName())
        .build();
  }
}
