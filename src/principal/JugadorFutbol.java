package principal;

import java.util.ArrayList;

public class JugadorFutbol extends Jugador {

	private Integer goles;
	private Integer tirosAlArco;
	private Integer tiros;
	private Integer tarjetasAmarillas;
	private Integer tarjetasRojas;
	private Integer posicion;
	
	private ArrayList <Partido> partidosJugados = new ArrayList <Partido>();
	
	public JugadorFutbol(String nombre, String apellido, Double salario, Integer numero, Integer partidosGanados,
			Integer campeonatosGanados, Integer goles, Integer tirosAlArco, Integer tiros, Integer tarjetasAmarillas, Integer tarjetasRojas, Integer posicion) {
		super(nombre, apellido, salario, numero, partidosGanados, campeonatosGanados);
		this.goles = goles;
		this.tirosAlArco = tirosAlArco;
		this.tiros = tiros;
		this.tarjetasAmarillas = tarjetasAmarillas;
		this.tarjetasRojas = tarjetasRojas;
		this.posicion = posicion;
		
	}
	
	public JugadorFutbol(String nombre, String apellido) {
		super(nombre, apellido);
		
		
	}

	public Integer getGoles() {
		return goles;
	}

	public void setGoles(Integer goles) {
		this.goles = goles;
	}

	public Integer getTirosAlArco() {
		return tirosAlArco;
	}

	public void setTirosAlArco(Integer tirosAlArco) {
		this.tirosAlArco = tirosAlArco;
	}

	public Integer getTiros() {
		return tiros;
	}

	public void setTiros(Integer tiros) {
		this.tiros = tiros;
	}

	public Integer getTarjetasAmarillas() {
		return tarjetasAmarillas;
	}

	public void setTarjetasAmarillas(Integer tarjetasAmarillas) {
		this.tarjetasAmarillas = tarjetasAmarillas;
	}

	public Integer getTarjetasRojas() {
		return tarjetasRojas;
	}

	public void setTarjetasRojas(Integer tarjetasRojas) {
		this.tarjetasRojas = tarjetasRojas;
	}

	public Integer getPosicion() {
		return posicion;
	}

	public void setPosicion(Integer posicion) {
		this.posicion = posicion;
	}

	public ArrayList<Partido> getPartidosJugados() {
		return partidosJugados;
	}

	public void setPartidosJugados(ArrayList<Partido> partidosJugados) {
		this.partidosJugados = partidosJugados;
	}
	
}
