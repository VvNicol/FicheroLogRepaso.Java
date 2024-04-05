package servicios;

import java.io.IOException;

public interface MenuInterfaz {

	public int mostrarMenuYSeleccion() throws IOException;
	
	public void accederMenuGerencia();
	
	public void accederMenuEmpleado() throws IOException;
	
}
