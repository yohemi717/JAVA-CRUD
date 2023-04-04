package org.controller.persona;
import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.dao.persona.DaoPersona;
import org.modelo.persona.Persona;



@SuppressWarnings("serial")
@ManagedBean
@ViewScoped
public class ControllerPersona implements Serializable {
	
	private List<Persona> listPersonas;
	private Persona persona;
	
	
	//SUPER CLASS
	public ControllerPersona() {
		persona = new Persona();
		// TODO Auto-generated constructor stub
	}

	
//GETTERs AND SETERS DE LIST PERSONAS
	
	public List<Persona> getListPersonas() {
		DaoPersona dao = new DaoPersona();
	    listPersonas = dao.ListPersona();
		
		return listPersonas;
	}

	public void setListPersonas(List<Persona> listPersonas) {
		this.listPersonas = listPersonas;
	}
	
	
	
	
	
	
	//GETTERS AND SETTER DE PERSONA

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	
	//METHODS PERSONA
	public void limpiarPersona() {
		persona = new Persona();
	}
	
	public String agregarPersona() {
		DaoPersona dao = new DaoPersona();
		dao.addPersona(persona);
		return "/index.xhtml?faces-redirect=true";
	}
	
	public String modificarPersona() {
		DaoPersona dao = new DaoPersona();
		dao.updatePersona(persona);
		return "/index.xhtml?faces-redirect=true";
	}
	public String eliminarPersona() {
		DaoPersona dao = new DaoPersona();
		dao.deletePersona(persona);
		return "/index.xhtml?faces-redirect=true";
	}

}