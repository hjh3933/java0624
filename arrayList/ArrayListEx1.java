package org.java.arrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListEx1 {
	public static void main(String[] args) {
		// 가변길이의 배열
//		ArrayList<Integer> AL1 = new ArrayList<Integer>();
		List<Integer> AL1 = new ArrayList<Integer>();	//다형성
		AL1.add(new Integer(10));
		AL1.add(20);
		AL1.add(30);
		AL1.add(40);
		AL1.add(50);

		System.out.println(AL1.size());

		Integer i0 = AL1.get(0);
		int i1 = AL1.get(1);
		AL1.get(2);
		AL1.get(3);
		AL1.get(4);

		System.out.println("==========================");
		for (int i = 0; i < AL1.size(); i++) {
			System.out.println(AL1.get(i));
		}
		System.out.println("==========================");
		for (Integer i : AL1) {
			System.out.println(i);
		}
		System.out.println("==========================");
		Iterator<Integer> iter = AL1.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
	}
}
