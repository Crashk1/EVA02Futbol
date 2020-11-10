package principal;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestJugador {

	@Test
	public void testQuePermitaCrearUnDelantero() {
		
		JugadorDelantero LionelMessi = new JugadorDelantero("Lionel Messi", "Barcelona", 1500000.0, 33, 10, 0, 0, 0, 0, 0);
		
		String nombreEsperado = "Lionel Messi";
		String nombreJugador = LionelMessi.getNombreYApellido();
		
		assertEquals(nombreEsperado, nombreJugador);
		
		Integer edadEsperada = 33;
		Integer edadJugador = LionelMessi.getEdad();
		
		assertEquals(edadEsperada, edadJugador);
	}

	
	@Test
	public void testQuePermitaCobrarUnaAmarilla() {
		
		JugadorDelantero LionelMessi = new JugadorDelantero("Lionel Messi", "Barcelona", 1500000.0, 33, 10, 0, 0, 0, 0, 0);
		
		LionelMessi.cobrarTarjetaAmarilla();
		
		Integer amarillasEsperadas = 1;
		Integer amarillasJugador = LionelMessi.getTarjetasAmarillas();
		
		assertEquals(amarillasEsperadas, amarillasJugador);
		
	}
	
	
	@Test 
	public void testQueActualiceTarjetasCorrectamente() {
		
		JugadorDelantero LionelMessi = new JugadorDelantero("Lionel Messi", "Barcelona", 1500000.0, 33, 10, 23, 0, 0, 0, 0);
		Equipo barcelona = new Equipo("Barcelona", 5, 2, 0.0, 1);
		Equipo madrid = new Equipo("Madrid", 5, 2, 0.0, 1);
		Partido octavos1 = new Partido(barcelona, madrid);
		
		Integer amarillasEsperadas1 = 23;
		Integer amarillasActuales = LionelMessi.getTarjetasAmarillas();
		
		assertEquals(amarillasEsperadas1, amarillasActuales);
		
		octavos1.agregarDelantero(LionelMessi);
		
		octavos1.cobrarTarjetaAJugador("42", "Lionel Messi", "delantero", "amarilla");
		
		LionelMessi.agregarPartidoJugado(octavos1);
		LionelMessi.actualizarHistorialTarjetasAmarillas();
		
		Integer amarillasEsperadas = 1;
		Integer amarillasJugador = LionelMessi.getTarjetasAmarillas();
		
		assertEquals(amarillasEsperadas, amarillasJugador);
	}
}
