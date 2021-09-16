package estruturadados.vetor;

public class VetorObjeto {

	private Object[] elementos;
	private Integer tamanho;

	public VetorObjeto(int capacidade) {
		this.elementos = new Object[capacidade];
		this.tamanho = 0;
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

	public boolean adiciona(Object elemento) {
		this.aumentaCapacidade();

		if (this.tamanho < this.elementos.length) {
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;
			return true;
		}
		return false;
	}

	// Adiciona elemento em qualquer posição sem perder elementos ja existentes
	public boolean adiciona(int posicao, Object elemento) {
		if (!(posicao >= 0 && posicao < tamanho)) {
			throw new IllegalArgumentException("Posição inválida!");
		}

		this.aumentaCapacidade();

		for (int i = this.tamanho - 1; i >= posicao; i--) {
			this.elementos[i + 1] = this.elementos[i];
		}

		this.elementos[posicao] = elemento;
		this.tamanho++;

		return true;
	}

	public void removerElemento(int posicao) {
		if (!(posicao >= 0 && posicao < tamanho)) {
			throw new IllegalArgumentException("Posição inválida!");
		}

		for (int i = posicao; i < tamanho - 1; i++) {
			this.elementos[i] = this.elementos[i + 1];
		}

		this.tamanho--;

	}

	public Integer getTamanho() {
		return tamanho;
	}

	public Object busca(int posicao) {
		if (!(posicao >= 0 && posicao < tamanho)) {
			throw new IllegalArgumentException("Posição inválida!");
		}
		return this.elementos[posicao];
	}

	// sobrecarga verifica se existe o elemento
	public int busca(Object elemento) {
		for (int i = 0; i < this.tamanho; i++) {
			if (elementos[i].equals(elemento)) {
				return i;
			}
		}
		return -1;
	}

	private void aumentaCapacidade() {
		if (this.tamanho == this.elementos.length) {
			Object[] vetorNovo = new Object[this.elementos.length * 2];

			for (int i = 0; i < this.elementos.length; i++) {
				vetorNovo[i] = this.elementos[i];
			}

			this.elementos = vetorNovo;
		}
	}

}
