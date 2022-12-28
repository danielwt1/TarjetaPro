package com.ejemplo.tarjeta.tarjetapro.models.dto;


import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class TarjetaDTO {

    private Integer idTarjeta;
    private String numTarjeta;
    private Integer capacidad;
    private LocalDate creacion= LocalDate.now();
    private LocalDate vencimiento;
    private UserDTO user;
    private short numSeguridad;
    private double cuota;
    private TipoTarjetaDTO idTipoTarjeta;
    private Set<TarjetaDetailsDTO> tarjetaDetails = new HashSet<>();
}
