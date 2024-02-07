package entities;

public abstract class Conta implements InterfaceConta {
//	Atributos da classe
	protected int agencia;
	protected int numero;
	protected double saldo;
	private String nomeTitular;
	
	
	public Conta(String nome) {
		this.nomeTitular = nome;
	}
	
//	Get e set
	public int getAgencia() {
		return agencia;
	}
	public int getNumero() {
		return numero;
	}
	public double getSaldo() {
		return saldo;
	}
	
	
//	Metodos da interface
	
	@Override
	public void sacar (double valor) {
		if( this.saldo < valor) {
			System.out.println("Saldo insuficiente para realizar o saque !");
		}else {
			this.saldo -= valor;
		}
	}
	
	@Override
	public void transferir(double valor, Conta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
	}
	
	@Override
	public void depositar(double valor) {
		this.saldo += valor;
	}
	
	protected void imprimirInformacoes() {
		System.out.printf("Nome: %s\n", this.nomeTitular);
		System.out.printf("Angência: %d\n", this.agencia);
		System.out.printf("Conta: %d\n", this.numero);
		System.out.printf("Saldo: %.2f\n", this.saldo);
	}
}
