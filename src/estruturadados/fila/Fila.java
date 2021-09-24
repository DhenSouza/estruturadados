package estruturadados.fila;

import estruturadados.base.EstruturaEstatica;
import estruturadados.interfaces.IFila;

public class Fila<T> extends EstruturaEstatica<T> implements IFila<T> {

	public Fila() {
		super();
	}

	public Fila(int capacidade) {
		super(capacidade);
	}

	@Override
	public void enfileira(T elemento) {

		// uoutro metodo de fazer é
		// this.elementos[this.tamanho] = elemento
		// this.tamanho++

		// um modo de fazer
		// this.elementos[this.tamanho++] = elemento;

		this.adiciona(elemento);
	}

	@Override
	public T espiar() {
		if (this.estaVazia()) {
			return null;
		}
		return this.elementos[0];
	}

	@Override
	public T desenfileira() {

		final Integer POSITION = 0;

		if (this.estaVazia()) {
			return null;
		}

		T elementoASerRemovido = this.elementos[POSITION];
		this.remove(POSITION);

		return elementoASerRemovido;
	}

}
