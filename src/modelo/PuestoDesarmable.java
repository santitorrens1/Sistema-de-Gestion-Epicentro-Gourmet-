package modelo;

import java.util.ArrayList;
import java.util.List;

public class PuestoDesarmable extends UnidadVenta {
	private int cantCarpas;
	private int tiempoMontaje;

	public PuestoDesarmable(int idUnidadVenta, String nombreComercial, Personal responsable, float superficieMt2,
			String codigo, boolean estado, int cantCarpas, int tiempoMontaje) throws Exception {
		super(idUnidadVenta, nombreComercial, responsable, superficieMt2, codigo, estado);
		this.cantCarpas = cantCarpas;
		this.tiempoMontaje = tiempoMontaje;
		
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

	@Override
	public String toString() {
		return super.toString() +"PuestoDesarmable ["  + ", cantCarpas=" + cantCarpas
				+ ", tiempoMontaje=" + tiempoMontaje + ", lstPersonal=" + lstPersonal + "]";
	}
	
	public boolean equals(PuestoDesarmable puestoDesarmable) {
		return super.equals(puestoDesarmable);
	}

	// CU 3 — Cálculo de Canon - Método que devuelve el monto a pagar por una unidad.PuestoDesarmable: (Superficie × $500) − (Tiempo de montaje × $10).. 
	@Override
	public float calcularCanon() {
		 float canon = (this.getSuperficieMt2() * 500) - (this.getTiempoMontaje() * 10);
		 return canon;
	}
}
