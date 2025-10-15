package com.entornos.lunchuis.repository;

import com.entornos.lunchuis.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    Optional<Usuario> findByCode(String code);
}
