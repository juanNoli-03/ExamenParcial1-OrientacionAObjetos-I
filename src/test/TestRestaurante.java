package test;

import java.time.LocalDate;

import modelos.SistemaRestaurante;


public class TestRestaurante {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("\n---PRIMER EXAMEN PARCIAL OO1 (Juan Manuel Noli / 45233126)---\n");
		
		//0- CREAMOS EL SISTEMA
		SistemaRestaurante sistema = new SistemaRestaurante ();
		//-------------------------------------------

		
		//1- AREGAMOS LOS SIGUIENTES CLIENTES
		System.out.println("\n1- Agregamos clientes: ");
		try {
			System.out.println("\nCliente agregado de forma exitosa?: " + sistema.agregarCliente("Juan", "Perez", 38958345, "+541146592131"));
			System.out.println("\nClinete agregado de forma exitosa?: " + sistema.agregarCliente("Mario", "Lopez", 32964234, "+541163927564"));
			System.out.println("\nClinete agregado de forma exitosa?: " + sistema.agregarCliente("Delia", "Gonzalez", 33095256, "+541109624724"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		System.out.println("\n---------------------------------------------------\n");
		//-------------------------------------------
		
		//2- AREGAMOS LAS SIGUIENTES MESAS
		System.out.println("\n2- Agregamos mesas: ");
		try {
			System.out.println("\nMesa agregada de forma exitosa?: " + sistema.agregarMesa(1, 4));
			System.out.println("\nMesa agregada de forma exitosa?: " + sistema.agregarMesa(2, 4));
			System.out.println("\nMesa agregada de forma exitosa?: " + sistema.agregarMesa(3, 2));
			System.out.println("\nMesa agregada de forma exitosa?: " + sistema.agregarMesa(4, 4));
			System.out.println("\nMesa agregada de forma exitosa?: " + sistema.agregarMesa(5, 6));
			System.out.println("\nMesa agregada de forma exitosa?: " + sistema.agregarMesa(6, 4));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
				
		System.out.println("\n---------------------------------------------------\n");
		//-------------------------------------------
		
		//3- AREGAMOS LAS SIGUIENTES RESERVAS
		System.out.println("\n3- Agregamos reservas: ");
		try {
			System.out.println("\nReserva agregada de forma exitosa?: " + sistema.agregarReserva(sistema.traerCliente(38958345), LocalDate.of(2023, 8, 10), sistema.traerMesa(3), 2));
			System.out.println("\nReserva agregada de forma exitosa?: " + sistema.agregarReserva(sistema.traerCliente(32964234), LocalDate.of(2023, 8, 10), sistema.traerMesa(2), 4));
			System.out.println("\nReserva agregada de forma exitosa?: " + sistema.agregarReserva(sistema.traerCliente(33095256), LocalDate.of(2023, 8, 20), sistema.traerMesa(6), 4));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
						
		System.out.println("\n---------------------------------------------------\n");
		//-------------------------------------------
		

		//4- TRAEMOS E IMPRMIMOS TODAS LAS RESERVAS ENTRE LAS FECHAS 2023-8-10 Y 2023-8-15
		System.out.println("\n4- Traemos e imprimimos todas las reservas entre las fechas 2023-8-10 y 2023-8-15:\n");
		System.out.println(sistema.traerReservasPorFecha(LocalDate.of(2023, 8, 10), LocalDate.of(2023, 8, 15)));
		System.out.println("\n---------------------------------------------------\n");
		//-------------------------------------------
		
		//5- TRAEMOS E IMPRIMIMOS TODAS LAS MESAS LIBRES PARA LA FECHA 2023-8-10
		System.out.println("\n5- Traemos e imprimimos todas mesas libres para la fecha 2023-8-10:\n");
		System.out.println(sistema.traerMesasLibresPorFecha(LocalDate.of(2023, 8, 10)));
		System.out.println("\n---------------------------------------------------\n");
		//-------------------------------------------
		
		//6- INTENTAMOS AGREGAR NUEVAMENTE A UN CIENTE
		System.out.println("\n6- Intentamos agregar nuevamente al ciente Mario Lopez: ");
		try {
			System.out.println("\nClinete agregado de forma exitosa?: " + sistema.agregarCliente("Mario", "Lopez", 32964234, "+541163927564"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		System.out.println("---------------------------------------------------\n");
		//-------------------------------------------
		
		//7- INTENTAMOS AGREGAR NUEVAMENTE A LA MESA 2
		System.out.println("\n7- Intentamos agregar nuevamente a la mesa 2: ");
		try {
			System.out.println("\nMesa agregada de forma exitosa?: " + sistema.agregarMesa(2, 4));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}		
		System.out.println("---------------------------------------------------\n");
		//-------------------------------------------
		
		//8- INTENTAMOS AGREGAR NUEVAMENTE 2 RESERVAS
		System.out.println("\n8- Intentamos agregar nuevamente 2 reservas: ");
		
		try {
			System.out.println("\nReserva agregada de forma exitosa?: " + sistema.agregarReserva(sistema.traerCliente(33095256), LocalDate.of(2023, 8, 10), sistema.traerMesa(3), 2));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		try {
			System.out.println("\nReserva agregada de forma exitosa?: " + sistema.agregarReserva(sistema.traerCliente(32964234), LocalDate.of(2023, 8, 15), sistema.traerMesa(4), 6));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		
		System.out.println("---------------------------------------------------\n");
		//-------------------------------------------

		
		
		
	}

}
