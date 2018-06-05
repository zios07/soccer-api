package com.soccer.repository;

import com.soccer.domain.Participation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ParticipationRepository extends JpaRepository<Participation, Long> {


  List<Participation> findByPlayerId(Long id);
}
