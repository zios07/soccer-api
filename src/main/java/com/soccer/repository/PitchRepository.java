package com.soccer.repository;

import com.soccer.domain.Pitch;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PitchRepository  extends JpaRepository<Pitch, Long> {
}
