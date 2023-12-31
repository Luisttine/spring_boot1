package com.ts.back.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ts.back.entity.Empregado;
import com.ts.back.repository.EmpregadoRepository;

@Service
public class EmpregadoService implements IEmpregadoService{
 
    @Autowired
    private EmpregadoRepository EmpregadoRepo;

    public Empregado buscarPorCtps(Long ctps) {
        Optional<Empregado> EmpregadoOp = EmpregadoRepo.findByCtps(ctps);
        if(EmpregadoOp.isPresent()) {
            return EmpregadoOp.get();
        }
        throw new IllegalArgumentException("CTPS inválido!");
    }

    public Empregado buscarPorEmail(String email) {
        Optional<Empregado> EmpregadoOp = EmpregadoRepo.findByEmail(email);
        if(EmpregadoOp.isPresent()) {
            return EmpregadoOp.get();
        }
        throw new IllegalArgumentException("Email inválido!");
    }

    // public Empregado buscarPorCtpsOuEmail(Long ctps, String email) {
    //     List<Empregado> EmpregadoOp = EmpregadoRepo.findByCtpsOrEmail(ctps, email);
    //     return EmpregadoOp.get();
    // }

    public Empregado novoEmpregado(Empregado Empregado) {
        // Empregado.setDataCadastro(LocalDateTime().now());
        if(Empregado == null ||
            Empregado.getNome() == null ||
            Empregado.getCtps() == null ||
            Empregado.getEmail() == null) {
            throw new IllegalArgumentException("Dados inválidos!");
        }
        return EmpregadoRepo.save(Empregado);
    }

    public List<Empregado> buscarTodos() {
        return EmpregadoRepo.findAll();
    }

    // @Override
    // public Empregado buscarPorCtpsOuEmail(Long ctps, String email) {
    //     // TODO Auto-generated method stub
    //     throw new UnsupportedOperationException("Unimplemented method 'buscarPorCtpsOuEmail'");
    // }
}