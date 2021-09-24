package estruturadados.fila;

import estruturadados.base.EstruturaEstatica;
import estruturadados.interfaces.IFila;

public class Fila<T> extends EstruturaEstatica<T> implements IFila<T>{
	
	public Fila() {
		super();
	}

	public Fila(int capacidade) {
		super(capacidade);
	}

	@Override
	public void enfileira(T elemento) {
		this.adiciona(elemento);
	}

	@Override
	public T espiar() {
		if (this.estaVazia()) {
			return null;
		}
		return this.elementos[tamanho-1];
	}

	@Override
	public T desenfileira() {
		// TODO Auto-generated method stub
		return null;
	}

}
