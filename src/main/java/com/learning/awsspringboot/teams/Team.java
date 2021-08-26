package com.learning.awsspringboot.teams;

import com.learning.awsspringboot.players.Player;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
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
public class Team {

  @Id
  @GeneratedValue
  @Column(name = "team_id")
  private int team_id;

  @NotNull
  @Column(name = "team_name")
  private String teamName;

  @NotNull
  @Column(name = "establishment_year")
  private String establishmentYear;

  @OneToMany(fetch = FetchType.EAGER, mappedBy = "playerTeam")
  private List<Player> teamSquad;
}
