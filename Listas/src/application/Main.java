package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//aqui e a importação da lista, a lista n aceita tipos primitivos(int,double...)
		//vai ter que usar whiperclass(Integer, Double...)
		//o Arraylist e uma classe diferente para se utilizar com list
		List<String> list = new ArrayList<>();
		
		//assim que se adiciona elementos a lista
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		list.add(2, "Marcos");
		
		//list size define o tamanho a quatidade de dados adicionado nesse ex são 5
		System.out.println(list.size());

		// aqui se utiliza um for each ai utilizamos a list que craimos e definimos um String List para se utilizar dentroo do for
		for(String List : list) {
			
			System.out.println(List);
			
		}
		System.out.println("--------------------------------");
		list.removeIf(List -> List.charAt(0) == 'M');
		for(String List : list) {
			
			System.out.println(List);
			
		}
		System.out.println("--------------------------------");
		System.out.println("Index of Bob: " + list.indexOf("Bob"));
		System.out.println("Index of Marco: " + list.indexOf("Marco"));
		System.out.println("--------------------------------");
		List<String> result = list.stream().filter(List -> List.charAt(0) == 'A').collect(Collectors.toList());
		for(String List : result) {
			
			System.out.println(List);
			
		}
		System.out.println("--------------------------------");
		String name = list.stream().filter(List -> List.charAt(0) == 'B').findFirst().orElse(null);
		System.out.println(name);
	}

}
