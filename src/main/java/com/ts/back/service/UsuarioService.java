package com.ts.back.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ts.back.entity.Usuario;
import com.ts.back.repository.UsuarioRepository;

@Service
public class UsuarioService implements IUsuarioService{
 
    @Autowired
    private UsuarioRepository usuarioRepo;

    public Usuario buscarPorId(Long id) {
        Optional<Usuario> usuarioOp = usuarioRepo.findById(id);
        if(usuarioOp.isPresent()) {
            return usuarioOp.get();
        }
        throw new IllegalArgumentException("Id inválido!");
    }

    public Usuario buscarPorNome(String nome) {
        Optional<Usuario> usuarioOp = usuarioRepo.findByNome(nome);
        if(usuarioOp.isPresent()) {
            return usuarioOp.get();
        }
        throw new IllegalArgumentException("Nome inválido!");
    }

    public Usuario novoUsuario(Usuario usuario) {
        if(usuario == null ||
            usuario.getNome() == null ||
            usuario.getSenha() == null) {
            throw new IllegalArgumentException("Nome e senha inválidos!");
        }
        return usuarioRepo.save(usuario);
    }

    public List<Usuario> buscarTodos() {
    return usuarioRepo.findAll();
    }
}