package co.edu.konradlorenz.model;

public class Estudiante extends Persona {
	
	public String codigo_estudiantil;

	public Estudiante() {
	}

	public Estudiante(String cedula) {
		super(cedula);
	}
	
	public Estudiante(String cedula, String codigo_estudiantil) {
		super(cedula);
		this.codigo_estudiantil = codigo_estudiantil;
	}
	
	public void pagarMatricula() {
			
	}
	
	public void asistirClase() {
		
	}
	
	public void realizarLecturas() {
		
	}
	
	public void entregarTrabajos() {
		
	}


	public String getCodigo_estudiantil() {
		return codigo_estudiantil;
	}

	public void setCodigo_estudiantil(String codigo_estudiantil) {
		this.codigo_estudiantil = codigo_estudiantil;
	}

	@Override
	public String toString() {
		return "Estudiante [codigo_estudiantil=" + codigo_estudiantil + "]";
	}
	
}
