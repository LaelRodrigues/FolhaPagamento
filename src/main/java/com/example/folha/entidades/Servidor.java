package com.example.folha.entidades;

import com.example.folha.entidades.Vinculo;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="servidor")
public class Servidor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_Servidor", nullable = false)
    private Long idServidor;

    @Column(name = "matricula")
    private String matricula;

    @Column(name = "nome")
    private String nome;

    @OneToMany(mappedBy = "servidor", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<Vinculo> vinculos;

    public Servidor(Long idServidor, String matricula, String nome) {
        this.idServidor = idServidor;
        this.matricula = matricula;
        this.nome = nome;
    }

    public Servidor() {}

    public Long getIdServidor() {
        return idServidor;
    }

    public void setIdServidor(Long idServidor) {
        this.idServidor = idServidor;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
