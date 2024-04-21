package co.edu.konradlorenz.model;

public class Decano extends Profesor {
	public String facultad;

	public Decano() {

	}

	public Decano(String cedula, String tarjeta_profesional) {
		super(cedula, tarjeta_profesional);
	}

	public Decano(String facultad) {
		this.facultad = facultad;
	}
	
	public void presentarInforme() {
		
	}

	public String getFacultad() {
		return facultad;
	}

	public void setFacultad(String facultad) {
		this.facultad = facultad;
	}

	@Override
	public String toString() {
		return "Decano [facultad=" + facultad + "]";
	}
	
	
	
}
