package estruturadados.vetor.exercicios;

import java.util.Scanner;

import estruturadados.vetor.Lista;
import estruturadados.vetor.test.Contato;

public class Exercicio6 {
	
	

	public static void main(String[] args) {
		
		 Scanner scan = new Scanner(System.in);

		Lista<Contato> listaContatos = new Lista<>(20);

		//criarContatosDinamicamente(30, listaContatos);
		
		int menu = obterOpcaoMenu(scan);

	}
	
	
	protected static int obterOpcaoMenu(Scanner scan){

		boolean entradaValida = false;
		int opcao = 0;
		String entrada;

		while (!entradaValida){

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

				if (opcao >= 0 && opcao <= 11){
					entradaValida = true;
				} else {
					throw new Exception();
				}

			} catch (Exception e){

				System.out.println("Entrada inválida, digite novamente\n\n");
			}
		}

		return opcao;
	}

	

	public static void criarContatosDinamicamente(Integer quantidade, Lista<Contato> listaContatos) {

		Contato contato1 = new Contato();

		for (int i = 1; i <= quantidade; i++) {
			contato1.setNome("Contato " + 1);
			contato1.setTelefone("11111" + i);
			contato1.setEmail("contato" + i + "@email.com");

			listaContatos.adiciona(contato1);
		}
	}

}
