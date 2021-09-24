package estruturadados.fila.exercicios;

import estruturadados.fila.Fila;

public class Exercicio1 {

	public static void main(String[] args) {

		Fila<Documento> impressao = new Fila<>();

		impressao.enfileira(new Documento("A", 1));
		impressao.enfileira(new Documento("B", 2));
		impressao.enfileira(new Documento("C", 3));
		impressao.enfileira(new Documento("D", 7));
		impressao.enfileira(new Documento("E", 9));

		while (!impressao.estaVazia()) {
			Documento documento = impressao.desenfileira();

			System.out.println("Imprimindo documento: " + documento.getNumFolhas());
			try {
				Thread.sleep(200 * documento.getNumFolhas());
			} catch (InterruptedException ex) {
				ex.printStackTrace();
			}
		}

	}

}
