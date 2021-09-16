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
		
		vetor.removerElemento(1);
		
		System.out.println(vetor);
		
		
	}

}
