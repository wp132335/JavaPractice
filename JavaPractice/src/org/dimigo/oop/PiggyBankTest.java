/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 * 	|_ PiggyBankTest
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2015. 6. 16.
 * </pre>
 * 
 * @author		: 최재혁
 * @version		: 1.0
 */
public class PiggyBankTest {

	public static void main(String[] args) {
		FamilyMember m1 = new FamilyMember("아빠");
		FamilyMember m2 = new FamilyMember("엄마");
		FamilyMember m3 = new FamilyMember("나");
		FamilyMember m4 = new FamilyMember("남동생");

		FamilyMember.printMemberCnt();
		
		PiggyBank.putMoney(m1, 10000);
		PiggyBank.putMoney(m2, 5000);
		PiggyBank.putMoney(m3, 2000);
		PiggyBank.putMoney(m4, 1000);
		
		PiggyBank.printBalance();
		
		PiggyBank.putMoney(m3, 1000);
		
		PiggyBank.printBalance();
	}

}
