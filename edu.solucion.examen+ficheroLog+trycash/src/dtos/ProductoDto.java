package dtos;

import java.time.LocalDate;
import java.util.List;

import util.Utilidades;

public class ProductoDto {
	
	Utilidades utilidades;	
	
	long idProducto;
	String nombreProducto = "aaaaa";
	int cantidadProducto = 1;
	String fchDeseadaProducto = "31-12-9999";	
	
	
	
	public ProductoDto(String nombreProducto, int cantidadProducto, 
			String fchDeseadaProducto, List<ProductoDto> listaProductos) {
		super();
		this.nombreProducto = nombreProducto;
		this.cantidadProducto = cantidadProducto;
		this.fchDeseadaProducto = fchDeseadaProducto;
		this.idProducto = utilidades.calcularIdProducto(listaProductos);
	}	
	
	public ProductoDto() {
		super();
	}
	

	public long getIdProducto() {
		return idProducto;
	}
	public void setIdProducto(long idProducto) {
		this.idProducto = idProducto;
	}
	public String getNombreProducto() {
		return nombreProducto;
	}
	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}
	public int getCantidadProducto() {
		return cantidadProducto;
	}
	public void setCantidadProducto(int cantidadProducto) {
		this.cantidadProducto = cantidadProducto;
	}
	public String getFchDeseadaProducto() {
		return fchDeseadaProducto;
	}
	public void setFchDeseadaProducto(String fchDeseadaProducto) {
		this.fchDeseadaProducto = fchDeseadaProducto;
	}

	@Override
	public String toString() {
		
		String texto = "Producto: " + this.nombreProducto + "\n";
		
		return texto;
	}		

	
}
