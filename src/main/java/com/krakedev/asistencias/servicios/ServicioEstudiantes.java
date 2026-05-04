package com.krakedev.asistencias.servicios;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.krakedev.asistencias.entidades.Estudiante;

@Service
public class ServicioEstudiantes {
	
	private ArrayList<Estudiante> estudiantes = new ArrayList<>();
	//no permite duplicados
	 public void agregar(Estudiante estudiante) {
		 Estudiante encontrado=buscarPorCedula(estudiante.getCedula());
		 if(encontrado == null) {
			 estudiantes.add(estudiante);
		 }
		 
	 }
	 public Estudiante buscarPorCedula(String cedula) {
	 }
	 public void eliminar(String cedula) {

	 }
	 public void actualizar(String cedula, Estudiante nuevo) {
	 }
	 public ArrayList<Estudiante> listar() {
	 }

	

}
