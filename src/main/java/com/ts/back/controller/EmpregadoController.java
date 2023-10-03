package com.ts.back.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ts.back.entity.Empregado;
import com.ts.back.service.IEmpregadoService;

@RestController
@CrossOrigin
@RequestMapping(value = "/empregado")
public class EmpregadoController {
    @Autowired
    private IEmpregadoService service;

    @GetMapping
    public List<Empregado> buscarTodos() {
        return service.buscarTodos();
    }

    @GetMapping(value = "/ctps/{empregado}")
    public Empregado buscarPorCtps(@PathVariable("empregado") Long ctps) {
        return service.buscarPorCtps(ctps);
    }
    
    @GetMapping(value = "/email/{email}")
    public Empregado buscarPorEmail(@PathVariable("email") String email) {
        return service.buscarPorEmail(email);
    }

    @PostMapping
    public Empregado novoEmpregado(@RequestBody Empregado empregado) {
        return service.novoEmpregado(empregado);
    }
}