package principal;

public class JugadorArquero extends Jugador{

	private Integer balonesAtajados;
	private Integer penalesAtajados;
	private Integer vallasInvictas; 
	
	public JugadorArquero(String nombreYapellido, Double salario, Integer edad, Integer numero, Integer tarjetasAmarillas,
			Integer tarjetasRojas, Integer balonesAtajados, Integer penalesAtajados, Integer vallasInvictas) {
		super(nombreYapellido, salario, edad, numero, tarjetasAmarillas, tarjetasRojas);
		
		this.balonesAtajados = balonesAtajados;
		this.penalesAtajados = penalesAtajados;
		this.vallasInvictas = vallasInvictas;
	}
	
	public JugadorArquero(String nombreYapellido) {
		super(nombreYapellido);
		
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
