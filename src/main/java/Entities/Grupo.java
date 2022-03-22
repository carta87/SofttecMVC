
package Entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Grupo")
public class Grupo implements Serializable {
   
	//@OneToOne(cascade = {CascadeType.ALL})
	//@JoinColumn(name = "id")
	//private List<Estudiantes> estudiantes;
	//@OneToOne(cascade = {CascadeType.ALL})
	//@JoinColumn(name = "id")
	//@Column(name="idProfesor")
	//private Profesores profesor;
	
	@Id
	private String id;
	private String asignatura;
	@Column(name = "idestudiante")
	private String idEstudiante;
	@Column(name = "idprofesor")
	private String idProfesor;
	
	
	public Grupo() {
		
	}
	
	public Grupo(String id, String asignatura, String idEstudiante, String idProfesor) {
		super();
		this.id = id;
		this.asignatura = asignatura;
		this.idEstudiante = idEstudiante;
		this.idProfesor = idProfesor;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAsignatura() {
		return asignatura;
	}

	public void setAsignatura(String asignatura) {
		this.asignatura = asignatura;
	}

	public String getIdEstudiante() {
		return idEstudiante;
	}

	public void setIdEstudiante(String idEstudiante) {
		this.idEstudiante = idEstudiante;
	}

	public String getIdProfesor() {
		return idProfesor;
	}

	public void setIdProfesor(String idProfesor) {
		this.idProfesor = idProfesor;
	}

	@Override
	public String toString() {
		return "Grupo [id=" + id + ", asignatura=" + asignatura + ", idEstudiante=" + idEstudiante + ", idProfesor="
				+ idProfesor + "]";
	}
}
