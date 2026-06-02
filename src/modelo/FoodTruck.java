package modelo;

import java.util.List;

public class FoodTruck extends UnidadVenta{
@Override
	public String toString() {
		return super.toString() + "FoodTruck [idFoodTruck=" + idFoodTruck + ", patente=" + patente + ", electricidad=" + electricidad
				+ ", lstPersonal=" + lstPersonal + ", lstPlatosOfrecidos=" + lstPlatosOfrecidos + "]";
	}
public FoodTruck(int idUnidadVenta, String nombreComercial, Personal responsable, float superficieMt2,
			String codigo, List<Plato> lstPlatos, List<Personal> lstPersonal, List<Pedido> lstPedidos, boolean estado,
			int idFoodTruck, String patente, boolean electricidad, List<Personal> lstPersonal2,
			List<Plato> lstPlatosOfrecidos) {
		super(idUnidadVenta, nombreComercial, responsable, superficieMt2, codigo, lstPlatos, lstPersonal, lstPedidos,
				estado);
		this.idFoodTruck = idFoodTruck;
		this.patente = patente;
		this.electricidad = electricidad;
		lstPersonal = lstPersonal2;
		this.lstPlatosOfrecidos = lstPlatosOfrecidos;
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
