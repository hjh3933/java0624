package org.java.thread;

public class MainThread {
	public static void main(String[] args) {
		
		//현재 실행중인 스레드 이름
		String threadName = Thread.currentThread().getName();
		//현재 실행중인 스레드 아이디
		long id = Thread.currentThread().getId();
		//현재 실행중인 스레드 상태
		Thread.State state = Thread.currentThread().getState();
		
		System.out.println("실행중인 스레드 이름: "+threadName);	//main 스레드
		System.out.println("실행중인 스레드 아이디: "+id);
		System.out.println("실행중인 스레드 상태: "+state);
	}
}	
