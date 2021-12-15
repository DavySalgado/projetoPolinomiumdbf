package com.DavySalgado.polinomium.domain;

import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tbmatriculaLicao")
public class MatriculaLicao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable=false)
    private Boolean isLocked;
    @Column(nullable=false)
    private Boolean isFinished;
    @ManyToOne
    @JoinColumn(name="Licao")
    Licao licao;
    @ManyToOne
    @JoinColumn(name="Usuario")
    Usuario usuario;

    @ManyToMany
    @JoinTable(name="associacao_matriculaatividade_matriculalicao",
            joinColumns = @JoinColumn(name="fk_matriculalicao"),
            inverseJoinColumns = @JoinColumn(name="fk_matriculaatividade"))
    private List<MatriculaAtividade> matriculaAtividades;
}
