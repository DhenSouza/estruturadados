package estruturadados.vetor.test;

import estruturadados.vetor.Lista;

public class ConfigTipoVetorDinamico {
	
	public static void main(String[] args) {
		
		Lista<String> vetor = new Lista<String>(1);
		
		vetor.adiciona("ElementoOne");
		
		System.out.println(vetor.busca(0));
		
	}

}
