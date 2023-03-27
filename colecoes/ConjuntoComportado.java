package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {
	
	public static void main(String[] args) {
		
//		Set<String> lista = new HashSet<>();		// < -- Aqui ele não é organizado, não mantem a ordem de seção.
		SortedSet<String> lista = new TreeSet<>();		// < -- Aqui ele mantem em ordem alfabética.
		lista.add("Ana");
		lista.add("Gustavo");
		lista.add("Roberto");
		lista.add("Daniela");
		lista.add("Eduardo");
		lista.add("Joao");
		lista.add("Bruna");
		
		System.out.println(lista);
		
		for (String usuarios: lista) {
			System.out.println(usuarios);
		}
		Set<Integer> nums = new HashSet<>();		
		nums.add(5);
		nums.add(8);
		nums.add(9);
		nums.add(2);
		nums.add(1);
		nums.add(20);
		nums.add(165);
		
		System.out.println(nums);
		
		for (int numeros: nums) {
			System.out.println(numeros);
		}
	}	
}

