package org.bdp.com.bo.repository;

import org.bdp.com.bo.model.entity.FCliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IFClienteRepository extends JpaRepository<FCliente, Long> {
    
}
