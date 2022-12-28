package com.ejemplo.tarjeta.tarjetapro.models;


import javax.persistence.*;

@Entity
@Table(name = "rol")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer roleId;
    @Column(name = "roleName",length = 10)
    private String rolName;
    @ManyToOne
    @JoinColumn(name = "IdUsuario",nullable = false,foreignKey = @ForeignKey(name = "FK_Role_User"))
    private Usuario userId;

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getRolName() {
        return rolName;
    }

    public void setRolName(String rolName) {
        this.rolName = rolName;
    }

    public Usuario getUserId() {
        return userId;
    }

    public void setUserId(Usuario userId) {
        this.userId = userId;
    }
}
