package com.example.folha.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class Vinculo_rubricaID  {

    @Column(name = "vinculo_id")
    private Long vinculoId;

    @Column(name = "rubrica_id")
    private Long rubricaId;
}
