package com.ts.back.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ts.back.entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
 
}