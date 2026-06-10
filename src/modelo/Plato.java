package modelo;

public class Plato {
	private int idPlato;
	private String nombre;
	private float precioVenta;
	private float costoProd;

	public Plato(int idPlato, String nombre, float precioVenta, float costroProd) {
		super();
		this.idPlato = idPlato;
		this.nombre = nombre;
		this.precioVenta = precioVenta;
		this.costoProd = costroProd;
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
	public float getCostoProd() {
		return costoProd;
	}
	public void setCostroProd(float costroProd) {
		this.costoProd = costroProd;
	}

	@Override
	public String toString() {
		return "Plato [idPlato=" + idPlato + ", nombre=" + nombre + ", precioVenta=" + precioVenta + ", costoProd="
				+ costoProd + "]";
	}
	
	public boolean equals(Plato plato) {
		return this.getNombre().equalsIgnoreCase(plato.getNombre());
	}
	
}
