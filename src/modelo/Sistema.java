package modelo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Sistema {
	@Override
	public String toString() {
		return "Sistema [lstFestivales=" + lstFestivales + ", lstUnidades=" + lstUnidades + ", lstPedidos=" + lstPedidos
				+ ", lstPersonal=" + lstPersonal + "]";
	}
	public Sistema() {
		this.lstFestivales = new ArrayList<Festival>();
		this.lstUnidades = new ArrayList<UnidadVenta>();
		this.lstPedidos= new ArrayList<Pedido>();
		this.lstPersonal = new ArrayList<Personal>();
	}
	public List<Personal> getLstPersonal() {
		return lstPersonal;
	}
	
	public List<Festival> getLstFestivales() {
		return lstFestivales;
	}
	public List<UnidadVenta> getLstUnidades() {
		return lstUnidades;
	}
	public List<Pedido> getLstPedidos() {
		return lstPedidos;
	}
	private List<Festival> lstFestivales;
	private List<UnidadVenta> lstUnidades;
	private List<Pedido> lstPedidos;
	private List<Personal> lstPersonal;

public Festival traerFestival(String nombre, LocalDate fechaInicio) {
	int i = 0;
	Festival festival = null;
	
	while(i<lstFestivales.size() && festival == null) {
		if(lstFestivales.get(i).getNombre().equalsIgnoreCase(nombre) 
			&& lstFestivales.get(i).getFechaInicio().equals(fechaInicio)) {
			festival = lstFestivales.get(i);
		}
		i++;
	}
	return festival;
}

public boolean agregarFestival(String nombre, String temporada, LocalDate fechaInicio, LocalDate fechaFin) throws Exception{
	if(traerFestival(nombre,fechaInicio )!= null) {
		throw new Exception("El festival ya existe");
	}
	
	int id;
	if(lstFestivales.isEmpty()) {
		id=0;
	}else {
		id=lstFestivales.get(lstFestivales.size()-1).getIdFestival()+1;
	}
	
	Festival festival = new Festival(id,nombre,temporada,fechaInicio,fechaFin,true);
	return lstFestivales.add(festival);
}

public UnidadVenta traerUnidadVenta(String codigo) {
	int i=0;
	UnidadVenta unidadVenta = null;
	while(i<lstUnidades.size() && unidadVenta == null) {
		if(lstUnidades.get(i).getCodigo().equalsIgnoreCase(codigo)) {
			unidadVenta = lstUnidades.get(i);
		}
		i++;
	}
	return unidadVenta;
}

public boolean agregarFoodTrack(String nombreComercial, Personal responsable, float superficie, String codigo, 
		 String patente, boolean electricidad)throws Exception {
	if(traerUnidadVenta(codigo) !=null) {
		throw new Exception("Esta unidad de venta ya existe");
	}
	
	int id;
	if(lstUnidades.isEmpty()) {
		id=0;
	}else {
		id=lstUnidades.get(lstUnidades.size()-1).getIdUnidadVenta()+1;
	}
	
	FoodTruck foodTruck = new FoodTruck(id,nombreComercial,responsable,superficie,codigo,true,patente,electricidad);
	return lstUnidades.add(foodTruck);
}

public boolean agregarPuestoDesarmable(String nombreComercial, Personal responsable,float superficie, String codigo,
		boolean estado, int cantCarpas, int tiempoMontaje)throws Exception {
	if(traerUnidadVenta(codigo) !=null) {
		throw new Exception("Esta unidad de venta ya existe");
	}
	int id;
	if(lstUnidades.isEmpty()) {
		id=0;
	}else {
		id=lstUnidades.get(lstUnidades.size()-1).getIdUnidadVenta()+1;
	}
	PuestoDesarmable puestoDesarmable = new PuestoDesarmable(id,nombreComercial,responsable,superficie,
			codigo,true,cantCarpas,tiempoMontaje);
	return lstUnidades.add(puestoDesarmable);
}




public Personal traerPersonal(int dni) {
	int i =0;
	Personal personal = null;
	while(i<lstPersonal.size() && personal == null) {
		if(lstPersonal.get(i).getDni() == dni) {
			personal = lstPersonal.get(i);
		}
		i++;
	}
	return personal;
}

public boolean agregarCajero(String nombre, String apellido, int dni, LocalDate fechaNac, LocalDate fechaIng,float sueldoBase, 
		String turno) throws Exception {
	if(traerPersonal(dni)!=null) {
		throw new Exception("Este personal ya existe");
	}
	int id;
	if(lstPersonal.isEmpty()) {
		id=1;
	}else {
		id=lstPersonal.get(lstPersonal.size()-1).getIdPersonal()+1;
	}
	
	Cajero cajero = new Cajero(id,nombre,apellido,dni,fechaNac,fechaIng,"Cajero",sueldoBase,turno,true);
	return lstPersonal.add(cajero);
}

public boolean agregarCocinero(String nombre, String apellido, int dni, LocalDate fechaNac, LocalDate fechaIng,float sueldoBase,
		String especialidadCulinaria, float plusCategoria)throws Exception {
	if(traerPersonal(dni)!=null) {
		throw new Exception("Este personal ya existe");
	}
	
	int id;
	if(lstPersonal.isEmpty()) {
		id=1;
	}else {
		id=lstPersonal.get(lstPersonal.size()-1).getIdPersonal()+1;
	}
	
	Cocinero cocinero = new Cocinero (id,nombre,apellido,dni,fechaNac,fechaIng,"Cocinero",sueldoBase, especialidadCulinaria,plusCategoria, true);
	return lstPersonal.add(cocinero);
}

}

