package com.ejemplo.tarjeta.tarjetapro.models;

import javax.persistence.*;

@Entity
@Table(name="credencial")
public class Credencial {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCredenciales;
    @Column(name = "user",length = 40)
    private String user;
    @Column(name = "password",length = 25)
    private String password;

    @OneToOne
    @JoinColumn(name = "usuarioId",nullable = false,foreignKey = @ForeignKey(name = "FK_Credencial_Usuario"))
    private Usuario usuarioId;


    public Integer getIdCredenciales() {
        return idCredenciales;
    }

    public void setIdCredenciales(Integer idCredenciales) {
        this.idCredenciales = idCredenciales;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Usuario getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(Usuario usuarioId) {
        this.usuarioId = usuarioId;
    }
}
