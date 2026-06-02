package modelo;

public class DetalleUnidadPlato {
@Override
	public String toString() {
		return "DetalleUnidadPlato [idUnidadPlato=" + idUnidadPlato + ", plato=" + plato + "]";
	}
public DetalleUnidadPlato(int idUnidadPlato, Plato plato) {
		super();
		this.idUnidadPlato = idUnidadPlato;
		this.plato = plato;
	}
public int getIdUnidadPlato() {
		return idUnidadPlato;
	}
	public void setIdUnidadPlato(int idUnidadPlato) {
		this.idUnidadPlato = idUnidadPlato;
	}
	public Plato getPlato() {
		return plato;
	}
	public void setPlato(Plato plato) {
		this.plato = plato;
	}
private int idUnidadPlato;
private Plato plato;
}
