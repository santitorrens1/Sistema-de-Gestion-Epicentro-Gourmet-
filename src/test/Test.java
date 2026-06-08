package test;

import java.time.LocalDate;

import modelo.Festival;
import modelo.Personal;
import modelo.Sistema;
import modelo.UnidadVenta;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sistema sistema = new Sistema();
		try {
			sistema.agregarFestival("Lollapalloza", "Verano", LocalDate.of(2026, 6, 7), LocalDate.of(2026, 6, 10));
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		//for(Festival f : sistema.getLstFestivales()) {
		//	System.out.println(f);
		//}
		
		try {
			sistema.agregarCajero("Santiago", "Torrens", 47012913 , LocalDate.of(2005, 10, 6),LocalDate.of(2026, 1, 1), 450000.f, "Noche");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		for(Personal p : sistema.getLstPersonal()) {
			System.out.println(p);
		}
		
		try {
			sistema.agregarFoodTrack("McDonalds", sistema.traerPersonal(47012913), 234.4f, "ASE34FRT54","AA345GH",true);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		for(UnidadVenta u : sistema.getLstUnidades()) {
			System.out.println(u);
	}

}
}
