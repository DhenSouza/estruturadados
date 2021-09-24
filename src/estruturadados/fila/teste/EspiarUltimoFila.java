package estruturadados.fila.teste;

import estruturadados.fila.Fila;

public class EspiarUltimoFila {

	public static void main(String[] args) {
		Fila<Integer> fila = new Fila<>();

		fila.enfileira(1);
		fila.enfileira(3);
		fila.enfileira(4);
		fila.enfileira(5);

		System.out.println(fila);
		
		System.out.println("Ultimo da fila: " + fila.espiar());

	}

}
