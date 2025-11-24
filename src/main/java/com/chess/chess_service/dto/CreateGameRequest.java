package com.chess.chess_service.dto;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CreateGameRequest {
    
    @NotNull(message = "White player ID is required")
    private Long whitePlayerId;
    
    @NotNull(message = "Black player ID is required")
    private Long blackPlayerId;
}