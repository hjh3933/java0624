package org.java.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class MapEx4 {
	public static void main(String[] args) {
		// 영어와 한글입력, 영어로 한글검색
		// Scanner이용

		HashMap<String, String> map = new HashMap<String, String>();
		map.put("apple", "사과");
		map.put("banana", "바나나");
		map.put("java", "자바");
		map.put("web", "웹");
		map.put("test", "시험");

		Set<String> set = map.keySet();
		Iterator<String> iter = set.iterator();
		//Iterator<String> iter2 = map.keySet().iterator();
		while (iter.hasNext()) {
			String key = iter.next();
			System.out.println("키: " + key + ",값: " + map.get(key));
		}
		System.out.println();
		Scanner scn = new Scanner(System.in);
		while (true) {
			System.out.println("단어검색");
			String eng = scn.next();
			String kor = map.get(eng);
			
			if (eng.equals("exit")) {
				System.out.println("종료");
				break;
			} else {
				if (kor == null) {
					System.out.println("단어가 없습니다");
				} else {
					System.out.println(kor);
				}
			}
		}

		scn.close();
	}
}
