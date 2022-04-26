package model;

public class Nodo {

	private int val;
	private int count;

	private Nodo anterior;
	private Nodo siguiente;

	public Nodo(int value) {
		this.val = value;
		this.count = 0;
	}

	public int getValue() {
		return val;
	}

	public void setValue(int value) {
		this.val = value;
	}

	public Nodo getPrev() {
		return anterior;
	}

	public void setPrev(Nodo prev) {
		this.anterior = prev;
	}

	public Nodo getNext() {
		return siguiente;
	}

	public void setNext(Nodo next) {
		this.siguiente = next;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

}