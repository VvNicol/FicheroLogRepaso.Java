package controladores;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import servicios.MenuImplementacion;
import servicios.MenuInterfaz;

public class Inicio {

	public static String miArchivoLog = "miArchivoLog.txt";

	public static void main(String[] args) {

		MenuInterfaz mi = new MenuImplementacion();

		int opcionMenuPrincipal;
		boolean cerrarAplicacion = false;
		
		try {
			File archivo = new File(miArchivoLog);
            if (!archivo.exists()) {
                archivo.createNewFile();
            }
            FileWriter fw = new FileWriter(archivo, true);
				
			do {
				
				fw.write("Menu Principal\n");
				opcionMenuPrincipal = mi.mostrarMenuYSeleccion();

				switch (opcionMenuPrincipal) {
				case 0:
					cerrarAplicacion = true;
					fw.write("Aplicacion cerrada\n");
					break;
				case 1:
					mi.accederMenuGerencia();
					fw.write("Menu gerencia\n");
					break;
				case 2:
					mi.accederMenuEmpleado();
					fw.write("Menu Empleado\n");
					break;
				default:
					System.out.print("La opcion no existe");
					break;
				}
				
				fw.close();
			} while (!cerrarAplicacion);
			
		} catch (IOException io) {
			System.out.println("Error no se ha posido leer/escribir " + io.getMessage());
			io.printStackTrace();
		}

	}

}
