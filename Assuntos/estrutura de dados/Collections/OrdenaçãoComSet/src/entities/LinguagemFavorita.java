package entities;

import java.util.Objects;

public class LinguagemFavorita implements Comparable<LinguagemFavorita> {
	private String nome;
	private int anoCriacao;
	private String ide;
	
	
	public LinguagemFavorita(String nome, int anoCriacao, String ide) {
		this.nome = nome;
		this.anoCriacao = anoCriacao;
		this.ide = ide;
	}


	public String getNome() {
		return nome;
	}
	public int getAnoCriacao() {
		return anoCriacao;
	}
	public String getIde() {
		return ide;
	}


	


	@Override
	public String toString() {
		return "[nome=" + nome + ", anoCriacao=" + anoCriacao + ", ide=" + ide + "]\n";
	}


	@Override
	public int hashCode() {
		return Objects.hash(anoCriacao, ide, nome);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LinguagemFavorita other = (LinguagemFavorita) obj;
		return anoCriacao == other.anoCriacao && Objects.equals(ide, other.ide) && Objects.equals(nome, other.nome);
	}


	@Override
	public int compareTo(LinguagemFavorita o) {
		return this.nome.compareTo(o.getNome());
	}



	
	
	
	
	
	
	
	
}
