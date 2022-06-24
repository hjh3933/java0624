package org.java.thread;
//�����带 ����� �ι��� ���: �������̽� ���
class RunnableSub implements Runnable {

	@Override
	public void run() {
		System.out.println("thread(Runnable)");
	}
	
}

public class ThreadEx2 {
	public static void main(String[] args) {
		Runnable r1 = new RunnableSub(); //1 ������
		Thread t1 = new Thread(r1);	//Runnable ����
		t1.start();	//RunableSub���� ������ run�޼ҵ带 ����
								
		Thread t2 = new Thread(new Runnable() {	//2 �͸�Ŭ����(�������̽� ����)
			
			@Override
			public void run() {
				System.out.println("thread(�͸�Ŭ����)");
			}
		});
		
		t2.start();
		Thread t3= new Thread(() -> {	//3 () -> {}
			//run()
			System.out.println("thread(���ٽ�)");
		});
		
	}
}
