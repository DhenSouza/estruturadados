package estruturadados.vetor.exercicios;

import estruturadados.vetor.Lista;

public class Exercicio1 {
	
	public static void main(String[] args) {
		// Melhore a classe Lista e implemente o método contém, 
		// semelhando ao método da classe ArrayList.
		
		
		Lista<String> vetor = new Lista<>();
		
		vetor.adiciona("A");
		vetor.adiciona("B");
		vetor.adiciona("C");
		vetor.adiciona("D");
		vetor.adiciona("E");
		
		boolean verifica = vetor.contem("D");
		if(verifica) {
			System.out.println("Existe no vetor");
		} else {
			System.out.println("Não existe no vetor");
		}
		
	}
}
