package modelo;

import java.util.ArrayList;
import java.util.List;

public class Sistema {
	@Override
	public String toString() {
		return "Sistema [lstFestivales=" + lstFestivales + ", lstUnidades=" + lstUnidades + ", lstPedidos=" + lstPedidos
				+ "]";
	}
	public Sistema() {
		List<Festival> lstFestivales = new ArrayList<Festival>();
		List<UnidadVenta> lstUnidades = new ArrayList<UnidadVenta>();
		List<Pedido> lstPedidos= new ArrayList<Pedido>();
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
}
