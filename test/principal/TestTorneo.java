package principal;

import static org.junit.Assert.*;

import java.util.Set;

import org.junit.Test;

public class TestTorneo {

	@Test
	public void testQuePermitaCrearUnTorneo() {
		
		Torneo torneo1 = new Torneo("Copa Libertadores");
		
		String nombreProbar = "Copa Libertadores";
		String nombreActual = torneo1.getNombreTorneo();
		
		
		assertEquals(nombreProbar, nombreActual);
	
		
	}
	
	@Test
	public void testQuePermitaAgregarEquiposAlTorneo() {
		
		Torneo torneo1 = new Torneo("Copa Libertadores");
		Equipo e1 = new Equipo("Boca", 5, 2, 0.0, 1);
		Equipo e2 = new Equipo("Racing", 1, 154, 0.0, 2);
		Equipo e3 = new Equipo("River", 0, 50, 0.0, 3);
		Equipo e4 = new Equipo("San Lorenzo", 4, 4, 0.0, 4);
		
		torneo1.agregarEquipos(e1);
		
		torneo1.agregarEquipos(e2);
		
		torneo1.agregarEquipos(e3);
		
		torneo1.agregarEquipos(e4);
		
		Integer equiposEsperados = 4;
		Integer equiposActuales = torneo1.getEquipos().size();
		
		assertEquals(equiposEsperados, equiposActuales);
		
		System.out.println(e1.toString());
		
	}

}
