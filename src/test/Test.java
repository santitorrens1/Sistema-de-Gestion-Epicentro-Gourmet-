package test;

import java.time.LocalDate;
import java.util.List;

import modelo.Cajero;
import modelo.Cocinero;
import modelo.DetallePedidoPlato;
import modelo.Festival;
import modelo.FoodTruck;
import modelo.Pedido;
import modelo.Personal;
import modelo.Plato;
import modelo.PuestoDesarmable;
import modelo.ReporteVenta;
import modelo.Sistema;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sistema s = new Sistema();
	//-----------------------------	
		try {
        s.agregarFestival("UnlaFest", "Verano", LocalDate.of(2026, 6, 11), LocalDate.of(2026, 6, 20), true);
        
	}catch(Exception e) {System.out.println(e.getMessage());}
		
		Festival fest = s.traerFestival("UnlaFest");
		System.out.println(fest);
		
	//	-----------------------------	
		try {
			s.agregarCajero("Sebastian", "Damonte", 47130790, LocalDate.of(2006, 4, 22), LocalDate.of(2026, 5, 21), "Cajero", "Mañana", true);
			s.agregarCajero("Thiago", "Dagraca", 47130890, LocalDate.of(2000, 5, 21), LocalDate.of(2021, 4, 21), "Cajero", "Noche", false);
			
			s.agregarCajero("Santiago", "Brest", 45263123, LocalDate.of(2002, 4, 14), LocalDate.of(2023, 12, 5), "Cajero", "Mañana", true);//
			s.agregarCajero("Federico", "Lopez", 36211589, LocalDate.of(1995, 8, 7), LocalDate.of(2020, 12, 4), "Cajero", "Noche", false);//
		}catch(Exception e) {System.out.println(e.getMessage());}
		
		
		
		try {
			s.agregarCocinero("Santiago", "Filipeli", 46123456, LocalDate.of(2003, 2, 26), LocalDate.of(2024, 1, 16), "Cocinero", "Parrilla", 1400.0f, true);
			s.agregarCocinero("Martin", "Torrens", 45258369, LocalDate.of(2001, 3, 25), LocalDate.of(2022, 6, 6), "Cocinero", "Italiana", 2600.5f, true);
			
			s.agregarCocinero("Nahuel", "Garcia", 35412698, LocalDate.of(1998, 8, 9), LocalDate.of(2019, 5, 7), "Cocinero", "Heladeria", 900.5f, true);//
			s.agregarCocinero("Mateo", "Proruk", 31258741, LocalDate.of(2005, 3, 31), LocalDate.of(2026, 2, 14), "Cocinero", "Milkshakes", 918.5f, true);//
		}catch(Exception e) {System.out.println(e.getMessage());}
		
		
		
		System.out.println(s.getLstPersonal());
		
		//	-----------------------------
		
		try {
			s.agregarPuestoDesarmable("El Parrillon", s.traerPersonal(45258369), 20, "abcde12345", true, 2,75);
			s.agregarFoodTruck("Luiggi", s.traerPersonal(46123456), 30, "qwert45678", true, "dsz429" , true);
			s.agregarPuestoDesarmable("Shaking", s.traerPersonal(35412698), 16.0f, "abcde23456", true, 1, 35);//
			s.agregarFoodTruck("Heladito", s.traerPersonal(31258741), 26, "qwert1111", true, "AC257FT", true);//
		}catch(Exception e) {System.out.println(e.getMessage());}
		
		
		try {
		s.agregarUnidadPDFestival("El Parrillon", s.traerPersonal(45258369), 20, "abcde12345", true, 2,75, "UnlaFest");
		s.agregarUnidadadFTFestival("Luiggi", s.traerPersonal(46123456), 30, "qwert45678", true, "dsz429" , true, "UnlaFest");

		s.agregarUnidadPDFestival("Shaking", s.traerPersonal(35412698), 16.0f, "abcde23456", true, 1, 35, "UnlaFest");//
		s.agregarUnidadadFTFestival("Heladito", s.traerPersonal(31258741), 26, "qwert1111", true, "AC257FT", true, "UnlaFest");//
		
		}catch(Exception e) {System.out.println(e.getMessage());}
		
		System.out.println(s.traerUnidad("abcde12345"));
		System.out.println(s.traerUnidad("qwert45678"));		
	//----------------------------------------
		
		
		try {
		s.traerUnidad("qwert45678").agregarPlato( "Pizza", 20000.0f, 6850.0f);
		s.traerUnidad("qwert45678").agregarPlato( "Carbonara", 18000.0f, 4520.0f);
		
		s.traerUnidad("abcde12345").agregarPlato( "Choripan", 10000.0f, 4000.0f);
		s.traerUnidad("abcde12345").agregarPlato( "Parrillada", 45000.0f, 22000.0f);
		
		s.traerUnidad("abcde23456").agregarPlato("Licuado de banana", 6000.0f, 2000.0f);//
		s.traerUnidad("abcde23456").agregarPlato("Licuado de chocolate", 6000.0f, 2000.0f);//
		
		s.traerUnidad("qwert1111").agregarPlato("Helado frutilla", 3200.0f, 1400.0f);//
		s.traerUnidad("qwert1111").agregarPlato("Helado vainilla", 3200.0f, 1400.0f);//
		
		}catch(Exception e) {System.out.println(e.getMessage());}
		try {
	s.agregarPedido(LocalDate.of(2026, 6, 11), fest.getNombre(), s.traerUnidad("abcde12345").getCodigo());
	s.agregarPedido(LocalDate.of(2026, 6, 11), fest.getNombre(), s.traerUnidad("abcde12345").getCodigo());
	s.agregarPedido(LocalDate.of(2026, 6, 12), fest.getNombre(), s.traerUnidad("abcde12345").getCodigo());
	s.agregarPedido(LocalDate.of(2026, 6, 13), fest.getNombre(), s.traerUnidad("abcde12345").getCodigo());
	//-
	s.agregarPedido(LocalDate.of(2026, 6, 11), fest.getNombre(), s.traerUnidad("qwert45678").getCodigo());
	s.agregarPedido(LocalDate.of(2026, 6, 12), fest.getNombre(), s.traerUnidad("qwert45678").getCodigo());
	s.agregarPedido(LocalDate.of(2026, 6, 12), fest.getNombre(), s.traerUnidad("qwert45678").getCodigo());
	s.agregarPedido(LocalDate.of(2026, 6, 14), fest.getNombre(), s.traerUnidad("qwert45678").getCodigo());
	
	//-------------
	s.agregarPedido(LocalDate.of(2026, 6, 12), fest.getNombre(), s.traerUnidad("abcde23456").getCodigo());
	s.agregarPedido(LocalDate.of(2026, 6, 13), fest.getNombre(), s.traerUnidad("abcde23456").getCodigo());
	s.agregarPedido(LocalDate.of(2026, 6, 14), fest.getNombre(), s.traerUnidad("abcde23456").getCodigo());
	s.agregarPedido(LocalDate.of(2026, 6, 14), fest.getNombre(), s.traerUnidad("abcde23456").getCodigo());
	//-
	s.agregarPedido(LocalDate.of(2026, 6, 12), fest.getNombre(), s.traerUnidad("qwert1111").getCodigo());
	s.agregarPedido(LocalDate.of(2026, 6, 12), fest.getNombre(), s.traerUnidad("qwert1111").getCodigo());
	s.agregarPedido(LocalDate.of(2026, 6, 12), fest.getNombre(), s.traerUnidad("qwert1111").getCodigo());
	s.agregarPedido(LocalDate.of(2026, 6, 12), fest.getNombre(), s.traerUnidad("qwert1111").getCodigo());
	
	

		}catch(Exception e) {System.out.println(e.getMessage());}
		
		
		
		
		/*
		//int idDetallePedido, Plato plato, int cantidad
		s.traerPedido(1).getLstDetalles().add(new DetallePedidoPlato(1, choripan, 3));
		s.traerPedido(2).getLstDetalles().add(new DetallePedidoPlato(2, parrillada, 1));
		s.traerPedido(3).getLstDetalles().add(new DetallePedidoPlato(3, choripan, 1));
		s.traerPedido(4).getLstDetalles().add(new DetallePedidoPlato(4, parrillada, 2));
		//--
		s.traerPedido(5).getLstDetalles().add(new DetallePedidoPlato(5, carbonara, 2));
		s.traerPedido(6).getLstDetalles().add(new DetallePedidoPlato(6, pizza, 1));
		s.traerPedido(7).getLstDetalles().add(new DetallePedidoPlato(7, pizza, 4));
		s.traerPedido(8).getLstDetalles().add(new DetallePedidoPlato(8, carbonara,2 ));
		
		*/
		try {
		s.traerPedido(1).agregarDetallePedido(s.traerUnidad("abcde12345").traerPlato("Choripan"), 3);
		s.traerPedido(2).agregarDetallePedido(s.traerUnidad("abcde12345").traerPlato("Parrillada"), 1);
		s.traerPedido(3).agregarDetallePedido(s.traerUnidad("abcde12345").traerPlato("Choripan"), 1);
		s.traerPedido(4).agregarDetallePedido(s.traerUnidad("abcde12345").traerPlato("Parrillada"), 2);
		
		s.traerPedido(5).agregarDetallePedido(s.traerUnidad("qwert45678").traerPlato("carbonara"), 2);
		s.traerPedido(6).agregarDetallePedido(s.traerUnidad("qwert45678").traerPlato("pizza"), 1);
		s.traerPedido(7).agregarDetallePedido(s.traerUnidad("qwert45678").traerPlato("pizza"), 4);
		s.traerPedido(8).agregarDetallePedido(s.traerUnidad("qwert45678").traerPlato("carbonara"), 2);
		
		s.traerPedido(9).agregarDetallePedido(s.traerUnidad("abcde23456").traerPlato("Licuado de banana"),2);
		s.traerPedido(10).agregarDetallePedido(s.traerUnidad("abcde23456").traerPlato("Licuado de chocolate"),1);
		s.traerPedido(11).agregarDetallePedido(s.traerUnidad("abcde23456").traerPlato("Licuado de banana"),3);
		s.traerPedido(12).agregarDetallePedido(s.traerUnidad("abcde23456").traerPlato("Licuado de chocolate"),1);
		
		s.traerPedido(13).agregarDetallePedido(s.traerUnidad("qwert1111").traerPlato("Helado vainilla"),2);
		s.traerPedido(14).agregarDetallePedido(s.traerUnidad("qwert1111").traerPlato("Helado frutilla"),1);
		s.traerPedido(15).agregarDetallePedido(s.traerUnidad("qwert1111").traerPlato("Helado vainilla"),3);
		s.traerPedido(16).agregarDetallePedido(s.traerUnidad("qwert1111").traerPlato("Helado frutilla"),1);
		}catch(Exception e) {System.out.println(e.getMessage());}

