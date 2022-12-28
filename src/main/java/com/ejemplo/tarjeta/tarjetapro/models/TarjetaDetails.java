package com.ejemplo.tarjeta.tarjetapro.models;


import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "TarjetaDetails")
public class TarjetaDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idTarjetaDetails;
    @Column(name = "descMov",length = 50)
    private String desMov;

    @Column(name = "montoMov")
    private Integer montoMov;
    @Column(name = "fecha")
    private LocalDate fecha= LocalDate.now();
    @ManyToOne
    @JoinColumn(name = "idTarjeta",nullable = false)
    private Tarjeta idTarjeta;

}
