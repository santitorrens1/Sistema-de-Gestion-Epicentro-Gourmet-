package modelo;

import java.time.LocalDate;

public class Cajero extends Personal{

	private String turno;
	private boolean estado;

	public Cajero(int idPersonal, String nombre, String apellido, int dni, LocalDate fechaNac, LocalDate fechaIng,
			String tipo, String turno, boolean estado) throws Exception {
		super(idPersonal, nombre, apellido, dni, fechaNac, fechaIng, tipo);
		this.turno = turno;
		this.estado = estado;
	}


	public String getTurno() {
		return turno;
	}
	public void setTurno(String turno) {
		this.turno = turno;
	}
	public boolean isEstado() {
		return estado;
	}
	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return super.toString() + "Cajero ["  + ", turno=" + turno + ", estado=" + estado + "]";
	}
	
	public boolean equals(Cajero cajero) {
		return super.equals(cajero);
	}

	//CU 4 -  Cajero: Sueldo Base ($100.000) + (Antigüedad × $5.000 por año).

	@Override
	public float liquidarHaberes() {
		
		float sueldo = this.getSueldoBase() + (this.calcularAntiguedad() * 5000);
		return sueldo;
	}
	
}
