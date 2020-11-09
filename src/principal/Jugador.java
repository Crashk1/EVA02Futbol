package principal;

import java.util.TreeSet;

public class Jugador {

	private String nombre;
	private String apellido;
	private Double salario;
	private Integer edad;
	private Integer numero;
	private Integer tarjetasAmarillas;
	private Integer tarjetasRojas;
	private TreeSet <Partido> partidosJugados = new TreeSet <Partido>();
	private TreeSet <Torneo> torneosJugados = new TreeSet <Torneo>();
	
	public Jugador (String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
		
	}
	
	public Jugador (String nombre, String apellido, Double salario, Integer edad, Integer numero, Integer tarjetasAmarillas, Integer tarjetasRojas) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.salario = salario;
		this.edad = edad;
		this.numero = numero;
		this.tarjetasAmarillas = tarjetasAmarillas;
		this.tarjetasRojas = tarjetasRojas;
			
	}
	
	public Integer actualizarTarjetasAmarillas() {
		Integer aux = 0;
		for (int i : partidosJugados.tarjetasAmarillasCometidasPor("nombre", "apellido")) {
			aux += i;
		}
		tarjetasAmarillas = aux;
		return tarjetasAmarillas;
	}
	
	public Integer actualizarTarjetasRojas() {
		
	}
	
	public void aumentarSalario(Double aumento) {
		this.salario += aumento;
	}

	public Integer getTarjetasTotales() {
		return tarjetasAmarillas + tarjetasRojas;
	}
	
	public Integer getNumeroPartidosJugados() {
		return partidosJugados.size();
	}
	
	public Integer getNumeroTorneosJugados() {
		return torneosJugados.size();
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
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
