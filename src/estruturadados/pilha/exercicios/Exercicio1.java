package estruturadados.pilha.exercicios;

import java.util.Scanner;

import estruturadados.pilha.Pilha;

public class Exercicio1 {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		
		Pilha<Integer> pilha = new Pilha<>();

		for (int i = 0; i < 11; i++) {
			
			System.out.println("Informe um numero");
			Integer numero = scan.nextInt();
			
			if (numero % 2 == 0) {
				pilha.empilha(numero);
			} else {

				Integer desempilhado = pilha.desempilha();

				if (desempilhado == null) {
					System.out.println(" A pilha esta vazia!");
				} else {
					System.out.println("Numero Impar, desempilhando .. " + desempilhado);
				}

			}

		}

		System.out.println("Todos os numeros foram Lidos, desempilhando numeros da pilha");

		while (!pilha.estaVazia()) {

			System.out.println("Desempilhando um elemento da pilha " + pilha.desempilha());
		}

		System.out.println("Todos os elementos foram desempilhados");
	}
}
