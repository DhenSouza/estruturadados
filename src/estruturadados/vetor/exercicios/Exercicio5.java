package estruturadados.vetor.exercicios;

import estruturadados.vetor.Lista;

public class Exercicio5 {

	public static void main(String[] args) {
		// Melhore a clssse lista e implemente o metodo limpar, onde todos
		//  os elementos da lista sao removidos
		// Esse método é semelhante ao metodo clear da classe ArrayList
		
		
		Lista<String> lista = new Lista<>(5);

		lista.adiciona("Elemento A");
		lista.adiciona("Elemento B");
		
		System.out.println(lista);
		
		
		lista.limpar();
		
		System.out.println(lista);
		
	}
}
