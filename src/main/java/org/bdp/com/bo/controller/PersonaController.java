package org.bdp.com.bo.controller;

import java.util.List;

import org.bdp.com.bo.model.entity.FCliente;
import org.bdp.com.bo.model.entity.FUsuario;
import org.bdp.com.bo.model.entity.PPersona;
import org.bdp.com.bo.repository.IFClienteRepository;
import org.bdp.com.bo.repository.IPPersonaRepository;
import org.bdp.com.bo.repository.IUsuarioRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/persona")
public class PersonaController {

    private final IPPersonaRepository ipPersonaRepository;
    private final IFClienteRepository clienteRepository;
    private final IUsuarioRepository iUsuarioRepository;

    public PersonaController(IPPersonaRepository ipPersonaRepository, IFClienteRepository clienteRepository,
            IUsuarioRepository iUsuarioRepository) {
        this.ipPersonaRepository = ipPersonaRepository;
        this.clienteRepository = clienteRepository;
        this.iUsuarioRepository = iUsuarioRepository;
    }

    @GetMapping("/")
    public List<PPersona> listarPersonas() {
        return ipPersonaRepository.findAll();
    }

    @GetMapping("/listar-clientes")
    public List<FCliente> listarClientes() {
        return clienteRepository.findAll();
    }

    @GetMapping("/listar-usuarios")
    public List<FUsuario> listarUsuario() {
        return iUsuarioRepository.findAll();
    }
}
