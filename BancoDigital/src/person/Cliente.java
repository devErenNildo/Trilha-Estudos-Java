package person;

import entities.Conta;

public class Cliente extends Pessoa {
//	Atributos do cliente
	private double patrimonio;
	private int score;
	private Conta contaUsuario;
	
//	Construtor da classe
	public Cliente (String nome, int idade, double patrimonio, int score) {
		super(nome, idade);
		this.patrimonio = patrimonio;
		this.score = score;
	}

//	Get e set da classe
	public double getPatrimonio() {
		return patrimonio;
	}

	protected void setPatrimonio(double patrimonio) {
		this.patrimonio = patrimonio;
	}

	public int getScore() {
		return score;
	}

	protected void setScore(int score) {
		this.score = score;
	}
	
	protected void setConta(Conta conta) {
		contaUsuario = conta;
	}
	
	public Conta getConta() {
		return contaUsuario;
	}
	
	
	
}
