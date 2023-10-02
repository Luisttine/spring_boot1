package com.ts.back.service;

import java.util.List;
import com.ts.back.entity.Usuario;

public interface IUsuarioService {
 public Usuario buscarPorId(Long id);

 public Usuario novoUsuario(Usuario usuario);

 public List<Usuario> buscarTodos();

}
