package principal;

import java.util.ArrayList;

public class Jugador {

	private String nombreYapellido;
	private String equipo;
	private Double salario;
	private Integer edad;
	private Integer numero;
	private Integer tarjetasAmarillas;
	private Integer tarjetasRojas;
	protected ArrayList <Partido> partidosJugados = new ArrayList <Partido>();
	protected ArrayList <Torneo> torneosJugados = new ArrayList <Torneo>();
	
	public Jugador (String nombreYapellido) {
		this.nombreYapellido = nombreYapellido;
		
	}
	
	public Jugador (String nombreYapellido, String equipo, Double salario, Integer edad, Integer numero, Integer tarjetasAmarillas, Integer tarjetasRojas) {
		this.nombreYapellido = nombreYapellido;
		this.equipo = equipo;
		this.salario = salario;
		this.edad = edad;
		this.numero = numero;
		this.tarjetasAmarillas = tarjetasAmarillas;
		this.tarjetasRojas = tarjetasRojas;
			
	}
	
	public Integer actualizarHistorialTarjetasAmarillas() {
		Integer aux = 0;
		for (int i = 0; i < partidosJugados.size(); i++){
			aux += partidosJugados.get(i).tarjetasAmarillasCometidasPorJugador(this.nombreYapellido);
		}
		tarjetasAmarillas = aux;
		return tarjetasAmarillas;
	}

	public Integer actualizarHistorialTarjetasRojas() {
		Integer aux = 0;
		for (int i = 0; i < partidosJugados.size(); i++){
			aux += partidosJugados.get(i).tarjetasRojasCometidasPorJugador(this.nombreYapellido);
		}
		tarjetasRojas = aux;
		return tarjetasRojas;
	}
	
	public void cobrarTarjetaAmarilla() {
		tarjetasAmarillas++;
	}
	
	public void cobrarTarjetaRoja() {
		tarjetasRojas++;
	}
	
	public void agregarPartidoJugado(Partido partido) {
		partidosJugados.add(partido);
	}
	
	public Integer getPartidosGanados() {
		Integer aux = 0;
		for (int i = 0; i < partidosJugados.size(); i++){
			aux += (partidosJugados.get(i).getEquipoGanador() == this.equipo);
		}
		tarjetasAmarillas = aux;
		return tarjetasAmarillas;
	}
	
	public void aumentarSalario(Double aumento) {
		this.salario += aumento;
	}

	public Integer getTarjetasTotales() {
		return tarjetasAmarillas + tarjetasRojas;
	}
	
	public Integer getTarjetasAmarillas() {
		return tarjetasAmarillas;
	}
	
	public void setTarjetasAmarillas(Integer tarjetasAmarillas) {
		this.tarjetasAmarillas = tarjetasAmarillas;
	}
	
	public String getEquipo() {
		return equipo;
	}

	public void setEquipo(String equipo) {
		this.equipo = equipo;
	}

	public ArrayList<Partido> getPartidosJugados() {
		return partidosJugados;
	}

	public void setPartidosJugados(ArrayList<Partido> partidosJugados) {
		this.partidosJugados = partidosJugados;
	}

	public ArrayList<Torneo> getTorneosJugados() {
		return torneosJugados;
	}

	public void setTorneosJugados(ArrayList<Torneo> torneosJugados) {
		this.torneosJugados = torneosJugados;
	}

	public Integer getTarjetasRojas() {
		return tarjetasRojas;
	}
	
	public void setTarjetasRojas(Integer tarjetasRojas) {
		this.tarjetasRojas = tarjetasRojas;
	}
	
	public Integer getNumeroPartidosJugados() {
		return partidosJugados.size();
	}
	
	public Integer getNumeroTorneosJugados() {
		return torneosJugados.size();
	}
	
	public String getNombreYApellido() {
		return nombreYapellido;
	}

	public void setNombreYApellido(String nombreYapellido) {
		this.nombreYapellido = nombreYapellido;
	}

	public Integer getEdad() {
		return edad;
	}
	
	public void setEdad(Integer edad) {
		this.edad = edad;
	}
	
	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	
}
