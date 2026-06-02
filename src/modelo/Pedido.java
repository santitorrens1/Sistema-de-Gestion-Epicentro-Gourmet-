package modelo;

import java.time.LocalDate;
import java.util.List;

public class Pedido {
@Override
	public String toString() {
		return "Pedido [idPedido=" + idPedido + ", fecha=" + fecha + ", festival=" + festival + ", unidadVenta="
				+ unidadVenta + ", lstDetalles=" + lstDetalles + "]";
	}
public Pedido(int idPedido, LocalDate fecha, Festival festival, UnidadVenta unidadVenta,
			List<DetallePedidoPlato> lstDetalles) {
		super();
		this.idPedido = idPedido;
		this.fecha = fecha;
		this.festival = festival;
		this.unidadVenta = unidadVenta;
		this.lstDetalles = lstDetalles;
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
private int idPedido;
private LocalDate fecha;
private Festival festival;
private UnidadVenta unidadVenta;
private List<DetallePedidoPlato> lstDetalles;
}
