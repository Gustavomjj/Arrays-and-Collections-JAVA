package colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {
	public static void main(String[] args) {
		
		Map<Integer, String> usuarios = new HashMap<>();
		
		usuarios.put(1,"Roberto");
		usuarios.put(2,"Rafaela");
		usuarios.put(4,"Ricardo");
		usuarios.put(9,"Rayane");
		
		System.out.println(usuarios.size());
		System.out.println(usuarios.isEmpty());
		
		System.out.println(usuarios.keySet());
		System.out.println(usuarios.values());
		System.out.println(usuarios.entrySet());
		
		System.out.println(usuarios.containsKey(2));
		System.out.println(usuarios.containsValue("Rayane"));
		
		System.out.println(usuarios.get(4));
		System.out.println(usuarios.remove(9));

		for (int chave: usuarios.keySet()) {
			System.out.println(chave);
		}
		
		for (String valor: usuarios.values()) {
			System.out.println(valor);
		}
		
		for (Entry <Integer,String> registro: usuarios.entrySet()) {
			System.out.println(registro.getKey() + " : " + registro.getValue());
		}
		
		
		
		
	}

}
