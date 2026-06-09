package modelo;

public class ReporteMayoresCanon {
	private String codigo;
	private String nombreComercial;
	private String tipoUnidad;
	private float canon;
	
	public ReporteMayoresCanon(String codigo, String nombreComercial, String tipoUnidad, float canon) {
		super();
		this.codigo = codigo;
		this.nombreComercial = nombreComercial;
		this.tipoUnidad = tipoUnidad;
		this.canon = canon;
	}
	
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getNombreComercial() {
		return nombreComercial;
	}
	public void setNombreComercial(String nombreComercial) {
		this.nombreComercial = nombreComercial;
	}
	public String getTipoUnidad() {
		return tipoUnidad;
	}
	public void setTipoUnidad(String tipoUnidad) {
		this.tipoUnidad = tipoUnidad;
	}
	public float getCanon() {
		return canon;
	}
	public void setCanon(float canon) {
		this.canon = canon;
	}

	@Override
	public String toString() {
		return "ReporteMayoresCanon [codigo=" + codigo + ", nombreComercial=" + nombreComercial + ", tipoUnidad="
				+ tipoUnidad + ", canon=" + canon + "]";
	}
}
