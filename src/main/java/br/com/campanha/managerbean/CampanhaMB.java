package br.com.campanha.managerbean;

import javax.faces.bean.ManagedBean;

import br.com.campanha.entity.CampanhaEntity;

@ManagedBean
public class CampanhaMB {
	
	private CampanhaEntity campanha = new CampanhaEntity();

	
	
	
	
	public CampanhaEntity getCampanha() {
		return campanha;
	}

	public void setCampanha(CampanhaEntity campanha) {
		this.campanha = campanha;
	}
	
	
}
