package com.DavySalgado.polinomium.service;

import java.util.List;
import java.util.Optional;

import com.DavySalgado.polinomium.domain.Usuario;
import com.DavySalgado.polinomium.repository.UsuarioRepository;

import org.springframework.stereotype.Service;

@Service
public class UsuarioService {
    
    // private final Logger log = LoggerFactory.getLogger(UsuarioService.class);

    private final UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository){
        this.usuarioRepository = usuarioRepository;
    }

    public List<Usuario> findAllList(){
        return usuarioRepository.findAll();
    }

    public Optional<Usuario> findOne(Long id){
        // log.debug("Request to get Usuario : {}", id);
        return usuarioRepository.findById(id);
    }

    public void delete(Long id){
        // log.debug("Request to delete Usuario : {}", id);
        usuarioRepository.deleteById(id);
    }

    public Usuario save(Usuario user){
        // log.debug("Request to save Usuario : {}", user);
        usuarioRepository.save(user);
        return user;
    }
}
