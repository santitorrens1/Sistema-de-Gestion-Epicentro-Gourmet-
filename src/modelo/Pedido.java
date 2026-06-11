package modelo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Pedido {

	private int idPedido;
	private LocalDate fecha;
	private Festival festival;
	private UnidadVenta unidadVenta;
	private List<DetallePedidoPlato> lstDetalles;


	public Pedido(int idPedido, LocalDate fecha, Festival festival, UnidadVenta unidadVenta) {
		this.idPedido = idPedido;
		this.fecha = fecha;
		this.festival = festival;
		this.unidadVenta = unidadVenta;
		this.lstDetalles = new ArrayList<DetallePedidoPlato>();
	}
	
	public int getIdPedido() {
		return idPedido;
	}
	public void setIdPedido(int idPedido) {
		this.idPedido = idPedido;
	}
	public LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	public Festival getFestival() {
		return festival;
	}
	public void setFestival(Festival festival) {
		this.festival = festival;
	}
	public UnidadVenta getUnidadVenta() {
		return unidadVenta;
	}
	public void setUnidadVenta(UnidadVenta unidadVenta) {
		this.unidadVenta = unidadVenta;
	}
	public List<DetallePedidoPlato> getLstDetalles() {
		return lstDetalles;
	}
	public void setLstDetalles(List<DetallePedidoPlato> lstDetalles) {
		this.lstDetalles = lstDetalles;
	}
	
	public DetallePedidoPlato traerDetallePedido(Plato plato, int cantidad) {
		DetallePedidoPlato detallePedido = null;
		int i=0;
		while(i<getLstDetalles().size() && detallePedido == null) {
			if(this.getLstDetalles().get(i).getPlato().equals(plato) && this.getLstDetalles().get(i).getCantidad() == cantidad) {
				
				detallePedido = getLstDetalles().get(i);
			}
			i++;
		}
		return detallePedido;
	}
	
	public boolean agregarDetallePedido (Plato plato, int cantidad)throws Exception{
		
		if(traerDetallePedido(plato, cantidad)!=null) {
			throw new Exception("Este detalle ya existe");
		}
		
		int id = this.getLstDetalles().isEmpty() ? 1 : this.getLstDetalles().get(this.getLstDetalles().size() - 1).getIdDetallePedido()+1;

		DetallePedidoPlato detallePedido = new DetallePedidoPlato(id, plato, cantidad);
		
		return this.getLstDetalles().add(detallePedido);
	}

	

	@Override
	public String toString() {
	    return "Pedido [idPedido=" + idPedido + 
	           ", fecha=" + fecha + 
	           ", festival=" + (festival != null ? festival.getNombre() : "null") +
	           ", unidadVenta=" + (unidadVenta != null ? unidadVenta.getCodigo() : "null") +
	           ", lstDetalles=" + lstDetalles + "]";
	}
	
	public boolean equals(Pedido pedido) {
		return this.getIdPedido() == pedido.getIdPedido();
	}
}
