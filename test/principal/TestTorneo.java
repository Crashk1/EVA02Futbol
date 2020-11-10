package principal;

import static org.junit.Assert.*;

import java.util.Set;

import org.junit.Test;

public class TestTorneo {

//	@Test
//	public void testQuePermitaCrearUnTorneo() {
//		
//		Torneo torneo1 = new Torneo("Copa Libertadores");
//		
//		String nombreProbar = "Copa Libertadores";
//		String nombreActual = torneo1.getNombreTorneo();
//		
//		
//		assertEquals(nombreProbar, nombreActual);
//	
//		
//	}
//	
//	@Test
//	public void testQuePermitaAgregarEquiposAlTorneo() {
//		
//		Torneo torneo1 = new Torneo("Copa Libertadores");
//		Equipo e1 = new Equipo("Boca", 5, 2, 0.0, 1);
//		Equipo e2 = new Equipo("Racing", 1, 154, 0.0, 2);
//		Equipo e3 = new Equipo("River", 0, 50, 0.0, 3);
//		Equipo e4 = new Equipo("San Lorenzo", 4, 4, 0.0, 4);
//		
//		torneo1.agregarEquipos(e1);
//		
//		torneo1.agregarEquipos(e2);
//		
//		torneo1.agregarEquipos(e3);
//		
//		torneo1.agregarEquipos(e4);
//		
//		Integer equiposEsperados = 4;
//		Integer equiposActuales = torneo1.getEquipos().size();
//		
//		assertEquals(equiposEsperados, equiposActuales);
//		
//		System.out.println(e1.toString());
//		
//	}
	
	@Test
	public void testQuePermitaGenerarUnaTablaDePosiciones() {
		
		Torneo torneo1 = new Torneo("Copa Libertadores");
		Equipo e1 = new Equipo("Boca", 0, 0, 0.0, 1);
		Equipo e2 = new Equipo("Racing", 0, 0, 0.0, 2);
		Equipo e3 = new Equipo("River", 0, 0, 0.0, 3);
		Equipo e4 = new Equipo("San Lorenzo", 0, 0, 0.0, 4);
		
		torneo1.agregarEquipos(e1);
		
		torneo1.agregarEquipos(e2);
		
		torneo1.agregarEquipos(e3);
		
		torneo1.agregarEquipos(e4);

		Partido p1 = new Partido(e1, e2);
		
		Partido p2 = new Partido(e3, e4);
		
		Partido p3 = new Partido(e1, e3);
		
		Partido p4 = new Partido(e2, e4);
		
		Partido p5 = new Partido(e2, e3);
		
		Partido p6 = new Partido(e1, e4);
		

	p1.marcarGol(e1);
	p1.marcarGol(e1);
	p1.finalizarPartido();
	
	p2.marcarGol(e3);
	p2.finalizarPartido();
	
	p3.marcarGol(e1);
	p3.finalizarPartido();
		
	p4.marcarGol(e1);
	p4.finalizarPartido();
	
	p5.marcarGol(e2);
	p5.finalizarPartido();
	
	p6.marcarGol(e1);
	p6.finalizarPartido();
	

	torneo1.tablaDePosiciones(torneo1);
	
		
	}

}
