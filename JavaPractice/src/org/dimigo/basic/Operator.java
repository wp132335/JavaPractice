package org.dimigo.basic;

public class Operator {

	public static void main(String[] args) {
		int a = 9, b = 10;
		double h1 = 5.8, h2 = 5.4;
		
		double area1 = (a + b) * h1 / 2;
		double area2 = (a * h2);
		
		System.out.println("<< 도형 넓이 비교 >>");
		System.out.println("사다리꼴 넓이 : " + area1);
		System.out.println("평행사변형 넓이 : "+ area2);
		System.out.println();
		System.out.println("사다리꼴이 평행사변형 보다 " + (area1 - area2) + " 더 큽니다.");
		
	}

}
