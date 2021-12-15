package com.DavySalgado.polinomium.domain;


import javax.persistence.*;
import lombok.*;

import java.util.List;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="tbAmigo")
public class Amigo {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @ManyToMany(mappedBy = "amigos")
    private List<Usuario> usuarios;

}
