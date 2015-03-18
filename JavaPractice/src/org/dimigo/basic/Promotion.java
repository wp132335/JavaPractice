package org.dimigo.basic;

public class Promotion {

	public static void main(String[] args) {
		
		int wage = 1700000;
		int staff = 3;
		int cafe = 1500;
		long yearwage = (long)wage*staff*cafe*12;
		String.format("%,d", 1700000);
		System.out.println("<< 디미베네 연간 인건비 >>");
		System.out.println("월 평균 급여 : " + String.format("%,d", wage) + "원");
		System.out.println("점포 내 직원 수 : " + staff + "명");
		System.out.println("점포 수 : " + cafe + "개");
		System.out.println();
		System.out.println("연간 인건비 : " + String.format("%,d", yearwage) + "원");
	}

}
