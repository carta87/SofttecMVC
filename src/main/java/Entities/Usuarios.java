package Entities;



import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.MappedSuperclass;
import javax.persistence.Table;

@Inheritance(strategy = InheritanceType.JOINED)
@Entity
@Table(name= "Usuarios")
public class Usuarios implements Serializable { //  
	@Id
	private String id;
	private String nombre;
	private String password;
	
	public Usuarios() {
		
	}
	
	public Usuarios(String id, String nombre, String password) {
		this.id = id;
		this.nombre = nombre;
		this.password = password;
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public String toString() {
		return "Usuarios [id=" + id + ", nombre=" + nombre + ", password=" + password + "]";
	}
}