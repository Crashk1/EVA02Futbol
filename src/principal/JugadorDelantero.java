package principal;

public class JugadorDelantero extends Jugador{

	private Integer goles;
	private Integer tirosAlArco;
	private Integer asistencias;
	
	
	public JugadorDelantero(String nombre, String apellido, Double salario, Integer edad, Integer numero, Integer tarjetasAmarillas,
			Integer tarjetasRojas, Integer goles, Integer tirosAlArco, Integer asistencias) {
		super(nombre, apellido, salario, edad, numero, tarjetasAmarillas, tarjetasRojas);
		
		this.goles = goles;
		this.tirosAlArco = tirosAlArco;
		this.asistencias = asistencias;
	}
	
	public JugadorDelantero(String nombre, String apellido) {
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

	public Integer getAsistencias() {
		return asistencias;
	}

	public void setAsistencias(Integer asistencias) {
		this.asistencias = asistencias;
	}
	
}