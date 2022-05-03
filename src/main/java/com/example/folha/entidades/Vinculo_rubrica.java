package com.example.folha.entidades;

import javax.persistence.*;

@Entity
@Table(name = "tabela_lancamento")
public class Vinculo_rubrica {

    @EmbeddedId
    private Vinculo_rubricaID vinculo_rubricaId;

    @ManyToOne
    @MapsId("vinculoId")
    @JoinColumn(name = "vinculo_id")
    private Vinculo vinculo;

    @ManyToOne
    @MapsId("rubricaId")
    @JoinColumn(name = "rubrica_id")
    private Rubrica rubrica;

    @Column(name = "valor")
    private Double valor;

    public Vinculo_rubrica(Vinculo_rubricaID vinculo_rubricaId, Double valor) {
        this.vinculo_rubricaId = vinculo_rubricaId;
        this.valor = valor;
    }

    public Vinculo_rubrica() {}

    public Vinculo_rubricaID getVinculo_rubricaId() { return vinculo_rubricaId; }

    public void setVinculo_rubricaId(Vinculo_rubricaID vinculo_rubricaId) { this.vinculo_rubricaId = vinculo_rubricaId; }

    public Vinculo getVinculo() { return vinculo; }

    public void setVinculo(Vinculo vinculo) { this.vinculo = vinculo; }

    public Rubrica getRubrica() { return rubrica; }

    public void setRubrica(Rubrica rubrica) { this.rubrica = rubrica; }

    public Double getValor() { return valor; }

    public void setValor(Double valor) { this.valor = valor; }
}
