package dtos;

import java.time.LocalDateTime;

public class VentaDto {
	
	long id;
	double importeVenta = 0.0;
    public double getImporteVenta() {
		return importeVenta;
	}

	public void setImporteVenta(double importeVenta) {
		this.importeVenta = importeVenta;
	}

	public LocalDateTime getFchImporte() {
		return fchImporte;
	}

	public void setFchImporte(LocalDateTime fchImporte) {
		this.fchImporte = fchImporte;
	}

	LocalDateTime fchImporte =  LocalDateTime.now();
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}	
	
}
