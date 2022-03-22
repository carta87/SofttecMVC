package Businness;

import javax.faces.bean.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;
import Entities.Grupo;
import Persistencia.FachadaPersistenciaGrupoLocal;
import java.util.List;
import java.util.ArrayList;

@Named
@ApplicationScoped
public class GrupoBean  { 
	
	@Inject
	public FachadaPersistenciaGrupoLocal fachadaPersistenciaGrupoLocal;
	
	private static List<Grupo> listRecover = new ArrayList<>();
	
	
	public List<Grupo> getListRecover() {
		return listRecover;
	}

	public void setListRecover(List<Grupo> listRecover) {
		this.listRecover = listRecover;
	}


	public List<Grupo> consultarGrupo(){
		
		this.listRecover = this.fachadaPersistenciaGrupoLocal.findAll();
		return this.listRecover;
	}
}
