package principal;

import java.util.TreeSet;
import java.util.Set;

public class Torneo {

	private String nombreTorneo;
	private Integer tamaņoTorneo;
	private Set<Equipo> equipos;
	
	
	public Torneo(String nombreDelTorneo, Integer tamaņoDelTorneo) {
		
		this.nombreTorneo = nombreDelTorneo;
		this.tamaņoTorneo = tamaņoDelTorneo;
		
		this.setEquipos(new TreeSet<Equipo>());
		
	}



	public String getNombreTorneo() {
		return nombreTorneo;
	}


	public void setNombreTorneo(String nombreTorneo) {
		this.nombreTorneo = nombreTorneo;
	}


	public Integer getTamaņoTorneo() {
		return tamaņoTorneo;
	}


	public void setTamaņoTorneo(Integer tamaņoTorneo) {
		this.tamaņoTorneo = tamaņoTorneo;
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
