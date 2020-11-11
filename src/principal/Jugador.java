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
			if (partidosJugados.get(i).getEquipoGanador() == this.equipo) {
				aux++;
			}
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
	
	@Override
	public String toString() {
		return "El Jugador se llama " + nombreYapellido + ", tiene " + edad + " años, y no tiene una posicion o rol definido \n"
				+ "Su salario es de " + salario + " dolares por año, juega con el numero de camiseta " + numero + " y juega para el equipo de " + equipo + "\n"
				+ "En su historial recibio un total de " + tarjetasAmarillas + " tarjetas amarillas y un total de " + tarjetasRojas + " tarjetas rojas";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((edad == null) ? 0 : edad.hashCode());
		result = prime * result + ((equipo == null) ? 0 : equipo.hashCode());
		result = prime * result + ((nombreYapellido == null) ? 0 : nombreYapellido.hashCode());
		result = prime * result + ((numero == null) ? 0 : numero.hashCode());
		result = prime * result + ((partidosJugados == null) ? 0 : partidosJugados.hashCode());
		result = prime * result + ((salario == null) ? 0 : salario.hashCode());
		result = prime * result + ((tarjetasAmarillas == null) ? 0 : tarjetasAmarillas.hashCode());
		result = prime * result + ((tarjetasRojas == null) ? 0 : tarjetasRojas.hashCode());
		result = prime * result + ((torneosJugados == null) ? 0 : torneosJugados.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Jugador other = (Jugador) obj;
		if (edad == null) {
			if (other.edad != null)
				return false;
		} else if (!edad.equals(other.edad))
			return false;
		if (equipo == null) {
			if (other.equipo != null)
				return false;
		} else if (!equipo.equals(other.equipo))
			return false;
		if (nombreYapellido == null) {
			if (other.nombreYapellido != null)
				return false;
		} else if (!nombreYapellido.equals(other.nombreYapellido))
			return false;
		if (numero == null) {
			if (other.numero != null)
				return false;
		} else if (!numero.equals(other.numero))
			return false;
		if (partidosJugados == null) {
			if (other.partidosJugados != null)
				return false;
		} else if (!partidosJugados.equals(other.partidosJugados))
			return false;
		if (salario == null) {
			if (other.salario != null)
				return false;
		} else if (!salario.equals(other.salario))
			return false;
		if (tarjetasAmarillas == null) {
			if (other.tarjetasAmarillas != null)
				return false;
		} else if (!tarjetasAmarillas.equals(other.tarjetasAmarillas))
			return false;
		if (tarjetasRojas == null) {
			if (other.tarjetasRojas != null)
				return false;
		} else if (!tarjetasRojas.equals(other.tarjetasRojas))
			return false;
		if (torneosJugados == null) {
			if (other.torneosJugados != null)
				return false;
		} else if (!torneosJugados.equals(other.torneosJugados))
			return false;
		return true;
	}
	
}
