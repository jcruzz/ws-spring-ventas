package org.bdp.com.bo.model.entity;

import java.util.Date;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
@Table(name = "f_rol", schema = "e_ventas")
public class FRol {
    @Id
    @Column(name = "cod_rol")
    private String codRol;

    @Column(name = "nombre_rol")
    private String nombreRol;

    @Column(name = "descripcion_rol")
    private String descripcionRol;

    @Column(name = "fec_creacion")
    private Date fecCreacion;

    @Column(name = "fec_modificacion")
    private Date fecModificacion;

    @Column(name = "cod_estado")
    private String codEstado;

    @ManyToMany(mappedBy = "roles")
    @JsonIgnore
    private Set<FUsuario> usuarios;
}
