package estruturadados.pilha;

import estruturadados.base.EstruturaEstatica;
import estruturadados.interfaces.IPilha;

public class Pilha<T> extends EstruturaEstatica<T> implements IPilha<T> {

	private T[] elementos;
	private Integer tamanho;

	public Pilha() {
		super();
	}

	public Pilha(Integer capacidade) {
		super(capacidade);
	}

	@Override
	public void empilha(T elemento) {
		// TODO Auto-generated method stub

	}

	@Override
	public T topo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T desempilha() {
		// TODO Auto-generated method stub
		return null;
	}

}
