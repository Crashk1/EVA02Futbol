package principal;

public class JugadorDefensa extends Jugador{

	private Integer intercepciones;
	private Integer balonesRobados;
	private Integer tiros;
	
	public JugadorDefensa(String nombreYapellido, String equipo, Double salario, Integer edad, Integer numero, Integer tarjetasAmarillas,
			Integer tarjetasRojas, Integer intercepciones, Integer balonesRobados, Integer tiros) {
		super(nombreYapellido, equipo, salario, edad, numero, tarjetasAmarillas, tarjetasRojas);
		
		this.intercepciones = intercepciones;
		this.balonesRobados = balonesRobados;
		this.tiros = tiros;
	}
	
	public JugadorDefensa(String nombreYapellido) {
		super(nombreYapellido);
		
	}
	
	public Integer actualizarHistorialIntercepciones() {
		Integer aux = 0;
		for (int i = 0; i < this.partidosJugados.size(); i++) {
			aux += this.partidosJugados.get(i).intercepcionesHechasPorJugador(this.getNombreYApellido());
		}
		this.intercepciones = aux;
		return intercepciones;
	}
	
	public Integer actualizarHistorialBalonesRobados() {
		Integer aux = 0;
		for (int i = 0; i < this.partidosJugados.size(); i++) {
			aux += this.partidosJugados.get(i).balonesRobadosPorJugador(this.getNombreYApellido());
		}
		this.balonesRobados = aux;
		return balonesRobados;
	}
	
	public Integer actualizarHistorialTIros() {
		Integer aux = 0;
		for (int i = 0; i < this.partidosJugados.size(); i++) {
			aux += this.partidosJugados.get(i).tirosHechosPorJugador(this.getNombreYApellido());
		}
		this.tiros = aux;
		return tiros;
	}
	
	public void actualizarHistorialCompleto() {
		this.actualizarHistorialBalonesRobados();
		this.actualizarHistorialIntercepciones();
		this.actualizarHistorialTIros();
		this.actualizarHistorialTarjetasAmarillas();
		this.actualizarHistorialTarjetasRojas();
	}
	
	public void cobrarIntercepcion() {
		intercepciones++;
	}
	
	public void cobrarRoboDeBalon() {
		balonesRobados++;
	}
	
	public void cobrarTiro() {
		tiros++;
	}
	
	public Integer getIntercepciones() {
		return intercepciones;
	}

	public void setIntercepciones(Integer intercepciones) {
		this.intercepciones = intercepciones;
	}


	public Integer getBalonesRobados() {
		return balonesRobados;
	}


	public void setBalonesRobados(Integer balonesRobados) {
		this.balonesRobados = balonesRobados;
	}


	public Integer getTiros() {
		return tiros;
	}


	public void setTiros(Integer tiros) {
		this.tiros = tiros;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((balonesRobados == null) ? 0 : balonesRobados.hashCode());
		result = prime * result + ((intercepciones == null) ? 0 : intercepciones.hashCode());
		result = prime * result + ((tiros == null) ? 0 : tiros.hashCode());
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
		JugadorDefensa other = (JugadorDefensa) obj;
		if (balonesRobados == null) {
			if (other.balonesRobados != null)
				return false;
		} else if (!balonesRobados.equals(other.balonesRobados))
			return false;
		if (intercepciones == null) {
			if (other.intercepciones != null)
				return false;
		} else if (!intercepciones.equals(other.intercepciones))
			return false;
		if (tiros == null) {
			if (other.tiros != null)
				return false;
		} else if (!tiros.equals(other.tiros))
			return false;
		return true;
	}
}
