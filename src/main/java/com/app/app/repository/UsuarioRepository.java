package com.app.app.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.app.app.model.Usuarios;

@Repository
public class UsuarioRepository {

    public List<Usuarios> repoUsuarios = new ArrayList<>();

    public UsuarioRepository(){
        this.repoUsuarios.add(new Usuarios("Juan",31));

    }

    public List<Usuarios> getRepoUsuarios() {
        return repoUsuarios;
    }

    
}
