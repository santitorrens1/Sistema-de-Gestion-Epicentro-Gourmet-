package modelo;

public class Plato {
@Override
	public String toString() {
		return "Plato [idPlato=" + idPlato + ", nombre=" + nombre + ", precioVenta=" + precioVenta + ", costroProd="
				+ costroProd + "]";
	}
public Plato(int idPlato, String nombre, float precioVenta, float costroProd) {
		super();
		this.idPlato = idPlato;
		this.nombre = nombre;
		this.precioVenta = precioVenta;
		this.costroProd = costroProd;
	}
public int getIdPlato() {
		return idPlato;
	}
	public void setIdPlato(int idPlato) {
		this.idPlato = idPlato;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public float getPrecioVenta() {
		return precioVenta;
	}
	public void setPrecioVenta(float precioVenta) {
		this.precioVenta = precioVenta;
	}
	public float getCostroProd() {
		return costroProd;
	}
	public void setCostroProd(float costroProd) {
		this.costroProd = costroProd;
	}
private int idPlato;
private String nombre;
private float precioVenta;
private float costroProd;
}
