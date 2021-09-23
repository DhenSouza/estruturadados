package estruturadados.pilha.test;

import java.util.Stack;

import estruturadados.pilha.Pilha;

public class StackTest {

	public static void main(String[] args) {
		Pilha<String> pilha = new Pilha<>();

		Stack<String> stack = new Stack<>();

		// estaVazio()
		System.out.println("Equivalente ao m�todo estaVazio()");
		System.out.println(stack.isEmpty());
		System.out.println();

		System.out.println("Equivalente ao m�todo empilha()");
		stack.push("1");
		stack.push("2");
		stack.push("3");
		stack.push("4");
		stack.push("5");

		System.out.println();

		System.out.println("Equivalente ao m�todo estaVazio()");
		System.out.println(stack.isEmpty());

		// tamanho()
		System.out.println("Equivalente ao m�todo tamanho()");
		System.out.println(stack.size());

		// toString()
		System.out.println("Equivalente ao m�todo toString()");
		System.out.println(stack);

		// topo()
		System.out.println("Equivalente ao m�todo topo()");
		System.out.println(stack.peek());

		// desempilha()
		System.out.println("Equivalente ao m�todo desempilha()");
		System.out.println(stack.pop());

		System.out.println(stack);

	}

}
