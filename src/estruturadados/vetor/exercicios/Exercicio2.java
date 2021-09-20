package estruturadados.vetor.exercicios;

import estruturadados.vetor.Lista;

public class Exercicio2 {
	
	public static void main(String[] args) {
		Lista<String> lista = new Lista<>(5);
		
		//Melhore a classe lista e implemente o método ultimoIndice, 
		// semelhante ao metodo LastIndexOf da classe ARrayList
		
		lista.adiciona("Elemento A");
		lista.adiciona("Elemento B");
		lista.adiciona("Elemento C");
		lista.adiciona("Elemento D");
		lista.adiciona("Elemento E");
		
		System.out.println(lista);
		
		lista.ultimoIndice(null);
		
	}
	
	
}
