package principal;

import java.util.TreeSet;
import java.util.Set;

public class Torneo {

	private String nombreTorneo;
	private Integer tama�oTorneo;
	private Set<Equipo> equipos;
	
	
	public Torneo(String nombreDelTorneo, Integer tama�oDelTorneo) {
		
		this.nombreTorneo = nombreDelTorneo;
		this.tama�oTorneo = tama�oDelTorneo;
		
		this.setEquipos(new TreeSet<Equipo>());
		
	}



	public String getNombreTorneo() {
		return nombreTorneo;
	}


	public void setNombreTorneo(String nombreTorneo) {
		this.nombreTorneo = nombreTorneo;
	}


	public Integer getTama�oTorneo() {
		return tama�oTorneo;
	}


	public void setTama�oTorneo(Integer tama�oTorneo) {
		this.tama�oTorneo = tama�oTorneo;
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
