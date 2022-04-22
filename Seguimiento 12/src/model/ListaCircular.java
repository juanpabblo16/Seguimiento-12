package model;

public class ListaCircular {

	private Nodo inicio;

	private Nodo siguiente;

	private Nodo ultimo;

	private int tamaño;

	public void Lista() {
		inicio = null;
		ultimo = null;
		tamaño = 0;
	}

	private boolean buscar(int valor) {
		return false;
	}

	public boolean Vacia() {

		return inicio == null;

	}

	public int getTamanio() {
		return tamaño;
	}

	public void agregarAlFinal(int valor) {

		Nodo nuevo = new Nodo();
		nuevo.setValor(valor);

		if (Vacia() && tamaño <= 50) {
			inicio = nuevo;
			ultimo = nuevo;
			ultimo.setSiguiente(inicio);
		} else {
			ultimo.setSiguiente(nuevo);
			nuevo.setSiguiente(inicio);

			ultimo = nuevo;
		}
		tamaño++;

		System.out.println("\n" + "Se agrego correctamente" + "\n");

	}

	public void insertarPorReferencia(int referencia, int valor) {
		Nodo nuevo = new Nodo();
		nuevo.setValor(valor);
		if (!Vacia()) {
			if (buscar(referencia)) {
				Nodo aux = inicio;
				while (aux.getValor() != referencia) {
					aux = aux.getSiguiente();
				}
				if (aux == ultimo) {
					aux.setSiguiente(nuevo);
					nuevo.setSiguiente(inicio);
					ultimo = nuevo;
				} else {
					Nodo siguiente = aux.getSiguiente();
					aux.setSiguiente(nuevo);
					nuevo.setSiguiente(siguiente);
				}
				tamaño++;
			}
		}
	}

	public int getValor(int posicion) throws Exception {

		if (posicion >= 0 && posicion < tamaño && tamaño <= 50) {
			if (posicion == 0) {
				return inicio.getValor();
			} else {
				Nodo aux = inicio;
				for (int i = 0; i < posicion; i++) {
					aux = aux.getSiguiente();
				}
				return aux.getValor();
			}
		} else {
			throw new Exception("Posicion inexistente en la lista.");
		}
	}

	public void removerPorReferencia(int valor) {
		if (buscar(valor)) {
			if (inicio.getValor() == valor) {
				inicio = inicio.getSiguiente();
				ultimo.setSiguiente(inicio);
			} else {
				Nodo aux = inicio;
				while (aux.getSiguiente().getValor() != valor) {
					aux = aux.getSiguiente();
				}
				if (aux.getSiguiente() == ultimo) {
					aux.setSiguiente(inicio);
					ultimo = aux;
				} else {
					Nodo siguiente = aux.getSiguiente();
					aux.setSiguiente(siguiente.getSiguiente());
				}
			}

			tamaño--;
		}
	}

	public void removerPorPosicion(int posicion) {
		if (posicion >= 0 && posicion < tamaño) {
			if (posicion == 0) {
				inicio = inicio.getSiguiente();
				ultimo.setSiguiente(inicio);
			} else {
				Nodo aux = inicio;
				for (int i = 0; i < posicion - 1; i++) {
					aux = aux.getSiguiente();
				}
				if (aux.getSiguiente() == ultimo) {
					aux.setSiguiente(inicio);
					ultimo = aux;
				} else {
					Nodo siguiente = aux.getSiguiente();
					aux.setSiguiente(siguiente.getSiguiente());
				}
			}
			tamaño--;
		}
	}

	public void editarPorPosicion(int posicion, int valor) {

		if (posicion >= 0 && posicion < tamaño) {
			if (posicion == 0) {
				inicio.setValor(valor);
			} else {

				Nodo aux = inicio;
				for (int i = 0; i < posicion; i++) {
					aux = aux.getSiguiente();
				}
				aux.setValor(valor);
			}
		}
	}

}
