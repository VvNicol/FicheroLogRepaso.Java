package servicios;

import java.io.IOException;
import java.util.List;

import dtos.VentaDto;

public interface EmpleadoInterfaz {

	public void aniadirVenta(List<VentaDto> listaVentas) throws IOException;
	
	public void ventaTotalDiaria(List<VentaDto>listaVentas) throws IOException;
}
