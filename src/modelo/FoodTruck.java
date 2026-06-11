package modelo;

import java.util.ArrayList;
import java.util.List;

public class FoodTruck extends UnidadVenta{
	private String patente;
	private boolean electricidad;

	public FoodTruck(int idUnidadVenta, String nombreComercial, Personal responsable, float superficieMt2,
			String codigo, boolean estado, String patente, boolean electricidad) throws Exception {
		super(idUnidadVenta, nombreComercial, responsable, superficieMt2, codigo, estado);
		this.patente = patente;
		this.electricidad = electricidad;
	}

	public String getPatente() {
		return patente;
	}
	public void setPatente(String patente) {
		this.patente = patente;
	}
	public boolean isElectricidad() {
		return electricidad;
	}
	public void setElectricidad(boolean electricidad) {
		this.electricidad = electricidad;
	}

	@Override
	public String toString() {
		return "FoodTruck[ " + super.toString() +  " patente=" + patente + ", electricidad=" + electricidad
				+ ", lstPersonal=" + lstPersonal + "] \n";
	}
	
	public boolean equals(FoodTruck foodTruck) {
		return super.equals(foodTruck);
	}
	
	// CU 3 — Cálculo de Canon - Método que devuelve el monto a pagar por una unidad. FoodTruck: (Superficie × $500) + $2.000 si requiere electricidad. 
	@Override
	public float calcularCanon() {
		
		float canon = (this.getSuperficieMt2() * 500);
		
		if(this.isElectricidad()) {
			canon = canon + 2000;
		}
		return canon;
	}
}
