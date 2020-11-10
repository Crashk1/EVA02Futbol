package principal;

import java.util.ArrayList;

public class Partido {

	protected ArrayList <String> tarjetasAmarillasCobradas = new ArrayList <String>();
	private ArrayList <String> tarjetasRojasCobradas = new ArrayList <String>();
	protected ArrayList <JugadorDelantero> delanterosActivos = new ArrayList <JugadorDelantero>();
	private ArrayList <JugadorMediocampo> mediocampistasActivos = new ArrayList <JugadorMediocampo>();
	private ArrayList <JugadorDefensa> defensasActivos = new ArrayList <JugadorDefensa>();
	private ArrayList <JugadorArquero> arquerosActivos = new ArrayList <JugadorArquero>();
	
	
	public void agregarDelantero(JugadorDelantero jugador) {
		delanterosActivos.add(jugador);
	}
	
	public void cobrarTarjetaAmarillaAJugador(String minuto, String nombreYapellido, String posicion) {
		this.tarjetasAmarillasCobradas.add(minuto);
		this.tarjetasAmarillasCobradas.add(nombreYapellido);
		
		switch (posicion) {
		case "delantero":
			for (int i = 0; i < delanterosActivos.size(); i++) {
				if (delanterosActivos.get(i).getNombreYApellido() == nombreYapellido) {
					delanterosActivos.get(i).cobrarTarjetaAmarilla();
				}
			}
			break;
		case "mediocampo":
			for (int i = 0; i < mediocampistasActivos.size(); i++) {
				if (mediocampistasActivos.get(i).getNombreYApellido() == nombreYapellido) {
					mediocampistasActivos.get(i).cobrarTarjetaAmarilla();
				}
			}
			break;
		case "defensa":
			for (int i = 0; i < defensasActivos.size(); i++) {
				if (defensasActivos.get(i).getNombreYApellido() == nombreYapellido) {
					defensasActivos.get(i).cobrarTarjetaAmarilla();
				}
			}
			break;
		case "arquero":
			for (int i = 0; i < arquerosActivos.size(); i++) {
				if (arquerosActivos.get(i).getNombreYApellido() == nombreYapellido) {
					arquerosActivos.get(i).cobrarTarjetaAmarilla();
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
	
}