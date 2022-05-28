package com.portfolio.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;


import com.portfolio.model.Persona;

public interface PersonaRepository extends JpaRepository<Persona, Long>{

	Optional<Persona> findByNombre(String nombre);
	boolean existsByNombre(String nombre);
}
