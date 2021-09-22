package estruturadados.pilha.test;

import estruturadados.pilha.Pilha;

public class VerificaEstaVazio {
	
	public static void main(String[] args) {
		
		Pilha<Integer> pilha = new Pilha<>();
		
		System.out.println(pilha.estaVazia());
		
		pilha.empilha(1);
		
		System.out.println(pilha.estaVazia());

	}

}
