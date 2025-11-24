package com.chess.chess_service.dto;

import com.chess.chess_service.model.GameStatus;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

// for ending games

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UpdateGameStatusRequest {
    
    @NotNull(message = "Game ID is required")
    private Long gameId;
    
    @NotNull(message = "Status is required")
    private GameStatus status;
    
    // Optional: For resignation, specify which player resigned
    private Long resignedPlayerId;
}
