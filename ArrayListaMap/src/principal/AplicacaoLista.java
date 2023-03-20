package principal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AplicacaoLista {

	public static void main(String[] args) {
		
//		//Trabalhando com Arrays
//		int tam = 5;
//		Integer[] numeros;
//		numeros = new Integer[tam];
//		for(int i=0; i< tam; i++) {
//			numeros[i] = i*5;
//		}
//		for(int i=0; i< tam; i++) {
//			System.out.println(numeros[i].doubleValue());
//		}
		
//		//Trabalhando com Listas
//		int tam = 5;
//		List<Integer> listaNumeros = new ArrayList<>();
//		for(int i=0; i< tam; i++) {
//			listaNumeros.add(i*5);
//		}
//		listaNumeros.remove(3);
//		for(int i=0; i< listaNumeros.size(); i++) {
//			System.out.println(listaNumeros.get(i));
//		}
		
		//Trabalhando com MAP
		Map<Integer, String> mapNomes = new HashMap<>();
		mapNomes.put(1, "Marcelo");
		mapNomes.put(2, "João");
		mapNomes.put(3, "Maria");
		mapNomes.put(4, "José");
		mapNomes.put(5, "Jaqueline");
		
		System.out.println(mapNomes.get(3));
		
		
	}
}
