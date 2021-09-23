package estruturadados.pilha.test;

import estruturadados.pilha.Pilha;

public class DesempilhaElemento {
	public static void main(String[] args) {
		Pilha<Integer> pilha = new Pilha<>(5);
		
		pilha.empilha(1);
		pilha.empilha(2);
		pilha.empilha(3);
		pilha.empilha(4);
		pilha.empilha(5);
		
		System.out.println(pilha);
		
		System.out.println(pilha.desempilha() + " Pilha desempilhada.");
		
		System.out.println(pilha);
	}

}
