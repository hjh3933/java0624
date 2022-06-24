package org.java.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MapEx1 {
	public static void main(String[] args) {
		HashMap<String, String> mem = new HashMap<String, String>();
		mem.put("����1", "�̸��");
		mem.put("����2", "����");
		mem.put("����3", "�ڸ��");
		mem.put("����4", "�ָ��");
		
		System.out.println(mem.get("����1"));
		
		//KeySet() -> Key�� Set
		//key���� �ߺ��� �Ұ���
		Set<String> set = mem.keySet(); //Ű���� ����
		
		Iterator<String> iter = set.iterator();
		while(iter.hasNext()) {
			String key = iter.next();
			String val = mem.get(key);	//key�� �̿��ؼ� value�� get
			
			System.out.println("Ű: "+key+", ��: "+val);
		}
	}
}
