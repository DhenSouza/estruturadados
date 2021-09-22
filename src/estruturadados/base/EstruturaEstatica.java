package estruturadados.base;

public class EstruturaEstatica<T> {

	private T[] elementos;
	private Integer tamanho;

	@SuppressWarnings("unchecked")
	public EstruturaEstatica(int capacidade) {
		this.elementos = (T[]) new Object[capacidade]; // solu��o do livro effective Java
		this.tamanho = 0;
	}

	public EstruturaEstatica() {
		this(10);
	}

	protected boolean adiciona(T elemento) {
		this.aumentaCapacidade();

		if (this.tamanho < this.elementos.length) {
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;
			return true;
		}
		return false;
	}

	protected boolean adiciona(Integer posicao, T elemento) {
		this.verificarPosicaoValida(posicao);

		this.aumentaCapacidade();

		for (int i = this.tamanho - 1; i >= posicao; i--) {
			this.elementos[i + 1] = this.elementos[i];
		}

		this.elementos[posicao] = elemento;
		this.tamanho++;

		return true;

	}

	public void remove(Integer posicao) {
		// TODO Auto-generated method stub

	}

	private void aumentaCapacidade() {
		if (this.tamanho == this.elementos.length) {
			T[] vetorNovo = (T[]) new Object[this.elementos.length * 2];

			for (int i = 0; i < this.elementos.length; i++) {
				vetorNovo[i] = this.elementos[i];
			}
			this.elementos = vetorNovo;
		}

	}

	public boolean estaVazia() {
		// TODO Auto-generated method stub
		return false;
	}

	public Integer tamanho() {
		return this.tamanho;
	}

	public void verificarPosicaoValida(int posicao) {
		if (!(posicao >= 0 && posicao < this.tamanho)) {
			throw new IllegalArgumentException("Posi��o inv�lida!");
		}
	}

	@Override
	public String toString() {

		StringBuilder s = new StringBuilder();
		s.append("[");

		for (int i = 0; i < this.tamanho - 1; i++) {
			s.append(this.elementos[i]);
			s.append(", ");
		}

		if (tamanho > 0) {
			s.append(this.elementos[this.tamanho - 1]);
		}
		s.append("] ");

		return s.toString();
	}

}