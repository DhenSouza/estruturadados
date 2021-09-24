package estruturadados.fila.teste;

import java.util.LinkedList;
import java.util.Queue;

public class TestandoApiQueue {

	public static void main(String[] args) {
		
		Queue<Integer> fila = new LinkedList<>();
		
		// Enfileirar
		fila.add(1);
		fila.add(2);
		fila.add(3);
		fila.add(4);
		
		System.out.println(fila);
		
		// Espiar o primeiro da fila
		System.out.println(fila.peek());
		
		// Desenfileirar primeira Posicao
		System.out.println(fila.remove());
		
		System.out.println(fila);
		
		

	}

}
