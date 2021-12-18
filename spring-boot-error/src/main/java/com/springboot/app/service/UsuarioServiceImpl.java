package com.springboot.app.service;

import com.springboot.app.models.domain.Usuario;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UsuarioServiceImpl implements UsuarioService {
    private List<Usuario> listar;

    public UsuarioServiceImpl(List<Usuario> listar) {
        this.listar = new ArrayList<>();
        listar.add(new Usuario(1, "Daniel", "Calderon"));
        listar.add(new Usuario(2, "Alexander", "Finol"));
        listar.add(new Usuario(3, "Juan", "Rangel"));
    }

    @Override
    public List<Usuario> listar() {
        return this.listar;
    }

    @Override
    public Usuario porId(Integer id) {
        Usuario resultado = null;
        for (Usuario u : this.listar) {
            if (u.getId().equals(id)) {
                resultado = u;
                break;
            }
        }
        return resultado;
    }
}
