package org.java.arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEx2 {
	public static void main(String[] args) {
		//���� ���̰� �� �����͸� �̾Ƴ��� �ڵ�
		ArrayList<String> str = new ArrayList<String>();
		Scanner scn = new Scanner(System.in);
		
		for(int i =0;i<4; i++) {
			System.out.println("�̸��� �Է����ּ���");
			String name = scn.next();
			str.add(name);
		}
		scn.close();
		//�ε��� ��
		int firstIndex = 0;
		for (int i = 0; i<str.size(); i++) {
			if (str.get(firstIndex).length()<str.get(i).length()) {
				firstIndex = i;
			}
		}
		System.out.println("���� ���̰� �� ����Ÿ: "+str.get(firstIndex));
	}
}
