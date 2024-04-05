package servicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import dtos.ProductoDto;

public class GerenciaImplementacion implements GerenciaInterfaz {

	@Override
	public void crearPedido() {
		List<ProductoDto> pedido = new ArrayList<ProductoDto>();
		Scanner sc = new Scanner(System.in);
		
		String controlador = "";
		
		do {
			
			System.out.println("Nombre producto: ");
			String nombre = sc.next();
			System.out.println("Cantidad producto: ");
			int cantidad = sc.nextInt();
			System.out.println("Fecha entrega (dd-MM-yyyy): ");
			String fecha = sc.next();
			
			ProductoDto producto = new ProductoDto(nombre,cantidad,fecha,pedido);
			pedido.add(producto);
			System.out.println("Otro producto (si/no): ");
			controlador = sc.next();
			
		}while(controlador.equals("si"));
		
		for(ProductoDto producto : pedido) {
			System.out.println(producto.toString());
		}
		
		
	}

}
