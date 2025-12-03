package org.bdp.com.bo.model.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "p_persona", schema = "e_ventas")
@Getter
@Setter
@ToString
public class PPersona {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_persona")
    @SequenceGenerator(name = "seq_persona", sequenceName = "e_ventas.seq_persona", allocationSize = 1)
    @Column(name = "sec_persona")
    private Long secPersona;

    @Column(name = "nombres")
    private String nombres;

    @Column(name = "primer_apellido")
    private String primerApellido;

    @Column(name = "segundo_apellido")
    private String segundoApellido;

    @Column(name = "cod_tipo_identificacion")
    private String codTipoIdentificacion;

    @Column(name = "numero_identificacion")
    private String numeroIdentificacion;

    @Column(name = "correo_electronico")
    private String correoElectronico;

    @Column(name = "celular")
    private String celular;

    @Column(name = "direccion")
    private String direccion;

    @Column(name = "coordenada_x")
    private String coordenadaX;

    @Column(name = "coordenada_y")
    private String coordenadaY;

    @Column(name = "fec_creacion")
    private Date fecCreacion;

    @Column(name = "fec_modificacion")
    private Date fecModificacion;

    @Column(name = "cod_estado")
    private String codEstado;

    @OneToMany(mappedBy = "persona", fetch = FetchType.LAZY)
    @JsonIgnore
    private List<FCliente> clientes = new ArrayList<>();
}
