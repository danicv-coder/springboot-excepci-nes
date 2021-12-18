package com.springboot.app.controllers;

import com.springboot.app.models.domain.Usuario;
import com.springboot.app.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.UUID;

@Controller
public class AppController {
    @Autowired
    private UsuarioService usuarioService;

    @GetMapping("/index")
    public String index() {
        //   Integer valor = 100 / 0;
        Integer valor = Integer.parseInt("10x");
        return "index";
    }

    @GetMapping("/ver/{id}")
    public String ver(@PathVariable Integer id, Model model) {
        Usuario usuario = usuarioService.porId(id);
        model.addAttribute("usuario", usuario);
        model.addAttribute("titulo", "Detalle de usuario encontrado");

        return "ver";
    }
}
