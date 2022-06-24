package org.java.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapEx2 {
	public static void main(String[] args) {
		System.out.println("1. "+"Map");
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "소고기");
		map.put(2, "돼지고기");
		map.put(3, "막회");
		map.put(4, "곱창");
		map.put(5, "김치");
		
		System.out.println("2. "+map);
		System.out.println("3. "+map.keySet());
		System.out.println("4. "+map.values());
		Set<Integer> set = map.keySet();
		Iterator<Integer> iterator = set.iterator();
		while(iterator.hasNext()) {
			Integer key = iterator.next();
			String val = map.get(key);
			System.out.println("5. 키: "+key+", 값 : "+val);
		}
		for (Integer key:map.keySet()) {
			System.out.println("6. 키: "+key);
			System.out.println("7. 값: "+map.get(key));
		}
	}
}
