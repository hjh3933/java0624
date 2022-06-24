package org.java.thread;

import java.util.function.Function;

interface FunctionalIn {
	void son1();
}

public class RamdaBasicEx1 {
	
	interface FunctionalInter {
		void son();
	}
	
	public static void main(String[] args) {
		FunctionalInter f1;
		
		f1 = new FunctionalInter() {
			
			@Override
			public void son() {
				System.out.println("익명클래스");
			}
		};
		
		f1.son();
			//람다식
		f1 = () -> {
			System.out.println("람다식");
		};
		f1.son();
		
		/////////////////////////////////////////////////////////
		FunctionalIn f2;
		
		f2 = new FunctionalIn() {
			
			@Override
			public void son1() {
				System.out.println("익명클래스");
			}
		};
		f2.son1();
		
		f2 = ()-> {
			System.out.println("람다식");
		};
		f2.son1();
		
	}
}
