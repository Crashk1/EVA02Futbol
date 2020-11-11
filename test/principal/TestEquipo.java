package principal;

import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.TreeSet;


import org.junit.Test;

public class TestEquipo {

	@Test
	public void queSePuedaCrearElEquipo() {
		 String nombreEquipo="Barcelona";
		 Integer partidosGanados=2;
		 Integer partidosPerdidos=2;
		 Double gastosTotalesDelEquipo=1000.5;
		 Integer codEquipo=2;
		 
		 
		 Equipo Barcelona = new Equipo (nombreEquipo,partidosGanados,partidosPerdidos,gastosTotalesDelEquipo,codEquipo);
	}
	
	@Test
	public void queSePuedaContratarUnTecnico() {
		String nombreDelEquipo="Barcelona";
		Integer partidosGanados=1; 
		Integer partidosPerdidos=1; 
		Double gastosTotalesDelEquipo=100.0; 
		Integer codEquipo=1;
		
		Equipo Barcelona = new Equipo( nombreDelEquipo,  partidosGanados,  partidosPerdidos,  gastosTotalesDelEquipo,  codEquipo);
		
		Tecnico Guardiola = new Tecnico("Guardiola",100, 55,1);
		Tecnico Guardiola2 = new Tecnico("Guardiola",100, 55,12);

		assertTrue(Barcelona.contratarTecnico(Guardiola));
		assertFalse(Barcelona.contratarTecnico(Guardiola2));

	}
	
	@Test

	public void queSePuedanAgregarJugadores() {
		String nombreDelEquipo="Barcelona";
		Integer partidosGanados=1; 
		Integer partidosPerdidos=1; 
		Double gastosTotalesDelEquipo=100.0; 
		Integer codEquipo=1;
		
		Equipo Barcelona = new Equipo( nombreDelEquipo,  partidosGanados,  partidosPerdidos,  gastosTotalesDelEquipo,  codEquipo);
		
		Jugador Roman = new Jugador("Roman", "Barcelona", 100.5, 39, 10,1, 1);
		assertTrue(Barcelona.agregarJugadoresAlEquipo(Roman));

	}
	

}
