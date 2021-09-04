package com.learning.awsspringboot.teams;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TeamRepository extends JpaRepository<TeamEntity, Integer> {
}
