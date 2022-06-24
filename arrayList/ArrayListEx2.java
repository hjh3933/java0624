package org.java.arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEx2 {
	public static void main(String[] args) {
		//가장 길이가 긴 데이터를 뽑아내는 코드
		ArrayList<String> str = new ArrayList<String>();
		Scanner scn = new Scanner(System.in);
		
		for(int i =0;i<4; i++) {
			System.out.println("이름을 입력해주세요");
			String name = scn.next();
			str.add(name);
		}
		scn.close();
		//인덱스 값
		int firstIndex = 0;
		for (int i = 0; i<str.size(); i++) {
			if (str.get(firstIndex).length()<str.get(i).length()) {
				firstIndex = i;
			}
		}
		System.out.println("가장 길이가 긴 데이타: "+str.get(firstIndex));
	}
}
