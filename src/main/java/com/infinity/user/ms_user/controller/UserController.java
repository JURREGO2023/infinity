package com.infinity.user.ms_user.controller;


import com.infinity.user.ms_user.model.UserEntity;
import com.infinity.user.ms_user.service.IUserServices;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/user")
@AllArgsConstructor
public class UserController {

    private final IUserServices userServices;


    @PostMapping
    public ResponseEntity<UserEntity> create(@RequestBody UserEntity user){
      return this.userServices.create(user);
    }
}
