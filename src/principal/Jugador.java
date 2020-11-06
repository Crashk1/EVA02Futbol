package principal;

public class Jugador {

	// Me hago cargo yo (Alexis) de Jugador
	private String nombre;
	private String apellido;
	private Double salario;
	private Integer numero;
	private Integer partidosGanados;
	private Integer campeonatosGanados;
	
	public Jugador (String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
		
	}
	
	public Jugador (String nombre, String apellido, Double salario, Integer numero, Integer partidosGanados, Integer campeonatosGanados) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.salario = salario;
		this.numero = numero;
		this.partidosGanados = partidosGanados;
		this.campeonatosGanados = campeonatosGanados;
		
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

	public Integer getPartidosGanados() {
		return partidosGanados;
	}

	public void setPartidosGanados(Integer partidosGanados) {
		this.partidosGanados = partidosGanados;
	}

	public Integer getCampeonatosGanados() {
		return campeonatosGanados;
	}

	public void setCampeonatosGanados(Integer campeonatosGanados) {
		this.campeonatosGanados = campeonatosGanados;
	}
	
}
