package org.bdp.com.bo.repository;

import org.bdp.com.bo.model.entity.FUsuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUsuarioRepository extends JpaRepository<FUsuario, Long> {
    FUsuario findBySecUsuario(long secUsuario);
}
