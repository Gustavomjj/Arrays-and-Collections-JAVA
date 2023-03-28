package colecoes;

import java.util.HashSet;

public class Hash {
	public static void main(String[] args) {
		
		HashSet<Usuario> Usuarios = new HashSet<>();
		
		Usuarios.add(new Usuario("Guilherme"));
		Usuarios.add(new Usuario("Rafael"));
		Usuarios.add(new Usuario("Leandro"));
		
		System.out.println(Usuarios.contains(new Usuario("Guilherme")));
		System.out.println(Usuarios.contains(new Usuario("João")));
		System.out.println(Usuarios.contains(new Usuario("Leandro")));
		
	}

}
