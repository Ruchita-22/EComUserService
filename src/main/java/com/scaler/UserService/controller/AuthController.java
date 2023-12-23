package com.scaler.UserService.controller;

import com.scaler.UserService.dto.LoginRequestDto;
import com.scaler.UserService.dto.SignUpRequestDTO;
import com.scaler.UserService.dto.UserDto;
import com.scaler.UserService.model.Session;
import com.scaler.UserService.model.User;
import com.scaler.UserService.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("auth")
public class AuthController {
    @Autowired
    AuthService authService;

    @PostMapping("signup")
    public ResponseEntity<UserDto> signUp(@RequestBody SignUpRequestDTO request){
        UserDto userDto = authService.signUp(request.getEmail(),request.getPassword());
        return new ResponseEntity<>(userDto, HttpStatus.OK);
    }
    @PostMapping("login")
    public ResponseEntity<UserDto> login(@RequestBody LoginRequestDto request){
        return authService.login(request.getEmail(),request.getPassword());
    }
    @GetMapping("session")
    public ResponseEntity<List<Session>> getAllSession(){
        return authService.getAllSession();
    }

    @GetMapping("user")
    public ResponseEntity<List<User>> getAllUser(){
        return authService.getAllUser();
    }


}
