package org.bdp.com.bo.service;

import java.util.List;

import org.bdp.com.bo.model.entity.FUsuario;

public interface IUsuarioService {
    List<FUsuario> listarTodos();
    FUsuario obtenerUsuarioPorSecUsuario(Long secUsuario);
}
