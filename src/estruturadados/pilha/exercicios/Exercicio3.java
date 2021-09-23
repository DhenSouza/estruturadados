package estruturadados.pilha.exercicios;

import estruturadados.pilha.Pilha;

public class Exercicio3 {
	
	public static void main(String[] args) {
		Pilha<Livro> pilha = new Pilha<>(20);
		Livro livro = new Livro();
		
		for(int i = 0; i < 6; i++) {
			livro.setNome("Contato " + i);
			livro.setIsbn("KKKKKKK" + i);
			livro.setAnoLancamento(i + "/09/2021");
			livro.setAutor("Autor numero: " + i);

			pilha.empilha(livro);
		}
	}

}
