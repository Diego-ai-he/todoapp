package com.app.app.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.app.model.Usuarios;
import com.app.app.repository.UsuarioRepository;
import com.app.app.service.UsuarioService;

import lombok.RequiredArgsConstructor;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/api/empleados")
@RequiredArgsConstructor
public class controlUsuarios {

    private final UsuarioService userService;

    @GetMapping("/status")
    public String getStatus() {
        return "La API funciona correctamente";
    }
    
    @GetMapping("/Usuarios")
    public List<Usuarios> obtenerUsuarios() {
        return userService.getUsers();
    }
    




}
