package com.chess.chess_service.dto;

import com.chess.chess_service.model.GameStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GameDetailResponse {
    
    private Long id;
    private Long whitePlayerId;
    private Long blackPlayerId;
    private String fen;
    private GameStatus status;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    
    // Include all moves for game replay
    private List<MoveResponse> moves;
}
