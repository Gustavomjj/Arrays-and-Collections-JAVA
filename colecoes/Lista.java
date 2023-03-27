package colecoes;

import java.util.ArrayList;

public class Lista {

	public static void main(String[] args) {
		
		ArrayList<Usuario> lista = new ArrayList<>();
		
//		Usuario u1 = new Usuario("Ana");
//		
//		lista.add(u1);
		lista.add(new Usuario ("Carlos"));
		lista.add(new Usuario ("Lua"));
		lista.add(new Usuario ("Jose"));
		lista.add(new Usuario ("Bea"));
		lista.add(new Usuario ("Bea"));
		
		System.out.println(lista.get(3));		// Aqui consegue acessar pelo indice. 
		
		 lista.remove(1);						// Remove o usuario conforme o index
		 lista.remove(new Usuario ("Lua"));		// Aqui remove o objeto; É usado boolean. 
		
		System.out.println(">>>" + lista.contains(new Usuario ("Jose"))); 	// Aqui é boolean também
		 
		for (Usuario u: lista) {
			System.out.println(u.nome);
		}
		

	}
}
