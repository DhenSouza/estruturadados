package estruturadados.vetor.test;

import estruturadados.vetor.Vetor;

public class RemoverElementos {

	public static void main(String[] args) {
		Vetor vetor = new Vetor(10);

		vetor.adiciona("B");
		vetor.adiciona("G");
		vetor.adiciona("D");
		vetor.adiciona("E");
		vetor.adiciona("F");

		System.out.println(vetor);
		
		int posicao = vetor.busca("D");
		
		if (posicao > - 1) {
			vetor.removerElemento(posicao);
		} else {
			System.out.println("Elemento Não existe no vetor");
		}
		
		System.out.println(vetor);
		
	}

}
