package ProyectoArbolNodos;

public class Nodo {
	public int llave;
	public Nodo nIzq;
	public Nodo nDer;
	public Nodo padre;
	
	public Nodo(int indice) {
		this.llave = indice;
		nIzq = null;
		nDer = null;
		padre = null;
	}
}
