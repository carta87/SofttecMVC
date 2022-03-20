package Businness;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.inject.Inject;

import org.hibernate.service.spi.InjectService;

import Entities.Estudiantes;
import Persistencia.FachadaPersistenciaEstudiante;

import java.util.List;
import java.util.ArrayList;

@ManagedBean
@RequestScoped
public class EstudianteBean {
	
	List<Estudiantes> listEstudiantes = new ArrayList<>();
	@Inject
	private FachadaPersistenciaEstudiante fachadaPersistenciaEstudiante;

	private String prueba="nada por aca";
	

	public String getPrueba() {
		return prueba;
	}

	public void setPrueba(String prueba) {
		this.prueba = prueba;
	}
	
	public List<Estudiantes> getAllStudents(){
		listEstudiantes =  fachadaPersistenciaEstudiante.findAll();
		return listEstudiantes;
	}

	public List<Estudiantes> getListEstudiantes() {
		listEstudiantes =  fachadaPersistenciaEstudiante.findAll();
		return listEstudiantes;
	}

	public void setListEstudiantes(List<Estudiantes> listEstudiantes) {
		this.listEstudiantes = listEstudiantes;
	}
	/*
	public static void main(String[] args) {
		
		EstudianteBean estudianteBean = new EstudianteBean();
		
		List<Estudiantes> listEstudiantes = new ArrayList<>();
		System.out.println("sdasdgagf");
		
		listEstudiantes= estudianteBean.getAllStudents();
		
		for (Estudiantes estudiantes : listEstudiantes) {
			System.out.println(estudiantes);
		}
		
	}*/

}
