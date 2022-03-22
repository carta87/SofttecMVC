package Persistencia;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import Entities.Estudiantes;

public class FachadaPersistenciaEstudiante implements FachadaPersistenciaEstudianteLocal {

	//@PersistenceContext(unitName = "Persistencia")
	private static EntityManagerFactory emf;
	Estudiantes estudiantes;

	EntityManager entity = getEntityManagerFactory().createEntityManager();

	public static EntityManagerFactory getEntityManagerFactory() {
		if (emf == null) {
			emf = Persistence.createEntityManagerFactory("Persistencia");
		}
		return emf;
	}

	@Override
	public void create(Estudiantes estudiante) {
		entity.getTransaction().begin();
		entity.persist(estudiante);
		entity.getTransaction().commit();
	}

	@Override
	public void edit(Estudiantes estudiante) {
		Estudiantes estudianteRecover = entity.find(Estudiantes.class, estudiante.getId());
		if (estudianteRecover != null) {
			entity.getTransaction().begin();
			entity.merge(estudiante);
			entity.getTransaction().commit();
		} else { // no lo encontro
			// System.out.println("Estudiante no encontrado");
		}

	}

	@Override
	public void find(Object object) {
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Estudiantes> findAll() {

		List<Estudiantes> estudiantesRecover = (List<Estudiantes>) entity.createQuery("FROM Estudiantes")
				.getResultList();
		return estudiantesRecover;
	}

	@Override
	public Estudiantes findByIdEstudiante(String idEstudiante) {
		estudiantes = entity.find(Estudiantes.class, idEstudiante);
		return estudiantes;
	}

	@Override
	public void remove(Estudiantes estudiante) {
		Estudiantes estudianteRecover = entity.find(Estudiantes.class, estudiante.getId());

		if (estudianteRecover != null) {
			entity.getTransaction().begin();
			entity.remove(estudianteRecover);
			entity.getTransaction().commit();
			// System.out.println("estudiante eliminado...");
		} else {
			// System.out.println("Estudiante no encontrado...");
		}
	}

}