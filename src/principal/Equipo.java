package principal;

import java.util.TreeSet;

public class Equipo {

	private String nombreEquipo;
	private TreeSet<Jugador> jugadoresEnEquipo;
	private Integer partidosGanados;
	private Integer partidosPerdidos;
	private Double gastosTotalesDelEquipo;
	
	
	public Equipo(String nombreDelEquipo, Integer partidosGanados, Integer partidosPerdidos, Double gastosTotalesDelEquipo) {
		
		this.setNombreEquipo(nombreDelEquipo);
		this.setPartidosGanados(partidosGanados);
		this.setPartidosPerdidos(partidosPerdidos);
		this.setGastosTotalesDelEquipo(gastosTotalesDelEquipo);
		
		jugadoresEnEquipo = new TreeSet<Jugador>();
		
	}


	public String getNombreEquipo() {
		return nombreEquipo;
	}


	public void setNombreEquipo(String nombreEquipo) {
		this.nombreEquipo = nombreEquipo;
	}


	public TreeSet<Jugador> getJugadoresEnEquipo() {
		return jugadoresEnEquipo;
	}


	public void agregarJugadoresAlEquipo(Jugador jugador) {
		
		jugadoresEnEquipo.add(jugador);
	}


	public Integer getPartidosGanados() {
		return partidosGanados;
	}


	public void setPartidosGanados(Integer partidosGanados) {
		this.partidosGanados = partidosGanados;
	}


	public Integer getPartidosPerdidos() {
		return partidosPerdidos;
	}


	public void setPartidosPerdidos(Integer partidosPerdidos) {
		this.partidosPerdidos = partidosPerdidos;
	}


	public Double getGastosTotalesDelEquipo() {
		return gastosTotalesDelEquipo;
	}


	public void setGastosTotalesDelEquipo(Double gastosTotalesDelEquipo) {
		this.gastosTotalesDelEquipo = gastosTotalesDelEquipo;
	}
}
