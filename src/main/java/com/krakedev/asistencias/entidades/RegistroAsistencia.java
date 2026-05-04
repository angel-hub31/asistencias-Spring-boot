package com.krakedev.asistencias.entidades;

public class RegistroAsistencia {
	private Estudiante estudiante;
	private Asistencia asistencia;
	
	//constructor vacio
	public RegistroAsistencia() {
		
	}
	
	//constructor que recibe parametros
	public RegistroAsistencia(Estudiante estudiante, Asistencia asistencia) {
	
		this.estudiante = estudiante;
		this.asistencia = asistencia;
	}
	
	//metodos getters y setters
	public Estudiante getEstudiante() {
		return estudiante;
	}
	public void setEstudiante(Estudiante estudiante) {
		this.estudiante = estudiante;
	}
	public Asistencia getAsistencia() {
		return asistencia;
	}
	public void setAsistencia(Asistencia asistencia) {
		this.asistencia = asistencia;
	}
	

}
