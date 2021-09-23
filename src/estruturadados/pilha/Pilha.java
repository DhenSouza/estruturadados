package estruturadados.pilha;

import estruturadados.base.EstruturaEstatica;
import estruturadados.interfaces.IPilha;

public class Pilha<T> extends EstruturaEstatica<T> implements IPilha<T> {

	public Pilha() {
		super();
	}

	public Pilha(Integer capacidade) {
		super(capacidade);
	}

	@Override
	public void empilha(T elemento) {
		this.adiciona(elemento);
	}

	@Override
	public T topo() {
		if (this.estaVazia()) {
			return null;
		}
		return this.elementos[tamanho - 1];
	}

	// Um modo de fazer o desempilha 
			/*T elemento = this.elementos[tamanho - 1];
			tamanho--;
			return elemento;*/
	
	@Override
	public T desempilha() {
		if (this.estaVazia()) {
			return null;
		}
		return this.elementos[--tamanho];
	}

}
