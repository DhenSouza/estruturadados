package estruturadados.vetor.exercicios;

import estruturadados.vetor.Lista;

public class Exercicio3 {
	public static void main(String[] args) {
		// Melhore a clssse lista e implemente o metodo Remove(T elemento, onde sera
		// possivel
		// remover um elemento da lista passando o mesmo como parametro.

		Lista<String> lista = new Lista<>(5);

		lista.adiciona("Elemento A");
		lista.adiciona("Elemento B");
		lista.adiciona("Elemento C");
		lista.adiciona("Elemento D");
		lista.adiciona("Elemento E");
		
		System.out.println(lista);
		
		lista.removerElemento("Elemento A");
		System.out.println(lista);
	}

}
