package modelo;

import java.util.ArrayList;
import java.util.List;

public abstract class UnidadVenta {
	
	protected int idUnidadVenta;
	protected String nombreComercial;
	protected Personal responsable;
	protected float superficieMt2;
	protected String codigo;
	protected List<Plato> lstPlatos;
	protected List<Personal> lstPersonal;
	protected List<Pedido> lstPedidos;
	protected boolean estado;

	public UnidadVenta(int idUnidadVenta, String nombreComercial, Personal responsable, float superficieMt2,
			String codigo,  boolean estado) {
		super();
		this.idUnidadVenta = idUnidadVenta;
		this.nombreComercial = nombreComercial;
		this.responsable = responsable;
		this.superficieMt2 = superficieMt2;
		this.codigo = codigo;
		this.lstPlatos = new ArrayList<Plato>();
		this.lstPersonal = new ArrayList<Personal>();
		this.lstPedidos = new ArrayList<Pedido>();
		this.estado = estado;
	}
	
	public int getIdUnidadVenta() {
		return idUnidadVenta;
	}
	public void setIdUnidadVenta(int idUnidadVenta) {
		this.idUnidadVenta = idUnidadVenta;
	}
	public String getNombreComercial() {
		return nombreComercial;
	}
	public void setNombreComercial(String nombreComercial) {
		this.nombreComercial = nombreComercial;
	}
	public Personal getResponsable() {
		return responsable;
	}
	public void setResponsable(Personal responsable) {
		this.responsable = responsable;
	}
	public float getSuperficieMt2() {
		return superficieMt2;
	}
	public void setSuperficieMt2(float superficieMt2) {
		this.superficieMt2 = superficieMt2;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public List<Plato> getLstPlatos() {
		return lstPlatos;
	}
	public void setLstPlatos(List<Plato> lstPlatos) {
		this.lstPlatos = lstPlatos;
	}
	public List<Personal> getLstPersonal() {
		return lstPersonal;
	}
	public void setLstPersonal(List<Personal> lstPersonal) {
		this.lstPersonal = lstPersonal;
	}
	public List<Pedido> getLstPedidos() {
		return lstPedidos;
	}
	public void setLstPedidos(List<Pedido> lstPedidos) {
		this.lstPedidos = lstPedidos;
	}
	public boolean isEstado() {
		return estado;
	}
	public void setEstado(boolean estado) {
		this.estado = estado;
	}


	@Override
	public String toString() {
		return "UnidadVenta [idUnidadVenta=" + idUnidadVenta + ", nombreComercial=" + nombreComercial + ", responsable="
				+ responsable + ", superficieMt2=" + superficieMt2 + ", codigo=" + codigo + ", lstPlatos=" + lstPlatos
				+ ", lstPersonal=" + lstPersonal + ", lstPedidos=" + lstPedidos + ", estado=" + estado + "]";
	}
	
	public boolean equals(UnidadVenta unidadVenta) {
		return this.getCodigo().equalsIgnoreCase(unidadVenta.getCodigo());
	}
	
	//CASO DE USO 2 - Localizar cualquier entidad del sistema.
	public Plato traerPlato(int idPlato) {
		Plato p = null;
		int i = 0;
		
		while(i < this.lstPlatos.size() && p == null) {
			if(this.lstPlatos.get(i).getIdPlato() == idPlato) {
				p = this.lstPlatos.get(i);
			}
			i++;
		}
		
		return p;
	}
	
	public abstract float calcularCanon();
	
}
