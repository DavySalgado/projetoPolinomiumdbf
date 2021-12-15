package com.DavySalgado.polinomium.domain;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "tableAtividade")
public class Atividade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 100)
    private String enunciado;

    @Column(nullable = false, length = 150)
    private String conteudo;

    @Column(nullable = false, length = 45)
    private String solucao;

    @Column(nullable = false)
    private int difuculdade;

    @OneToMany(mappedBy = "atividade")
    List<Dica> dicas;

    @OneToMany(mappedBy = "atividade")
    List<MatriculaAtividade> matriculaAtividades;

}
