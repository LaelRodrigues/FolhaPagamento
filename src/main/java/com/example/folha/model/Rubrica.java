package com.example.folha.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "rubrica")
public class Rubrica {
    
    @Id //primary key of the entity
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_rubrica")
    private Long idRubrica;
    
    @Column(name = "descricao")
    private String descricao;
    
    @Column(name = "tipo_rubrica")
    private Long tipoRubrica;

    @OneToMany(mappedBy = "rubrica") 
    private List<Vinculo_rubrica> rubricaVinculos;
    
    public List<Vinculo_rubrica> getRubricaVinculos() { return rubricaVinculos; }

    public void setRubricaVinculos(List<Vinculo_rubrica> rubricaVinculos) { this.rubricaVinculos = rubricaVinculos; }
}
