package com.chess.chess_service.repository;

import com.chess.chess_service.model.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {
}