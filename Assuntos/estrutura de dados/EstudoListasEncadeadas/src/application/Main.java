package application;

import entities.ListaEncadeada;

public class Main {

	public static void main(String[] args) {
		
		ListaEncadeada<String> minhaListaEncadeada = new ListaEncadeada<>();
		
		minhaListaEncadeada.add("teste 01");
		minhaListaEncadeada.add("teste 02");
		minhaListaEncadeada.add("teste 03");
		minhaListaEncadeada.add("teste 04");
		minhaListaEncadeada.add("teste 05");
		
		System.out.println(minhaListaEncadeada.get(0));
//		System.out.println("teste");
		
	}

}
