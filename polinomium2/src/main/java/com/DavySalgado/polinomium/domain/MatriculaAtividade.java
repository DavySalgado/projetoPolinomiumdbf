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
@Table(name = "tbmatriculaAtividade")
public class MatriculaAtividade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable=false)
    private Boolean isLocked;

    @Column(nullable=false)
    private Boolean isFinished;

    @Column(nullable=false)
    private Boolean Acerto;

    @ManyToOne
    @JoinColumn(name="FK_Usuario")
    Usuario usuario;

    @ManyToOne
    @JoinColumn(name="FK_Atividade")
    Atividade atividade;

    @ManyToMany(mappedBy = "matriculaAtividades")
    private List<MatriculaLicao> matriculaLicaos;

}
