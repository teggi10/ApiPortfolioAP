package com.portfolio.dto;




public class ProyectoDto {


	 private Long id;
	
	private String nombre;
	
	
	 private String urlFoto;
	 
	 private String informacion;
	
	
	public ProyectoDto() {
		super();
	}


	public ProyectoDto( String nombre, String urlFoto, String informacion) {
		super();
		this.nombre = nombre;
		this.urlFoto = urlFoto;
		this.informacion = informacion;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getUrlFoto() {
		return urlFoto;
	}


	public void setUrlFoto(String urlFoto) {
		this.urlFoto = urlFoto;
	}


	public String getInformacion() {
		return informacion;
	}


	public void setInformacion(String informacion) {
		this.informacion = informacion;
	}


	
}
