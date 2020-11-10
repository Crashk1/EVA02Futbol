package principal;

import java.util.TreeSet;

import static org.junit.Assert.assertTrue;

import java.util.Set;

public class Torneo {

	private String nombreTorneo;
	private TreeSet <Equipo> equipos= new TreeSet<Equipo>();

	
	
	public Torneo(String nombreDelTorneo) {
		this.nombreTorneo = nombreDelTorneo;
	}

	public String getNombreTorneo() {
		return nombreTorneo;
	}


	public void setNombreTorneo(String nombreTorneo) {
		this.nombreTorneo = nombreTorneo;
	}

	public Set<Equipo> getEquipos() {
		return equipos;
	}
	
/*	public TreeSet <Equipo> tablaDeposiciones(){
		Integer mayor=0;
		int i=0;
		for (Equipo j : equipos) {
		if(i==0)
		mayor=j.getPartidosGanados();
		else {
		assertTrue(mayor<j.getPartidosGanados());
		mayor=j.getPartidosGanados();
		}
		i++;
		}
		}
		*/

	public void setEquipos(TreeSet<Equipo> equipos) {
		this.equipos = equipos;
	}
	
	public void agregarEquipos(Equipo equiposNuevos) {
		
		equipos.add(equiposNuevos);
		
	}
	
	
}
