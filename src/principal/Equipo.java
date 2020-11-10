package principal;

import java.util.TreeSet;


public class Equipo implements Comparable <Equipo> {

	private String nombreEquipo;
	private TreeSet<Jugador> jugadoresEnEquipo;
	private Integer partidosGanados;
	private Integer partidosPerdidos;
	private Double gastosTotalesDelEquipo;
	private Integer codEquipo;
	
	
	public Equipo(String nombreDelEquipo, Integer partidosGanados, Integer partidosPerdidos, Double gastosTotalesDelEquipo, Integer codEquipo) {
		
		this.setNombreEquipo(nombreDelEquipo);
		this.setPartidosGanados(partidosGanados);
		this.setPartidosPerdidos(partidosPerdidos);
		this.setGastosTotalesDelEquipo(gastosTotalesDelEquipo);
		this.codEquipo = codEquipo;
		jugadoresEnEquipo = new TreeSet<Jugador>();
		
	}


	public String getNombreEquipo() {
		return this.nombreEquipo;
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


	@Override
	public int compareTo(Equipo o) {
		
		return this.codEquipo.compareTo(o.codEquipo);
	}
	
	@Override
	public String toString() {
		
		return "Equipo [Nombre del equipo ="+ nombreEquipo + ", partidos ganados =" +partidosGanados+ ", partidos perdidos ="+partidosPerdidos+", codigo del equipo ="+codEquipo+" ] ";
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Equipo other = (Equipo) obj;
		if (codEquipo == null) {
			if (other.codEquipo != null)
				return false;
		} else if (!codEquipo.equals(other.codEquipo))
			return false;
		return true;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codEquipo == null) ? 0 : codEquipo.hashCode());
		return result;
	}
}
