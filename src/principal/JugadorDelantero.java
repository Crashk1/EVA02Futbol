package principal;

public class JugadorDelantero extends Jugador{

	private Integer goles;
	private Integer tirosAlArco;
	private Integer asistencias;

	public JugadorDelantero(String nombreYapellido, Double salario, Integer edad, Integer numero, Integer tarjetasAmarillas,
			Integer tarjetasRojas, Integer goles, Integer tirosAlArco, Integer asistencias) {
		super(nombreYapellido, salario, edad, numero, tarjetasAmarillas, tarjetasRojas);
		
		this.goles = goles;
		this.tirosAlArco = tirosAlArco;
		this.asistencias = asistencias;
	}
	
	public JugadorDelantero(String nombreYapellido) {
		super(nombreYapellido);
		
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
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((asistencias == null) ? 0 : asistencias.hashCode());
		result = prime * result + ((goles == null) ? 0 : goles.hashCode());
		result = prime * result + ((tirosAlArco == null) ? 0 : tirosAlArco.hashCode());
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
		JugadorDelantero other = (JugadorDelantero) obj;
		if (asistencias == null) {
			if (other.asistencias != null)
				return false;
		} else if (!asistencias.equals(other.asistencias))
			return false;
		if (goles == null) {
			if (other.goles != null)
				return false;
		} else if (!goles.equals(other.goles))
			return false;
		if (tirosAlArco == null) {
			if (other.tirosAlArco != null)
				return false;
		} else if (!tirosAlArco.equals(other.tirosAlArco))
			return false;
		return true;
	}
}