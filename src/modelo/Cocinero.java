package modelo;

import java.time.LocalDate;

public class Cocinero extends Personal {

	private String especialidadCulinaria;
	private float plusCategoria;
	private boolean estado;

	public Cocinero(int idPersonal, String nombre, String apellido, int dni, LocalDate fechaNac, LocalDate fechaIng,
			String tipo, float sueldoBase, String especialidadCulinaria, float plusCategoria,
			boolean estado) {
		super(idPersonal, nombre, apellido, dni, fechaNac, fechaIng, tipo, sueldoBase);
		this.especialidadCulinaria = especialidadCulinaria;
		this.plusCategoria = plusCategoria;
		this.estado = estado;
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

	@Override
	public String toString() {
		return super.toString() + "Cocinero [" + ", especialidadCulinaria=" + especialidadCulinaria
				+ ", plusCategoria=" + plusCategoria + ", estado=" + estado + "]";
	}
	
	public boolean equals(Cocinero cocinero) {
		return super.equals(cocinero);
	}
}
