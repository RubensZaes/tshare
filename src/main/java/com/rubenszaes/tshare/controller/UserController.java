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
    @Operation(summary = "Listar Todos os Usuários", tags = "User")
    @GetMapping
    public ResponseEntity<List<User>> listarTodos() {
        return ResponseEntity.ok(userService.listarTodos());
    }

    @Operation(summary = "Buscar Usuários por ID", tags = "User")
    @GetMapping("/{id}")
    public ResponseEntity<User> buscarPorId(@PathVariable Long id) {
        User user = userService.buscarPorId(id);
        return user != null ? ResponseEntity.ok(user) : ResponseEntity.notFound().build();
    }

    @Operation(summary = "Salvar um novo Usuário", tags = "User")
    @PostMapping
    public ResponseEntity<List<User>> save(@RequestBody User user) {
        userService.save(user);
        return ResponseEntity.status(HttpStatus.CREATED).body(userService.listarTodos());
    }

    @Operation(summary = "Atualizar Usuário", tags = "User")
    @PutMapping("/{id}")
    public ResponseEntity<User> atualizar(@PathVariable Long id, @RequestBody User user) {
        return ResponseEntity.ok(userService.atualizar(id, user));
    }

    @Operation(summary = "Deletar Usuário", tags = "User")
    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        userService.deletar(id);
    }

}
