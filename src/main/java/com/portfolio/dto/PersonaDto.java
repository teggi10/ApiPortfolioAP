package com.portfolio.dto;

public class PersonaDto {

	private String nombre;
	private String apellido;
	private String domicilio;
	private String email;
	private String urlFoto;
	private String fechaNac;
	private String telefono;
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
	private String sobreMi;
	public PersonaDto(String nombre, String apellido, String domicilio, String email, String urlFoto, String sobreMi, String fechaNac, String telefono) {
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
	public PersonaDto() {
		
	}
	
}
