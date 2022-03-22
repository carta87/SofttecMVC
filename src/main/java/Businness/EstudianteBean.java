package Businness;

import javax.faces.bean.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;
import Entities.Estudiantes;
import Persistencia.FachadaPersistenciaEstudianteLocal;
import java.util.List;
import java.util.ArrayList;

@Named
@ApplicationScoped
public class EstudianteBean  {
	

	@Inject
	public FachadaPersistenciaEstudianteLocal fachadaPersistenciaEstudianteLocal;
	
	private static List<Estudiantes> listRecover = new ArrayList<>();
	

	public List<Estudiantes> getListRecover() {
		return listRecover;
	}

	public void setListRecover(List<Estudiantes> listRecover) {
		this.listRecover = listRecover;
	}

	public List<Estudiantes> consultarEstudiantes(){
		
		this.listRecover = this.fachadaPersistenciaEstudianteLocal.findAll();
		return this.listRecover;
	} 
	
	public void eliminarEstudiante(Estudiantes estudiantes) {
		this.fachadaPersistenciaEstudianteLocal.remove(estudiantes);;
	}
}
