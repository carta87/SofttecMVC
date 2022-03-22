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
/*
	@Override
	public int hashCode() {
		return Objects.hash(codigo, grupo, id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Estudiantes other = (Estudiantes) obj;
		return Objects.equals(codigo, other.codigo) && Objects.equals(grupo, other.grupo)
				&& Objects.equals(id, other.id);
	}*/

/*
   public static void main(String[] args) {
	   Estudiantes estudiantes = new Estudiantes();
	   estudiantes.setNombre("juliana");
	 System.out.println(estudiantes.getNombre());
}*/
	

}
