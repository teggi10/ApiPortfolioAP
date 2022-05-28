package com.portfolio.security.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.portfolio.security.enums.RolNombre;
import com.portfolio.security.model.Rol;
import com.portfolio.security.repository.RolRepository;



@Service
@Transactional
public class RolService {

	@Autowired
	RolRepository rolRepository;
	
	public Optional<Rol> getByRolNombre(RolNombre rolNombre){
		return rolRepository.findByRolNombre(rolNombre);
	}

	public void save(Rol rolAdmin) {
		rolRepository.save(rolAdmin);
	}
}