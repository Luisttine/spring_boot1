package com.ts.back.entity;

// import com.fasterxml.jackson.annotation.JsonIgnore;  lib para ignorar um campo no json
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name = "emp_empregado")
public class Empregado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "emp_id")
    private Long id;

    @Column(name = "emp_nome_completo")
    private String nome;

    @Column(name = "emp_ctps")
    // @JsonIgnore ignora o campo senha no retorno do json
    private Long ctps;

    @Column(name = "emp_data_hora_cadastro")
    private LocalDateTime data_cadastro;

    @Column(name = "emp_email")
    private String email;

    @Column(name = "emp_carga_horaria")
    private Float carga_horaria;

    public Empregado(String nome, Long ctps, LocalDateTime data_cadastro, String email, Float carga_horaria) {
        this.nome = nome;
        this.ctps = ctps;
        this.data_cadastro = data_cadastro;
        this.email = email;
        this.carga_horaria = carga_horaria;
    }

    public Empregado() { }
    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getCtps() {
        return ctps;
    }
    public void setCtps(Long ctps) {
        this.ctps = ctps;
    }

    public LocalDateTime getDataCadastro() {
        return data_cadastro;
    }
    public void setDataCadastro(LocalDateTime data_cadastro) {
        this.data_cadastro = data_cadastro;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public Float getCargaHoraria() {
        return carga_horaria;
    }
    public void setCargaHoraria(Float carga_horaria) {
        this.carga_horaria = carga_horaria;
    }
}
