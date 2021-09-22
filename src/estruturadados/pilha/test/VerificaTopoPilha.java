package estruturadados.pilha.test;

import estruturadados.pilha.Pilha;

public class VerificaTopoPilha {
	
	public static void main(String[] args) {
		Pilha<Integer> pilha = new Pilha<>(5);
		
		System.out.println(pilha.topo());
		
		System.out.println(pilha);
		
		pilha.empilha(1);
		pilha.empilha(2);
		pilha.empilha(2);
		pilha.empilha(3);
		pilha.empilha(4);
		
		System.out.println(pilha.topo());
	}

}
