package com.soccer.repository;

import com.soccer.domain.Player;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerRepository  extends JpaRepository<Player, Long> {
}
