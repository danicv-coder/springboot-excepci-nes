package com.springboot.app.service;

import com.springboot.app.models.domain.Usuario;

import java.util.List;

public interface UsuarioService {
    List<Usuario> listar();

    Usuario porId(Integer id);
}
