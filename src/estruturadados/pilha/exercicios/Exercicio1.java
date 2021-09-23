package estruturadados.pilha.exercicios;

import java.util.Scanner;

import estruturadados.pilha.Pilha;

	

public class Exercicio1 {
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		/*System.out.println("Informe o tamanho da pilha");
		Integer tam = scan.nextInt();*/
		
		Pilha<Integer> pilha = new Pilha<>(11);
		
		
		for(int i=0; i<11; i++) {
			if(i%2 == 0) {
				pilha.empilha(i);
			} else {

				if(pilha.estaVazia()) {
					System.out.println(" A pilha esta vazia!");
				}
				pilha.desempilha();
				
			}
			
			if(!pilha.estaVazia()) {
				System.out.println(pilha);
			}
		}

	}
}
