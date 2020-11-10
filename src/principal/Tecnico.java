package principal;

import java.util.TreeSet;

public class Tecnico {
	
	String nombreTecnico;
	Integer salarioTecnico;
	Integer edad;
	Boolean estaDirigiendo;
	Integer codTecnico;
	private TreeSet <Equipo> equiposDirigidos= new TreeSet<Equipo>();

	
	public Tecnico(String nombreTecnico,Integer salarioTecnico, Integer Edad, Integer codTecnico) {
		this.nombreTecnico=nombreTecnico;
		this.salarioTecnico=salarioTecnico;
		this.edad=edad;
		equiposDirigidos = new TreeSet<Equipo>();
		estaDirigiendo=false;
		this.codTecnico=codTecnico;
	}
	
	
	public TreeSet<Equipo> getTecnicos() {
		return equiposDirigidos;
	}

	public Integer codTecnico() {
		return this.codTecnico;
	}
	
	public Integer salarioTecnico() {
		return this.salarioTecnico;
	}
	
	public String nombreTecnico() {
		return this.nombreTecnico;
	}
	
	
	
	public Integer cantidadDeEquiposDirigidos() {
		return equiposDirigidos.size();
	}
	
	public TreeSet<Equipo> equiposDirigidos() {
		return this.equiposDirigidos;
	}
	
	
	
	
	
	
	
	
}
