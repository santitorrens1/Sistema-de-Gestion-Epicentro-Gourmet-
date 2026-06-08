package modelo;

import java.time.LocalDate;

public abstract class Personal {

	protected int idPersonal;
	protected String nombre;
	protected String apellido;
	protected int dni;
	protected LocalDate fechaNac;
	protected LocalDate fechaIng;
	protected String tipo;
	protected float sueldoBase;

	public Personal(int idPersonal, String nombre, String apellido, int dni, LocalDate fechaNac, LocalDate fechaIng,
			String tipo, float sueldoBase) {
		super();
		this.idPersonal = idPersonal;
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.fechaNac = fechaNac;
		this.fechaIng = fechaIng;
		this.tipo = tipo;
		this.sueldoBase = sueldoBase;
	}
	public int getIdPersonal() {
		return idPersonal;
	}
	public void setIdPersonal(int idPersonal) {
		this.idPersonal = idPersonal;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
	public LocalDate getFechaNac() {
		return fechaNac;
	}
	public void setFechaNac(LocalDate fechaNac) {
		this.fechaNac = fechaNac;
	}
	public LocalDate getFechaIng() {
		return fechaIng;
	}
	public void setFechaIng(LocalDate fechaIng) {
		this.fechaIng = fechaIng;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public float getSueldoBase() {
		return sueldoBase;
	}
	public void setSueldoBase(float sueldoBase) {
		this.sueldoBase = sueldoBase;
	}

	@Override
	public String toString() {
		return "Personal [idPersonal=" + idPersonal + ", nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni
				+ ", fechaNac=" + fechaNac + ", fechaIng=" + fechaIng + ", tipo=" + tipo + ", sueldoBase=" + sueldoBase
				+ "]";
	}
	
	public boolean equals(Personal personal) {
		return this.getDni() == personal.getDni();
	}
}
