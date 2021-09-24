package estruturadados.fila.teste;

import estruturadados.fila.Fila;

public class RemoverPrimeiraPosFila {
	
	public static void main(String[] args) {
		Fila<Integer> fila = new Fila<>();

		fila.enfileira(10);
		fila.enfileira(9);
		fila.enfileira(8);
		fila.enfileira(7);

		System.out.println(fila);
		
		System.out.println(fila.desenfileira());
		
		System.out.println(fila);
	}

}
