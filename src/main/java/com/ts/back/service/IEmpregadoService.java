package com.ts.back.service;

import java.util.List;
import com.ts.back.entity.Empregado;

public interface IEmpregadoService {
    // public Empregado buscarPorCtps(Long ctps);

    // public Empregado buscarPorEmail(String email);

    public Empregado buscarPorCtpsOuEmail(Long ctps, String email);

    public Empregado novoEmpregado(Empregado usuario);

    public List<Empregado> buscarTodos();

}
