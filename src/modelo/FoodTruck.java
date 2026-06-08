package modelo;

import java.util.ArrayList;
import java.util.List;

public class FoodTruck extends UnidadVenta{
@Override
	public String toString() {
		return super.toString() + "FoodTruck [idFoodTruck=" + idFoodTruck + ", patente=" + patente + ", electricidad=" + electricidad
				+ ", lstPersonal=" + lstPersonal + ", lstPlatosOfrecidos=" + lstPlatosOfrecidos + "]";
	}
public FoodTruck(int idFoodTruck, String nombreComercial, Personal responsable, float superficieMt2,
			String codigo,  boolean estado, String patente, boolean electricidad) throws Exception{
		super(idFoodTruck,nombreComercial, responsable, superficieMt2, codigo,estado);
		this.idFoodTruck = idFoodTruck;
		this.patente = patente;
		this.electricidad = electricidad;
		this.lstPersonal = new ArrayList<Personal>();
		this.lstPlatosOfrecidos = new ArrayList<Plato>();
	}
public int getIdFoodTruck() {
		return idFoodTruck;
	}
	public void setIdFoodTruck(int idFoodTruck) {
		this.idFoodTruck = idFoodTruck;
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
private int idFoodTruck;
private String patente;
private boolean electricidad;
private List<Personal> lstPersonal;
private List<Plato> lstPlatosOfrecidos;
}
