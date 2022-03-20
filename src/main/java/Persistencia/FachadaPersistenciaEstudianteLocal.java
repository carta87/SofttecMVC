package Persistencia;

import java.util.List;

import Entities.Estudiantes;

public interface FachadaPersistenciaEstudianteLocal {
	
	void create(Estudiantes estudiante);
	void edit(Estudiantes estudiante);
	void find(Object object);
	List<Estudiantes> findAll();
	Estudiantes findByEstudiante(String string);
	void remove(Estudiantes estudiante); 

}