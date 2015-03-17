package org.dimigo.basic;

public class CharExample {

	public static void main(String[] args) {
		char ch1 = 'A';
		char ch2 = 65;			// 10진수
		char ch3 = '\u0041';	// 16진수
		
		System.out.println(ch1);
		System.out.println(ch2);
		System.out.println(ch3);

		char ch4 = '가';
		int unicode = ch4;
		
		System.out.println(ch4);
		System.out.println(unicode);
		
		char ch5 = 44032;
		
		System.out.println(ch5);
		
		char ch6 = '\uAC00';
		
		System.out.println(ch6);
		
		// 문자열
		System.out.println("My name is " + "김자바");
		System.out.println("123" + 10 + 3.14 + "김자바");
		
		System.out.printf("%f, %.3f, %d, %c, %s\n", 3.14, 0.123, 100, 'A', "김자바");
	}

}
