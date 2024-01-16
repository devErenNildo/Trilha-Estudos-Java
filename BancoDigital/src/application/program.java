package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import person.Cliente;
import person.Gerente;
import person.Pessoa;

public class program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		List<Gerente> gerentes = new ArrayList<>();
		gerentes.add(new Gerente("Diego", 22, "Santander"));
		gerentes.add(new Gerente("Marcos", 25, "Bradesco"));
		gerentes.add(new Gerente("Dariel", 30, "Banco Inter"));
		gerentes.add(new Gerente("Raynara", 19, "NuBank"));
		gerentes.add(new Gerente("Eren", 22, "Itau"));
		gerentes.add(new Gerente("Matheus", 32, "Banco Do Brasil"));
		gerentes.add(new Gerente("Erenildo", 25, "NuBank"));
		
		System.out.println("Qual o seu nome:");
		String nome = scan.nextLine();
		System.out.println("Agora informe sua idade");
		int idade = scan.nextInt();
		System.out.println("Informe o valor do seu patrimônio");
		double patrimonio = scan.nextDouble();
		System.out.println("Por ultimo, informe seu score");
		int score = scan.nextInt();
		
		Cliente cliente = new Cliente(nome, idade, patrimonio, score);
		
		System.out.println("Qual gerente você quer abrir sua conta: ");
		int cont = 1;
		for(Pessoa x: gerentes) {
			System.out.println(cont + ":" + x.getNome());
			++cont;
		}
		
		int gerenteEscolhido = scan.nextInt();
		
		gerentes.get(gerenteEscolhido - 1).cadastrarCliente(cliente);
				
		scan.close();
	}

}
