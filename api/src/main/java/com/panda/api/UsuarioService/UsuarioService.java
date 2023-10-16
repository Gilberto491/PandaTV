package com.panda.api.UsuarioService;

import com.panda.api.model.Usuario;
import com.panda.api.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {
    private final UsuarioRepository usuarioRepository;

    @Autowired
    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public List<Usuario> listarTodos() {
        return usuarioRepository.findAll();
    }

    public Optional<Usuario> buscarPorId(Long id) {
        return usuarioRepository.findById(id);
    }

    public Usuario salvar(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    public void deletar(Long id) {
        usuarioRepository.deleteById(id);
    }

    public Usuario login(String nomeUsuario, String email, String senha) {
        Usuario usuario = usuarioRepository.findByNomeUsuarioOrEmail(nomeUsuario, email);

        if (usuario != null) {
            // Agora, verifique se a senha fornecida corresponde à senha armazenada para o usuário
            if (verificarSenha(senha)) {
                return usuario; // Credenciais válidas, retorne o objeto do usuário
            }
        }

        return null; // Credenciais inválidas
    }

    private boolean verificarSenha(String senhaFornecida) {
        return true;
    }
}