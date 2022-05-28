package com.portfolio.security.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.portfolio.model.Persona;
import com.portfolio.security.model.Usuario;
import com.portfolio.security.repository.UsuarioRepository;



@Service
@Transactional
public class UsuarioService {
	@Autowired
	UsuarioRepository usuarioRepository;
	
	 public List<Usuario> list(){
	        return usuarioRepository.findAll();
	    }

	    public Optional<Usuario> getOne(long id){
	        return usuarioRepository.findById((int) id);
	    }
	    
	public Optional<Usuario> getByNombreUsuario(String nombreUsuario) {
		return usuarioRepository.findByNombreUsuario(nombreUsuario);
	}
	
	public boolean existsByNombreUsuario(String nombreUsuario) {
		return usuarioRepository.existsByNombreUsuario(nombreUsuario);
	}
	
	public boolean existsByEmail(String email) {
		return usuarioRepository.existsByEmail(email);
	}
	
	public void save(Usuario usuario) {
		usuarioRepository.save(usuario);
	}
	
	  public void delete(int id){
	        usuarioRepository.deleteById(id);
	    }

	    public boolean existsById(int id){
	        return usuarioRepository.existsById(id);
	    }
}

