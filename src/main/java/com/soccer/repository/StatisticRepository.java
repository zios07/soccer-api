package com.soccer.repository;

import com.soccer.domain.Statistic;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StatisticRepository extends JpaRepository<Statistic, Long>{
}
