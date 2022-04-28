package com.example.folha.entidades;

import javax.persistence.*;

@Entity
@Table(name = "Vinculo")
public class Vinculo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_vinculo", nullable = false)
    private Long idVinculo;

    @ManyToOne
    @JoinColumn(name = "servidor_id")
    private Servidor servidor;

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
