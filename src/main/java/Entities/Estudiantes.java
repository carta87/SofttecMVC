package Entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="Estudiantes")
public class Estudiantes extends Usuarios implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
    @Id
	private String id;
	private Integer codigo;
	@Column(name= "idgrupo")
	private Integer grupo;

	public Estudiantes() {
		
	}
	
	public Estudiantes(String id, String nombre, String pasword, Integer codigo, Integer grupo) {
		setNombre(nombre);
		setPassword(pasword);
		this.id = id;
		this.codigo = codigo;
		this.grupo = grupo;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	public Integer getGrupo() {
		return grupo;
	}
	public void setGrupo(Integer grupo) {
		this.grupo = grupo;
	}

	@Override
	public String toString() {
		return "Estudiantes [id=" + id + " codigo=" + codigo + ", grupo=" + grupo + "]";
	}



	

}
