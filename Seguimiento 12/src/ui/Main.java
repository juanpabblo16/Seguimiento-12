package ui;

import java.util.InputMismatchException;
import java.util.Scanner;
import model.ListaCircular;
import model.Nodo;

public class Main {

	public static void main(String[] args) {

		ListaCircular agregarTurno = new ListaCircular();

		ListaCircular mostrarValor = new ListaCircular();

		ListaCircular eliminarValor = new ListaCircular();
		
		ListaCircular eliminarPosicion = new ListaCircular();

		Nodo atributos = new Nodo();

		int valor = atributos.getValor();

		System.out.println("Bienvenido al sistema de turnos");

		Scanner sn = new Scanner(System.in);
		boolean salir = false;
		int opcion;
		int opcion2;
		int referencia = 0;

		try {

			while (!salir) {

				System.out.println("1. Agregar turno");
				System.out.println("2. Mostrar turno");
				System.out.println("3. Pasar turno");
				System.out.println("4. Eliminar turno actual");

				System.out.println("Escribe una de las opciones");
				opcion = sn.nextInt();

				switch (opcion) {
				case 1:
					System.out.println("Has seleccionado la opcion 1");
						
					System.out.println("Escoja referencia a agregar:");
					
					referencia = sn.nextInt();
				
					agregarTurno.insertarPorReferencia(referencia, valor);

					break;
				case 2:
					System.out.println("Has seleccionado la opcion 2");
					
					try {
						mostrarValor.getValor(referencia);
					} catch (Exception e) {
						e.printStackTrace();
					}
					
					break;
				case 3:
					System.out.println("Has seleccionado la opcion 3");

					System.out.println("Seleccione 1 si se presento el usuario:" + "\n");

					System.out.println("Seleccione 2 si no se presento el usuario:" + "\n");

					opcion2 = sn.nextInt();

					switch (opcion2) {
					case 1:

						atributos.getSiguiente();
						
						atributos.setSiguiente(atributos);
						
						break;

					case 2:

						eliminarValor.removerPorReferencia(valor);
						
						System.out.println("Se ha eliminado con exito");

						break;

					default:

						System.out.println("Seleccione solo numeros 1 o 2" + "\n");
						break;
					}

					break;
				case 4:
					
					atributos.getValor();
					
					eliminarPosicion.removerPorPosicion(valor);
					
					System.out.println("Se elimino el turno");
					
					salir = true;
					break;
				default:
					System.out.println("Solo números entre 1 y 4");
				}

			}

		} catch (InputMismatchException e) {
			System.out.println("Debes insertar un número");
			sn.next();
		}

	}

}
