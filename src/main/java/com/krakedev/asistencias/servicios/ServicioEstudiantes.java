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
		 for(Estudiante e: estudiantes) {
				if(e.getCedula().equals(cedula)) {
					return e;
				}
			}
			return null;
		}
		 
	 
	 public boolean eliminar(String cedula) {
		 Estudiante estudiante = buscarPorCedula(cedula);
			if (estudiante !=null) {
				estudiantes.remove(estudiante);
				return true;
				
			}else {
				return false;
			}

			
		}

	 
	 public Estudiante actualizar(String cedula, Estudiante estudianteNuevo) {
		 
		 Estudiante estudianteEncontrado = buscarPorCedula(cedula);
			
			if(estudianteEncontrado !=null) {
				estudianteEncontrado.setNombre(estudianteNuevo.getNombre());
				estudianteEncontrado.setApellido(estudianteNuevo.getApellido());

			}
			return estudianteEncontrado;
		}
	 
	 
	 
	 public ArrayList<Estudiante> listar() {
		 return estudiantes;
	 }

	

}
