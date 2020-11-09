package principal;

public class JugadorArquero extends Jugador{

	private Integer balonesAtajados;
	private Integer penalesAtajados;
	private Integer vallasInvictas; 


	public JugadorArquero(String nombre, String apellido, Double salario, Integer edad, Integer numero, Integer tarjetasAmarillas,
			Integer tarjetasRojas, Integer balonesAtajados, Integer penalesAtajados, Integer vallasInvictas) {
		super(nombre, apellido, salario, edad, numero, tarjetasAmarillas, tarjetasRojas);
		
		this.balonesAtajados = balonesAtajados;
		this.penalesAtajados = penalesAtajados;
		this.vallasInvictas = vallasInvictas;
	}
	
	
	public JugadorArquero(String nombre, String apellido) {
		super(nombre, apellido);
		
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
}
