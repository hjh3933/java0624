package org.java.thread;
//�����带 ����� ù���� ���: ���
class ThreadSub extends Thread {
	@Override
	public void run() {
		System.out.println("Thread run()�޼ҵ�");
	}
}

public class ThreadEx1 {
	public static void main(String[] args) {
		System.out.println("main thread ����");
		System.out.println("Thread");
		
		ThreadSub t1 = new ThreadSub();
		t1.start();	//thread ����, �ݵ�� ������ ����� ����ȴ�. run�����δ� ���� �ȵ�
		
		System.out.println("main thread ��");
	}
}
