package Persistencia;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import Entities.Profesores;

public class FachadaPersistenciaProfesor implements FachadaPersistenciaProfesorLocal {

	// @PersistenceUnit(unitName = "Persistencia")
	private static EntityManagerFactory emf;
	Profesores profesor;

	EntityManager entity = getEntityManagerFactory().createEntityManager();

	public static EntityManagerFactory getEntityManagerFactory() {
		if (emf == null) {
			emf = Persistence.createEntityManagerFactory("Persistencia");
		}
		return emf;
	}

	@Override
	public void create(Profesores profesor) {
		entity.getTransaction().begin();
		entity.persist(profesor);
		entity.getTransaction().commit();
	}

	@Override
	public void edit(Profesores profesor) {
		Profesores profesorRecover = entity.find(Profesores.class, profesor.getId());
		if (profesorRecover != null) {
			entity.getTransaction().begin();
			entity.merge(profesor);
			entity.getTransaction().commit();
			// System.out.println("actualizo");
		} else {
			// System.out.println("Profesor no encontrado");
		}
	}

	@Override
	public void find(Object object) {
		// TODO Auto-generated method stub

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Profesores> findAll() {
		List<Profesores> profesoresRecover = (List<Profesores>) entity.createQuery("FROM Profesores").getResultList();
		return profesoresRecover;
	}

	@Override
	public Profesores findByIdProfesor(String idProfesor) {
		profesor = entity.find(Profesores.class, idProfesor);
		return profesor;
	}

	@Override
	public void remove(Profesores profesor) {
		Profesores profesorRecover = entity.find(Profesores.class, profesor.getId());
		if (profesorRecover != null) {
			entity.getTransaction().begin();
			entity.remove(profesorRecover);
			entity.getTransaction().commit();
			//System.out.println("estudiante  eliminado...");
		} else {
			//System.out.println("Estudiante no encontrado...");
		}
	}

}
