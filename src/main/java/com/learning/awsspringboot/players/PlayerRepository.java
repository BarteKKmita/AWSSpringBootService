package com.learning.awsspringboot.players;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerRepository extends JpaRepository<PlayerEntity, UUID> {
}
