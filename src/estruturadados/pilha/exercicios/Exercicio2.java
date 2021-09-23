package estruturadados.pilha.exercicios;

import estruturadados.pilha.Pilha;

public class Exercicio2 {

	public static void main(String[] args) {

		Pilha<Integer> par = new Pilha<>();

		Pilha<Integer> impar = new Pilha<>();

		for (int i = 0; i < 11; i++) {
			if (i % 2 == 0) {
				par.empilha(i);
			} else {
				impar.empilha(i);
			}

			if (i == 0) {
				if (par.estaVazia() && impar.estaVazia()) {
					System.out.println("As pilhas estao nullas! ");
				}
				par.desempilha();
				impar.desempilha();
			}

		}

		System.out.println("Numeros PAR");
		mostrarPar(par);

		System.out.println("Numero Impar");
		mostrarImpar(impar);

	}

	public static Pilha<Integer> mostrarPar(Pilha<Integer> par) {

		for (int i = 0; i < 11; i++) {
			System.out.println(par);
		}

		return par;
	}

	public static Pilha<Integer> mostrarImpar(Pilha<Integer> impar) {

		for (int i = 0; i < 11; i++) {
			System.out.println(impar);
		}

		return impar;
	}

}