//----------------------- casos de uso
		
		//calculo de canon: 
		float canonF = s.traerUnidad("qwert45678").calcularCanon();
		
		System.out.println("El canon del food truck es: " + canonF);
		
		float canonP = s.traerUnidad("abcde12345").calcularCanon();
		
		System.out.println("El canon del puesto desarmable es: " + canonP);
		
		float  canonF2 = s.traerUnidad("abcde23456").calcularCanon();
		
		System.out.println("El canon del puesto desarmable es: " + canonF2);
		
		float canonP2 = s.traerUnidad("qwert1111").calcularCanon();
		System.out.println("El canon del puesto desarmable es: " + canonP2);

	//---------------- liquidacion de haberes
		
		
		
		System.out.println("Haberes liquidados cajero 1: "+s.traerPersonal(47130790).liquidarHaberes());
		System.out.println("Haberes liquidados cajero 2: "+s.traerPersonal(47130890).liquidarHaberes());
		System.out.println("Haberes liquidados cajero 3: "+s.traerPersonal(45263123).liquidarHaberes());
		System.out.println("Haberes liquidados cajero 4: "+s.traerPersonal(36211589).liquidarHaberes());
		System.out.println("Haberes liquidados cocinero 1: "+s.traerPersonal(45258369).liquidarHaberes());
		System.out.println("Haberes liquidados cocinero 2: "+s.traerPersonal(46123456).liquidarHaberes());
		System.out.println("Haberes liquidados cocinero 3: "+s.traerPersonal(35412698).liquidarHaberes());
		System.out.println("Haberes liquidados cocinero 4: "+s.traerPersonal(31258741).liquidarHaberes());
		
	//---------------------- Reporte de recaudacion
		
		
		
		System.out.println(s.reporteRecaudacion("UnlaFest"));
		
		//3400...3250
		
	//---------------------- Filtro de personal por edad
		System.out.println(s.traerPersonalEdad(LocalDate.of(2000, 1, 1), LocalDate.of(2001, 12, 31)));
		
		
	//---------------------- Calculo de rentabilidad neta	
	System.out.println(s.calcularGanancia(1));
	System.out.println(s.calcularGanancia(2));
	System.out.println(s.calcularGanancia(3));//
	System.out.println(s.calcularGanancia(4));//
	
	//---------------------- Ranking de unidades
	System.out.println("Ranking de unidades: " + s.ordenarUnidadesRecaudaciones());
	
	//---------------------- Plato estrella 
	System.out.println("Plato estrella de 'El Parrillon': " +s.traerPlatoEstrella(1, "UnlaFest"));
	System.out.println("Plato estrella de Luiggi: " + s.traerPlatoEstrella(2, "UnlaFest"));
	System.out.println("Plato estrella de Shaking: " + s.traerPlatoEstrella(3, "UnlaFest"));//
	System.out.println("Plato estrella de Heladito: " + s.traerPlatoEstrella(4, "UnlaFest"));//
	
		
	//---------------------- Auditoria del personal: 
	List<Personal> listaP = s.traerPersonalFestival("UnlaFest");
	System.out.println(listaP);
		
	}
	


}