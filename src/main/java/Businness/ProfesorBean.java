package Businness;

import javax.faces.bean.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;
import Entities.Profesores;
import Persistencia.FachadaPersistenciaProfesorLocal;
import java.util.List;
import java.util.ArrayList;

@Named
@ApplicationScoped
public class ProfesorBean {

	@Inject
	public FachadaPersistenciaProfesorLocal fachadaPersistenciaProfesorLocal;

	private static List<Profesores> listRecover = new ArrayList<>();

	public List<Profesores> getListRecover() {
		return listRecover;
	}

	public void setListRecover(List<Profesores> listRecover) {
		this.listRecover = listRecover;
	}

	public List<Profesores> consultarProfesores() {
		this.listRecover = this.fachadaPersistenciaProfesorLocal.findAll();

		return this.listRecover;
	}
}
