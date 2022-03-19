package Entities;

public class Estudiante extends Usuario {
	private Integer codigo;
	private Grupo grupo;
	
	public Estudiante() {
		
	}
	
	public Estudiante(String id, String nombre, String pasword, Integer codigo, Grupo grupo) {
		setId(id);
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
	public Grupo getGrupo() {
		return grupo;
	}
	public void setGrupo(Grupo grupo) {
		this.grupo = grupo;
	}
	
	

}
