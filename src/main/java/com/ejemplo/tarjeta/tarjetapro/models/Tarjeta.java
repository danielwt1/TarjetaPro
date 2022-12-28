package com.ejemplo.tarjeta.tarjetapro.models;


import javax.persistence.*;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "tarjeta")
public class Tarjeta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idTarjeta;
    @Column(length = 16, nullable = false)
    private String numTarjeta;
    @Column(name = "capacidad",nullable = false)
    private Integer capacidad;
    @Column(name = "creacion",nullable = false)
    private LocalDate creacion= LocalDate.now();
    @Column(name = "vencimiento",nullable = false)
    private LocalDate vencimiento;
    @ManyToOne
    @JoinColumn(name = "idUser",nullable = false,foreignKey = @ForeignKey(name = "FK_Tarjeta_User"))
    private Usuario user;
    @Column(name = "numeroSeguridad",nullable = false)
    private short numSeguridad;
    @Column(name = "cuota",columnDefinition = "decimal(6,2)",nullable = false)
    private double cuota;
    @OneToOne
    @JoinColumn(name = "idTarjetaTipo",nullable = false,foreignKey = @ForeignKey(name = "FK_Tarjeta_TipoTarjeta"))
    private TipoTarjeta idTipoTarjeta;

    @OneToMany(mappedBy = "idTarjeta",cascade = CascadeType.ALL,orphanRemoval = true)
    private Set<TarjetaDetails>tarjetaDetails = new HashSet<>();


    public Tarjeta() {
    }


}
