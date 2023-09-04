package ProyectoArbolNodos;


public class Arbol {
	Nodo raiz;
	public Arbol() {
		raiz = null;
	}

	public boolean vacio() {
		if(raiz == null) {
			return true;
		}else
			return false;
	}

	public void insertar(int llave) {
		Nodo N = new Nodo(llave);
		if (vacio()) {
			raiz = N;

		} else {
			Nodo aux = raiz;
			while (aux != null) {
				N.padre = aux;
				if (N.llave>= aux.llave) {
					aux = aux.nDer;
				} else {
					aux = aux.nIzq;
				}
			}
			if (N.llave < N.padre.llave) {
				N.padre.nIzq = N;
			} else {
				N.padre.nDer = N;
			}
		}
	}

	public Nodo buscar(int num, Nodo N) {
		if (N == null) {
			return null;
		}
		if (N.llave == num) {
			return N;
		} else if (num > N.llave) {
			return buscar(num, N.nDer);
		} else {
			return buscar(num, N.nIzq);
		}
	}

	public void imprimir(Nodo N) {
		if (N != null) {
			System.out.println("Nodo: " + N.llave);
			imprimir(N.nIzq);
			imprimir(N.nDer);

		}
	}
	
}
