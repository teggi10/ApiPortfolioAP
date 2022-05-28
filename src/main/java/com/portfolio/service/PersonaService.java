package com.portfolio.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.portfolio.model.Persona;
import com.portfolio.repository.PersonaRepository;


@Service
@Transactional
public class PersonaService {

	 @Autowired
	   PersonaRepository personaRepository;

	    public List<Persona> list(){
	        return personaRepository.findAll();
	    }

	    public Optional<Persona> getOne(long id){
	        return personaRepository.findById(id);
	    }

	    public Optional<Persona> getByNombre(String nombre){
	        return personaRepository.findByNombre(nombre);
	    }

	    public void  save(Persona persona){
	        personaRepository.save(persona);
	    }
	   

	    public void delete(Long id){
	        personaRepository.deleteById(id);
	    }

	    public boolean existsById(long id){
	        return personaRepository.existsById(id);
	    }

	    public boolean existsByNombre(String nombre){
	        return personaRepository.existsByNombre(nombre);
	    }
	
}
