package modelo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Sistema {

	private List<Festival> lstFestivales;
	private List<UnidadVenta> lstUnidades;
	private List<Pedido> lstPedidos;
	private List<Personal> lstPersonal;

	public Sistema() {
		this.lstFestivales = new ArrayList<Festival>();
		this.lstUnidades = new ArrayList<UnidadVenta>();
		this.lstPedidos = new ArrayList<Pedido>();
		this.lstPersonal = new ArrayList<Personal>();
	}

	public List<Festival> getLstFestivales() {
		return lstFestivales;
	}
	public List<UnidadVenta> getLstUnidades() {
		return lstUnidades;
	}
	public List<Pedido> getLstPedidos() {
		return lstPedidos;
	}

	@Override
	public String toString() {
		return "Sistema [lstFestivales=" + lstFestivales + ", lstUnidades=" + lstUnidades + ", lstPedidos=" + lstPedidos
				+ "]";
	}


	//CASO DE USO 1 - Métodos para agregar y eliminar festivales, unidades y personal de las listas de la clase Sistema.

	public boolean agregarFestival(String nombre, String temporada, LocalDate fechaInicio, LocalDate fechaFin,  boolean estado) {

		int id = this.lstFestivales.isEmpty() ? 1 : this.lstFestivales.get(this.lstFestivales.size() - 1).getIdFestival() + 1;

		return this.lstFestivales.add(new Festival(id, nombre, temporada, fechaInicio, fechaFin, estado));
	}

	public boolean agregarFoodTruck(String nombreComercial, Personal responsable, float superficie, String codigo, boolean estado, String patente, boolean electricidad) {

		int id = this.lstUnidades.isEmpty() ? 1 : this.lstUnidades.get(this.lstUnidades.size() - 1).getIdUnidadVenta() + 1;

		UnidadVenta fd = new FoodTruck(id, nombreComercial, responsable, superficie, codigo, estado, patente, electricidad);

		return this.lstUnidades.add(fd);

	}

	public boolean agregarPuestoDesarmable(String nombreComercial, Personal responsable, float superficie, String codigo, boolean estado, int cantCarpas, int tiempoMontaje) {

		int id = this.lstUnidades.isEmpty() ? 1 : this.lstUnidades.get(this.lstUnidades.size() - 1).getIdUnidadVenta() + 1;

		UnidadVenta pd = new PuestoDesarmable(id, nombreComercial, responsable, superficie, codigo, estado, cantCarpas, tiempoMontaje);

		return this.lstUnidades.add(pd);

	}

	public boolean agregarCajero(String nombre, String apellido, int dni, LocalDate fechaNac, LocalDate fechaIng,
			String tipo, float sueldoBase, String turno, boolean estado) {

		int id = this.lstPersonal.isEmpty() ? 1 : this.lstPersonal.get(this.lstPersonal.size() - 1).getIdPersonal() + 1;

		Personal ca = new Cajero(id, nombre, apellido, dni,fechaNac,fechaIng, tipo, sueldoBase, turno, estado);

		return this.lstPersonal.add(ca);
	}

	public boolean agregarCocinero(String nombre, String apellido, int dni, LocalDate fechaNac, LocalDate fechaIng,
			String tipo, float sueldoBase, String especialidadCulinaria, float plusCategoria, boolean estado) {

		int id = this.lstPersonal.isEmpty() ? 1 : this.lstPersonal.get(this.lstPersonal.size() - 1).getIdPersonal() + 1;

		Personal co = new Cocinero(id, nombre, apellido, dni,fechaNac,fechaIng, tipo, sueldoBase, especialidadCulinaria, plusCategoria, estado);

		return this.lstPersonal.add(co);
	}

	public boolean eliminarFestival(int idFestival) {

		int i = 0;
		boolean eliminado = false;

		while(i < this.lstFestivales.size() && eliminado == false) {
			if(this.lstFestivales.get(i).getIdFestival() == idFestival) {
				this.lstFestivales.remove(i);
				eliminado = true;
			}
			i++;
		}
		return eliminado;
	}

	public boolean eliminarFoodTruck(int idFoodTruck) {

		int i = 0;
		boolean eliminado = false;

		while(i < this.lstUnidades.size() && eliminado == false) {
			if(this.lstUnidades.get(i).getIdUnidadVenta() == idFoodTruck && this.lstUnidades.get(i) instanceof FoodTruck) {
				this.lstUnidades.remove(i);
				eliminado = true;
			}
			i++;
		}
		return eliminado;
	}

	public boolean eliminarPuestoDesarmable(int idPuestoDesarmable) {

		int i = 0;
		boolean eliminado = false;

		while(i < this.lstUnidades.size() && eliminado == false) {
			if(this.lstUnidades.get(i).getIdUnidadVenta() == idPuestoDesarmable && this.lstUnidades.get(i) instanceof PuestoDesarmable) {
				this.lstUnidades.remove(i);
				eliminado = true;
			}
			i++;
		}
		return eliminado;
	}

	public boolean eliminarCajero(int idCajero) {
		int i = 0;
		boolean eliminado = false;

		while(i < this.lstPersonal.size() && eliminado == false) {
			if(this.lstPersonal.get(i).getIdPersonal() == idCajero && this.lstPersonal.get(i) instanceof Cajero) {
				this.lstPersonal.remove(i);
				eliminado = true;
			}
			i++;
		}
		return eliminado;
	}

	public boolean eliminarCocinero(int idCocinero) {
		int i = 0;
		boolean eliminado = false;

		while(i < this.lstPersonal.size() && eliminado == false) {
			if(this.lstPersonal.get(i).getIdPersonal() == idCocinero && this.lstPersonal.get(i) instanceof Cocinero) {
				this.lstPersonal.remove(i);
				eliminado = true;
			}
			i++;
		}
		return eliminado;
	}

	//CASO DE USO 2 - Localizar cualquier entidad del sistema. Personal se busca por DNI, Unidad por código.

	public Cajero traerCajero(int idCajero) {

		Cajero c = null;
		int i = 0;

		while(i < this.lstPersonal.size() && c == null) {
			if(this.lstPersonal.get(i).getIdPersonal() == idCajero && this.lstPersonal.get(i) instanceof Cajero) {
				c = (Cajero) this.lstPersonal.get(i);
			}
			i++;
		}

		return c;
	}

	public Cocinero traerCocinero(int idCocinero) {

		Cocinero c = null;
		int i = 0;

		while(i < this.lstPersonal.size() && c == null) {
			if(this.lstPersonal.get(i).getIdPersonal() == idCocinero && this.lstPersonal.get(i) instanceof Cocinero) {
				c = (Cocinero) this.lstPersonal.get(i);
			}
			i++;
		}

		return c;
	}

	public FoodTruck traerFoodTruck(int idFoodTruck) {

		FoodTruck f = null;
		int i = 0;

		while(i < this.lstUnidades.size() && f == null) {
			if(this.lstUnidades.get(i).getIdUnidadVenta() == idFoodTruck && this.lstUnidades.get(i) instanceof FoodTruck) {
				f = (FoodTruck) this.lstUnidades.get(i);
			}
			i++;
		}

		return f;
	}

	public PuestoDesarmable traerPuestoDesarmable(int idPuestoDesarmable) {

		PuestoDesarmable p = null;
		int i = 0;

		while(i < this.lstUnidades.size() && p == null) {
			if(this.lstUnidades.get(i).getIdUnidadVenta() == idPuestoDesarmable && this.lstUnidades.get(i) instanceof PuestoDesarmable) {
				p = (PuestoDesarmable) this.lstUnidades.get(i);
			}
			i++;
		}

		return p;
	}
	
	public Pedido traerPedido(int idPedido) {
		Pedido p = null;
		int i = 0;
		
		while(i < this.lstPedidos.size() && p == null) {
			if(this.lstPedidos.get(i).getIdPedido() == idPedido) {
				p = this.lstPedidos.get(i);
			}
			i++;
		}
		
		return p;
	}
	
	public Festival traerFestival(int idFestival) {
		
		Festival f = null;
		int i = 0;
		
		while(i < this.lstFestivales.size() && f == null) {
			if(this.lstFestivales.get(i).getIdFestival() == idFestival) {
				f = this.lstFestivales.get(i);
			}
			i++;
		}
		
		return f;
	}
}
