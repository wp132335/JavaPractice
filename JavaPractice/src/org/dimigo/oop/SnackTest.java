/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 * 	|_ SnackTest
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2015. 5. 19.
 * </pre>
 * 
 * @author		: 최재혁
 * @version		: 1.0
 */
public class SnackTest {

	public static void main(String[] args) {
		Snack[] snack = new Snack[3];
		int sum=0;
		
		snack[0] = new Snack("새우깡", "농심", 1100, 2);
		snack[1] = new Snack("콘칲", "크라운", 1200, 1);
		snack[2] = new Snack("허니버터칩", "해태", 1500, 4);
		
		for(int i=0; i<3; i++) {
			System.out.println("이름 : " + snack[i].getName());
			System.out.println("제조사 : " + snack[i].getCompany());
			System.out.println("가격 : " + String.format("%,d",snack[i].getPrice()) + "원");
			System.out.println("개수 : " + snack[i].getNumber() + "개");
			System.out.println();
		}
		for(int i=0; i<3; i++) {
			sum += snack[i].calcPrice();
		}
		System.out.println("총 구매 금액 : " + sum + "원");
	}

}
