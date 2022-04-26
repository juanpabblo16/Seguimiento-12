package model;

public class ListaCircular {

	private Nodo principal;
	private Nodo girar;
	private int totalDelArreglo;

	public void addLast(Nodo node1) {
		if (principal == null) {
			principal = node1;
			principal.setNext(principal);
			principal.setPrev(principal);
			girar = principal;
		} else {
			Nodo nodo1 = principal.getPrev();
			nodo1.setNext(node1);
			node1.setPrev(nodo1);
			node1.setNext(principal);
			principal.setPrev(node1);
		}
		totalDelArreglo++;
	}
	

	private void print(Nodo node) {
		System.out.println("El turno es: " + node.getValue());
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
			System.out.println("Se elimino el turno para el siguiente: " + girar.getValue());
			deleteTurn();
		}
		girar = girar.getNext();
	}

	public void print() {
		print(girar);
	}

	@Override
	public String toString() {
		return super.toString();
	}
}