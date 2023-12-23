package com.scaler.UserService.dto;

import lombok.Data;

import java.util.List;

@Data
public class SetUserRolesRequestDto {
    private List<Long> roleIds;
}
