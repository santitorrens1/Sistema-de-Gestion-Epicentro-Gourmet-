package modelo;

import java.time.LocalDate;

public class Cajero extends Personal{

	private String turno;
	private boolean estado;

	public Cajero(int idPersonal, String nombre, String apellido, int dni, LocalDate fechaNac, LocalDate fechaIng,
			String tipo, float sueldoBase, String turno, boolean estado) {
		super(idPersonal, nombre, apellido, dni, fechaNac, fechaIng, tipo, sueldoBase);
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
}
