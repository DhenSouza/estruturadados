package estruturadados.pilha.exercicios;

import java.util.Scanner;

import estruturadados.pilha.Pilha;

public class Exercicio2 {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		Pilha<Integer> par = new Pilha<>();

		Pilha<Integer> impar = new Pilha<>();
		for (int i = 1; i <= 10; i++) {

			System.out.println("Entre com um número: ");

			int num = scan.nextInt();

			if (num == 0) {

				// pilha par

				Integer desempilhado = par.desempilha();

				if (desempilhado == null) {
					System.out.println("Pilha par vazia");
				} else {
					System.out.println("Desempilhando da pilha par: " + desempilhado);
				}

				// pilha impar

				desempilhado = impar.desempilha();

				if (desempilhado == null) {
					System.out.println("Pilha impar vazia");
				} else {
					System.out.println("Desempilhando da pilha impar: " + desempilhado);
				}

			} else if (num % 2 == 0) {
				System.out.println("Número par, empilhando na pilha par: " + num);
				par.empilha(num);
			} else {
				System.out.println("Número ímpar, empilhando na pilha ímpar: " + num);
				impar.empilha(num);
			}
		}

		System.out.println("Desempilhando todos os numeros da pilha par: ");

		while (!par.estaVazia()) {

			System.out.println("Desempilhando um elemento da pilha Par " + par.desempilha());
		}

		while (!impar.estaVazia()) {

			System.out.println("Desempilhando um elemento da pilha Impar " + impar.desempilha());
		}

	}

}
