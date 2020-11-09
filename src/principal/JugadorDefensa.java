package principal;

public class JugadorDefensa extends Jugador{

	private Integer intercepciones;
	private Integer balonesRobados;
	private Integer tiros;
	
	
	public JugadorDefensa(String nombre, String apellido, Double salario, Integer edad, Integer numero, Integer tarjetasAmarillas,
			Integer tarjetasRojas, Integer intercepciones, Integer balonesRobados, Integer tiros) {
		super(nombre, apellido, salario, edad, numero, tarjetasAmarillas, tarjetasRojas);
		
		this.intercepciones = intercepciones;
		this.balonesRobados = balonesRobados;
		this.tiros = tiros;
	}
	
	public JugadorDefensa(String nombre, String apellido) {
		super(nombre, apellido);
		
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

}
