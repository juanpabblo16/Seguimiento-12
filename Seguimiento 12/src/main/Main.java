package main;

import java.util.Scanner;
import model.ListaCircular;
import model.Nodo;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ListaCircular circularList = new ListaCircular();
		boolean continuar = true;
		int turno = 1;
		while (continuar) {
			System.out.println("1. Agregar turno" + "\n");
			System.out.println("2. Mostrar turno" + "\n");
			System.out.println("3. Pasar turno" + "\n");
			System.out.println("4. Eliminar turno actual" + "\n");

			System.out.println("Escribe una de las opciones" + "\n");

			int opt = Integer.parseInt(sc.nextLine());
			switch (opt) {
			case 1:
				circularList.addLast(new Nodo(turno));
				System.out.println("Has seleccionado la opcion 1");

				System.out.println("Turno aniadido correctamente.\n");
				turno++;
				break;
			case 2:
				circularList.print();
				System.out.println("Has seleccionado la opcion 2");
				break;
			case 3:
				circularList.nextTurn();

				System.out.println("Has seleccionado la opcion 3");

				System.out.println("Se paso el turno.\n");
				break;
			case 4:
				circularList.deleteTurn();
				System.out.println("Se borro el nodo.\n");
				break;
			case 5:
				continuar = false;
			default:
				System.out.println("Opcion incorrecta." + "\n" + "Seleccione nuevamente.");
				break;
			}
		}
	}

}