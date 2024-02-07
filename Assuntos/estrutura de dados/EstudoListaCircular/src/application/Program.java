package application;

import entities.ListaCircular;

public class Program {
	public static void main(String[] args) {
		
		ListaCircular<String> minhaLista = new ListaCircular<>();
		
		minhaLista.add("c0");
		
		System.out.println(minhaLista);
		
		minhaLista.remove(0);
		
		System.out.println(minhaLista);
		
		minhaLista.add("c1");
		minhaLista.add("c2");
		minhaLista.add("c3");
		minhaLista.add("c4");
		
		System.out.println(minhaLista);
		
	}
}
