package modelo;

import java.util.List;

public class PuestoDesarmable extends UnidadVenta {
@Override
	public String toString() {
		return super.toString() +"PuestoDesarmable [idPuestoDesarmable=" + idPuestoDesarmable + ", cantCarpas=" + cantCarpas
				+ ", tiempoMontaje=" + tiempoMontaje + ", lstPersonal=" + lstPersonal + ", lstPlatosOfrecidos="
				+ lstPlatosOfrecidos + "]";
	}
public PuestoDesarmable(int idUnidadVenta, String nombreComercial, Personal responsable, float superficieMt2,
			String codigo, List<Plato> lstPlatos, List<Personal> lstPersonal, List<Pedido> lstPedidos, boolean estado,
			int idPuestoDesarmable, int cantCarpas, int tiempoMontaje, List<Personal> lstPersonal2,
			List<Plato> lstPlatosOfrecidos) {
		super(idUnidadVenta, nombreComercial, responsable, superficieMt2, codigo, lstPlatos, lstPersonal, lstPedidos,
				estado);
		this.idPuestoDesarmable = idPuestoDesarmable;
		this.cantCarpas = cantCarpas;
		this.tiempoMontaje = tiempoMontaje;
		lstPersonal = lstPersonal2;
		this.lstPlatosOfrecidos = lstPlatosOfrecidos;
	}
public int getIdPuestoDesarmable() {
		return idPuestoDesarmable;
	}
	public void setIdPuestoDesarmable(int idPuestoDesarmable) {
		this.idPuestoDesarmable = idPuestoDesarmable;
	}
	public int getCantCarpas() {
		return cantCarpas;
	}
	public void setCantCarpas(int cantCarpas) {
		this.cantCarpas = cantCarpas;
	}
	public int getTiempoMontaje() {
		return tiempoMontaje;
	}
	public void setTiempoMontaje(int tiempoMontaje) {
		this.tiempoMontaje = tiempoMontaje;
	}
	public List<Personal> getLstPersonal() {
		return lstPersonal;
	}
	public void setLstPersonal(List<Personal> lstPersonal) {
		this.lstPersonal = lstPersonal;
	}
	public List<Plato> getLstPlatosOfrecidos() {
		return lstPlatosOfrecidos;
	}
	public void setLstPlatosOfrecidos(List<Plato> lstPlatosOfrecidos) {
		this.lstPlatosOfrecidos = lstPlatosOfrecidos;
	}
private int idPuestoDesarmable;
private int cantCarpas;
private int tiempoMontaje;
private List<Personal> lstPersonal;
private List<Plato> lstPlatosOfrecidos;
}
