package org.java.map;

import java.util.HashMap;
import java.util.Map;

public class MapEx3 {
	public static void main(String[] args) {
		System.out.println("Map");
		Map<String, String> map = new HashMap<String, String>();
		map.put("1����", "����");
		map.put("2����", "����");
		map.put("3����", "����");
		map.put("4����", "����");
		map.put("5����", "����");
		
		System.out.println(map.get("1����"));
		System.out.println(map.keySet());
		System.out.println(map.size());
		System.out.println(map.isEmpty());
		
		map.clear();
		System.out.println("clear -> "+map);
		System.out.println(map.containsKey("1����"));
		System.out.println(map.remove("1����"));
		System.out.println(map.containsKey("1����"));
		System.out.println(map.containsValue("����"));
	}
}
