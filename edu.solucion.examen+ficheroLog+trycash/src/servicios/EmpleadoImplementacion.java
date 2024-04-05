package servicios;

import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import dtos.VentaDto;
import util.Utilidades;

public class EmpleadoImplementacion implements EmpleadoInterfaz {
	Utilidades util;
	Scanner sc = new Scanner(System.in);
	
	@Override
	public void aniadirVenta(List<VentaDto> listaVentas) throws IOException {
		
		// TODO Auto-generated method stub
		VentaDto crearVenta = new VentaDto();
		long idVenta= util.calcularIdVenta(listaVentas);
		System.out.println("Agrege una venta");
		double importeVenta=sc.nextDouble();	
		crearVenta.setImporteVenta(importeVenta);
		crearVenta.setId(idVenta);
		listaVentas.add(crearVenta);
	}

	public void ventaTotalDiaria(List<VentaDto>listaVentas)throws IOException {
		
		System.out.println("Ingrese una fecha (formato dd-MM-yyyy)");
		String fechaConsultada = sc.next();
		double importeTotal = 0.0;
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		List<LocalDateTime> fechasVentas = new ArrayList<LocalDateTime>();
		
		for (VentaDto venta : listaVentas) {
			 
				if (venta.getFchImporte().format(formato).equals(fechaConsultada)) {
					
					importeTotal = importeTotal + venta.getImporteVenta();
					fechasVentas.add(venta.getFchImporte());
					
				}
		}
		
		//LocalDate fechaInicio = LocalDate.parse(fechasVentas.get(0).format(formato), formato);
		//LocalDate fechaFin = fechasVentas.get(fechasVentas.size()-1).toLocalDate();
			
		//Period diferencia = Period.between(fechaInicio, fechaFin);
		
		//Temporal fechaInicio = fechasVentas.get(0);
		//Temporal fechaFin = fechasVentas.get(fechasVentas.size()-1);
		
		
		//Duration diferencia = Duration.between(fechasVentas.get(0), fechasVentas.get(fechasVentas.size()-1));
		
		LocalDateTime fechaHoy = LocalDateTime.now();
		LocalDateTime fechaOtra = LocalDateTime.of(2024,3,15,12,12,12);
		LocalDateTime fechaAntesAyer = fechaHoy.plusDays(-3);
		
		Duration diferencia = Duration.between(fechasVentas.get(0), fechasVentas.get(fechasVentas.size()-1));
		
		System.out.println("Importe: " + importeTotal +
				"Minutos Part: " + diferencia.toMinutesPart() +
				"Minutos: " + diferencia.toMinutes());
		
			
	}
}
