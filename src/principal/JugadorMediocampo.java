package principal;

public class JugadorMediocampo extends Jugador{

	private Integer asistencias;
	private Integer pasesCorrectos;
	private Integer intercepciones;
	
	public JugadorMediocampo(String nombreYapellido, Double salario, Integer edad, Integer numero, Integer tarjetasAmarillas,
			Integer tarjetasRojas, Integer asistencias, Integer pasesCorrectos, Integer intercepciones) {
		super(nombreYapellido, salario, edad, numero, tarjetasAmarillas, tarjetasRojas);
		
		this.asistencias = asistencias;
		this.pasesCorrectos = pasesCorrectos;
		this.intercepciones = intercepciones;
	}
	
	public JugadorMediocampo(String nombreYapellido) {
		super(nombreYapellido);
		
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((asistencias == null) ? 0 : asistencias.hashCode());
		result = prime * result + ((intercepciones == null) ? 0 : intercepciones.hashCode());
		result = prime * result + ((pasesCorrectos == null) ? 0 : pasesCorrectos.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		JugadorMediocampo other = (JugadorMediocampo) obj;
		if (asistencias == null) {
			if (other.asistencias != null)
				return false;
		} else if (!asistencias.equals(other.asistencias))
			return false;
		if (intercepciones == null) {
			if (other.intercepciones != null)
				return false;
		} else if (!intercepciones.equals(other.intercepciones))
			return false;
		if (pasesCorrectos == null) {
			if (other.pasesCorrectos != null)
				return false;
		} else if (!pasesCorrectos.equals(other.pasesCorrectos))
			return false;
		return true;
	}

}