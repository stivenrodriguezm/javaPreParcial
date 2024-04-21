package co.edu.konradlorenz.model;

public abstract class Persona {
	public String cedula;

	public Persona() {
		
	}
	public Persona(String cedula) {
		this.cedula = cedula;
	}
	
	public void registrarEntrada() {
		
	}
	public void registrarSalida() {
		
	}
	
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	@Override
	public String toString() {
		return "Persona [cedula=" + cedula + "]";
	}	
}
