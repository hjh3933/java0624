package org.java.arrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;


public class ArrayListMemberDto {
	public static void main(String[] args) {

		ArrayList<MemberDto> member = new ArrayList<>();

		member.add(new MemberDto("rooot1", "1111", 21, "010-1111-1111"));
		member.add(new MemberDto("rooot2", "2222", 22, "010-2222-1111"));
		member.add(new MemberDto("rooot3", "3333", 23, "010-3333-1111"));
		member.add(new MemberDto("rooot4", "4444", 24, "010-4444-1111"));
		member.add(new MemberDto("rooot5", "5555", 25, "010-5555-1111"));

		// for each
		for (MemberDto dto : member) {
			System.out.println("���̵�: " + dto.getUserId() + ",��й�ȣ: " + dto.getUserPw() + ", ����: " + dto.getUserAge()
					+ ", ��ȭ��ȣ: " + dto.getUserPhone());
		}

		System.out.println("=======================================================================");
		// Iterator
		Iterator<MemberDto> iter = member.iterator();
		while (iter.hasNext()) {
			MemberDto str = iter.next(); // iter.next.getUserId()�ʹ� �� ������ ����
			System.out.println("���̵�: " + str.getUserId() + ",��й�ȣ: " + str.getUserPw() + ", ����: " + str.getUserAge()
					+ ", ��ȭ��ȣ: " + str.getUserPhone());
		}
		
		ArrayList<MemberDto> members = new ArrayList<MemberDto>();
		Scanner scn = new Scanner(System.in);

		while (true) {
			System.out.println("insert: ȸ���߰�, exit ����");
			String query = scn.next();
			if (query.equals("insert")) {
				System.out.println("���̵� �Է�");
				String userId = scn.next();
				System.out.println("��й�ȣ �Է�");
				String userPw = scn.next();
				System.out.println("���� �Է�");
				int userAge = scn.nextInt();
				System.out.println("��ȭ��ȣ �Է�");
				String userPhone = scn.next();
				
				members.add(new MemberDto(userId, userPw, userAge, userPhone));
			} else if (query.equals("exit")) {
				System.out.println("�����մϴ�");
				break; 
			} else {
				System.out.println("������ �Է� ����");
			}

		}
		scn.close();
		System.out.println("======�߰��� �л� ���======");
		for (MemberDto dto : members) {
			System.out.println("���̵� : " + dto.getUserId() + ", ��й�ȣ : " + dto.getUserPw() + ", ���� : " + dto.getUserAge()
					+ ", ��ȭ��ȣ : " + dto.getUserPhone());

		}
		

	}
}
