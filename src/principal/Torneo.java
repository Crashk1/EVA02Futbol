package principal;

import java.util.TreeSet;
import java.util.Set;

public class Torneo {

	private String nombreTorneo;
	private Integer tamañoTorneo;
	private Set<Equipo> equipos;
	
	
	public Torneo(String nombreDelTorneo, Integer tamañoDelTorneo) {
		
		this.nombreTorneo = nombreDelTorneo;
		this.tamañoTorneo = tamañoDelTorneo;
		
		this.setEquipos(new TreeSet<Equipo>());
		
	}



	public String getNombreTorneo() {
		return nombreTorneo;
	}


	public void setNombreTorneo(String nombreTorneo) {
		this.nombreTorneo = nombreTorneo;
	}


	public Integer getTamañoTorneo() {
		return tamañoTorneo;
	}


	public void setTamañoTorneo(Integer tamañoTorneo) {
		this.tamañoTorneo = tamañoTorneo;
	}



	public Set<Equipo> getEquipos() {
		return equipos;
	}



	public void setEquipos(Set<Equipo> equipos) {
		this.equipos = equipos;
	}
	
	public void agregarEquipos(Equipo equiposNuevos) {
		
		equipos.add(equiposNuevos);
		
	}
	
	
}
