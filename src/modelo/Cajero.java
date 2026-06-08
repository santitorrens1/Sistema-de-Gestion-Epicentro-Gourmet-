package modelo;

import java.time.LocalDate;

public class Cajero extends Personal{
public Cajero(int idCajero, String nombre, String apellido, int dni, LocalDate fechaNac, LocalDate fechaIng,
			String tipo, float sueldoBase, String turno, boolean estado) throws Exception {
		super(idCajero, nombre, apellido, dni, fechaNac, fechaIng, tipo, sueldoBase);
		this.idCajero = idCajero;
		this.turno = turno;
		this.estado = estado;
	}

@Override
	public String toString() {
		return super.toString() + "Cajero [idCajero=" + idCajero + ", turno=" + turno + ", estado=" + estado + "]";
	}

public int getIdCajero() {
		return idCajero;
	}
	public void setIdCajero(int idCajero) {
		this.idCajero = idCajero;
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
private int idCajero;
private String turno;
private boolean estado;
}
