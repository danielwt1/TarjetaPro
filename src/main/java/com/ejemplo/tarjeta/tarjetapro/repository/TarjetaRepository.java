package com.ejemplo.tarjeta.tarjetapro.repository;

import com.ejemplo.tarjeta.tarjetapro.models.Tarjeta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TarjetaRepository extends JpaRepository<Tarjeta,Integer> {
}
