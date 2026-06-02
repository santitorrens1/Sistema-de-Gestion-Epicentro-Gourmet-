package modelo;

public class ReporteVenta {
@Override
	public String toString() {
		return "ReporteVenta [unidadVenta=" + unidadVenta + ", recaudacionTotal=" + recaudacionTotal + "]";
	}
public ReporteVenta(UnidadVenta unidadVenta, float recaudacionTotal) {
		super();
		this.unidadVenta = unidadVenta;
		this.recaudacionTotal = recaudacionTotal;
	}
public UnidadVenta getUnidadVenta() {
		return unidadVenta;
	}
	public void setUnidadVenta(UnidadVenta unidadVenta) {
		this.unidadVenta = unidadVenta;
	}
	public float getRecaudacionTotal() {
		return recaudacionTotal;
	}
	public void setRecaudacionTotal(float recaudacionTotal) {
		this.recaudacionTotal = recaudacionTotal;
	}
private UnidadVenta unidadVenta;
private float recaudacionTotal;
}
