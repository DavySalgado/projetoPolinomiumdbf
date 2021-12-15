package com.DavySalgado.polinomium.domain;

import java.util.List;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tbUsuario")
public class Usuario {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable=false, length = 45)
    private String nome;
    @Column(nullable=false, length = 45)
    private String username;
    @Column(nullable=false)
    @Temporal(TemporalType.DATE)
    private java.util.Date dataNascimento;
    @Column(nullable=false, length = 45)
    private String email;
    @Column(nullable=false, length = 45)
    private String senha;
    @Column(nullable=false)
    private int XP;
    @Column(nullable=false)
    private int ofensiva;
    @Column(nullable=false)
    private int nível;
    @OneToMany(mappedBy = "usuario")
    private List<MatriculaLicao> matriculaLicao;

    @OneToMany(mappedBy = "usuario")
    private List<MatriculaAtividade> matriculaAtividades;

    @ManyToMany
    @JoinTable(name="associacao_usuario_amigo",
        joinColumns = @JoinColumn(name="fk_usuario"),
        inverseJoinColumns = @JoinColumn(name = "fk_amigo"))
    private List<Amigo> amigos;
}
