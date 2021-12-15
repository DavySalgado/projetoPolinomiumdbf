package com.DavySalgado.polinomium;

import com.DavySalgado.polinomium.domain.Usuario;
import com.DavySalgado.polinomium.repository.UsuarioRepository;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PolinomiumApplication {

	public static void main(String[] args) {

		SpringApplication.run(PolinomiumApplication.class, args);
		
		UsuarioRepository usuarioRepository;
	
		Usuario user = new Usuario();
		user.setNome("Davy");

		System.out.println("teste");
	
	}

}
