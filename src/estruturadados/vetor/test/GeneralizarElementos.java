package estruturadados.vetor.test;

import estruturadados.vetor.VetorObjeto;

public class GeneralizarElementos {

	public static void main(String[] args) {
		
		VetorObjeto obj = new VetorObjeto(3);
		
		Contato contato1 = new Contato("Denilson", "(11) 99999-9999", "deni@gmail.com");
		Contato contato2 = new Contato("Daiane", "(11) 22222-9999", "daia@gmail.com");
		Contato contato3 = new Contato("Patricia", "(11) 55555-9999", "paty@gmail.com");
		
		Contato contato4 = new Contato("Patricia", "(11) 55555-9999", "paty@gmail.com");
		
		
		obj.adiciona(contato1);
		obj.adiciona(contato2);
		obj.adiciona(contato3);
		
		System.out.println(obj);
		
		
		Integer posicao = obj.busca(contato4);
		
		System.out.println((posicao > -1) ? "Elemento Existe no vetor!" : "Elemento NÃO existe no vetor!");
		
		

	}

}
