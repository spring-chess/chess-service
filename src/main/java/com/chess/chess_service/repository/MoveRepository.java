package com.chess.chess_service.repository;

import com.chess.chess_service.model.Move;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MoveRepository extends JpaRepository<Move, Long> {
}