package estruturadados.pilha.exercicios;

import estruturadados.pilha.Pilha;

public class Exercicio6 {
	public static void main(String[] args) {

		imprimeResultado("{[()]}[](){()}");
		imprimeResultado("A + B");
		imprimeResultado("A + B + (C - D)");
		imprimeResultado("{[(]}[](){()}");
		imprimeResultado("A + B + C - D)");
	}

	public static void imprimeResultado(String expressao) {
		System.out.println(expressao + " está balanceado? " + verificaSimbolosBalanceados(expressao));
	}

	final static String ABRE = "([{";
	final static String FECHA = ")]}";

	public static boolean verificaSimbolosBalanceados(String expressao) {
		Pilha<Character> pilha = new Pilha<>();

		int index = 0;
		char simbolo, topo;

		while (index < expressao.length()) {
			simbolo = expressao.charAt(index);

			if (ABRE.indexOf(simbolo) > -1) {
				pilha.empilha(simbolo);
			} else if (FECHA.indexOf(simbolo) > -1) {
				if (pilha.estaVazia()) {
					return false;
				} else {

					topo = pilha.desempilha();

					if (ABRE.indexOf(topo) != FECHA.indexOf(simbolo)) {
						return false;
					}
				}
			}

			index++;
		}
		return true;
	}
}
