package estruturadados.pilha.exercicios;

import estruturadados.pilha.Pilha;

public class Exercicio5 {
		public static void main(String[] args) {
			
			imprimeResultado("ADA");
			
			imprimeResultado("ABCD");
			
			imprimeResultado("ABCCBA");
			
			imprimeResultado("Maria");
			
		}
		
		public static void imprimeResultado(String palavra) {
			System.out.println(palavra + " � palindromo? " + testaPalindromo(palavra));
		}

		private static boolean testaPalindromo(String palavra) {
			Pilha<Character> pilha = new Pilha<>();
			
			for(int i=0; i < palavra.length(); i++) {
				pilha.empilha(palavra.charAt(i));
			}
			
			String palavraInversa = "";
			
			while(!pilha.estaVazia())  {
				palavraInversa += pilha.desempilha();
			}
			
			if (palavraInversa.equalsIgnoreCase(palavra)){
				return true;
			}
			return false;
		}
}