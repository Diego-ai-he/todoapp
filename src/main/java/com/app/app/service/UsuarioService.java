package com.app.app.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.app.app.model.Usuarios;
import com.app.app.repository.UsuarioRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UsuarioService {

        private final UsuarioRepository userRepo;

        public List<Usuarios> getUsers(){
            return userRepo.getRepoUsuarios();
        }


}
