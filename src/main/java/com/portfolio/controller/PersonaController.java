package com.portfolio.controller;

import java.util.List;

import org.apache.logging.log4j.util.Strings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.portfolio.dto.Mensaje;
import com.portfolio.dto.PersonaDto;
import com.portfolio.model.Persona;
import com.portfolio.service.PersonaService;

@RestController
@RequestMapping("persona")
@CrossOrigin

public class PersonaController {

	 @Autowired
	 PersonaService personaService;
	 
	 @GetMapping("/lista") 
	    public ResponseEntity<List<Persona>> list(){
	        List<Persona> list = personaService.list();
	        return new ResponseEntity<List<Persona>>(list, HttpStatus.OK);
	    }
	 
	  @GetMapping("/detail/{id}")
	    public ResponseEntity<Object> getById(@PathVariable("id") Long id){
	        if(!personaService.existsById(id))
	            return new ResponseEntity<Object>(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
	        Persona persona = personaService.getOne(id).get();
	        return new ResponseEntity<Object>(persona, HttpStatus.OK);
	    }
	  
	  @GetMapping("/detailname/{nombre}")
	    public ResponseEntity<Persona> getByNombre(@PathVariable("nombre") String nombre){
	        if(!personaService.existsByNombre(nombre))
	            return new ResponseEntity<Persona>(HttpStatus.NOT_FOUND);
	        Persona persona = personaService.getByNombre(nombre).get();
	        return new ResponseEntity<Persona>(persona, HttpStatus.OK);
	    }
	  
	
	  @PostMapping("/create")
	    public ResponseEntity<?> create(@RequestBody PersonaDto personaDto){
	        if(Strings.isBlank(personaDto.getNombre()))
	            return new ResponseEntity(new Mensaje("el nombre es obligatorio"), HttpStatus.BAD_REQUEST);
	        if(Strings.isBlank(personaDto.getApellido()))
	        	   return new ResponseEntity(new Mensaje("el apellido es obligatoria"), HttpStatus.BAD_REQUEST);
	      
	        Persona persona = new Persona (personaDto.getNombre(), personaDto.getApellido(), personaDto.getDomicilio(), personaDto.getEmail(), personaDto.getUrlFoto(), personaDto.getSobreMi(), personaDto.getFechaNac(), personaDto.getTelefono());
	        personaService.save(persona);
	        return new ResponseEntity(new Mensaje("persona creado"), HttpStatus.OK);
	    }
	  
	  @PreAuthorize("hasRole('ADMIN')")
	  @PutMapping("/update/{id}")
	    public ResponseEntity<?> update(@PathVariable("id")Long id, @RequestBody PersonaDto personaDto){
	        if(!personaService.existsById(id))
	            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
	        if(personaService.existsByNombre(personaDto.getNombre()) && (personaService.getByNombre(personaDto.getNombre()).get().getId() != id))
	            return new ResponseEntity(new Mensaje("ese nombre ya existe"), HttpStatus.BAD_REQUEST);
	        if(Strings.isBlank(personaDto.getNombre()))
	            return new ResponseEntity(new Mensaje("el nombre es obligatorio"), HttpStatus.BAD_REQUEST);
	     

	        Persona persona = personaService.getOne(id).get();
	        persona.setNombre(personaDto.getNombre());
	        persona.setApellido(personaDto.getApellido());
	        persona.setDomicilio(personaDto.getDomicilio());
	        persona.setEmail(personaDto.getEmail());
	        persona.setFechaNac(personaDto.getFechaNac());
	        persona.setUrlFoto(personaDto.getUrlFoto());
	        persona.setSobreMi(personaDto.getSobreMi());
	        persona.setTelefono(personaDto.getTelefono());
	        personaService.save(persona);
	        return new ResponseEntity(new Mensaje("persona actualizada"), HttpStatus.OK);
	    }
	  
	 
	  @DeleteMapping("/delete/{id}")
	    public ResponseEntity<?> delete(@PathVariable("id")Long id){
	        if(!personaService.existsById(id))
	            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
	        personaService.delete(id);
	        return new ResponseEntity(new Mensaje("persona eliminado"), HttpStatus.OK);
	    }
}
