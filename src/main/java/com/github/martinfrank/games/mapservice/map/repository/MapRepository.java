package com.github.martinfrank.games.mapservice.map.repository;

import com.github.martinfrank.games.mapservice.map.model.Map;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MapRepository extends JpaRepository<Map, Long> {
}
