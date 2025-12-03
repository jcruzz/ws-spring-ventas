package org.bdp.com.bo.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.bdp.com.bo.model.entity.FUsuario;
import org.bdp.com.bo.repository.IUsuarioRepository;
import org.bdp.com.bo.service.IUsuarioService;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServiceImpl implements IUsuarioService {

    private final IUsuarioRepository iUsuarioRepository;

    public UsuarioServiceImpl(IUsuarioRepository iUsuarioRepository) {
        this.iUsuarioRepository = iUsuarioRepository;
    }

    @Override
    public List<FUsuario> listarTodos() {
        List<FUsuario> resp = new ArrayList<>();
        try {
            resp = iUsuarioRepository.findAll();
        } catch (Exception e) {
            System.out.println("Error en obtener todos los usuarios" +
                    e);
        }
        return resp;
    }

    @Override
    public FUsuario obtenerUsuarioPorSecUsuario(Long secUsuario) {
        FUsuario resp = new FUsuario();
        try {
            resp = iUsuarioRepository.findBySecUsuario(secUsuario);
        } catch (Exception e) {
            System.out.println("Error al obtener al usuario: " + secUsuario + " e: " + e);
        }
        return resp;
    }

}
