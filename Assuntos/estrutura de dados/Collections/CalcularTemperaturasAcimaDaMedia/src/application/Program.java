package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Temperatura;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Temperatura> temp = new ArrayList<>();
		
		for(int i = 0; i < 6; i++) {
			System.out.println("Digite a temperatura do mês: " + obterNomeMes(i));
			double temperaturaMes = sc.nextDouble() ;
			temp.add(new Temperatura(temperaturaMes, i));
		}
		
		System.out.println("Temperaturas acima da média semestral");
		double media = calcularMedia(temp);
		for(Temperatura tempMes: temp) {
			if(tempMes.getGraus() > media) {
				System.out.println("O mês " + obterNomeMes(tempMes.getMes()) + " teve a temperatura acima da media");
			}
		}
		
		
		sc.close();
	}
	
	private static double calcularMedia(List<Temperatura> temp) {
		double soma = 0;
		for(Temperatura tempMes: temp ) {
			soma += tempMes.getGraus();
		}
		return soma / temp.size();
	}
	
	private static String obterNomeMes(int mes) {
        switch (mes) {
        case 0:
            return "Janeiro";
        case 1:
            return "Fevereiro";
        case 2:
            return "Março";
        case 3:
            return "Abril";
        case 4:
            return "Maio";
        case 5:
            return "Junho";
        default:
            return "Mês inválido";
    }
	}
}
