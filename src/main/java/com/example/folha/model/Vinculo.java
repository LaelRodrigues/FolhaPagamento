package com.example.folha.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "vinculo")
public class Vinculo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_vinculo", nullable = false)
    private Long idVinculo;

    @ManyToOne
    @JoinColumn(name = "servidor_id")
    private Servidor servidor;

    @OneToMany(mappedBy = "vinculo")
    private List<Vinculo_rubrica> viculosRubricas;


    public Vinculo() {}

    public Vinculo(Long idVinculo) {
        this.idVinculo = idVinculo;
    }

    public Long getIdVinculo() {
        return idVinculo;
    }

    public void setIdVinculo(Long idVinculo) {
        this.idVinculo = idVinculo;
    }
}
