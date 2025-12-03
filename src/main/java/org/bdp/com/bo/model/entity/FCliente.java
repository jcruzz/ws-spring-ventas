package org.bdp.com.bo.model.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "f_cliente", schema = "e_ventas")
@Getter
@Setter
@ToString
public class FCliente {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_cliente")
    @SequenceGenerator(name = "seq_cliente", sequenceName = "e_ventas.seq_cliente", allocationSize = 1)
    @Column(name = "sec_cliente")
    private Long secCliente;

    // @Column(name = "sec_persona")
    // private Long secPersona;

    @Column(name = "fec_creacion")
    private Date fecCreacion;

    @Column(name = "fec_modificacion")
    private Date fecModificacion;

    @Column(name = "cod_estado")
    private String codEstado;

    @ManyToOne()
    @JoinColumn(name = "sec_persona", nullable = false)
    private PPersona persona;
}
