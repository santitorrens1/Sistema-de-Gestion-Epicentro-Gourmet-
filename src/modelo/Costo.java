package modelo;

public class Costo {
	private int idCosto;
	private float costoSuperficie;
	private float costoMontaje;
	private float usoElectricidad;

	public Costo(int idCosto, float costoSuperficie, float costoMontaje, float usoElectricidad) {
		super();
		this.idCosto = idCosto;
		this.costoSuperficie = costoSuperficie;
		this.costoMontaje = costoMontaje;
		this.usoElectricidad = usoElectricidad;
	}
	
	public int getIdCosto() {
		return idCosto;
	}
	public void setIdCosto(int idCosto) {
		this.idCosto = idCosto;
	}
	public float getCostoSuperficie() {
		return costoSuperficie;
	}
	public void setCostoSuperficie(float costoSuperficie) {
		this.costoSuperficie = costoSuperficie;
	}
	public float getCostoMontaje() {
		return costoMontaje;
	}
	public void setCostoMontaje(float costoMontaje) {
		this.costoMontaje = costoMontaje;
	}
	public float getUsoElectricidad() {
		return usoElectricidad;
	}
	public void setUsoElectricidad(float usoElectricidad) {
		this.usoElectricidad = usoElectricidad;
	}

	@Override
	public String toString() {
		return "Costo [idCosto=" + idCosto + ", costoSuperficie=" + costoSuperficie + ", costoMontaje=" + costoMontaje
				+ ", usoElectricidad=" + usoElectricidad + "]";
	}
	
	public boolean equals(Costo costo) {
		return this.getIdCosto() == costo.getIdCosto();
	}
}
