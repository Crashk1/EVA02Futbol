package principal;

import java.util.ArrayList;

public class Partido {
	
	private Equipo uno;
	private Equipo dos;
	private Integer golesEqui1=0;
	private Integer golesEqui2=0;
	protected ArrayList <String> tarjetasAmarillasCobradas = new ArrayList <String>();
	private ArrayList <String> tarjetasRojasCobradas = new ArrayList <String>();
	protected ArrayList <JugadorDelantero> delanterosActivos = new ArrayList <JugadorDelantero>();
	private ArrayList <JugadorMediocampo> mediocampistasActivos = new ArrayList <JugadorMediocampo>();
	private ArrayList <JugadorDefensa> defensasActivos = new ArrayList <JugadorDefensa>();
	private ArrayList <JugadorArquero> arquerosActivos = new ArrayList <JugadorArquero>();
	
	public Partido(Equipo uno, Equipo dos) {
		this.uno= uno;
		this.dos= dos;
	}
	
	public void marcarGol(Equipo equipo) {
		if(equipo.equals(this.uno)) {
			this.golesEqui1++;
		}
		if(equipo.equals(this.dos)) {
			this.golesEqui2++;
		}
	}
	
	public void marcador() {
		System.out.println("El marcador es: | " +  this.uno.getNombreEquipo() + " = " + this.golesEqui1 + " | " + this.dos.getNombreEquipo()+ " = " + this.golesEqui2+ " | " );

	}
	
	public void finalizarPartido() {
		marcador();
		if(this.golesEqui1>this.golesEqui2) {
			this.uno.setPartidosGanados(uno.getPartidosGanados()+1);
			this.dos.setPartidosPerdidos(dos.getPartidosPerdidos()+1);
		}
		if(this.golesEqui1<this.golesEqui2) {
			this.dos.setPartidosGanados(dos.getPartidosGanados()+1);
			this.uno.setPartidosPerdidos(uno.getPartidosPerdidos()+1);
		}
		
	}
	
	public void agregarDelantero(JugadorDelantero jugador) {
		delanterosActivos.add(jugador);
	}
	
	public String getEquipoGanador() {
		if (golesEqui1 > golesEqui2)
			return uno.getNombreEquipo();
		else if (golesEqui1 < golesEqui2) {
			return uno.getNombreEquipo();
		}
		else {
			return "Empate";
		}
	}
	
	public void cobrarTarjetaAJugador(String minuto, String nombreYapellido, String posicion, String tarjeta) {
		this.tarjetasAmarillasCobradas.add(minuto);
		this.tarjetasAmarillasCobradas.add(nombreYapellido);
		
		switch (posicion) {
		case "delantero":
			for (int i = 0; i < delanterosActivos.size(); i++) {
				if (delanterosActivos.get(i).getNombreYApellido() == nombreYapellido) {
					if (tarjeta == "amarilla") {
						delanterosActivos.get(i).cobrarTarjetaAmarilla();
					}
					else if (tarjeta == "roja") {
						delanterosActivos.get(i).cobrarTarjetaRoja();
					}
				}
			}
			break;
		case "mediocampo":
			for (int i = 0; i < mediocampistasActivos.size(); i++) {
				if (mediocampistasActivos.get(i).getNombreYApellido() == nombreYapellido) {
					if (tarjeta == "amarilla") {
						mediocampistasActivos.get(i).cobrarTarjetaAmarilla();
					}
					else if (tarjeta == "roja") {
						mediocampistasActivos.get(i).cobrarTarjetaRoja();
					}
				}
			}
			break;
		case "defensa":
			for (int i = 0; i < defensasActivos.size(); i++) {
				if (defensasActivos.get(i).getNombreYApellido() == nombreYapellido) {
					if (tarjeta == "amarilla") {
						defensasActivos.get(i).cobrarTarjetaAmarilla();
					}
					else if (tarjeta == "roja") {
						defensasActivos.get(i).cobrarTarjetaRoja();
					}
				}
			}
			break;
		case "arquero":
			for (int i = 0; i < arquerosActivos.size(); i++) {
				if (arquerosActivos.get(i).getNombreYApellido() == nombreYapellido) {
					if (tarjeta == "amarilla") {
						arquerosActivos.get(i).cobrarTarjetaAmarilla();
					}
					else if (tarjeta == "roja") {
						arquerosActivos.get(i).cobrarTarjetaRoja();
					}
				}
			}
			break;
		}
	}
	
	public Integer tarjetasAmarillasCometidasPorJugador(String nombreYapellido) {
		Integer aux = 0;
		for (int i = 0; i < tarjetasAmarillasCobradas.size(); i++) {
			if (tarjetasAmarillasCobradas.get(i) == nombreYapellido) {
				aux++;
			}
		}
		return aux;
	}
	
	public Integer tarjetasRojasCometidasPorJugador(String nombreYapellido) {
		Integer aux = 0;
		for (int i = 0; i < tarjetasRojasCobradas.size(); i++) {
			if (tarjetasRojasCobradas.get(i) == nombreYapellido) {
				aux++;
			}
		}
		return aux;
	}
	
	public int getGolesTotales() {
		
		Integer golesTotales = this.golesEqui1 + this.golesEqui2;
		
		return golesTotales;
	}
	
}