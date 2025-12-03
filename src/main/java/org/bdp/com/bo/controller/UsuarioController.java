package org.bdp.com.bo.controller;

import java.util.List;

import org.bdp.com.bo.model.entity.FUsuario;
import org.bdp.com.bo.service.IUsuarioService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
    private final IUsuarioService iUsuarioService;

    public UsuarioController(IUsuarioService iUsuarioService) {
        this.iUsuarioService = iUsuarioService;
    }

    @GetMapping("/listar-todos-usuarios")
    public List<FUsuario> listarUsuarios() {
        return iUsuarioService.listarTodos();
    }

    @GetMapping("/obtener-usuario/{secUsuario}")
    public ResponseEntity<FUsuario> obtenerUsuarioPorSecUsuario(@PathVariable Long secUsuario) {
        FUsuario resp = iUsuarioService.obtenerUsuarioPorSecUsuario(secUsuario);
        return ResponseEntity.ok(resp);
    }
}
