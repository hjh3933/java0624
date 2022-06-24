package org.java.arrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx4 {
	public static void main(String[] args) {
		//1.4까지
		List<String> list = new ArrayList<String>();
		list.add("LKM");
		String str = (String) list.get(0);
		System.out.println(str);
		
		System.out.println("===========================");
		
		List<String> list2 = new ArrayList<String>(10);
		List<String> list3 = new ArrayList<String>();
		
		//1.5v부터(자동)
		list3.add("LKM");
		String str2 = list3.get(0);
		System.out.println(str2);
	}
}
