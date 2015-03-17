package org.dimigo.basic;

public class DoubleExample {

	public static void main(String[] args) {
		double d1 = 3.14;
		double d2 = 3.14d;
		
		System.out.println(d1);
		System.out.println(d2);
		
		float f1 = (float)3.14;
		float f2 = 3.14f;
		
		System.out.println(f1);
		System.out.println(f2);
		
		// 실수 정밀도 테스트
		double d3 = 0.12345678901234567890;
		float f3 = 0.12345678901234567890f;
		
		System.out.println(d3);
		System.out.println(f3);
	}

}
