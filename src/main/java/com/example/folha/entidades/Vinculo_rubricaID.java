package com.example.folha.entidades;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class Vinculo_rubricaID implements Serializable {

    @Column(name = "vinculo_id")
    private Long vinculoId;

    @Column(name = "rubrica_id")
    private Long rubricaId;

    public Vinculo_rubricaID(Long vinculoId, Long rubricaId) {
        this.vinculoId = vinculoId;
        this.rubricaId = rubricaId;
    }

    public Vinculo_rubricaID() {}

    public Long getVinculoId() { return vinculoId; }

    public void setVinculoId(Long vinculoId) { this.vinculoId = vinculoId;}

    public Long getRubricaId() { return rubricaId; }

    public void setRubricaId(Long rubricaId) { this.rubricaId = rubricaId; }
}
