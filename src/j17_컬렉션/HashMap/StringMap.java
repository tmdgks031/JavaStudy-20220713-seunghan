package j17_컬렉션.HashMap;

import java.util.HashMap;
import java.util.Iterator;

public class StringMap {

	public static void main(String[] args) {
		HashMap<Integer, String> strMap = new HashMap<Integer, String>();
		
		HashMap<String, String> strMap2 = new HashMap<String, String>();

		
		strMap.put(10, "java1"); //HashMap은 add가 아닌 put을 쓴다.
		strMap.put(20, "java2");
		strMap.put(30, "java3");
		strMap.put(40, "java4");
		
		System.out.println(strMap); //앞에 값이 같으면 중복이 안된다.
		
		strMap2.put("a", "python");
		strMap2.put("b", "python");
		strMap2.put("c", "python");
		strMap2.put("d", "python");
		
		System.out.println(strMap2); //뒤에 값이 같으면 중복이 된다.
		
		strMap.get(strMap2);
		
		strMap.get(10);
		
		Iterator<Integer> irKey = strMap.keySet().iterator();
		while(irKey.hasNext()) {
			System.out.println(strMap.get(irKey.next()));
		}
	}

}
