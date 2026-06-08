package modelo;

import java.time.LocalDate;
import java.time.Period;

public abstract class Personal {
	@Override
	public String toString() {
		return "Personal [idPersonal=" + idPersonal + ", nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni
				+ ", fechaNac=" + fechaNac + ", fechaIng=" + fechaIng + ", tipo=" + tipo + ", sueldoBase=" + sueldoBase
				+ "]";
	}
	public Personal(int idPersonal, String nombre, String apellido, int dni, LocalDate fechaNac, LocalDate fechaIng,
			String tipo, float sueldoBase) throws Exception{
		super();
		this.idPersonal = idPersonal;
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		setFechaNac(fechaNac);
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
	public void setFechaNac(LocalDate fechaNac)throws Exception {
		if(Period.between(fechaNac, LocalDate.now()).getYears() < 18)
	        throw new Exception("El personal debe ser mayor de edad");
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
	protected int idPersonal;
	protected String nombre;
	protected String apellido;
	protected int dni;
	protected LocalDate fechaNac;
	protected LocalDate fechaIng;
	protected String tipo;
	protected float sueldoBase;
}
