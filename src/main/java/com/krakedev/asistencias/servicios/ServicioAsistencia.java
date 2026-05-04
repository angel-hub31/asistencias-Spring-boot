package com.krakedev.asistencias.servicios;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.krakedev.asistencias.entidades.Asistencia;
import com.krakedev.asistencias.entidades.Estudiante;
import com.krakedev.asistencias.entidades.RegistroAsistencia;

@Service
public class ServicioAsistencia {
	private ArrayList<RegistroAsistencia> registros = new ArrayList<>();
	private final ServicioEstudiantes servicioEstudiantes;

	public ServicioAsistencia(ServicioEstudiantes servicioEstudiantes) {
		this.servicioEstudiantes = servicioEstudiantes;
	}

	public RegistroAsistencia registrarAsistencia(String cedula) {

		Estudiante estudiante = servicioEstudiantes.buscarPorCedula(cedula);

		if (estudiante != null) {

			Asistencia asistencia = new Asistencia(LocalDate.now(), LocalDateTime.now(), "P");
			
			RegistroAsistencia nuevoRegistro =new RegistroAsistencia(estudiante,asistencia);
			registros.add(nuevoRegistro);
			return nuevoRegistro;

		}
		return null;

	}
	public ArrayList<Asistencia> consultarAsistencia(String cedula){
		ArrayList<Asistencia> asistenciaDelEstudiante = new ArrayList<>();
		
		for(RegistroAsistencia registro : registros) {
			if(registro.getEstudiante().getCedula().equals(cedula)) {
				asistenciaDelEstudiante.add(registro.getAsistencia());
			}
			
		}
		return asistenciaDelEstudiante;
	}
}
