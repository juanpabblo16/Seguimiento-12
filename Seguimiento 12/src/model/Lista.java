package model;

public class Lista {

	private Node principal;
	private Node girar;
	private int totalDelArreglo;

	public void addLast(Node node) {
		if (principal == null) {
			principal = node;
			principal.setNext(principal);
			principal.setPrev(principal);
			girar = principal;
		} else {
			Node tail = principal.getPrev();
			tail.setNext(node);
			node.setPrev(tail);
			node.setNext(principal);
			principal.setPrev(node);
		}
		totalDelArreglo++;
	}

	public void deleteTurn() {
		if (totalDelArreglo != 1) {
			Node prev = girar.getPrev();
			Node next = girar.getNext();
			prev.setNext(next);
			next.setPrev(prev);
			if (girar.equals(principal)) {
				principal = next;
			}
			girar = next;
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

	private void print(Node node) {
		System.out.println("El turno es: " + node.getValue());
	}

}