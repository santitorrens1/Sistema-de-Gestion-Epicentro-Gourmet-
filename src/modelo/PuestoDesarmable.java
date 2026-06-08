package modelo;

import java.util.ArrayList;
import java.util.List;

public class PuestoDesarmable extends UnidadVenta {
	private int cantCarpas;
	private int tiempoMontaje;
	private List<Personal> lstPersonal;
	private List<Plato> lstPlatosOfrecidos;

	public PuestoDesarmable(int idUnidadVenta, String nombreComercial, Personal responsable, float superficieMt2,
			String codigo, boolean estado, int cantCarpas, int tiempoMontaje) {
		super(idUnidadVenta, nombreComercial, responsable, superficieMt2, codigo, estado);
		this.cantCarpas = cantCarpas;
		this.tiempoMontaje = tiempoMontaje;
		this.lstPersonal = new ArrayList<Personal>();
		this.lstPlatosOfrecidos = new ArrayList<Plato>();
	}

	public int getCantCarpas() {
		return cantCarpas;
	}
	public void setCantCarpas(int cantCarpas) {
		this.cantCarpas = cantCarpas;
	}
	public int getTiempoMontaje() {
		return tiempoMontaje;
	}
	public void setTiempoMontaje(int tiempoMontaje) {
		this.tiempoMontaje = tiempoMontaje;
	}
	public List<Personal> getLstPersonal() {
		return lstPersonal;
	}
	public void setLstPersonal(List<Personal> lstPersonal) {
		this.lstPersonal = lstPersonal;
	}
	public List<Plato> getLstPlatosOfrecidos() {
		return lstPlatosOfrecidos;
	}
	public void setLstPlatosOfrecidos(List<Plato> lstPlatosOfrecidos) {
		this.lstPlatosOfrecidos = lstPlatosOfrecidos;
	}

	@Override
	public String toString() {
		return super.toString() +"PuestoDesarmable ["  + ", cantCarpas=" + cantCarpas
				+ ", tiempoMontaje=" + tiempoMontaje + ", lstPersonal=" + lstPersonal + ", lstPlatosOfrecidos="
				+ lstPlatosOfrecidos + "]";
	}
	
	public boolean equals(PuestoDesarmable puestoDesarmable) {
		return super.equals(puestoDesarmable);
	}
}
