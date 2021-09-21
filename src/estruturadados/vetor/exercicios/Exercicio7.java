package estruturadados.vetor.exercicios;

import java.util.ArrayList;
import java.util.Scanner;

import estruturadados.vetor.test.Contato;

public class Exercicio7 extends Exercicio6{

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		ArrayList<Contato> listaContatos = new ArrayList<>(20);

		criarContatosDinamicamente(5, listaContatos);

		int menu = obterOpcaoMenu(scan);

		switch (menu) {
		case 1:
			adicionaContato(scan, listaContatos);
			break;
		case 2:
			adicionaContatoEspecifico(scan, listaContatos);
			break;
		case 3:
			obterContatoPosicao(scan, listaContatos);
			break;
		case 4:
			obterContato(scan, listaContatos);
			break;
		case 5:

			pesquisarUltimoIndice(scan, listaContatos);
			break;
		case 6:
			verificarContatoExiste(scan, listaContatos);
			break;
		case 7:
			excluirPosicao(scan, listaContatos);
			break;
		case 8:
			excluirContato(scan, listaContatos);
			break;
		case 9:
			imprimeTamanhoVetor(listaContatos);
			break;
		case 10:
			limparVetor(listaContatos);
			break;
		case 11:
			imprimirVetor(listaContatos);
			break;

		default:
			break;
		}

	}

	public static void adicionaContato(Scanner scan, ArrayList<Contato> lista) {
		System.out.println("Preencha as informações do contato: ");
		System.out.println("Nome: ");
		String nome = scan.nextLine();

		System.out.println("Numero: ");
		String numero = scan.nextLine();

		System.out.println("Email: ");
		String email = scan.nextLine();

		Contato contato = new Contato(nome, numero, email);

		lista.add(contato);
		System.out.println("Contato cadastrado com sucesso!");

		main(null);

	}

	public static void adicionaContatoEspecifico(Scanner scan, ArrayList<Contato> lista) {
		System.out.println("Preencha as informações do contato: ");
		System.out.println("Nome: ");
		String nome = scan.nextLine();

		System.out.println("Numero: ");
		String numero = scan.nextLine();

		System.out.println("Email: ");
		String email = scan.nextLine();

		Contato contato = new Contato(nome, numero, email);

		int pos = lerInformacaoInt("Entre com a posição a adicionar o contato", scan);

		try {
			lista.add(pos, contato);

			System.out.println("Contato adicionado com sucesso!");
			System.out.println(contato);

		} catch (Exception e) {
			System.out.println("Posição inválida, contato não adicionado");
		}
	}

	public static void obterContatoPosicao(Scanner scan, ArrayList<Contato> lista) {
		int posicao = lerInformacaoInt("Informe a posição que deseja obter o contato: ", scan);
		try {

			Contato contato = lista.get(posicao);

			System.out.println("Busca efetuada com sucesso!");
			System.out.println(contato);

		} catch (Exception ex) {
			System.out.println("Contato não encontrado, busca cancelada!");
		}
	}

	public static void obterContato(Scanner scan, ArrayList<Contato> lista) {
		int posicao = lerInformacaoInt("Informe a posição que deseja obter o contato: ", scan);
		try {

			Contato contato = lista.get(posicao);

			System.out.println("Busca efetuada com sucesso!");
			System.out.println(contato);

			System.out.println("Efetuando a pesquisa pelo contato encontrado!");
			posicao = lista.indexOf(contato);

			System.out.println("Contato encontrado na posição: " + posicao);

		} catch (Exception ex) {
			System.out.println("Contato não encontrado, busca cancelada!");
		}
	}

	public static void pesquisarUltimoIndice(Scanner scan, ArrayList<Contato> lista) {
		int pos = lerInformacaoInt("Entre com a posição a ser pesquisada", scan);

		try {

			Contato contato = lista.get(pos);

			System.out.println("Contato existe, seguem dados:");
			System.out.println(contato);

			System.out.println("Fazendo pesquisa do último índice do contato encontrado:");
			pos = lista.lastIndexOf(contato);

			System.out.println("Contato encontrado na posição " + pos);

		} catch (Exception e) {
			System.out.println("Posição inválida!");
		}

	}

	private static void verificarContatoExiste(Scanner scan, ArrayList<Contato> lista) {
		int pos = lerInformacaoInt("Entre com a posição a ser pesquisada", scan);

		try {
			Contato contato = lista.get(pos);

			boolean existe = lista.contains(contato);

			if (existe) {
				System.out.println("Contato existe segue os dados: ");
				System.out.println(contato);
			} else {
				System.out.println("Contato não existe");
			}

		} catch (Exception ex) {
			System.out.println("Posicao invalida");
		}

	}

	public static void excluirPosicao(Scanner scan, ArrayList<Contato> lista) {
		int posicao = lerInformacaoInt("Entre com a do contato a ser pesquisada", scan);

		try {
			Contato contato = lista.get(posicao);

			boolean existe = lista.contains(contato);

			if (existe) {
				System.out.println("Contato existe segue os dados: ");
				System.out.println(contato);
				System.out.println("------------------------------------------------------------");

				System.out.println("Deseja excluir o contato S-sim | N - não");
				String op = scan.next().toLowerCase();
				if (op.equals("s")) {
					lista.remove(posicao);
					System.out.println("Contato exluido com sucesso!");
					System.out.println(lista);
				} else if (op.equals("n")) {
					System.out.println("Ação Cancelada de exclusão");
				}

			} else {
				System.out.println("Contato não existe");
			}

		} catch (Exception ex) {
			System.out.println("Posicao invalida");
		}
	}

	public static void excluirContato(Scanner scan, ArrayList<Contato> lista) {
		int pos = lerInformacaoInt("Entre com a posição a ser removida", scan);

		try {

			Contato contato = lista.get(pos);

			lista.remove(contato);

			System.out.println("Contato excluído");

		} catch (Exception e) {
			System.out.println("Posição inválida!");
		}
	}

	@SuppressWarnings("unused")
	private static void imprimeTamanhoVetor(ArrayList<Contato> lista) {
		System.out.println("Tamanho do vetor é de: " + lista.size());
	}

	@SuppressWarnings("unused")
	private static void limparVetor(ArrayList<Contato> lista) {
		lista.clear();

		System.out.println("Todos os contatos do vetor foram excluídos");
	}

	@SuppressWarnings("unused")
	private static void imprimirVetor(ArrayList<Contato> lista) {
		System.out.println(lista);
	}

	private static void criarContatosDinamicamente(Integer quantidade, ArrayList<Contato> lista) {

		Contato contato;

		for (int i = 1; i <= quantidade; i++) {

			contato = new Contato();
			contato.setNome("Contato " + i);
			contato.setTelefone("1111111" + i);
			contato.setEmail("contato" + i + "@email.com");

			lista.add(contato);
		}
	}

}
