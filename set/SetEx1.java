package org.java.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetEx1 {
	public static void main(String[] args) {
		System.out.println("Set");
		
		//�������̽� = ������ü(Ŭ����)
		Set<String> set = new HashSet<String>();
		
		set.add("java");
		set.add("Spring");
		set.add("JSP");
		set.add("Servlet");
		set.add("WEB");
		
		int size = set.size();
		System.out.println("�� ��ü��: "+size);
		
		set.remove("java"); //����� ���
		size = set.size(); //�ٽ� �ʱ�ȭ �ؾ���
		System.out.println("�� ��ü��: "+size);
		System.out.println(set);// ���� ���� -> ����ȭ -> iterator
		
		Iterator<String> iter = set.iterator(); //���ķ� ��ġ
		while(iter.hasNext()) {
			String it = iter.next();
			System.out.println(it);
		}
		
		set.clear();
		size = set.size();
		System.out.println("�� ��ü��: "+size);
		
		if (set.isEmpty()) {
			System.out.println("Set�� ����ִ�");
		} else {
			System.out.println("������� �ʽ��ϴ�");
		}
	}
}
