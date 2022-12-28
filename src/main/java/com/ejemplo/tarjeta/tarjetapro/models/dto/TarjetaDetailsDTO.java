package com.ejemplo.tarjeta.tarjetapro.models.dto;

import com.ejemplo.tarjeta.tarjetapro.models.Tarjeta;

import java.time.LocalDate;

public class TarjetaDetailsDTO {
    private Integer idTarjetaDetails;
    private String desMov;

    private Integer montoMov;
    private LocalDate fecha= LocalDate.now();
    private TarjetaDTO idTarjeta;
}
