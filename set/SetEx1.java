package org.java.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetEx1 {
	public static void main(String[] args) {
		System.out.println("Set");
		
		//인터페이스 = 구현객체(클래스)
		Set<String> set = new HashSet<String>();
		
		set.add("java");
		set.add("Spring");
		set.add("JSP");
		set.add("Servlet");
		set.add("WEB");
		
		int size = set.size();
		System.out.println("총 객체수: "+size);
		
		set.remove("java"); //지우기 명령
		size = set.size(); //다시 초기화 해야함
		System.out.println("총 객체수: "+size);
		System.out.println(set);// 순서 엉망 -> 직렬화 -> iterator
		
		Iterator<String> iter = set.iterator(); //직렬로 배치
		while(iter.hasNext()) {
			String it = iter.next();
			System.out.println(it);
		}
		
		set.clear();
		size = set.size();
		System.out.println("총 객체수: "+size);
		
		if (set.isEmpty()) {
			System.out.println("Set은 비어있다");
		} else {
			System.out.println("비어있지 않습니다");
		}
	}
}
