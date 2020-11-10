package principal;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestPartido {

	@Test
	public void testQueAgregueDelanteroCorrectamente() {
		
		JugadorDelantero LionelMessi = new JugadorDelantero("Lionel Messi", "Barcelona", 1500000.0, 33, 10, 0, 0, 0, 0, 0);
		Equipo barcelona = new Equipo("Barcelona", 5, 2, 0.0, 1);
		Equipo madrid = new Equipo("Madrid", 5, 2, 0.0, 1);
		Partido octavos1 = new Partido(barcelona, madrid);
		
		octavos1.agregarDelantero(LionelMessi);
		
		String nombreEsperado = "Lionel Messi";
		String nombreJugador = octavos1.delanterosActivos.get(0).getNombreYApellido();
		
		assertEquals(nombreEsperado, nombreJugador);
	}
	
	
	@Test
	public void testQueCobreAmarillaCorrectamente() {
		
		JugadorDelantero LionelMessi = new JugadorDelantero("Lionel Messi", "Barcelona", 1500000.0, 33, 10, 0, 0, 0, 0, 0);
		Equipo barcelona = new Equipo("Barcelona", 5, 2, 0.0, 1);
		Equipo madrid = new Equipo("Madrid", 5, 2, 0.0, 1);
		Partido octavos1 = new Partido(barcelona, madrid);
		
		octavos1.agregarDelantero(LionelMessi);
		
		octavos1.cobrarTarjetaAmarillaAJugador("42", "Lionel Messi", "delantero");
		
		Integer amarillasEsperadas = 1;
		Integer amarillasJugador = LionelMessi.getTarjetasAmarillas();
		
		assertEquals(amarillasEsperadas, amarillasJugador);
	}

}
