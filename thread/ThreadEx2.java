package org.java.thread;
//스레드를 만드는 두번쨰 방법: 인터페이스 상속
class RunnableSub implements Runnable {

	@Override
	public void run() {
		System.out.println("thread(Runnable)");
	}
	
}

public class ThreadEx2 {
	public static void main(String[] args) {
		Runnable r1 = new RunnableSub(); //1 다형성
		Thread t1 = new Thread(r1);	//Runnable 넣음
		t1.start();	//RunableSub에서 정의한 run메소드를 실행
								
		Thread t2 = new Thread(new Runnable() {	//2 익명클래스(인터페이스 구현)
			
			@Override
			public void run() {
				System.out.println("thread(익명클래스)");
			}
		});
		
		t2.start();
		Thread t3= new Thread(() -> {	//3 () -> {}
			//run()
			System.out.println("thread(람다식)");
		});
		
	}
}
