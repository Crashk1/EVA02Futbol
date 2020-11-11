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
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codTecnico == null) ? 0 : codTecnico.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Tecnico other = (Tecnico) obj;
		if (codTecnico == null) {
			if (other.codTecnico != null)
				return false;
		} else if (!codTecnico.equals(other.codTecnico))
			return false;
		return true;
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
