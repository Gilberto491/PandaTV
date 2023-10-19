package com.panda.api.repository;

import com.panda.api.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    Usuario findBySenha(String senha);

    Usuario findByNomeUsuario(String nomeUsuario);
}
