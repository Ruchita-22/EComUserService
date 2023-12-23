package com.scaler.UserService.model;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity
public class Role extends BaseModel{
    private String role;
}
