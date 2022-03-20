package Persistencia;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;

import Entities.Estudiantes;

public class FachadaPersistenciaEstudiante implements FachadaPersistenciaEstudianteLocal {
	
	@PersistenceContext(unitName = "Persistencia")
	
	private EntityManager manager;

	@Override
	public void create(Estudiantes estudiante) {
		
		
		
	}

	@Override
	public void edit(Estudiantes estudiante) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void find(Object object) {
		// TODO Auto-generated method stub
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Estudiantes> findAll() {
		List<Estudiantes> estudiantes = (List<Estudiantes>) manager.createQuery("from Estudiantes").getResultList();
		return estudiantes;
	}

	@Override
	public Estudiantes findByEstudiante(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void remove(Estudiantes estudiante) {
		// TODO Auto-generated method stub
		
	}
	
	
	public static void main(String[] args) {
		
		FachadaPersistenciaEstudiante fpe = new FachadaPersistenciaEstudiante();
		
		List<Estudiantes> listEstudiantes = new ArrayList<>();
		System.out.println("sdasdgagf");
		
		listEstudiantes= fpe.findAll();
		
		for (Estudiantes estudiantes : listEstudiantes) {
			System.out.println(estudiantes);
		}
		
	}

}