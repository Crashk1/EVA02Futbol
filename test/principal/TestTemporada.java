package principal;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestTemporada {

	@Test
	public void testQuePruebaAñadirUnNuevoEquipo() {
	
		Temporada verano = new Temporada (1);
		Equipo boca = new Equipo("Boca",0,0,0.0);
		Equipo river = new Equipo("River",0,0,0.0);
		
		verano.agregarEquipos(boca);
		verano.agregarEquipos(river);
		
		Integer cantidadPrueba = 2;
		Integer cantidadEquiposTemporada = verano.getEquipos().size(); 
		assertEquals(cantidadPrueba, cantidadEquiposTemporada);
		
	}
	
	@Test
	public void testQueVerificaPosicionesEnLaTabla(){
		
		Temporada verano = new Temporada (1);
		Equipo boca = new Equipo("Boca",10,0,0.0);
		Equipo river = new Equipo("River",5,5,0.0);
		Equipo sanLorenzo = new Equipo("San Lorenzo",3,7,0.0);
		Equipo independiente = new Equipo("Independiente",0,10,0.0);
		
		verano.agregarEquipos(boca);
		verano.agregarEquipos(river);
		verano.agregarEquipos(sanLorenzo);
		verano.agregarEquipos(independiente);
		
		
		
		
	}
	
	@Test
	public void testQueVerificaQueSeMuestreLaListaDeEquipos() {
		Temporada verano = new Temporada (1);
		Equipo boca = new Equipo("Boca",10,0,0.0);
		Equipo river = new Equipo("River",5,5,0.0);
		Equipo sanLorenzo = new Equipo("San Lorenzo",3,7,0.0);
		Equipo independiente = new Equipo("Independiente",0,10,0.0);
		
		verano.agregarEquipos(boca);
		verano.agregarEquipos(river);
		verano.agregarEquipos(sanLorenzo);
		verano.agregarEquipos(independiente);
		
		verano.cambiarElOrdenDeEquipos(new OrdenarPorVictorias());
		
		for (Equipo e : verano.obtenerEquiposPorVictorias()) {
			System.out.println(e);
			
		}
		
	}

}
