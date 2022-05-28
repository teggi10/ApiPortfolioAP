package com.portfolio.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="persona")
public class Persona  {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Long id;
	@Column(name="nombre", length = 50, nullable = false)
	private String nombre;
	
	@Column(name="apellido", length = 50, nullable = false)
	 private String apellido;
	
	@Column(name="domicilio", length = 50, nullable = false)
	private String domicilio;
	
	@Column(name="email", length = 50, nullable = false)
	private String email;
	
	@Column(name="urlFoto", length = 100, nullable = false)
	private String urlFoto;
	
	@Column(name="sobreMi", length = 300, nullable = false)
	private String sobreMi;
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUrlFoto() {
		return urlFoto;
	}

	public void setUrlFoto(String urlFoto) {
		this.urlFoto = urlFoto;
	}

	public String getSobreMi() {
		return sobreMi;
	}

	public void setSobreMi(String sobreMi) {
		this.sobreMi = sobreMi;
	}

	public String getFechaNac() {
		return fechaNac;
	}

	public void setFechaNac(String fechaNac) {
		this.fechaNac = fechaNac;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	@Column(name="fechaNac", length = 50, nullable = false)
	private String fechaNac;
	
	@Column(name="telefono", length = 50, nullable = false)
	private String telefono;
	
	
	public Persona( String nombre, String apellido, String domicilio, String email, String urlFoto,
			String sobreMi, String fechaNac, String telefono) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.domicilio = domicilio;
		this.email = email;
		this.urlFoto = urlFoto;
		this.sobreMi = sobreMi;
		this.fechaNac = fechaNac;
		this.telefono = telefono;
	}

	public Persona() {
		
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
}
