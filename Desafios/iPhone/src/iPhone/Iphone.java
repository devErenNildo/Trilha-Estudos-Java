package iPhone;

import aplicativos.AparelhoTelefonico;
import aplicativos.NavegadorInternet;
import aplicativos.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {

	@Override
	public void Tocar() {
		System.out.println("Tocar música");
		
	}

	@Override
	public void Pausar() {
		System.out.println("Pausar música");
		
	}

	@Override
	public void Selecionar() {
		System.out.println("Selecionar música");
		
	}

	@Override
	public void exibirPagina() {
		System.out.println("Exibir página web");
		
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("Adicionar nova aba no navegador");
		
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Atualizar página web");
		
	}

	@Override
	public void ligar() {
		System.out.println("Ligando para seu contato");		
	}

	@Override
	public void atender() {
		System.out.println("Atendendo ligaçao");
		
	}

	@Override
	public void iniciarCorreioVoz() {
		System.out.println("Gravando sua mensagem no correio de voz");
		
	}

}
