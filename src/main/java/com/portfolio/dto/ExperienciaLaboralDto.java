package com.portfolio.dto;

public class ExperienciaLaboralDto {
private Long id;
	
	private String nombre;
	
	
	 private String fecha;
	
	
	private String institucion;
	
	
	private String informacion;

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

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getInstitucion() {
		return institucion;
	}

	public void setInstitucion(String institucion) {
		this.institucion = institucion;
	}

	public String getInformacion() {
		return informacion;
	}

	public void setInformacion(String informacion) {
		this.informacion = informacion;
	}


	public ExperienciaLaboralDto(String nombre, String fecha, String institucion, String informacion) {
		super();
		this.nombre = nombre;
		this.fecha = fecha;
		this.institucion = institucion;
		this.informacion = informacion;
	}

	public ExperienciaLaboralDto() {
		super();
	}
}
