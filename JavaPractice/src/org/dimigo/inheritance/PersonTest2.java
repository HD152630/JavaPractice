/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 *   |_ PersonTest
 * 1. 개요 : 
 * 2. 작성일 : 2017. 5. 8.
 * </pre>
 *
 * @author 		: Administrator
 * @version		: 1.0
 */
public class PersonTest2 {
	public static void main(String[] args) {
		Person p[] = {
				new Person("Tom"),
				new Korean("홍길동"),
				new Japanese("다나카"),
				new Chinese("왕밍")
		};
		for (Person person : p) {
			greeting(person);
		}
	}

	/**
	 * @param person
	 */
	private static void greeting(Person person) {
		// TODO Auto-generated method stub
		System.out.println(person);
		person.sayHello();
		person.sayBye();
		System.out.println();
	}
}
