package util;

import java.util.List;

import dtos.ProductoDto;
import dtos.VentaDto;

public class Utilidades {
	
	public static long calcularIdVenta(List<VentaDto> lista) {
		
		long nuevoId = 0;
		int tamanio = lista.size();

		if(tamanio > 0) {
			
			nuevoId = lista.get(tamanio-1).getId() + 1;
			
		}else {
			
			nuevoId = 1;
			
		}
		
		return nuevoId;
		
	}
	
	public static long calcularIdProducto(List<ProductoDto> lista) {
		
		long nuevoId = 0;
		int tamanio = lista.size();

		if(tamanio > 0) {
			
			nuevoId = lista.get(tamanio-1).getIdProducto() + 1;
			
		}else {
			
			nuevoId = 0;
			
		}
		
		return nuevoId;
		
	}
	
	
	
}
