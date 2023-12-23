package com.scaler.UserService.dto;

import lombok.Data;

@Data
public class SignUpRequestDTO {
    private String email;
    private String password;
}
