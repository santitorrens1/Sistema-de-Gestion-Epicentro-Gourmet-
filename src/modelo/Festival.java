package modelo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Festival {
	private int idFestival;
	private String nombre;
	private String temporada;
	private LocalDate fechaInicio;
	private LocalDate fechaFin;
	private List<Costo>lstCostos;
	private List<UnidadVenta>lstUnidadesVenta;
	public boolean estado;

	public Festival(int idFestival, String nombre, String temporada, LocalDate fechaInicio, LocalDate fechaFin,
			 boolean estado) {
		super();
		this.idFestival = idFestival;
		this.nombre = nombre;
		this.temporada = temporada;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.lstCostos = new ArrayList<Costo>();
		this.lstUnidadesVenta = new ArrayList<UnidadVenta>();
		this.estado = estado;
	}
	
	public int getIdFestival() {
		return idFestival;
	}
	public void setIdFestival(int idFestival) {
		this.idFestival = idFestival;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTemporada() {
		return temporada;
	}
	public void setTemporada(String temporada) {
		this.temporada = temporada;
	}
	public LocalDate getFechaInicio() {
		return fechaInicio;
	}
	public void setFechaInicio(LocalDate fechaInicio) {
		this.fechaInicio = fechaInicio;
	}
	public LocalDate getFechaFin() {
		return fechaFin;
	}
	public void setFechaFin(LocalDate fechaFin) {
		this.fechaFin = fechaFin;
	}
	public List<Costo> getLstCostos() {
		return lstCostos;
	}
	public void setLstCostos(List<Costo> lstCostos) {
		this.lstCostos = lstCostos;
	}
	public List<UnidadVenta> getLstUnidadesVenta() {
		return lstUnidadesVenta;
	}
	public void setLstUnidadesVenta(List<UnidadVenta> lstUnidadesVenta) {
		this.lstUnidadesVenta = lstUnidadesVenta;
	}
	public boolean isEstado() {
		return estado;
	}
	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "Festival [idFestival=" + idFestival + ", nombre=" + nombre + ", temporada=" + temporada
				+ ", fechaInicio=" + fechaInicio + ", fechaFin=" + fechaFin + ", lstCostos=" + lstCostos
				+ ", lstUnidadesVenta=" + lstUnidadesVenta + ", estado=" + estado + "]";
	}
	
	public boolean equals(Festival festival) {
		return this.getNombre().equalsIgnoreCase(festival.getNombre());
	}
}
