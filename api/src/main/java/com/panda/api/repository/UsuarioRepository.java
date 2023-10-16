package com.panda.api.repository;

import com.panda.api.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    Usuario findByNomeUsuarioOrEmail(String nomeUsuario, String email);
}
