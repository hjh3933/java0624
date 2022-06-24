package org.java.thread;

public class MainThread {
	public static void main(String[] args) {
		
		//���� �������� ������ �̸�
		String threadName = Thread.currentThread().getName();
		//���� �������� ������ ���̵�
		long id = Thread.currentThread().getId();
		//���� �������� ������ ����
		Thread.State state = Thread.currentThread().getState();
		
		System.out.println("�������� ������ �̸�: "+threadName);	//main ������
		System.out.println("�������� ������ ���̵�: "+id);
		System.out.println("�������� ������ ����: "+state);
	}
}	
