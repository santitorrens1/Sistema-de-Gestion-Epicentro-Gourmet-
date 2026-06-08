package modelo;

import java.time.LocalDate;

public class Cocinero extends Personal {

public Cocinero(int idCocinero, String nombre, String apellido, int dni, LocalDate fechaNac, LocalDate fechaIng,
			String tipo, float sueldoBase, String especialidadCulinaria, float plusCategoria,
			boolean estado)throws Exception {
		super(idCocinero, nombre, apellido, dni, fechaNac, fechaIng, tipo, sueldoBase);
		this.idCocinero = idCocinero;
		this.especialidadCulinaria = especialidadCulinaria;
		this.plusCategoria = plusCategoria;
		this.estado = estado;
	}
@Override
	public String toString() {
		return super.toString() + "Cocinero [idCocinero=" + idCocinero + ", especialidadCulinaria=" + especialidadCulinaria
				+ ", plusCategoria=" + plusCategoria + ", estado=" + estado + "]";
	}
public int getIdCocinero() {
		return idCocinero;
	}
	public void setIdCocinero(int idCocinero) {
		this.idCocinero = idCocinero;
	}
	public String getEspecialidadCulinaria() {
		return especialidadCulinaria;
	}
	public void setEspecialidadCulinaria(String especialidadCulinaria) {
		this.especialidadCulinaria = especialidadCulinaria;
	}
	public float getPlusCategoria() {
		return plusCategoria;
	}
	public void setPlusCategoria(float plusCategoria) {
		this.plusCategoria = plusCategoria;
	}
	public boolean isEstado() {
		return estado;
	}
	public void setEstado(boolean estado) {
		this.estado = estado;
	}
private int idCocinero;
private String especialidadCulinaria;
private float plusCategoria;
private boolean estado;
}
