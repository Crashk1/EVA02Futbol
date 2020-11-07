package principal;

import java.util.Comparator;

public class OrdenarPorVictorias implements Comparator<Equipo> {

	@Override
	public int compare(Equipo uno, Equipo dos) {
		
		if(uno.getNombreEquipo().compareTo(dos.getNombreEquipo())==0)
			return (-1)*uno.getPartidosGanados().compareTo(dos.getPartidosGanados());
		return uno.getNombreEquipo().compareTo(dos.getNombreEquipo());
	}
	
}
