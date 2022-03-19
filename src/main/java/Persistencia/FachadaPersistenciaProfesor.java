package Persistencia;

import java.util.List;

import javax.persistence.EntityManager;

import Entities.Profesor;

public class FachadaPersistenciaProfesor implements FachadaPersistenciaProfesorLocal {
	
	private EntityManager em;

	@Override
	public void create(Profesor profesor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void edit(Profesor profesor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void find(Object object) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Profesor> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Profesor findByProfesor(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void remove(Profesor profesor) {
		// TODO Auto-generated method stub
		
	}

}
