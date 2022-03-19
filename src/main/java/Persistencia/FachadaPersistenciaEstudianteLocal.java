package Persistencia;

import java.util.List;

import Entities.Estudiante;

public interface FachadaPersistenciaEstudianteLocal {
	
	void create(Estudiante estudiante);
	void edit(Estudiante estudiante);
	void find(Object object);
	List<Estudiante> findAll();
	Estudiante findByEstudiante(String string);
	void remove(Estudiante estudiante); 

}
