package com.ejemplo.tarjeta.tarjetapro.models;

import javax.persistence.*;

@Entity
@Table(name = "tipoTarjeta")
public class TipoTarjeta {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idTipoTarjeta;
    @Column(name = "nomTipo",length = 40)
    private String nomTipo;
    @OneToOne(mappedBy = "idTipoTarjeta")
    private Tarjeta idTarjeta;



}
