package principal;

public class JugadorArquero extends Jugador{

	private Integer balonesAtajados;
	private Integer penalesAtajados;
	private Integer vallasInvictas; 
	
	public JugadorArquero(String nombreYapellido, String equipo, Double salario, Integer edad, Integer numero, Integer tarjetasAmarillas,
			Integer tarjetasRojas, Integer balonesAtajados, Integer penalesAtajados, Integer vallasInvictas) {
		super(nombreYapellido, equipo, salario, edad, numero, tarjetasAmarillas, tarjetasRojas);
		
		this.balonesAtajados = balonesAtajados;
		this.penalesAtajados = penalesAtajados;
		this.vallasInvictas = vallasInvictas;
	}
	
	public JugadorArquero(String nombreYapellido) {
		super(nombreYapellido);
		
	}
	
	public Integer actualizarHistorialBalonesAtajados() {
		Integer aux = 0;
		for (int i = 0; i < this.partidosJugados.size(); i++) {
			aux += this.partidosJugados.get(i).balonesAtajadosPorJugador(this.getNombreYApellido());
		}
		this.balonesAtajados = aux;
		return balonesAtajados;
	}
	
	public Integer actualizarHistorialPenalesAtajados() {
		Integer aux = 0;
		for (int i = 0; i < this.partidosJugados.size(); i++) {
			aux += this.partidosJugados.get(i).penalesAtajadosPorJugador(this.getNombreYApellido());
		}
		this.penalesAtajados = aux;
		return penalesAtajados;
	}
	
	public Integer actualizarHistorialVallasInvictas() {
		Integer aux = 0;
		for (int i = 0; i < this.partidosJugados.size(); i++) {
			aux += this.partidosJugados.get(i).tuvoVallaInvicta(this.getNombreYApellido());
		}
		this.vallasInvictas = aux;
		return vallasInvictas;
	}
	
	public void actualizarHistorialCompleto() {
		this.actualizarHistorialBalonesAtajados();
		this.actualizarHistorialPenalesAtajados();
		this.actualizarHistorialVallasInvictas();
		this.actualizarHistorialTarjetasAmarillas();
		this.actualizarHistorialTarjetasRojas();
	}
	
	public void atajoBalon() {
		balonesAtajados++;
	}
	
	public void atajoPenal() {
		penalesAtajados++;
	}
	
	public void tuvoVallaInvicta() {
		vallasInvictas++;
	}
	
	public Integer getBalonesAtajados() {
		return balonesAtajados;
	}

	public void setBalonesAtajados(Integer balonesAtajados) {
		this.balonesAtajados = balonesAtajados;
	}

	public Integer getPenalesAtajados() {
		return penalesAtajados;
	}

	public void setPenalesAtajados(Integer penalesAtajados) {
		this.penalesAtajados = penalesAtajados;
	}

	public Integer getVallasInvictas() {
		return vallasInvictas;
	}

	public void setVallasInvictas(Integer vallasInvictas) {
		this.vallasInvictas = vallasInvictas;
	}

	@Override
	public String toString() {
		return "El Jugador se llama " + this.getNombreYApellido() + ", tiene " + this.getEdad() + " a�os, y juega principalmente como Arquero \n"
				+ "Su salario es de " + this.getSalario() + " dolares por a�o, juega con el numero de camiseta " + this.getNumero() + " y juega para el equipo de " + this.getEquipo() + "\n"
				+ "En su historial recibio un total de " + this.getTarjetasAmarillas() + " tarjetas amarillas y un total de " + this.getTarjetasRojas() + " tarjetas rojas \n"
				+ "Como Arquero, es importante destacar sus siguientes estadisticas: Atajo " + balonesAtajados + " balones al arco, " + penalesAtajados + " penales, y jugo un total de " + vallasInvictas + " partidos con la Valla Invicta";
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((balonesAtajados == null) ? 0 : balonesAtajados.hashCode());
		result = prime * result + ((penalesAtajados == null) ? 0 : penalesAtajados.hashCode());
		result = prime * result + ((vallasInvictas == null) ? 0 : vallasInvictas.hashCode());
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
		JugadorArquero other = (JugadorArquero) obj;
		if (balonesAtajados == null) {
			if (other.balonesAtajados != null)
				return false;
		} else if (!balonesAtajados.equals(other.balonesAtajados))
			return false;
		if (penalesAtajados == null) {
			if (other.penalesAtajados != null)
				return false;
		} else if (!penalesAtajados.equals(other.penalesAtajados))
			return false;
		if (vallasInvictas == null) {
			if (other.vallasInvictas != null)
				return false;
		} else if (!vallasInvictas.equals(other.vallasInvictas))
			return false;
		return true;
	}
	
}
