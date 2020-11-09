package principal;

public class JugadorMediocampo extends Jugador{

	private Integer asistencias;
	private Integer pasesCorrectos;
	private Integer intercepciones;
	
	
	public JugadorMediocampo(String nombre, String apellido, Double salario, Integer edad, Integer numero, Integer tarjetasAmarillas,
			Integer tarjetasRojas, Integer asistencias, Integer pasesCorrectos, Integer intercepciones) {
		super(nombre, apellido, salario, edad, numero, tarjetasAmarillas, tarjetasRojas);
		
		this.asistencias = asistencias;
		this.pasesCorrectos = pasesCorrectos;
		this.intercepciones = intercepciones;
	}
	
	public JugadorMediocampo(String nombre, String apellido) {
		super(nombre, apellido);
		
	}
	
	
	public Integer getAsistencias() {
		return asistencias;
	}

	public void setAsistencias(Integer asistencias) {
		this.asistencias = asistencias;
	}

	public Integer getPasesCorrectos() {
		return pasesCorrectos;
	}

	public void setPasesCorrectos(Integer pasesCorrectos) {
		this.pasesCorrectos = pasesCorrectos;
	}

	public Integer getIntercepciones() {
		return intercepciones;
	}

	public void setIntercepciones(Integer intercepciones) {
		this.intercepciones = intercepciones;
	}

}