package application;

import entities.ListaDuplamenteEncadeada;

public class Program {

	public static void main(String[] args) {
		
		ListaDuplamenteEncadeada<String> minhaLista = new ListaDuplamenteEncadeada<>();
		minhaLista.add("c1");
		minhaLista.add("c2");
		minhaLista.add("c3");
		minhaLista.add("c4");
		minhaLista.add("c5");
		minhaLista.add("c6");
		minhaLista.add("c7");
		minhaLista.add("c8");
		minhaLista.add("c9");
		
		System.out.println(minhaLista);
		
		minhaLista.remove(3);
		
		minhaLista.add(3, "novo");
		
		System.out.println(minhaLista);
		
	}

}
