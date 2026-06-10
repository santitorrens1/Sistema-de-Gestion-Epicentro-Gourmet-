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
