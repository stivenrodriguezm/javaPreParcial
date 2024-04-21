package co.edu.konradlorenz.model;

public class Profesor extends Persona implements Empleado{
	public String tarjeta_profesional;

	public Profesor() {

	}

	public Profesor(String cedula) {
		super(cedula);
	}

	public Profesor(String cedula, String tarjeta_profesional) {
		super(cedula);
		this.tarjeta_profesional = tarjeta_profesional;
	}
	
	public void dictarClase() {
		
	}

	public String getTarjeta_profesional() {
		return tarjeta_profesional;
	}

	public void setTarjeta_profesional(String tarjeta_profesional) {
		this.tarjeta_profesional = tarjeta_profesional;
	}

	@Override
	public String toString() {
		return "Profesor [tarjeta_profesional=" + tarjeta_profesional + "]";
	}

	@Override
	public void cobrarSueldo() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pagarImpuestos() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void asistirReuniones() {
		// TODO Auto-generated method stub
		
	}
		
	
}
