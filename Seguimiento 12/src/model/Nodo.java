package model;

public class Nodo {
	
    private int valor;
    
    private Nodo siguiente;
    
    public Nodo () {
    	
    	this.valor = 0;
    	this.siguiente = null;
    	
    }

	/**
	 * @return the valor
	 */
	public int getValor() {
		return valor;
	}

	/**
	 * @param valor the valor to set
	 */
	public void setValor(int valor) {
		this.valor = valor;
	}

	/**
	 * @return the siguiente
	 */
	public Nodo getSiguiente() {
		return siguiente;
	}

	/**
	 * @param siguiente the siguiente to set
	 */
	public void setSiguiente(Nodo siguiente) {
		this.siguiente = siguiente;
	}
    
	


}
