/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 * 	|_ SmartPhoneTest
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2015. 8. 28.
 * </pre>
 * 
 * @author		: 최재혁
 * @version		: 1.0
 */
public class SmartPhoneTest {

	public static void main(String[] args) {
		
	SmartPhone[] phones = {
			new IPhone("iPhone 6", "애플", 700000),
			new Galaxy("갤럭시 S6", "삼성", 650000)
	};
	
	for(SmartPhone phone : phones) {
		System.out.println(phone);
		phone.turnOn();
		phone.pay();
		
		phone.useSpecialFunction(phone);
		
		phone.turnOff();
		
		System.out.println();
	}
		
	}

}
