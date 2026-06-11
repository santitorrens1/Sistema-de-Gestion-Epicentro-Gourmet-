package modelo;

import java.time.LocalDate;

public class Cocinero extends Personal {

	private String especialidadCulinaria;
	private float plusCategoria;
	private boolean estado;

	public Cocinero(int idPersonal, String nombre, String apellido, int dni, LocalDate fechaNac, LocalDate fechaIng,
			String tipo , String especialidadCulinaria, float plusCategoria,
			boolean estado) throws Exception {
		super(idPersonal, nombre, apellido, dni, fechaNac, fechaIng, tipo);
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
		return "Cocinero " + super.toString() +" Especialidad Culinaria=" + especialidadCulinaria
				+ ", plusCategoria=" + plusCategoria + ", estado=" + estado + "]\n";
	}
	
	public boolean equals(Cocinero cocinero) {
		return super.equals(cocinero);
	}

	//CU 4 - Cocinero: Sueldo Base ($100.000) + Plus por Categoría
	@Override
	public float liquidarHaberes() {
		float sueldo = this.getSueldoBase() + this.getPlusCategoria();
		return sueldo;
	}
}
