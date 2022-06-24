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
			System.out.println("아이디: " + dto.getUserId() + ",비밀번호: " + dto.getUserPw() + ", 나이: " + dto.getUserAge()
					+ ", 전화번호: " + dto.getUserPhone());
		}

		System.out.println("=======================================================================");
		// Iterator
		Iterator<MemberDto> iter = member.iterator();
		while (iter.hasNext()) {
			MemberDto str = iter.next(); // iter.next.getUserId()너무 길어서 변수에 넣음
			System.out.println("아이디: " + str.getUserId() + ",비밀번호: " + str.getUserPw() + ", 나이: " + str.getUserAge()
					+ ", 전화번호: " + str.getUserPhone());
		}
		
		ArrayList<MemberDto> members = new ArrayList<MemberDto>();
		Scanner scn = new Scanner(System.in);

		while (true) {
			System.out.println("insert: 회원추가, exit 종료");
			String query = scn.next();
			if (query.equals("insert")) {
				System.out.println("아이디 입력");
				String userId = scn.next();
				System.out.println("비밀번호 입력");
				String userPw = scn.next();
				System.out.println("나이 입력");
				int userAge = scn.nextInt();
				System.out.println("전화번호 입력");
				String userPhone = scn.next();
				
				members.add(new MemberDto(userId, userPw, userAge, userPhone));
			} else if (query.equals("exit")) {
				System.out.println("종료합니다");
				break; 
			} else {
				System.out.println("쿼리문 입력 오류");
			}

		}
		scn.close();
		System.out.println("======추가된 학생 목록======");
		for (MemberDto dto : members) {
			System.out.println("아이디 : " + dto.getUserId() + ", 비밀번호 : " + dto.getUserPw() + ", 나이 : " + dto.getUserAge()
					+ ", 전화번호 : " + dto.getUserPhone());

		}
		

	}
}
