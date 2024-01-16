package entities;

import java.util.Random;

public class ContaCorrente extends Conta {
	private static int AGENCIA = 2971;
	Random numeroConta = new Random();
	
	public ContaCorrente(String nome) {
		super(nome);
		super.agencia = AGENCIA;
		super.numero = numeroConta.nextInt(1000);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("----------------Extrato conta Corrente----------------");
		super.imprimirInformacoes();
	}

}
