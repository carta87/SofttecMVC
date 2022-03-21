/*
package Entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Grupo")
public class Grupo implements Serializable  {
    @Id
	private Integer id;
	private String asignatura;
	private List<Estudiantes> estudiantes;
	private Profesor profesor;
	
	public Grupo() {
		
	}
	

	public String getAsignatura() {
		return asignatura;
	}

	public void setAsignatura(String asignatura) {
		this.asignatura = asignatura;
	}

	public List<Estudiantes> getEstudiantes() {
		return estudiantes;
	}

	public void setEstudiantes(List<Estudiantes> estudiantes) {
		this.estudiantes = estudiantes;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Profesor getProfesor() {
		return profesor;
	}

	public void setProfesor(Profesor profesor) {
		this.profesor = profesor;
	}


	@Override
	public String toString() {
		return "Grupo [id=" + id + ", asignatura=" + asignatura + ", estudiantes=" + estudiantes + ", profesor="
				+ profesor + "]";
	}
	

}

*/