package com.chess.chess_service.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MoveResponse {
    
    private Long id;
    private Long gameId;
    private Integer moveNumber;
    private String fromSquare;
    private String toSquare;
    private String san;
    private String fenAfterMove;
    private LocalDateTime timestamp;
}
