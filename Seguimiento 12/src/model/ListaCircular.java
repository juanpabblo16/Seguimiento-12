package model;

public class ListaCircular {

	private Nodo principal;
	private Nodo girar;
	private int totalDelArreglo;

	public void addLast(Nodo node) {
		if (principal == null) {
			principal = node;
			principal.setNext(principal);
			principal.setPrev(principal);
			girar = principal;
		} else {
			Nodo nodo1 = principal.getPrev();
			nodo1.setNext(node);
			node.setPrev(nodo1);
			node.setNext(principal);
			principal.setPrev(node);
		}
		totalDelArreglo++;
	}

	public void deleteTurn() {
		if (totalDelArreglo != 1) {
			Nodo previo = girar.getPrev();
			Nodo siguiente = girar.getNext();
			previo.setNext(siguiente);
			siguiente.setPrev(previo);
			if (girar.equals(principal)) {
				principal = siguiente;
			}
			girar = siguiente;
		} else {
			girar = null;
			principal = null;
		}
		totalDelArreglo--;
	}

	public void nextTurn() {
		girar.setCount(girar.getCount() + 1);
		if (girar.getCount() == 3) {
			System.out.println("Se elimino por salto de turnos el turno: " + girar.getValue());
			deleteTurn();
		}
		girar = girar.getNext();
	}

	public void print() {
		print(girar);
	}

	private void print(Nodo node) {
		System.out.println("El turno es: " + node.getValue());
	}

}