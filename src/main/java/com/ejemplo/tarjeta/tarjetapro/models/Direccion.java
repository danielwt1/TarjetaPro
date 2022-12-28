package com.ejemplo.tarjeta.tarjetapro.models;

import javax.persistence.*;

@Entity
@Table(name = "direccion")
public class Direccion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idDireccion;
    @Column(name = "numeroCalle", length = 30,nullable = false)
    private String numCalle;
    @Column(name = "complementoCalle", length = 30,nullable = false)
    private String complementoCalle;
    @Column(name = "compEdiAparta",length = 40,nullable = false)
    private String compEdiAparta;
    @Column(name = "ciudad",length = 40,nullable = false)
    private String ciudad;
    @ManyToOne
    @JoinColumn(name = "UserId",nullable = false,foreignKey = @ForeignKey(name = "FK_Direccion_User"))
    private Usuario idUsuario;
}
