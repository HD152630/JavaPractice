/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *   |_ PiggyBankTest
 * 1. 개요 : 
 * 2. 작성일 : 2017. 4. 18.
 * </pre>
 *
 * @author 		: Administrator
 * @version		: 1.0
 */
public class PiggyBankTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FamilyMember[] FM = {
				new FamilyMember("아빠"),
				new FamilyMember("엄마"),
				new FamilyMember("나"),
				new FamilyMember("남동생")
		};
		FamilyMember.printMemberCnt();
		PiggyBank.putMoney(FM[0], 10000);
		PiggyBank.putMoney(FM[1], 5000);
		PiggyBank.putMoney(FM[2], 2000);
		PiggyBank.putMoney(FM[3], 1000);
		PiggyBank.printBalance();
		PiggyBank.putMoney(FM[2], 1000);
		PiggyBank.printBalance();
	}

}
