package model;

public class Node {

	private int val;
	private int count;

	private Node anterior;
	private Node siguiente;

	public Node(int value) {
		this.val = value;
		this.count = 0;
	}

	public int getValue() {
		return val;
	}

	public void setValue(int value) {
		this.val = value;
	}

	public Node getPrev() {
		return anterior;
	}

	public void setPrev(Node prev) {
		this.anterior = prev;
	}

	public Node getNext() {
		return siguiente;
	}

	public void setNext(Node next) {
		this.siguiente = next;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

}