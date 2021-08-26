package com.learning.awsspringboot.players;

import com.learning.awsspringboot.teams.Team;
import java.util.UUID;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "player_table")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
public class Player {

  @Id
  @GeneratedValue
  @Column(name = "user_id")
  private UUID playerId;

  @NotNull
  @Column(name = "player_name")
  private String playerName;

  @NotNull
  @Column(name = "player_surname")
  private String playerSurname;

  @Column(name = "player_goals")
  private int playerGoalsCount;

  @ManyToOne
  @JoinColumn(name = "team_id", referencedColumnName = "team_id")
  private Team playerTeam;
}
