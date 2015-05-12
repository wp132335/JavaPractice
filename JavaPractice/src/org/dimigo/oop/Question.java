/**
 * 
 */
package org.dimigo.oop;

import java.util.Scanner;

/**
 * <pre>
 * org.dimigo.oop
 * 	|_ Question
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2015. 5. 12.
 * </pre>
 * 
 * @author		: 최재혁
 * @version		: 1.0
 */
public class Question {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("가장 좋아하는 동물은?");
		String answer = scanner.nextLine();
		if(answer.equals("고양이")) {
			System.out.println("정답입니다!!");
		} else System.out.println("틀렸습니다");
		
		System.out.println("가장 좋아하는 라디오 프로그램은?");
		answer = scanner.nextLine();
		if(answer.equals("볼륨을 높여요") || answer.equals("컬투쇼")) {
			System.out.println("정답입니다!!");
		} else System.out.println("틀렸습니다");
		
		System.out.println("가장 좋아하는 과목은?");
		answer = scanner.nextLine();
		if(answer.equals("자바")) {
			System.out.println("정답입니다!!");
		} else System.out.println("틀렸습니다");
		
		scanner.close();
	}

}
