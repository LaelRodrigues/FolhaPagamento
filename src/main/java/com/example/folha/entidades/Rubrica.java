package com.example.folha.entidades;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "rubrica")
public class Rubrica {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_rubrica")
    private Long idRubrica;
    
    @Column(name = "descricao")
    private String descricao;
    
    @Column(name = "tipo_rubrica")
    private Long tipoRubrica;

    @OneToMany(mappedBy = "rubrica")
    private List<Vinculo_rubrica> rubricaVinculos;

    public Rubrica(Long idRubrica, String descricao, Long tipoRubrica) {
        this.idRubrica = idRubrica;
        this.descricao = descricao;
        this.tipoRubrica = tipoRubrica;
    }
    
    public Rubrica(){}

    public Long getIdRubrica() { return idRubrica; }

    public void setIdRubrica(Long idRubrica) { this.idRubrica = idRubrica; }

    public String getDescricao() { return descricao; }

    public void setDescricao(String descricao) { this.descricao = descricao; }

    public Long getTipoRubrica() { return tipoRubrica; }

    public void setTipoRubrica(Long tipoRubrica) { this.tipoRubrica = tipoRubrica; }

    public List<Vinculo_rubrica> getRubricaVinculos() { return rubricaVinculos; }

    public void setRubricaVinculos(List<Vinculo_rubrica> rubricaVinculos) { this.rubricaVinculos = rubricaVinculos; }
}
