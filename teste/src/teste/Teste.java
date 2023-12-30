package teste;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Teste {
	
	private static Map<String, List<String>> mapa = new HashMap<>();
	
	public static void main(String[] args) {
		List<String> classico_lista = new ArrayList<>();
		classico_lista.add("morango");
		classico_lista.add("banana");
		classico_lista.add("abacaxi");
		classico_lista.add("manga");
		classico_lista.add("pessego");
		classico_lista.add("mel");
		classico_lista.add("gel");
		classico_lista.add("iogurte");
	
		mapa.put("Clássico", classico_lista);
		
		List<String> forest_berry_lista = new ArrayList<>();
		forest_berry_lista.add("morango");
		forest_berry_lista.add("framboesa");
		forest_berry_lista.add("mirtilo");
		forest_berry_lista.add("mel");
		forest_berry_lista.add("gelo");
		forest_berry_lista.add("iogurte");
	
		
		mapa.put("Forest Berry", forest_berry_lista);
		
		List<String> freezie_lista = new ArrayList<>();
		freezie_lista.add("amora");
		freezie_lista.add("mirtilo");
		freezie_lista.add("groselha preta");
		freezie_lista.add("suco de uva");
		freezie_lista.add("iogurte congelado");
		
		mapa.put("Freezie", freezie_lista);
		
		List<String> greenie_lista = new ArrayList<>();
		greenie_lista.add("amora");
		greenie_lista.add("mirtilo");
		greenie_lista.add("groselha preta");
		greenie_lista.add("suco de uva");
		greenie_lista.add("iogurte congelado");
	
		mapa.put("Greenie", greenie_lista);
		
		List<String> vegan_deelite_lista = new ArrayList<>();
		vegan_deelite_lista.add("morango");
		vegan_deelite_lista.add("maracujá");
		vegan_deelite_lista.add("abacaxi");
		vegan_deelite_lista.add("manga");
		vegan_deelite_lista.add("pêssego");
		vegan_deelite_lista.add("gelo");
		vegan_deelite_lista.add("leite de soja");
		
		mapa.put("Vegan Delite", vegan_deelite_lista);
		
		List<String> apenas_sobremesas_lista = new ArrayList<>();
		apenas_sobremesas_lista.add("banana");
		apenas_sobremesas_lista.add("sorvete");
		apenas_sobremesas_lista.add("chocolate");
		apenas_sobremesas_lista.add("amendoim");
		apenas_sobremesas_lista.add("cereja");
		
		mapa.put("Apenas Sobremesas", apenas_sobremesas_lista);
		
		List<String> emagrecdor_lista = new ArrayList<>();
		emagrecdor_lista.add("leite desnatado");
		emagrecdor_lista.add("cacau em pó");
		emagrecdor_lista.add("farelo de linhaça");
		emagrecdor_lista.add("farelo de gergelim");
		emagrecdor_lista.add("aveia");
		
		mapa.put("Emagrecedor", emagrecdor_lista);
		
		atualizar("Clássico,+ chocolate,- morango", mapa.get("Clássico"));
		
		System.out.println(mapa.get("Clássico"));
		
	}
	
	public static void atualizar(String valor, List<String> lista)  {
		String[] valores = valor.split(",");
		
		int i = 0;
		String chave = valores[0];
		
		for(String valor_split : valores) {
			System.out.println(valor_split);
			if(i == 0) {
				i++;
				continue;
			}
			String ingrediente = valor_split;
			String ingrediente_valor = ingrediente.substring(2, ingrediente.length());
			
			if(ingrediente.contains("+")) {
				if(!lista.contains(ingrediente_valor)) {
					lista.add(ingrediente_valor);	
					mapa.put(chave, lista);
				}
			}
			
			if(ingrediente.contains("-")) {
				if(lista.contains(ingrediente_valor)) {
					lista.remove(ingrediente_valor);	
					mapa.put(chave, lista);
				}
			}
					
		}

	}
	
	

}
