package com.dsa.tracker.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dsa.tracker.entity.Problem;

public interface ProblemRepository extends JpaRepository<Problem, Long>{
List<Problem> findByDifficulty (String difficulty);
List<Problem> findByPlatform (String platform);
long countByDifficulty(String difficulty);


}
