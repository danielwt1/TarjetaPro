package com.ejemplo.tarjeta.tarjetapro.models.dto;

import com.ejemplo.tarjeta.tarjetapro.models.Credencial;
import com.ejemplo.tarjeta.tarjetapro.models.Direccion;
import com.ejemplo.tarjeta.tarjetapro.models.Role;
import com.ejemplo.tarjeta.tarjetapro.models.Tarjeta;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

public class UserDTO {
    private Integer idUser;
    private String cedula;
    private String nombre;
    private String direccion;
    private Integer edad;
    private Set<TarjetaDTO> tarjetas = new HashSet<>();
    private Set<RoleDTO> roles = new HashSet<>();
    private Set<DireccionDTO> direcciones = new HashSet<>();
    private CredencialDTO credencial;
}
