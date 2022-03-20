package Businness;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import org.hibernate.service.spi.InjectService;

import Entities.Estudiantes;
import Persistencia.FachadaPersistenciaEstudiante;

import java.util.List;
import java.util.ArrayList;

@Named
@RequestScoped
public class EstudianteBean {
	
	private String prueba="nada por aca";
	
	//@Inject
	//private FachadaPersistenciaEstudiante fachadaPersistenciaEstudiante;

	public String getPrueba() {
		return prueba;
	}

	public void setPrueba(String prueba) {
		this.prueba = prueba;
	}
}
