package br.com.campanha.managerbean;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import br.com.campanha.entity.CampanhaEntity;

@ManagedBean
public class CampanhaMB {
	
	private String message;
	private CampanhaEntity campanha = new CampanhaEntity();
	FacesContext context = FacesContext.getCurrentInstance();
	
	
	public void gravaCampanha() {
		
		message = "Campanha gravada";
		context.addMessage(null, new FacesMessage("Sucesso",  message) );
	}
	
	public CampanhaEntity getCampanha() {
		return campanha;
	}

	public void setCampanha(CampanhaEntity campanha) {
		this.campanha = campanha;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
