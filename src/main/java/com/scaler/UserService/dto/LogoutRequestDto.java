package com.scaler.UserService.dto;

import lombok.Data;

@Data
public class LogoutRequestDto {
    private String token;
    private Long userId;
}
