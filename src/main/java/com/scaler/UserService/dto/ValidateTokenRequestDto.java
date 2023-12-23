package com.scaler.UserService.dto;

import lombok.Data;

@Data
public class ValidateTokenRequestDto {
    private Long userId;
    private String token;
}
