package com.ts.back.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ts.back.entity.Empregado;

public interface EmpregadoRepository extends JpaRepository<Empregado, Long>{
    // public Optional<Empregado> findByCtps(Long ctps);

    // public Optional<Empregado> findByEmail(String email);

    public List<Empregado> findByCtpsOrEmail(Long ctps, String email);
}