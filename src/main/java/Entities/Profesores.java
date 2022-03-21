
package Entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Profesores")
public class Profesores extends Usuarios implements Serializable{
	@Id
	private String id; 
	@Column(name= "idgrupo")
	private Integer grupo;
	private Integer nivel;
	 
	public Profesores() {
		
	}
	
	public Profesores(String id, String nombre, String password, Integer grupo, Integer nivel) {
		setNombre(nombre);
		setPassword(nombre);
		this.id =id;
		this.grupo = grupo;
		this.nivel = nivel;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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
		return "Profesores [id=" + id + ", grupo=" + grupo + ", nivel=" + nivel + "]";
	}


}



