package com.ejemplo.tarjeta.tarjetapro.repository;

import com.ejemplo.tarjeta.tarjetapro.models.Credencial;
import com.ejemplo.tarjeta.tarjetapro.models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<Usuario,Integer> {
    Optional<Usuario> findOneByCredencial(Credencial credencial);
}
