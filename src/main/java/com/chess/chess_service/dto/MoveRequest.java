package com.chess.chess_service.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MoveRequest {
    
    @NotNull(message = "Game ID is required")
    private Long gameId;
    
    @NotBlank(message = "From square is required")
    @Pattern(regexp = "^[a-h][1-8]$", message = "From square must be valid (e.g., e2)")
    private String fromSquare;
    
    @NotBlank(message = "To square is required")
    @Pattern(regexp = "^[a-h][1-8]$", message = "To square must be valid (e.g., e4)")
    private String toSquare;
    
    // Optional: Client can send SAN if they've calculated it
    private String san;
    
    // Optional: For pawn promotion (e.g., "Q" for Queen)
    private String promotion;
}
