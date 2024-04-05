package servicios;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import dtos.VentaDto;

public class MenuImplementacion implements MenuInterfaz {
	
	private String miArchivoLog = "miArchivoLog.txt";
	
	List<VentaDto> listaVentas = new ArrayList<VentaDto>();
	Scanner sc = new Scanner(System.in);
	@Override
	public int mostrarMenuYSeleccion() throws IOException {
		
		int opcion;
		System.out.println("0. Cerrar aplicacion");
		System.out.println("1. Abrir menu gerencia");
		System.out.println("2. Abrir menu empleados");
		System.out.println("Selecciona una opcion: ");
		opcion = sc.nextInt();
		return opcion;
	}

	@Override
	public void accederMenuGerencia() {
		
		int opcionMenuGerencia;
		boolean cerrarMenuGerencia = false;
		
		do {
			
			opcionMenuGerencia = mostrarMenuYSeleccionGerencia();
			
			switch(opcionMenuGerencia) {			
				case 0:
					cerrarMenuGerencia = true;
					break;
				case 1:
					
					break;
				case 2:
					
					break;
					
				default:
					break;
			}
			
		}while(!cerrarMenuGerencia);
		
	}
	
	private int mostrarMenuYSeleccionGerencia() {
		int opcion;		
		System.out.println("0. Volver a menu principal");
		System.out.println("1. Mostrar todas las ventas de un dia");
		System.out.println("2. Crear pedido para proveedor");
		System.out.println("Selecciona una opcion: ");
		opcion = sc.nextInt();
		return opcion;
	}

	@Override
	public void accederMenuEmpleado() throws IOException {
		EmpleadoInterfaz ei = new EmpleadoImplementacion();
		
		int opcionMenuEmpleado;
		boolean cerrarMenuEmpleado = false;
		
		do {
			FileWriter sw = new FileWriter(miArchivoLog, true);
			opcionMenuEmpleado = mostrarMenuYSeleccionEmpleado();
			
			switch(opcionMenuEmpleado) {			
				case 0:
					cerrarMenuEmpleado = true;
					sw.write("0. Volver a menu principal\n");
					break;
				case 1:
					ei.ventaTotalDiaria(listaVentas);
					sw.write("1. Mostrar todas las ventas de un dia\n");
					break;
				case 2:
					ei.aniadirVenta(listaVentas);
					sw.write("2. Crear pedido para proveedor\n");
					break;
				default:
					break;
					
			}
		sw.close();
		}while(!cerrarMenuEmpleado);
		
	}
	
	private int mostrarMenuYSeleccionEmpleado() {
		int opcion;		
		System.out.println("0. Volver a menu principal");
		System.out.println("1. Calculo total ventas diaria");
		System.out.println("2. Agregar venta");
		System.out.println("Selecciona una opcion: ");
		opcion = sc.nextInt();
		return opcion;
	}

}
