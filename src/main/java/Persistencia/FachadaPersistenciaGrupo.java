package Persistencia;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import Entities.Grupo;

public class FachadaPersistenciaGrupo implements FachadaPersistenciaGrupoLocal {

	//@PersistenceContext(unitName = "Persistencia")
	private static EntityManagerFactory emf;
	Grupo grupo;

	EntityManager entity = getEntityManagerFactory().createEntityManager();

	public static EntityManagerFactory getEntityManagerFactory() {
		if (emf == null) {
			emf = Persistence.createEntityManagerFactory("Persistencia");
		}
		return emf;
	}

	@Override
	public void create(Grupo grupo) {
		entity.getTransaction().begin();
		entity.persist(grupo);
		entity.getTransaction().commit();
	}

	@Override
	public void edit(Grupo grupo) {
		Grupo grupoRecover = entity.find(Grupo.class, grupo.getId());
		if (grupoRecover != null) { // Encontro
			entity.getTransaction().begin();
			entity.merge(grupo);
			entity.getTransaction().commit();
			// System.out.println("actualizo");
		} else {
			// System.out.println("grupo no encontrado");
		}

	}

	@Override
	public void find(Object object) {
		// TODO Auto-generated method stub

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Grupo> findAll() {
		List<Grupo> grupoRecover = (List<Grupo>) entity.createQuery("FROM Grupo").getResultList();
		return grupoRecover;
	}

	@Override
	public Grupo findIdByGrupo(String idGrupo) {
		grupo = entity.find(Grupo.class, idGrupo);
		return grupo;
	}

	@Override
	public void remove(Grupo grupo) {
		Grupo grupoRecover = entity.find(Grupo.class, grupo.getId());
		if (grupoRecover != null) {
			entity.getTransaction().begin();
			entity.remove(grupoRecover);
			entity.getTransaction().commit();
			//System.out.println("grupo  eliminado...");
		} else {
			//System.out.println("grupo no encontrado...");
		}
	}

}
