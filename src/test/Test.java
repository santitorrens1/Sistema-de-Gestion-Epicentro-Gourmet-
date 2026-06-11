package test;

import java.time.LocalDate;
import modelo.*;

public class Test {

	public static void main(String[] args) {
		Sistema s = new Sistema();

		//CASO DE USO 1 Altas y Bajas: Métodos para agregar festivales, unidades y personal a las listas de
		//la clase Sistema

		System.out.println("Agregar Festival e Imprimirlo. \n");

		// ----------------------------- Festival
		try {
			s.agregarFestival("UnlaFest", "Verano", LocalDate.of(2026, 6, 11), LocalDate.of(2026, 6, 20), true);
		} catch (Exception e) { System.out.println(e.getMessage()); }

		System.out.println(s.traerFestival("UnlaFest"));

		System.out.println("Agregar Unidades e Imprimirlas. \n");

		// ----------------------------- Unidades (deben existir antes que el personal)
		try {
			s.agregarPuestoDesarmable("UnlaFest", "El Parrillon", null, 20, "abcde12345", true, 2, 75);
			s.agregarFoodTruck("UnlaFest", "Luiggi", null, 30, "qwert45678", true, "dsz429", true);
			s.agregarPuestoDesarmable("UnlaFest", "Shaking", null, 16.0f, "abcde23456", true, 1, 35);
			s.agregarFoodTruck("UnlaFest", "Heladito", null, 26, "qwert11111", true, "AC257FT", true);
		} catch (Exception e) { System.out.println(e.getMessage()); }

		System.out.println("\n");
		System.out.println("Agregar Personal e Imprimirlos. \n");

		// ----------------------------- Personal
		try {
			s.agregarCajero("abcde12345", "Sebastian", "Damonte", 47130790, LocalDate.of(2006, 4, 22), LocalDate.of(2026, 5, 21), "Cajero", "Mañana", true);
			s.agregarCajero("abcde12345", "Thiago", "Dagraca", 47130890, LocalDate.of(2000, 5, 21), LocalDate.of(2021, 4, 21), "Cajero", "Noche", false);
			s.agregarCajero("abcde23456", "Santiago", "Brest", 45263123, LocalDate.of(2002, 4, 14), LocalDate.of(2023, 12, 5), "Cajero", "Mañana", true);
			s.agregarCajero("abcde23456", "Federico", "Lopez", 36211589, LocalDate.of(1995, 8, 7), LocalDate.of(2020, 12, 4), "Cajero", "Noche", false);
		} catch (Exception e) { System.out.println(e.getMessage()); }

		try {
			s.agregarCocinero("abcde12345", "Santiago", "Filipeli", 46123456, LocalDate.of(2003, 2, 26), LocalDate.of(2024, 1, 16), "Cocinero", "Parrilla", 1400.0f, true);
			s.agregarCocinero("qwert45678", "Martin", "Torrens", 45258369, LocalDate.of(2001, 3, 25), LocalDate.of(2022, 6, 6), "Cocinero", "Italiana", 2600.5f, true);
			s.agregarCocinero("abcde23456", "Nahuel", "Garcia", 35412698, LocalDate.of(1998, 8, 9), LocalDate.of(2019, 5, 7), "Cocinero", "Heladeria", 900.5f, true);
			s.agregarCocinero("qwert11111", "Mateo", "Proruk", 31258741, LocalDate.of(2005, 3, 31), LocalDate.of(2026, 2, 14), "Cocinero", "Milkshakes", 918.5f, true);
		} catch (Exception e) { System.out.println(e.getMessage()); }

		System.out.println(s.getLstPersonal());

		System.out.println("\n");
		System.out.println("Asignar Responsables a Unidades e Imprimirlas. \n");

		// ----------------------------- Asignar responsables a las unidades
		s.traerUnidad("abcde12345").setResponsable(s.traerPersonal(45258369));
		s.traerUnidad("qwert45678").setResponsable(s.traerPersonal(46123456));
		s.traerUnidad("abcde23456").setResponsable(s.traerPersonal(35412698));
		s.traerUnidad("qwert11111").setResponsable(s.traerPersonal(31258741));

		System.out.println(s.traerUnidad("abcde12345"));
		System.out.println(s.traerUnidad("qwert45678"));
		System.out.println("\n");
		System.out.println("Agregar Platos a Unidades e Imprimirlos. \n");

		// ----------------------------- Platos
		try {
			s.traerUnidad("qwert45678").agregarPlato("Pizza", 20000.0f, 6850.0f);
			s.traerUnidad("qwert45678").agregarPlato("Carbonara", 18000.0f, 4520.0f);
			s.traerUnidad("abcde12345").agregarPlato("Choripan", 10000.0f, 4000.0f);
			s.traerUnidad("abcde12345").agregarPlato("Parrillada", 45000.0f, 22000.0f);
			s.traerUnidad("abcde23456").agregarPlato("Licuado de banana", 6000.0f, 2000.0f);
			s.traerUnidad("abcde23456").agregarPlato("Licuado de chocolate", 6000.0f, 2000.0f);
			s.traerUnidad("qwert11111").agregarPlato("Helado frutilla", 3200.0f, 1400.0f);
			s.traerUnidad("qwert11111").agregarPlato("Helado vainilla", 3200.0f, 1400.0f);
		} catch (Exception e) { System.out.println(e.getMessage()); }

		System.out.println(s.traerUnidad("qwert45678").getLstPlatos());
		System.out.println(s.traerUnidad("abcde12345").getLstPlatos());
		System.out.println(s.traerUnidad("qwert11111").getLstPlatos());

		System.out.println("\n");
		System.out.println("Agregar Pedidos a Festival e Imprimirlos. \n");

		// ----------------------------- Pedidos
		try {
			s.agregarPedido(LocalDate.of(2026, 6, 11), s.traerFestival("UnlaFest").getNombre(), "abcde12345");
			s.agregarPedido(LocalDate.of(2026, 6, 11), s.traerFestival("UnlaFest").getNombre(), "abcde12345");
			s.agregarPedido(LocalDate.of(2026, 6, 12), s.traerFestival("UnlaFest").getNombre(), "abcde12345");
			s.agregarPedido(LocalDate.of(2026, 6, 13), s.traerFestival("UnlaFest").getNombre(), "abcde12345");
			s.agregarPedido(LocalDate.of(2026, 6, 11), s.traerFestival("UnlaFest").getNombre(), "qwert45678");
			s.agregarPedido(LocalDate.of(2026, 6, 12), s.traerFestival("UnlaFest").getNombre(), "qwert45678");
			s.agregarPedido(LocalDate.of(2026, 6, 12), s.traerFestival("UnlaFest").getNombre(), "qwert45678");
			s.agregarPedido(LocalDate.of(2026, 6, 14), s.traerFestival("UnlaFest").getNombre(), "qwert45678");
			s.agregarPedido(LocalDate.of(2026, 6, 12), s.traerFestival("UnlaFest").getNombre(), "abcde23456");
			s.agregarPedido(LocalDate.of(2026, 6, 13), s.traerFestival("UnlaFest").getNombre(), "abcde23456");
			s.agregarPedido(LocalDate.of(2026, 6, 14), s.traerFestival("UnlaFest").getNombre(), "abcde23456");
			s.agregarPedido(LocalDate.of(2026, 6, 14), s.traerFestival("UnlaFest").getNombre(), "abcde23456");
			s.agregarPedido(LocalDate.of(2026, 6, 12), s.traerFestival("UnlaFest").getNombre(), "qwert11111");
			s.agregarPedido(LocalDate.of(2026, 6, 12), s.traerFestival("UnlaFest").getNombre(), "qwert11111");
			s.agregarPedido(LocalDate.of(2026, 6, 12), s.traerFestival("UnlaFest").getNombre(), "qwert11111");
			s.agregarPedido(LocalDate.of(2026, 6, 12), s.traerFestival("UnlaFest").getNombre(), "qwert11111");
		} catch (Exception e) { System.out.println(e.getMessage()); }

		// ----------------------------- Detalles de pedido
		try {
			s.traerPedido(1).agregarDetallePedido(s.traerUnidad("abcde12345").traerPlato("Choripan"), 3);
			s.traerPedido(2).agregarDetallePedido(s.traerUnidad("abcde12345").traerPlato("Parrillada"), 1);
			s.traerPedido(3).agregarDetallePedido(s.traerUnidad("abcde12345").traerPlato("Choripan"), 1);
			s.traerPedido(4).agregarDetallePedido(s.traerUnidad("abcde12345").traerPlato("Parrillada"), 2);
			s.traerPedido(5).agregarDetallePedido(s.traerUnidad("qwert45678").traerPlato("Carbonara"), 2);
			s.traerPedido(6).agregarDetallePedido(s.traerUnidad("qwert45678").traerPlato("Pizza"), 1);
			s.traerPedido(7).agregarDetallePedido(s.traerUnidad("qwert45678").traerPlato("Pizza"), 4);
			s.traerPedido(8).agregarDetallePedido(s.traerUnidad("qwert45678").traerPlato("Carbonara"), 2);
			s.traerPedido(9).agregarDetallePedido(s.traerUnidad("abcde23456").traerPlato("Licuado de banana"), 2);
			s.traerPedido(10).agregarDetallePedido(s.traerUnidad("abcde23456").traerPlato("Licuado de chocolate"), 1);
			s.traerPedido(11).agregarDetallePedido(s.traerUnidad("abcde23456").traerPlato("Licuado de banana"), 3);
			s.traerPedido(12).agregarDetallePedido(s.traerUnidad("abcde23456").traerPlato("Licuado de chocolate"), 1);
			s.traerPedido(13).agregarDetallePedido(s.traerUnidad("qwert11111").traerPlato("Helado vainilla"), 2);
			s.traerPedido(14).agregarDetallePedido(s.traerUnidad("qwert11111").traerPlato("Helado frutilla"), 1);
			s.traerPedido(15).agregarDetallePedido(s.traerUnidad("qwert11111").traerPlato("Helado vainilla"), 3);
			s.traerPedido(16).agregarDetallePedido(s.traerUnidad("qwert11111").traerPlato("Helado frutilla"), 1);
		} catch (Exception e) { System.out.println(e.getMessage()); }

		for(int i=1;i<17;i++){
			System.out.println(s.traerPedido(i).getLstDetalles());
		}

		System.out.println("\n");
		System.out.println("Calcular Canon e Imprimirlos. \n");

		// ----------------------------- Canon
		System.out.println("Canon " +  s.traerUnidad("abcde12345").getNombreComercial() + "---> " + s.traerUnidad("abcde12345").calcularCanon());
		System.out.println("Canon " +  s.traerUnidad("qwert45678").getNombreComercial() + "---> " + s.traerUnidad("qwert45678").calcularCanon());
		System.out.println("Canon " +  s.traerUnidad("abcde23456").getNombreComercial() + "---> " + s.traerUnidad("abcde23456").calcularCanon());
		System.out.println("Canon " +  s.traerUnidad("qwert11111").getNombreComercial() + "---> " + s.traerUnidad("qwert11111").calcularCanon());

		System.out.println("\n");
		System.out.println("Calcular Liquidación de haberes e Imprimirlos. \n");

		// ----------------------------- Liquidación de haberes
		try {
			System.out.println("Haberes cajero "+s.traerPersonal(47130790).getApellido() + "---> $" +s.traerPersonal(47130790).liquidarHaberes());
			System.out.println("Haberes cajero "+s.traerPersonal(47130890).getApellido() + "---> $"+ s.traerPersonal(47130890).liquidarHaberes());
			System.out.println("Haberes cajero "+s.traerPersonal(45263123).getApellido() + "---> $"+ s.traerPersonal(45263123).liquidarHaberes());
			System.out.println("Haberes cajero "+s.traerPersonal(36211589).getApellido() + "---> $" + s.traerPersonal(36211589).liquidarHaberes());
			System.out.println("Haberes cocinero "+s.traerPersonal(45258369).getApellido() + "---> $"+ s.traerPersonal(45258369).liquidarHaberes());
			System.out.println("Haberes cocinero "+s.traerPersonal(46123456).getApellido() + "---> $"+ s.traerPersonal(46123456).liquidarHaberes());
			System.out.println("Haberes cocinero "+s.traerPersonal(35412698).getApellido() + "---> $"+ s.traerPersonal(35412698).liquidarHaberes());
			System.out.println("Haberes cocinero "+s.traerPersonal(31258741).getApellido() + "---> $"+ s.traerPersonal(31258741).liquidarHaberes());
		} catch (Exception e) { System.out.println(e.getMessage()); }

		System.out.println("\n");
		System.out.println("Calcular Reporte de recaudación e Imprimirlos. \n");
		// ----------------------------- Reporte de recaudación
		System.out.println(s.reporteRecaudacion("UnlaFest"));

		System.out.println("\n");
		System.out.println("Traer Filtro de personal por edad e Imprimirlos. \n");
		// ----------------------------- Filtro de personal por edad
		System.out.println(s.traerPersonalEdad(LocalDate.of(2000, 1, 1), LocalDate.of(2001, 12, 31)));

		System.out.println("\n");
		System.out.println("Calcular Ganacia por Unidad e Imprimirlos. \n");
		// ----------------------------- Ganancia
		System.out.println("La Unidad: " + s.traerUnidad("abcde12345").getNombreComercial()+ " Tuvo una Ganancia o Perdida ---> $"  +s.calcularGanancia("abcde12345"));
		System.out.println("La Unidad: " + s.traerUnidad("qwert45678").getNombreComercial()+ " Tuvo una Ganancia o Perdida ---> $"  +s.calcularGanancia("qwert45678"));
		System.out.println("La Unidad: " + s.traerUnidad("abcde23456").getNombreComercial()+ " Tuvo una Ganancia o Perdida ---> $"  +s.calcularGanancia("abcde23456"));
		System.out.println("La Unidad: " + s.traerUnidad("qwert11111").getNombreComercial()+ " Tuvo una Ganancia o Perdida ---> $"  +s.calcularGanancia("qwert11111"));

		System.out.println("\n");
		System.out.println("Calcular Ranking de unidades e Imprimirlos. \n");

		// ----------------------------- Ranking de unidades
		System.out.println("Ranking de unidades: \n" + s.ordenarUnidadesRecaudaciones());

		System.out.println("\n");
		System.out.println("Calcular Plato estrella de cada unidad e Imprimirlos. \n");
		// ----------------------------- Plato estrella
		System.out.println("Plato estrella de la Unidad " + s.traerUnidad("abcde12345").getNombreComercial() + " ---> "  + s.traerPlatoEstrella("abcde12345", "UnlaFest"));
		System.out.println("Plato estrella de la Unidad " + s.traerUnidad("qwert45678").getNombreComercial() + " ---> "  + s.traerPlatoEstrella("qwert45678", "UnlaFest"));
		System.out.println("Plato estrella de la Unidad " + s.traerUnidad("abcde23456").getNombreComercial() + " ---> "  + s.traerPlatoEstrella("abcde23456", "UnlaFest"));
		System.out.println("Plato estrella de la Unidad " + s.traerUnidad("qwert11111").getNombreComercial() + " ---> "  + s.traerPlatoEstrella("qwert11111", "UnlaFest"));

		System.out.println("\n");
		System.out.println("Auditoría del personal. \n");

		// ----------------------------- Auditoría del personal
		System.out.println(s.traerPersonalFestival("UnlaFest"));

		System.out.println("\n");
		System.out.println("Traer Unidades con mayor Canon. \n");

		//---------------------- Unidades con mayor Canon

		try {
			System.out.print(s.unidadesConMayorCanon("UnlaFest"));
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}

	}

}


