package aplicacao;

import dominio.Pessoa;

public class Programa {
	public static void main(String[] args) {
		Pessoa p1 = new Pessoa(1, "carlos", "carlos@");
		Pessoa p2 = new Pessoa(2, "maria", "maria@");
		Pessoa p3 = new Pessoa(3, "joao", "joao@");
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
	}
}
