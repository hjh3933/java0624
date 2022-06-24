package org.java.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class MapEx4 {
	public static void main(String[] args) {
		// ����� �ѱ��Է�, ����� �ѱ۰˻�
		// Scanner�̿�

		HashMap<String, String> map = new HashMap<String, String>();
		map.put("apple", "���");
		map.put("banana", "�ٳ���");
		map.put("java", "�ڹ�");
		map.put("web", "��");
		map.put("test", "����");

		Set<String> set = map.keySet();
		Iterator<String> iter = set.iterator();
		//Iterator<String> iter2 = map.keySet().iterator();
		while (iter.hasNext()) {
			String key = iter.next();
			System.out.println("Ű: " + key + ",��: " + map.get(key));
		}
		System.out.println();
		Scanner scn = new Scanner(System.in);
		while (true) {
			System.out.println("�ܾ�˻�");
			String eng = scn.next();
			String kor = map.get(eng);
			
			if (eng.equals("exit")) {
				System.out.println("����");
				break;
			} else {
				if (kor == null) {
					System.out.println("�ܾ �����ϴ�");
				} else {
					System.out.println(kor);
				}
			}
		}

		scn.close();
	}
}
