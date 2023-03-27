package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {

	public static void main(String[] args) {
		
	Deque<String> livros = new ArrayDeque<String>();

//	livros.add("O pequeno principe");		// Entra na lista conforme uma fila
//	livros.add("A revolta de atlas");
//	livros.push("Don quixote");				// Entra na lista conforme uma pilha
//	livros.push("A psicologia financeira");
//	livros.push("Furão");
//	livros.add("O hobbit");
//	
//	System.out.println(livros);
	
//	System.out.println(livros.element());
	
	livros.add("A revolta de atlas");
	livros.add("Antifrágil");
	livros.add("Sapiens");
	livros.add("Inteligencia emocional");
	livros.add("A psicologia financeira");
	
	
	livros.push("A revolta de atlas");
	livros.push("Antifrágil");
	livros.push("Sapiens");
	livros.push("Inteligencia emocional");
	livros.push("A psicologia financeira");
	
	System.out.println(livros.element());
	
	System.out.println(livros);
	
	System.out.println(livros.peek());
	System.out.println(livros.element());
	
	for (String livro : livros) {
		System.out.println(">" + livro);
	}
	
	System.out.println(livros.pop());
	System.out.println(livros.poll());
	System.out.println(livros.pop());
	System.out.println(livros.poll());
	
	System.out.println(livros);
	
	
	}
}
