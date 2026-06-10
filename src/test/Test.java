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
		}catch(Exception e) {System.out.println(e.getMessage());}
		
		Cajero c1 = (Cajero) s.traerPersonal(47130790);
		Cajero c2= (Cajero) s.traerPersonal(47130890);
		
		try {
			s.agregarCocinero("Santiago", "Filipeli", 46123456, LocalDate.of(2003, 2, 26), LocalDate.of(2024, 1, 16), "Cocinero", "Parrilla", 1400.0f, true);
			s.agregarCocinero("Martin", "Torrens", 45258369, LocalDate.of(2001, 3, 25), LocalDate.of(2022, 6, 6), "Cocinero", "Italiana", 2600.5f, true);
		}catch(Exception e) {System.out.println(e.getMessage());}
		
		Cocinero co1 = (Cocinero) s.traerPersonal(46123456);
		Cocinero co2 = (Cocinero) s.traerPersonal(45258369);
		
		System.out.println(s.getLstPersonal());
		
		//	-----------------------------
		
		try {
			s.agregarPuestoDesarmable("El Parrillon", co2, 20, "abcde12345", true, 2,75);
			s.agregarFoodTruck("Luiggi", co2, 30, "qwert45678", true, "dsz429" , true);
		}catch(Exception e) {System.out.println(e.getMessage());}
		
		PuestoDesarmable p = (PuestoDesarmable) s.traerUnidad("abcde12345");
		FoodTruck f = (FoodTruck)s.traerUnidad("qwert45678");
		
		try {
		s.agregarUnidadPDFestival("El Parrillon", co2, 20, "abcde12345", true, 2,75, "UnlaFest");
		s.agregarUnidadadFTFestival("Luiggi", co2, 30, "qwert45678", true, "dsz429" , true, "UnlaFest");
		}catch(Exception e) {System.out.println(e.getMessage());}
		
		System.out.println(p);
		System.out.println(f);
		
	//----------------------------------------
		
			Plato pizza = new Plato(1, "Pizza", 250.5f, 125.0f);
			Plato carbonara = new Plato(2, "Carbonara", 500.0f, 230.0f);
			Plato parrillada = new Plato(3, "Parrillada", 800.0f, 400.0f);
			Plato choripan = new Plato(4, "Choripan", 250.0f, 130.0f);
		
		
		
		f.getLstPlatos().add(pizza);
		f.getLstPlatos().add(carbonara);
		
		p.getLstPlatos().add(choripan);
		p.getLstPlatos().add(parrillada);
		
		try {
	s.agregarPedido(LocalDate.of(2026, 6, 11), fest.getNombre(), p.getCodigo());
	s.agregarPedido(LocalDate.of(2026, 6, 11), fest.getNombre(), p.getCodigo());
	s.agregarPedido(LocalDate.of(2026, 6, 12), fest.getNombre(), p.getCodigo());
	s.agregarPedido(LocalDate.of(2026, 6, 13), fest.getNombre(), p.getCodigo());
	//-
	s.agregarPedido(LocalDate.of(2026, 6, 11), fest.getNombre(), f.getCodigo());
	s.agregarPedido(LocalDate.of(2026, 6, 12), fest.getNombre(), f.getCodigo());
	s.agregarPedido(LocalDate.of(2026, 6, 12), fest.getNombre(), f.getCodigo());
	s.agregarPedido(LocalDate.of(2026, 6, 14), fest.getNombre(), f.getCodigo());

		}catch(Exception e) {System.out.println(e.getMessage());}
		
		
		
		Pedido p1 = s.traerPedido(1);
		Pedido p2 = s.traerPedido(2);
		Pedido p3 = s.traerPedido(3);
		Pedido p4 = s.traerPedido(4);
		Pedido p5 = s.traerPedido(5);
		Pedido p6 = s.traerPedido(6);
		Pedido p7 = s.traerPedido(7);
		Pedido p8 = s.traerPedido(8);
		
		//int idDetallePedido, Plato plato, int cantidad
		p1.getLstDetalles().add(new DetallePedidoPlato(1, choripan, 3));
		p2.getLstDetalles().add(new DetallePedidoPlato(2, parrillada, 1));
		p3.getLstDetalles().add(new DetallePedidoPlato(3, choripan, 1));
		p4.getLstDetalles().add(new DetallePedidoPlato(4, parrillada, 2));
		//--
		p5.getLstDetalles().add(new DetallePedidoPlato(5, carbonara, 2));
		p6.getLstDetalles().add(new DetallePedidoPlato(6, pizza, 1));
		p7.getLstDetalles().add(new DetallePedidoPlato(7, pizza, 4));
		p8.getLstDetalles().add(new DetallePedidoPlato(8, carbonara,2 ));
		
		
		
		

//----------------------- casos de uso
		
		//calculo de canon: 
		float canonF = f.calcularCanon();
		
		System.out.println("El canon del food truck es: " + canonF);
		
		Float canonP = p.calcularCanon();
		
		System.out.println("El canon del puesto desarmable es: " + canonP);

	//---------------- liquidacion de haberes
		
		float hab1, hab2, hab3, hab4;
		hab1 = c1.liquidarHaberes();
		hab2 = c2.liquidarHaberes();
		hab3 = co1.liquidarHaberes();
		hab4 = co2.liquidarHaberes();
		
		System.out.println("Haberes liquidados cajero 1: "+hab1);
		System.out.println("Haberes liquidados cajero 2: "+hab2);
		System.out.println("Haberes liquidados cocinero 1: "+hab3);
		System.out.println("Haberes liquidados cocinero 2: "+hab4);
		
	//---------------------- Reporte de recaudacion
		
		
		
		System.out.println(s.reporteRecaudacion("UnlaFest"));
		
		//3400...3250
}

}