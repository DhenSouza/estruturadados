package estruturadados.vetor;

import estruturadados.base.EstruturaEstatica;

public class Lista2<T> extends EstruturaEstatica<T> {

	public Lista2() {
		super();
	}

	public Lista2(Integer capacidade) {
		super(capacidade);
	}

	public boolean adiciona(T elemento) {
		return super.adiciona(elemento);
	}

	public boolean adiciona(Integer posicao, T elemento){
		return super.adiciona(posicao, elemento);
	}

}
