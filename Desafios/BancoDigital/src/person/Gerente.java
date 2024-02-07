package person;

import java.util.ArrayList;
import java.util.List;

import entities.ContaPolpanca;

public class Gerente extends Pessoa{

	private String bancoTrabalho;
	
	public Gerente(String nome, int idade, String bancoTrabalho) {
		super(nome, idade);
		this.bancoTrabalho = bancoTrabalho;
	}
	
	List<Cliente> clientesBanco = new ArrayList<>();
	
	public String getBancoTrabalho () {
		return bancoTrabalho;
	}
	
//	Função que colsulta a situação do cliente
	public void cadastrarCliente (Cliente cliente) {
		if(cliente.getPatrimonio() > 5000 && cliente.getScore() > 200) {
			System.out.println("Parabéns, agora você é um cliente do banco: " + bancoTrabalho);
			cliente.setConta(new ContaPolpanca(cliente.getNome()));
			
			clientesBanco.add(cliente);
		} else {
			System.out.println("Lamentamos, mas não podemos disponibilizar uma conta para você no momento !");
		}
	}
	
}
