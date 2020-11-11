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
	public void testQueReporteCorrectamente() {
		
		Jugador JohnDoe = new Jugador("John Doe", "Marruecos", 12000.0, 25, 9, 10, 2);
		
		System.out.println(JohnDoe.toString());
		System.out.println("");
		
		JugadorDelantero LionelMessi = new JugadorDelantero("Lionel Messi", "Barcelona", 1500000.0, 33, 10, 12, 1, 700, 1300, 400);
		
		System.out.println(LionelMessi.toString());
		System.out.println("");
		
		JugadorDefensa SergioRamos = new JugadorDefensa("Sergio Ramos", "Madrid", 1500000.0, 34, 4, 23, 2, 0, 0, 0);
		
		System.out.println(SergioRamos.toString());
		System.out.println("");
		
		JugadorMediocampo ToniKroos = new JugadorMediocampo("Toni Kroos", "Madrid", 1500000.0, 30, 8, 11, 1, 0, 0, 0);
		
		System.out.println(ToniKroos.toString());
		System.out.println("");
		
		JugadorArquero TerStegen = new JugadorArquero("Ter Stegen", "Barcelona", 1500000.0, 28, 1, 4, 0, 5, 0, 3);
		
		System.out.println(TerStegen.toString());
		System.out.println("");
		
	}
	
	@Test 
	public void testQueActualiceElHistorialCorrectamente() {
		
		JugadorDelantero LionelMessi = new JugadorDelantero("Lionel Messi", "Barcelona", 2000000.0, 33, 10, 23, 0, 0, 0, 0);
		Equipo barcelona = new Equipo("Barcelona", 5, 2, 0.0, 1);
		Equipo madrid = new Equipo("Madrid", 5, 2, 0.0, 1);
		Partido octavos1 = new Partido(barcelona, madrid);
		
		Integer amarillasEsperadas1 = 23;
		Integer amarillasActuales = LionelMessi.getTarjetasAmarillas();
		
		assertEquals(amarillasEsperadas1, amarillasActuales);
		
		octavos1.agregarDelantero(LionelMessi);
		
		octavos1.cobrarTarjetaAJugador("42", "Lionel Messi", "delantero", "amarilla");
		octavos1.cobrarAccion("Lionel Messi", "delantero", "gol");
		
		LionelMessi.actualizarHistorialTarjetasAmarillas();
		LionelMessi.actualizarHistorialGoles();
		
		Integer amarillasEsperadas = 1;
		Integer amarillasJugador = LionelMessi.getTarjetasAmarillas();
		Integer golesEsperados= 1;
		Integer golesJugador= LionelMessi.getGoles();
		
		assertEquals(amarillasEsperadas, amarillasJugador);
		assertEquals(golesEsperados,golesJugador);
		
	}
	
	@Test
	public void testQueElHistorialDefensaFuncioneCorrectamente() {
		
		Equipo barcelona = new Equipo("Barcelona", 5, 2, 0.0, 1);
		Equipo madrid = new Equipo("Madrid", 5, 2, 0.0, 1);
		Partido octavos1 = new Partido(barcelona, madrid);
		JugadorDefensa SergioRamos = new JugadorDefensa("Sergio Ramos", "Madrid", 1500000.0, 34, 4, 23, 0, 0, 0, 0);
		
		octavos1.agregarDefensa(SergioRamos);
		
		Integer amarillasEsperadasDefensa = 23;
		Integer amarillasActualesDefensa = SergioRamos.getTarjetasAmarillas();
		
		assertEquals(amarillasEsperadasDefensa, amarillasActualesDefensa);
		
		octavos1.cobrarTarjetaAJugador("25", "Sergio Ramos", "defensa", "amarilla");
		octavos1.cobrarAccion("Sergio Ramos", "defensa", "robo de balon");
		
		SergioRamos.actualizarHistorialCompleto();
		
		Integer amarillasEsperadasDefensa1 = 1;
		Integer amarillasActualesDefensa1 = SergioRamos.getTarjetasAmarillas();
		Integer robosDeBalonEsperadosDefensa = 1;
		Integer robosDeBalonActualesDefensa = SergioRamos.getBalonesRobados();
		
		assertEquals(amarillasEsperadasDefensa1, amarillasActualesDefensa1);
		assertEquals(robosDeBalonEsperadosDefensa, robosDeBalonActualesDefensa);
		
	}
	
	@Test
	public void testQueElHistorialArqueroFuncioneCorrectamente() {
		
		Equipo barcelona = new Equipo("Barcelona", 5, 2, 0.0, 1);
		Equipo madrid = new Equipo("Madrid", 5, 2, 0.0, 2);
		Partido octavos1 = new Partido(barcelona, madrid);

		JugadorArquero TerStegen = new JugadorArquero("Ter Stegen", "Barcelona", 1500000.0, 34, 4, 23, 0, 5, 0, 3);
		
		octavos1.agregarArquero(TerStegen);
		
		Integer balonesAtajadosEsperados = 5;
		Integer vallasInvictasEsperadas = 3;
		Integer balonesAtajadosActuales = TerStegen.getBalonesAtajados();
		Integer vallasInvictasActuales = TerStegen.getVallasInvictas();
		
		assertEquals(balonesAtajadosEsperados, balonesAtajadosActuales);
		assertEquals(vallasInvictasEsperadas, vallasInvictasActuales);
		
		octavos1.cobrarAccion("Ter Stegen", "arquero", "atajada");
		octavos1.cobrarAccion("Ter Stegen", "arquero", "atajada");
		octavos1.cobrarAccion("Ter Stegen", "arquero", "atajada");
		octavos1.cobrarAccion("Ter Stegen", "arquero", "valla invicta");
		
		TerStegen.actualizarHistorialCompleto();
		
		Integer balonesAtajadosEsperados1 = 3;
		Integer vallasInvictasEsperadas1 = 1;
		Integer balonesAtajadosActuales1 = TerStegen.getBalonesAtajados();
		Integer vallasInvictasActuales1 = TerStegen.getVallasInvictas();
		
		assertEquals(balonesAtajadosEsperados1, balonesAtajadosActuales1);
		assertEquals(vallasInvictasEsperadas1, vallasInvictasActuales1);
		
	}
}