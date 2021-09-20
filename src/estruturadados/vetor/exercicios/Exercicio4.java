package estruturadados.vetor.exercicios;

import estruturadados.vetor.Lista;

public class Exercicio4 {
	
	public static void main(String[] args) {
		// Melhore a clssse lista e implemente o metodo obtem(int posicion), onde sera
		//  possivel obter o elemento dada a posição do vetor.
		// Esse método é semelhante ao metodo get da classe ArrayList
		
		
		Lista<String> lista = new Lista<>(5);

		lista.adiciona("Elemento A");
		lista.adiciona("Elemento B");
		lista.adiciona("Elemento C");
		lista.adiciona("Elemento D");
		lista.adiciona("Elemento E");
		
		System.out.println(lista.obtem(0));
		System.out.println(lista.obtem(2));
		System.out.println(lista.obtem(4));
		
	}

}
