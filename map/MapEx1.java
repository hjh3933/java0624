package org.java.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MapEx1 {
	public static void main(String[] args) {
		HashMap<String, String> mem = new HashMap<String, String>();
		mem.put("가수1", "이모모");
		mem.put("가수2", "김모모");
		mem.put("가수3", "박모모");
		mem.put("가수4", "최모모");
		
		System.out.println(mem.get("가수1"));
		
		//KeySet() -> Key를 Set
		//key값은 중복이 불가능
		Set<String> set = mem.keySet(); //키값을 저장
		
		Iterator<String> iter = set.iterator();
		while(iter.hasNext()) {
			String key = iter.next();
			String val = mem.get(key);	//key를 이용해서 value를 get
			
			System.out.println("키: "+key+", 값: "+val);
		}
	}
}
