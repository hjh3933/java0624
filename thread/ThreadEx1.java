package org.java.thread;
//스레드를 만드는 첫번쨰 방법: 상속
class ThreadSub extends Thread {
	@Override
	public void run() {
		System.out.println("Thread run()메소드");
	}
}

public class ThreadEx1 {
	public static void main(String[] args) {
		System.out.println("main thread 시작");
		System.out.println("Thread");
		
		ThreadSub t1 = new ThreadSub();
		t1.start();	//thread 시작, 반드시 시작을 해줘야 실행된다. run만으로는 실행 안됨
		
		System.out.println("main thread 끝");
	}
}
