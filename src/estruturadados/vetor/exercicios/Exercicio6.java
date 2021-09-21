package estruturadados.vetor.exercicios;

import java.util.Scanner;

import estruturadados.vetor.Lista;
import estruturadados.vetor.test.Contato;

public class Exercicio6 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Lista<Contato> listaContatos = new Lista<>(20);

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

	public static void adicionaContato(Scanner scan, Lista<Contato> lista) {
		System.out.println("Preencha as informações do contato: ");
		System.out.println("Nome: ");
		String nome = scan.nextLine();

		System.out.println("Numero: ");
		String numero = scan.nextLine();

		System.out.println("Email: ");
		String email = scan.nextLine();

		Contato contato = new Contato(nome, numero, email);

		lista.adiciona(contato);
		System.out.println("Contato cadastrado com sucesso!");

		main(null);

	}

	public static void adicionaContatoEspecifico(Scanner scan, Lista<Contato> lista) {
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
			lista.adiciona(pos, contato);

			System.out.println("Contato adicionado com sucesso!");
			System.out.println(contato);

		} catch (Exception e) {
			System.out.println("Posição inválida, contato não adicionado");
		}
	}

	public static int lerInformacaoInt(String mensagem, Scanner scan) {
		boolean verifica = false;
		int numero = 0;

		while (!verifica) {

			try {

				System.out.println(mensagem);
				String entrada = scan.nextLine();

				numero = Integer.parseInt(entrada);

				verifica = true;

			} catch (Exception ex) {
				System.out.println("Entrada invalida, tente novamente!");
				ex.printStackTrace();
			}

		}

		return numero;
	}

	public static String passarMensagem(String mensagem, Scanner scan) {
		System.out.println(mensagem);
		String entrada = scan.nextLine();

		return entrada;
	}

	public static void obterContatoPosicao(Scanner scan, Lista<Contato> lista) {
		int posicao = lerInformacaoInt("Informe a posição que deseja obter o contato: ", scan);
		try {

			Contato contato = lista.busca(posicao);

			System.out.println("Busca efetuada com sucesso!");
			System.out.println(contato);

		} catch (Exception ex) {
			System.out.println("Contato não encontrado, busca cancelada!");
		}
	}

	public static void obterContato(Scanner scan, Lista<Contato> lista) {
		int posicao = lerInformacaoInt("Informe a posição que deseja obter o contato: ", scan);
		try {

			Contato contato = lista.busca(posicao);

			System.out.println("Busca efetuada com sucesso!");
			System.out.println(contato);

			System.out.println("Efetuando a pesquisa pelo contato encontrado!");
			posicao = lista.busca(contato);

			System.out.println("Contato encontrado na posição: " + posicao);

		} catch (Exception ex) {
			System.out.println("Contato não encontrado, busca cancelada!");
		}
	}

	public static void pesquisarUltimoIndice(Scanner scan, Lista<Contato> lista) {
		int pos = lerInformacaoInt("Entre com a posição a ser pesquisada", scan);

		try {

			Contato contato = lista.busca(pos);

			System.out.println("Contato existe, seguem dados:");
			System.out.println(contato);

			System.out.println("Fazendo pesquisa do último índice do contato encontrado:");
			pos = lista.ultimoIndice(contato);

			System.out.println("Contato encontrado na posição " + pos);

		} catch (Exception e) {
			System.out.println("Posição inválida!");
		}

	}

	private static void verificarContatoExiste(Scanner scan, Lista<Contato> lista) {
		int pos = lerInformacaoInt("Entre com a posição a ser pesquisada", scan);

		try {
			Contato contato = lista.busca(pos);

			boolean existe = lista.contem(contato);

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

	protected static int obterOpcaoMenu(Scanner scan) {

		boolean entradaValida = false;
		int opcao = 0;
		String entrada;

		while (!entradaValida) {

			System.out.println("Digite a opção desejada:");
			System.out.println("1: Adiciona contato no final do vetor");
			System.out.println("2: Adiciona contato em uma posição específica");
			System.out.println("3: Obtém contato de uma posição específica");
			System.out.println("4: Consulta contato");
			System.out.println("5: Consulta último índide do contato");
			System.out.println("6: Verifica se contato existe");
			System.out.println("7: Excluir por posição");
			System.out.println("8: Excluir contato");
			System.out.println("9: Verifica tamanho do vetor");
			System.out.println("10: Excluir todos os contatos do vetor");
			System.out.println("11: Imprime vetor");
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

	public static void excluirPosicao(Scanner scan, Lista<Contato> lista) {
		int posicao = lerInformacaoInt("Entre com a do contato a ser pesquisada", scan);

		try {
			Contato contato = lista.busca(posicao);

			boolean existe = lista.contem(contato);

			if (existe) {
				System.out.println("Contato existe segue os dados: ");
				System.out.println(contato);
				System.out.println("------------------------------------------------------------");

				System.out.println("Deseja excluir o contato S-sim | N - não");
				String op = scan.next().toLowerCase();
				if (op.equals("s")) {
					lista.removerElemento(posicao);
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

	public static void excluirContato(Scanner scan, Lista<Contato> lista) {
		int pos = lerInformacaoInt("Entre com a posição a ser removida", scan);

		try {

			Contato contato = lista.busca(pos);

			lista.removerElemento(contato);

			System.out.println("Contato excluído");

		} catch (Exception e) {
			System.out.println("Posição inválida!");
		}
	}

	@SuppressWarnings("unused")
	private static void imprimeTamanhoVetor(Lista<Contato> lista) {
		System.out.println("Tamanho do vetor é de: " + lista.getTamanho());
	}

	@SuppressWarnings("unused")
	private static void limparVetor(Lista<Contato> lista) {
		lista.limpar();

		System.out.println("Todos os contatos do vetor foram excluídos");
	}

	@SuppressWarnings("unused")
	private static void imprimirVetor(Lista<Contato> lista) {
		System.out.println(lista);
	}

	public static void criarContatosDinamicamente(Integer quantidade, Lista<Contato> lista) {

		Contato contato;

		for (int i = 1; i <= quantidade; i++) {

			contato = new Contato();
			contato.setNome("Contato " + i);
			contato.setTelefone("1111111" + i);
			contato.setEmail("contato" + i + "@email.com");

			lista.adiciona(contato);
		}
	}

}
