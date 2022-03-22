package Entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "Profesores")
public class Profesores extends Usuarios implements Serializable{

	private static final long serialVersionUID = 1L;
	@Column(name= "idgrupo")
	private Integer grupo;
	private Integer nivel;
	 
	public Profesores() {
		
	}
	
	public Profesores(String id, String nombre, String password, Integer grupo, Integer nivel) {
		setNombre(nombre);
		setPassword(nombre);
		
		this.grupo = grupo;
		this.nivel = nivel;
	}

	public Integer getNivel() {
		return nivel;
	}
	public void setNivel(Integer nivel) {
		this.nivel = nivel;
	}

	public Integer getGrupo() {
		return grupo;
	}

	public void setGrupo(Integer grupo) {
		this.grupo = grupo;
	}

	@Override
	public String toString() {
		return "Profesores [nombre = "+ super.getNombre()+ " password = "+super.getPassword() + " grupo=" + grupo + ", nivel=" + nivel + "]";
	}

}



