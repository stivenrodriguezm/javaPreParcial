package co.edu.konradlorenz.model;

public class Vigilante extends Persona implements Empleado, Arma{

	public String numero_certificacion;

	public Vigilante() {
	}
	
	public Vigilante(String cedula) {
		super(cedula);
	}

	public Vigilante(String cedula, String numero_certificacion) {
		super(cedula);
		this.numero_certificacion = numero_certificacion;
	}

	public String getNumero_certificacion() {
		return numero_certificacion;
	}

	public void setNumero_certificacion(String numero_certificacion) {
		this.numero_certificacion = numero_certificacion;
	}

	@Override
	public String toString() {
		return "Vigilante [numero_certificacion=" + numero_certificacion + "]";
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

	@Override
	public void disparar() {
		// TODO Auto-generated method stub
		
	}
		
}
