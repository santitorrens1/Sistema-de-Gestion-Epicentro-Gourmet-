package modelo;

public class DetallePedidoPlato {
@Override
	public String toString() {
		return "DetallePedidoPlato [idDetallePedido=" + idDetallePedido + ", plato=" + plato + ", cantidad=" + cantidad
				+ "]";
	}
public DetallePedidoPlato(int idDetallePedido, Plato plato, int cantidad) {
		super();
		this.idDetallePedido = idDetallePedido;
		this.plato = plato;
		this.cantidad = cantidad;
	}
public int getIdDetallePedido() {
		return idDetallePedido;
	}
	public void setIdDetallePedido(int idDetallePedido) {
		this.idDetallePedido = idDetallePedido;
	}
	public Plato getPlato() {
		return plato;
	}
	public void setPlato(Plato plato) {
		this.plato = plato;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
private int idDetallePedido;
private Plato plato;
private int cantidad;
}
