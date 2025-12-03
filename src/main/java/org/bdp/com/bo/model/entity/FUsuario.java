package org.bdp.com.bo.model.entity;

import java.util.Date;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "f_usuario", schema = "e_ventas")
@Getter
@Setter
@ToString
public class FUsuario {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_usuario")
    @SequenceGenerator(name = "seq_usuario", sequenceName = "e_ventas.seq_usuario", allocationSize = 1)
    @Column(name = "sec_usuario")
    private long secUsuario;

    // @Column(name = "sec_persona")
    // private long secPersona;

    @Column(name = "fec_creacion")
    private Date fecCreacion;

    @Column(name = "fec_modificacion")
    private Date fecModificacion;

    @Column(name = "cod_estado")
    private String codEstado;

    @ManyToOne()
    @JoinColumn(name = "sec_persona", nullable = false)
    private PPersona persona;

    @ManyToMany
    @JoinTable(
        name = "f_r_usuario_rol",
        schema = "e_ventas",
        joinColumns = @JoinColumn(name = "sec_usuario"),
        inverseJoinColumns = @JoinColumn(name = "cod_rol")
    )
    private Set<FRol> roles;
}

