package estruturadados.vetor.test;

import java.util.ArrayList;

public class TestandoJavaArrayList {

	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<String>();
		

		System.out.println("------------------------------------------------------");
		System.out.println("Adicionando Elemento");
		arrayList.add("A");
		arrayList.add("C");
		System.out.println(arrayList);
		
		System.out.println("------------------------------------------------------");
		System.out.println("Adicionando Elemento");
		arrayList.add(1, "B");
		System.out.println(arrayList);
		
		System.out.println("------------------------------------------------------");
		System.out.println("Elemento contains");
		boolean existe = arrayList.contains("A");
		if (existe) {
			System.out.println("Elemento existe no array");
		} else {
			System.out.println("Elemento não existe no array");
		}
		System.out.println("------------------------------------------------------");
		System.out.println("Elemento indexOf");
		int pos = arrayList.indexOf("B");
		if (pos > -1) {
			System.out.println("Elemento existe no array na pos " + pos);
		} else {
			System.out.println("Elemento não existe no array " + pos);
		}
		
		System.out.println("------------------------------------------------------");
		System.out.println("Pegando o elemnto pelo seu index");
		System.out.println(arrayList.get(2));

		System.out.println("------------------------------------------------------");
		System.out.println("Remove Elemento");
		arrayList.remove(0);
		arrayList.remove("B");

		System.out.println(arrayList);

		System.out.println("------------------------------------------------------");
		System.out.println("Tamanho do arrayList");
		System.out.println(arrayList.size());
		
		System.out.println("------------------------------------------------------");
		System.out.println("ultimo indice do vetor");
		System.out.println(arrayList.lastIndexOf("C"));

	}

}
