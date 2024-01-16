package entities;

import java.util.Random;

public class ContaPolpanca extends Conta {
	private static int AGENCIA = 7129;
	Random numeroConta = new Random();
	
	public ContaPolpanca(String nome) {
		super(nome);
		super.agencia = AGENCIA;
		super.numero = numeroConta.nextInt(1000) + 1000;
	}
	
	@Override
	public void imprimirExtrato() {
		System.out.println("----------------Extrato conta Poupança----------------");
		super.imprimirInformacoes();
	}

}
