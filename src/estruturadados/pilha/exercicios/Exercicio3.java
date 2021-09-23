package estruturadados.pilha.exercicios;

import java.util.Scanner;

import estruturadados.pilha.Pilha;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Pilha<Livro> pilha = new Pilha<>(20);

		criarLivrosDinamicamente(5, pilha);

		Integer opcao = obterOpcaoMenu(scan);

		switch (opcao) {
		case 1:
			empilhar(scan, pilha);
			break;
		case 2:
			desempilhar(scan, pilha);
			break;
		case 3:
			ultimaPilhaTopo(scan, pilha);
			break;
		case 4:
			mostrarPilhaVaziaOuNao(scan, pilha);
			break;

		default:
			break;
		}
	}

	private static void ultimaPilhaTopo(Scanner scan, Pilha<Livro> pilha) {
		try {

			System.out.println(pilha.topo());

		} catch (Exception ex) {
			System.out.println("Não localizada o ultimo item");
		}

	}

	private static void empilhar(Scanner scan, Pilha<Livro> pilha) {
		System.out.println("Informe o nome do contato: ");
		String nome = scan.nextLine();

		System.out.println("Informe  ISBN do livro: ");
		String isbn = scan.nextLine();

		System.out.println("Informe a data de lancamento: ");
		String dataLancamento = scan.nextLine();

		System.out.println("Informe o nome do autor: ");
		String autor = scan.nextLine();

		Livro livro = new Livro(nome, isbn, dataLancamento, autor);

		pilha.empilha(livro);

		System.out.println("Empilhado com sucesso!");
		System.out.println(livro);

		main(null);

	}

	private static void mostrarPilhaVaziaOuNao(Scanner scan, Pilha<Livro> pilha) {
		try {

			if (pilha.estaVazia()) {
				System.out.println("A pilha esta vazia");
			}

			System.out.println("A pilha nao esta vazia");
			System.out.println(pilha);

		} catch (Exception e) {
			System.out.println("Erro ");
		}

	}

	private static void desempilhar(Scanner scan, Pilha<Livro> pilha) {
		try {

			System.out.println(pilha);

			System.out.println(pilha.desempilha());

			System.out.println(pilha);

		} catch (Exception ex) {
			System.out.println("Não foi possivel desempilhar");
		}

	}

	protected static int obterOpcaoMenu(Scanner scan) {

		boolean entradaValida = false;
		int opcao = 0;
		String entrada;

		while (!entradaValida) {

			System.out.println("Digite a opção desejada:");
			System.out.println("1: Empilhar");
			System.out.println("2: Desempilhar ");
			System.out.println("3: Mostrar ultima pilha no topo ");
			System.out.println("4: Mostrar se a pilha é vazia ou nao ");
			System.out.println("0: Sair");

			try {

				entrada = scan.nextLine();
				opcao = Integer.parseInt(entrada);

				if (opcao >= 0 && opcao <= 11) {
					entradaValida = true;
				} else {
					throw new Exception();
				}

			} catch (Exception e) {

				System.out.println("Entrada inválida, digite novamente\n\n");
			}
		}

		return opcao;
	}

	protected static void criarLivrosDinamicamente(Integer quantidade, Pilha<Livro> pilha) {

		Livro livro;

		for (int i = 1; i <= quantidade; i++) {
			livro = new Livro();
			livro.setNome("Denilson " + i);
			livro.setIsbn("45463" + i);
			livro.setAnoLancamento(i + "/09/2021");
			livro.setAutor("Autor numero: " + i);

			pilha.empilha(livro);
		}
	}

}
