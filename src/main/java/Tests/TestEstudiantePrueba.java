package Tests;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Entities.Estudiantes;

public class TestEstudiantePrueba {
	
	private static EntityManager manager;
	
	private static EntityManagerFactory emf;

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		emf = Persistence.createEntityManagerFactory("Persistencia");
		manager = emf.createEntityManager();
		
		List<Estudiantes> estudiante = (List<Estudiantes>) manager.createQuery("from Estudiantes").getResultList();
		//List<Integer> estudiante = (List<Integer>) manager.createQuery("select codigo from Estudiantes").getResultList();
		
		System.out.println("En esta base de datos hay "+ estudiante.size()+ " Personas");
		
		imprimir();
	}
	
	@SuppressWarnings("unchecked")
	private static void imprimir() {
		List<Estudiantes> estudiante = (List<Estudiantes>) manager.createQuery("from Estudiantes").getResultList();
		System.out.println("En esta base de datos hay "+ estudiante.size()+ " Personas");
		
		for (Estudiantes estudiantes : estudiante) {
			System.out.println(estudiantes);
		}
	}
}
