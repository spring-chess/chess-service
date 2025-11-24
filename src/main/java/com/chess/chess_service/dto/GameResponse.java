package com.chess.chess_service.dto;

import com.chess.chess_service.model.GameStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GameResponse {
    
    private Long id;
    private Long whitePlayerId;
    private Long blackPlayerId;
    private String fen;
    private GameStatus status;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    
    // Optional: Include move count or last move
    private String lastMove;
    private Integer moveCount;
}