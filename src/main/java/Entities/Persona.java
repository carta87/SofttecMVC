package Entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "Persona")
public class Persona  implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	private Integer id;
    private String nombre;
    private String apellido;
    @Column(name = "DNI")
    private Integer dni;
    private Boolean empleado;

    public Persona(){
    }

    public Persona(Integer id, String nombre, String apellido, Integer dni, Boolean empleado) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.empleado = empleado;
    }

    public Integer getId() {return id;}
    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getDni() {
        return dni;
    }
    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public Boolean getEmpleado() {
        return empleado;
    }
    public void setEmpleado(Boolean empleado) {
        this.empleado = empleado;
    }

	@Override
	public String toString() {
		return "Persona [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + ", empleado="
				+ empleado + "]";
	}
    
    
}