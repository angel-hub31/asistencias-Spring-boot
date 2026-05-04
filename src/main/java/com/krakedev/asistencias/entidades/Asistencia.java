package com.krakedev.asistencias.entidades;

import java.time.LocalDate;
import java.time.LocalTime;

public class Asistencia {
	private LocalDate fechaClase;
	private LocalTime fechaHoraRegistro;
	private String estado;
	
	//constructor vacio
	public Asistencia() {
		
	}

//constructor que recibe parametros
	public Asistencia(LocalDate fechaClase, LocalTime fechaHoraRegistro, String estado) {
		
		this.fechaClase = fechaClase;
		this.fechaHoraRegistro = fechaHoraRegistro;
		this.estado = estado;
	}

//metodos getters y setters
	public LocalDate getFechaClase() {
		return fechaClase;
	}


	public void setFechaClase(LocalDate fechaClase) {
		this.fechaClase = fechaClase;
	}


	public LocalTime getFechaHoraRegistro() {
		return fechaHoraRegistro;
	}


	public void setFechaHoraRegistro(LocalTime fechaHoraRegistro) {
		this.fechaHoraRegistro = fechaHoraRegistro;
	}


	public String getEstado() {
		return estado;
	}


	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	
	// sobreescribimos el toString

	@Override
	public String toString() {
		return "Asistencia [fechaClase=" + fechaClase + ", fechaHoraRegistro=" + fechaHoraRegistro + ", estado="
				+ estado + "]";
	}
	
	
	
	
	

}
