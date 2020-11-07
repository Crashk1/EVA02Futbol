package principal;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Temporada {

	private Integer nroTemporada;
	private Integer partidosTotales;
	private Integer golesTotales;
	private String campeon;
	private String subCampeon;
	private String goleadorTemporada;
	private String asistenteTemporada;
	private Set<Equipo> listaEquipos;
	
	
	public Temporada(Integer nroTemporadaActual) {
		
		this.nroTemporada = nroTemporadaActual;
		this.listaEquipos = new TreeSet<Equipo>();
		
	}
	
	public void agregarEquipos(Equipo equipos) {
		
		listaEquipos.add(equipos);
		
	}
	
	public Set<Equipo> obtenerEquiposPorVictorias(){
		
		Set <Equipo> equiposPorVictorias = new TreeSet<>(new OrdenarPorVictorias());
		equiposPorVictorias.addAll(listaEquipos);
		return equiposPorVictorias;
		
	}
	
	public void cambiarElOrdenDeEquipos(Comparator<Equipo> orden) {
		
		TreeSet<Equipo> ordenadoDos = new TreeSet<Equipo>(orden);
		ordenadoDos.addAll(listaEquipos);
		listaEquipos=ordenadoDos;
	}

	public Set<Equipo> getEquipos() {
		
		return listaEquipos;
	}
	
	public void setEquipos(Set<Equipo> equipos){
		
		this.listaEquipos = equipos;
	}
	
}
