/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 *   |_ SmartPhoneTest
 * 1. 개요 : 
 * 2. 작성일 : 2017. 5. 16.
 * </pre>
 *
 * @author : Administrator
 * @version : 1.0
 */
public class SmartPhoneTest {
	public static void main(String[] args) {
		SmartPhone s[] = { new Galaxy("갤럭시 S8", "삼성", 800000), new IPhone("iPhone 7", "애플", 900000) };
		for (SmartPhone smartPhone : s) {
			System.out.println(smartPhone);
			smartPhone.turnOn();
			smartPhone.pay();
			smartPhone.useSpecialFunction(smartPhone);
			smartPhone.turnOff();
			System.out.println();
		}
	}
}
