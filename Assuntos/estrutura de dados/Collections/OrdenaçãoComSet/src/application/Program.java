package application;

import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import entities.LinguagemFavorita;

public class Program {
	public static void main(String[] args) {
		Set<LinguagemFavorita> linguagens = new LinkedHashSet<>();
        linguagens.add(new LinguagemFavorita("Java", 1995, "Eclipse"));
        linguagens.add(new LinguagemFavorita("Python", 1991, "PyCharm"));
        linguagens.add(new LinguagemFavorita("JavaScript", 1995, "Visual Studio Code"));
        
        //EXIBIR POR ORDEM DE INSERÇÃO
        System.out.println("---Ordem de inserção---");
        System.out.println("----------------------------------------------------------------------");
        for(LinguagemFavorita lin: linguagens) {
        	System.out.println(lin);
        }
        System.out.println("============================================================\n");
        
        //ORDENAR POR NATURAL POR NOME 
        System.out.println("---Ordem natural por nome");
        System.out.println("----------------------------------------------------------------------");
        Set<LinguagemFavorita> linguagens2 = new TreeSet<>(linguagens);
        for(LinguagemFavorita lin: linguagens2) {
        	System.out.println(lin);
        }
        System.out.println("============================================================\n");
        
        //ORDENAR POR IDE
        System.out.println("Ordenar por IDE");
        System.out.println("----------------------------------------------------------------------");
        Set<LinguagemFavorita> linguagens3 = new TreeSet<>(Comparator.comparing(LinguagemFavorita::getIde));
        linguagens3.addAll(linguagens);
        for(LinguagemFavorita lin: linguagens3) {
        	System.out.println(lin);
        }
        System.out.println("============================================================\n");
        
        //ORDENAR POR ANO
        System.out.println("---Ordenar por ano");
        System.out.println("----------------------------------------------------------------------");
        Set<LinguagemFavorita> linguagens4 = new TreeSet<>(Comparator.comparing(LinguagemFavorita::getAnoCriacao).thenComparing(LinguagemFavorita::getNome));
        linguagens4.addAll(linguagens);
        for(LinguagemFavorita lin: linguagens4) {
        	System.out.println(lin);
        }
        System.out.println("============================================================\n");
	}
}
