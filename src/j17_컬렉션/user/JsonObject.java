package j17_컬렉션.user;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import lombok.Data;
import lombok.Getter;
@Data
@Getter
public class JsonObject {

	public static void main(String[] args) {
		Map<String, Object>map = new HashMap <String,Object>();
		List<Map<String,Object>>list = new ArrayList<Map<String,Object>>();
		
		Map<String, Object>tomap1 = new HashMap<String,Object>();
		tomap1.put("name","bulbasaur");
		tomap1.put("url","https://pokeapi.co/api/v2/pokemon/1/");
		

		Map<String, Object>tomap2 = new HashMap<String,Object>();
		tomap2.put("name","ivysaur");
		tomap2.put("url","https://pokeapi.co/api/v2/pokemon/1/");
		
		Map<String, Object>tomap3 = new HashMap<String,Object>();
		tomap3.put("name","venusaur");
		tomap3.put("url","https://pokeapi.co/api/v2/pokemon/1/");
		
		list.add(tomap1);
		list.add(tomap2);
		list.add(tomap3);
		
		map.put("count", 1118);
		map.put("next", "http://pokeapi.co/api/v2/pokemon/?offset=3&limit=3");
		map.put("previous", null);
		map.put("results", list);
		
		System.out.println(map);
		
		
		
	}

}










