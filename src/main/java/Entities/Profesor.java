package Entities;

public class Profesor extends Usuario {
	private Grupo grupo;
	private Integer nivel;
	
	public Profesor() {
		
	}
	
	public Profesor(String id, String nombre, String password, Grupo grupo, Integer nivel) {
		setId(id);
		setNombre(nombre);
		setPassword(nombre);
		this.grupo = grupo;
		this.nivel = nivel;
	}


	public Grupo getGrupo() {
		return grupo;
	}
	public void setGrupo(Grupo grupo) {
		this.grupo = grupo;
	}
	public Integer getNivel() {
		return nivel;
	}
	public void setNivel(Integer nivel) {
		this.nivel = nivel;
	}
	
}



