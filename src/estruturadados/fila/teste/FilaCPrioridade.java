package estruturadados.fila.teste;

import estruturadados.fila.FilaComPrioridade;

public class FilaCPrioridade {
	
	public static void main(String[] args) {
		FilaComPrioridade<Integer> fila = new FilaComPrioridade<>();
		
		fila.enfileira(1);
		fila.enfileira(3);
		fila.enfileira(2);
		
		System.out.println(fila);
	}

}
