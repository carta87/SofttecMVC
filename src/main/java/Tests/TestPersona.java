package Tests;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Entities.Persona;

public class TestPersona {

		private static EntityManager manager;
		
		private static EntityManagerFactory emf;

		@SuppressWarnings("unchecked")
		public static void main(String[] args) {
			emf = Persistence.createEntityManagerFactory("Persistencia");
			manager = emf.createEntityManager();
			
			List<Persona> personas = (List<Persona>) manager.createQuery("from Persona").getResultList();

			System.out.println("En esta base de datos hay "+ personas.size()+ " Personas");
		}


}
