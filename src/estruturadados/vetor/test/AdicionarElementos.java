package estruturadados.vetor.test;

import estruturadados.vetor.Vetor;

public class AdicionarElementos {

	public static void main(String[] args) {
		Vetor vetor = new Vetor(2);
		
		try {
			vetor.adiciona("Elemento 1");
			vetor.adiciona("Elemento 2");
			vetor.adiciona("Elemento 3");
			vetor.adiciona("Elemento 4");
			vetor.adiciona("Elemento 5");
			
			System.out.println(vetor);
			
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
