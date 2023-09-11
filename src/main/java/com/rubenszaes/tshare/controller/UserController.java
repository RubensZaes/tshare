package com.rubenszaes.tshare.controller;

import com.rubenszaes.tshare.model.User;
import com.rubenszaes.tshare.service.UserService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("users")
public class UserController {
    @Autowired
    private UserService userService;

//    @GetMapping
//    public List<User> listarTodos() {
//        return userService.listarTodos();
//    }
    @Operation(summary = "Save a new User", tags = "User")
    @PostMapping
    public ResponseEntity<User> save(@RequestBody User user) {
        userService.save(user);
        return ResponseEntity.status(HttpStatus.CREATED).body((User) userService.listarTodos());
    }

}
