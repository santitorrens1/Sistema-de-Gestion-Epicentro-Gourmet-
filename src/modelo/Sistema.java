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


	//CU 1 - Métodos para agregar y eliminar festivales, unidades y personal de las listas de la clase Sistema.

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

		Personal ca = new Cajero(id, nombre, apellido, dni,fechaNac,fechaIng, tipo, turno, estado);

		return this.lstPersonal.add(ca);
	}

	public boolean agregarCocinero(String nombre, String apellido, int dni, LocalDate fechaNac, LocalDate fechaIng,
			String tipo, float sueldoBase, String especialidadCulinaria, float plusCategoria, boolean estado) {

		int id = this.lstPersonal.isEmpty() ? 1 : this.lstPersonal.get(this.lstPersonal.size() - 1).getIdPersonal() + 1;

		Personal co = new Cocinero(id, nombre, apellido, dni,fechaNac,fechaIng, tipo, especialidadCulinaria, plusCategoria, estado);

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

	//CU 2 - Localizar cualquier entidad del sistema. Personal se busca por DNI, Unidad por código.
	
	public Cajero traerCajero(int dniCajero) {

		Cajero c = null;
		int i = 0;

		while(i < this.lstPersonal.size() && c == null) {
			if(this.lstPersonal.get(i).getDni() == dniCajero && this.lstPersonal.get(i) instanceof Cajero) {
				c = (Cajero) this.lstPersonal.get(i);
			}
			i++;
		}

		return c;
	}

	public Cocinero traerCocinero(int dniCocinero) {

		Cocinero c = null;
		int i = 0;

		while(i < this.lstPersonal.size() && c == null) {
			if(this.lstPersonal.get(i).getDni() == dniCocinero && this.lstPersonal.get(i) instanceof Cocinero) {
				c = (Cocinero) this.lstPersonal.get(i);
			}
			i++;
		}

		return c;
	}
	
	public UnidadVenta traerUnidad(String codigo) {
		UnidadVenta uv = null;
		int i = 0;
		
		while(i < this.lstUnidades.size() && uv == null) {
			if(this.lstUnidades.get(i).getCodigo().equalsIgnoreCase(codigo) && this.lstUnidades.get(i) instanceof PuestoDesarmable) {
				uv = (PuestoDesarmable) this.lstUnidades.get(i);
			}else if(this.lstUnidades.get(i).getCodigo().equalsIgnoreCase(codigo) && this.lstUnidades.get(i) instanceof FoodTruck) {
				uv = (FoodTruck) this.lstUnidades.get(i);
			}
			i++;
		}
		
		return uv;
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
	
	// CU 3 — Cálculo de Canon - Método que devuelve el monto a pagar por una unidad.
	
	public float calcularCanon(String codigo) {
		float canon = 0;
		boolean calculado = false;
		int i = 0;
		
		while(i < this.lstUnidades.size() && calculado == false) {
			if(this.lstUnidades.get(i).getCodigo().equalsIgnoreCase(codigo) && 
					this.lstUnidades.get(i) instanceof FoodTruck) {
				canon = this.lstUnidades.get(i).calcularCanon();
				calculado = true;
			}
			if(this.lstUnidades.get(i).getCodigo().equalsIgnoreCase(codigo) && 
					this.lstUnidades.get(i) instanceof PuestoDesarmable) {
				canon = this.lstUnidades.get(i).calcularCanon();
				calculado = true;
			}
			i++;
		}
		return canon;
	}
	
	// CU 4 — Liquidación de Haberes - Punto de entrada del sistema. Usa CU #2 (traerPersonal) para obtener el empleado y delega a liquidarHaberes().
	
	public float liquidarHaberes(int dni) {
		
		float sueldo = 0;
		
		if(this.traerCocinero(dni) != null) {
			sueldo = this.traerCocinero(dni).liquidarHaberes();
		}else if(this.traerCajero(dni) != null) {
			sueldo = this.traerCajero(dni).liquidarHaberes();
		}
		
		return sueldo;
	}
	
	// CU 5 - Registro de Pedido Validado - Invoca internamente CU #2 (traerFestival y traerUnidad) 
	// antes de crear el pedido. Si alguna entidad no existe, retorna false.
	
	public boolean agregarPedido(LocalDate fecha, int idFestival, String codigoUnidad) throws Exception{
		
		if(this.traerFestival(idFestival) == null || (this.traerUnidad(codigoUnidad) == null)) {
			throw new Exception("No existe el festival o la unidad ingresada");
		}
		
		int id = this.lstPedidos.isEmpty() ? 1 : this.lstPedidos.get(this.lstPedidos.size() - 1).getIdPedido() + 1;
		
		return this.lstPedidos.add(new Pedido(id, fecha, this.traerFestival(idFestival), this.traerUnidad(codigoUnidad)));
	}
	
	//CU 6 -  Reporte de Recaudación
	//Dado un festival, retornar la lista de unidades con su recaudación total. Utiliza la clase ReporteVenta que no persiste

	public List<ReporteVenta> reporteRecaudacion(int idFestival){
		List<ReporteVenta> reportes = new ArrayList<ReporteVenta>();
		Festival f1 = this.traerFestival(idFestival);	
		for(int i = 0;i < f1.getLstUnidadesVenta().size();i++) {
			float recaudacion = 0;
			for(int j = 0;j < f1.getLstUnidadesVenta().get(i).getLstPedidos().size();j++) {
				for(int h = 0; h < f1.getLstUnidadesVenta().get(i).getLstPedidos().get(j).getLstDetalles().size();h++) {
					DetallePedidoPlato detalle= f1.getLstUnidadesVenta().get(i).getLstPedidos().get(j).getLstDetalles().get(h);
					recaudacion += detalle.getPlato().getPrecioVenta() * detalle.getCantidad();
				}
			}
			ReporteVenta reporte = new ReporteVenta(f1.getLstUnidadesVenta().get(i),recaudacion);
			reportes.add(reporte);
		}
		return reportes;
	}
	
	//CU 7 - CU 7 — Filtro de Personal por Edad
	//Retornar una lista de empleados nacidos entre dos fechas dadas
	
	public List<Personal> traerPersonalEdad(LocalDate fechaInicio,LocalDate fechaFin){
		List<Personal> personales = new ArrayList<Personal>();
		for(int i = 0;i < this.lstPersonal.size();i++) {
			Personal p = lstPersonal.get(i);
			if((p.getFechaNac().isEqual(fechaInicio) || p.getFechaNac().isAfter(fechaInicio)) && (p.getFechaNac().isEqual(fechaFin) || 
					p.getFechaNac().isBefore(fechaFin))) {
				personales.add(p);
			}
		}
		
		return personales;
	}
	
	//CU 8 — Cálculo de Rentabilidad Neta
	//Calcular la ganancia neta de una unidad: (recaudación total de pedidos − costo de producción de los platos) − sueldos del personal − canon de la unidad.
	
	//cree un traerUnidad por id solo para esta funcion porque asi me resulta mas facil
	
	public UnidadVenta traerUnidadPorid(int idUnidadVenta) {
		UnidadVenta u = null;
		int i = 0;
		while(i < this.lstUnidades.size() && u == null) {
			if(this.lstUnidades.get(i).getIdUnidadVenta() == idUnidadVenta) {
				u = lstUnidades.get(i);
			}
			i++;
		}
		return u;   
		
	}
	
	
	public float calcularGanancia(int idUnidadVenta) {
		float totalNeto = 0;
		UnidadVenta u = this.traerUnidadPorid(idUnidadVenta);
		float canon = this.calcularCanon(u.getCodigo());
		float recaudacion = 0;
		float costoProduccion = 0;
		float sueldos = 0;
		for(int i = 0;i < u.getLstPedidos().size();i++) {
			Pedido p = u.getLstPedidos().get(i);
			for(int j = 0;j < p.getLstDetalles().size();j++) {
				Plato plato = p.getLstDetalles().get(j).getPlato();
				recaudacion += plato.getPrecioVenta() * p.getLstDetalles().get(j).getCantidad();
				costoProduccion += plato.getCostroProd() * p.getLstDetalles().get(j).getCantidad();
			}
		}
		
		for(int i = 0; i < u.getLstPersonal().size();i++) {
			sueldos += u.getLstPersonal().get(i).liquidarHaberes();
		}
		totalNeto = (recaudacion - costoProduccion) - sueldos - canon;
		return totalNeto;
		
	}
	
	//CU 9 — Rentabilidad Neta entre dos fechas
	//Para una unidad dada, calcular la rentabilidad neta considerando únicamente los pedidos dentro del rango de fechas indicado
	
	public float calcularGananciaFechas(int idUnidadVenta,LocalDate fechaInicio,LocalDate fechaFin) {
		float totalNeto = 0;
		UnidadVenta u = this.traerUnidadPorid(idUnidadVenta);
		float canon = this.calcularCanon(u.getCodigo());
		float recaudacion = 0;
		float costoProduccion = 0;
		float sueldos = 0;
		for(int i = 0;i < u.getLstPedidos().size();i++) {
			Pedido p = u.getLstPedidos().get(i);
			if((p.getFecha().isEqual(fechaInicio) || p.getFecha().isAfter(fechaInicio)) && (p.getFecha().isEqual(fechaFin) ||
					p.getFecha().isBefore(fechaFin))){
				for(int j = 0;j < p.getLstDetalles().size();j++) {
					Plato plato = p.getLstDetalles().get(j).getPlato();
					recaudacion += plato.getPrecioVenta() * p.getLstDetalles().get(j).getCantidad();
					costoProduccion += plato.getCostroProd() * p.getLstDetalles().get(j).getCantidad();
				}
			}
			
		}
		for(int i = 0; i < u.getLstPersonal().size();i++) {
			sueldos += u.getLstPersonal().get(i).liquidarHaberes();
		}
		totalNeto = (recaudacion - costoProduccion) - sueldos - canon;
		return totalNeto;
		
	}
	
	//CU 10 — Ranking de Unidades
	//Generar una lista de unidades ordenada de mayor a menor recaudación.
	
	public List<UnidadVenta> ordenarUnidadesRecaudaciones(){
		List<UnidadVenta> unidades = new ArrayList<UnidadVenta>(this.lstUnidades);
		
		for(int i = 0;i < unidades.size();i++) {
			for(int j = i  + 1;j < unidades.size();j++) {
				if(this.calcularGanancia(unidades.get(i).getIdUnidadVenta()) < this.calcularGanancia(unidades.get(j).getIdUnidadVenta())) {
					UnidadVenta aux = unidades.get(i);
					unidades.set(i, unidades.get(j));
					unidades.set(j, aux);
				}
			}
		}
		return unidades;
	}
	
	//CU 11 — Plato Estrella
	//Dado una unidad y un festival, devolver el plato que registró la mayor cantidad de unidades pedidas.
	
	public Plato traerPlatoEstrella(int idUnidad,int idFestival) {
		UnidadVenta u = this.traerUnidadPorid(idUnidad);
		Festival f = this.traerFestival(idFestival);
		Plato estrella = null;
		int maximaCant = 0;
		for(int i = 0;i < u.getLstPedidos().size();i++) {
			if(u.getLstPedidos().get(i).getFestival().equals(f)) {
				for(int j = 0;j < u.getLstPedidos().get(i).getLstDetalles().size();j++) {
					DetallePedidoPlato detalle = u.getLstPedidos().get(i).getLstDetalles().get(j);
	 				if(maximaCant < detalle.getCantidad()) {
						maximaCant = detalle.getCantidad();
						estrella = detalle.getPlato();
					}
				}
			}
		}
		return estrella;
		
	}
	
	//CU 12 — Auditoría de Personal del Festival
	//Retornar la lista de todo el personal que trabajó en un festival específico.
	
	public List<Personal> traerPersonalFestival(int idFestival){
		List<Personal> personales = new ArrayList<Personal>();
		Festival f1 = this.traerFestival(idFestival);
		for(int j = 0;j < f1.getLstUnidadesVenta().size();j++) {
			for(int i = 0;i < f1.getLstUnidadesVenta().get(j).getLstPersonal().size();i++) {
				Personal p = f1.getLstUnidadesVenta().get(j).getLstPersonal().get(i);
				personales.add(p);
			}
			}
		
		return personales;
		}
	

	//CU 13 — Unidades con Mayor Canon
	//Dado un festival, devolver las 3 unidades que más gastaron en canon. Utiliza la clase ReporteMayoresCanon que no persiste.
	
	public List<ReporteMayoresCanon> unidadesConMayorCanon(int idFestival){
		List<ReporteMayoresCanon> reportes = new ArrayList<ReporteMayoresCanon>();
		Festival f = this.traerFestival(idFestival);
		List<UnidadVenta> unidadesMayorCanon = new ArrayList<UnidadVenta>(f.getLstUnidadesVenta());
		for(int i = 0;i < unidadesMayorCanon.size();i++) {
			for(int j = i+1;j < unidadesMayorCanon.size();j++) {
				if(this.calcularCanon(unidadesMayorCanon.get(i).getCodigo()) < this.calcularCanon(unidadesMayorCanon.get(j).getCodigo())) {
					UnidadVenta aux = unidadesMayorCanon.get(i);
					unidadesMayorCanon.set(i, unidadesMayorCanon.get(j));
					unidadesMayorCanon.set(j, aux);
				}
			}
		}
		int a = 0;
		while(reportes.size() < 3 && a < unidadesMayorCanon.size()) {
			String tipoUnidad = null;
			UnidadVenta uni = unidadesMayorCanon.get(a);
			if(uni instanceof FoodTruck) {
				tipoUnidad = "FoodTruck";
			}else if(uni instanceof PuestoDesarmable) {
				tipoUnidad = "Puesto Desarmable";
			}
			ReporteMayoresCanon reporte = new ReporteMayoresCanon(uni.getCodigo(),uni.getNombreComercial(),tipoUnidad,this.calcularCanon(uni.getCodigo()));
			reportes.add(reporte);
			a++;
		}
		
		return reportes;
	}

}
