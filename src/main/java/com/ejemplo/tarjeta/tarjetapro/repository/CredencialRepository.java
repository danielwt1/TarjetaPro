package com.ejemplo.tarjeta.tarjetapro.repository;

import com.ejemplo.tarjeta.tarjetapro.models.Credencial;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CredencialRepository extends JpaRepository<Credencial,Integer> {
    Optional<Credencial> findOneByUser(String username);
}
