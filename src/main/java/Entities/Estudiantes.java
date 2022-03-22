package Entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name ="Estudiantes")
public class Estudiantes extends Usuarios implements Serializable {
	
	private static final long serialVersionUID = 1L;
	

	private Integer codigo;
	@Column(name= "idgrupo")
	private Integer grupo;

	public Estudiantes() {
		
	}
	
	public Estudiantes(String id, String nombre, String pasword, Integer codigo, Integer grupo) {
		setNombre(nombre);
		setPassword(pasword);
		this.codigo = codigo;
		this.grupo = grupo;
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
		return "Estudiantes [nombre ="+ super.getNombre()+ " password = "+super.getPassword() +" codigo=" + codigo + ", grupo=" + grupo + "]";
	}
	
	    
}
