package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		
		Queue <String> fila = new LinkedList<>();
		
		fila.add("João");
		fila.add("Silvia");
		fila.add("Livia");
		fila.offer("Larissa");
		fila.offer("Hank");
		
		System.out.println(fila);
		
		

		
	}
}
