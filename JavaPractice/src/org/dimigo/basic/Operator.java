package org.dimigo.basic;

/**
 * <pre>
 * org.dimigo.basic
 *   |_ Operator
 * 1. 개요 : 디미베네
 * 2. 작성일 : 2017. 3. 13.
 * </pre>
 *
 * @author 		: Administrator
 * @version		: 1.0
 */
public class Operator {

	
	public static void main(String[] args) {
		long salary = 1700000;
		String sal = String.format("%,d", salary);
		long employ = 3;
		String em = String.format("%,d", employ);
		long shop = 1500;
		String sh = String.format("%,d", shop);
		long money = salary * 12 * employ * shop;
		String mo = String.format("%,d", money);
		System.out.println("<<디미베네 연간 인건비>>");
		System.out.println("월 평균 급여 : " + sal + "원");
		System.out.println("점포 내 직원 수 : " + em + "명");
		System.out.println("점포 수 : " + sh + "개");
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("연간 인건비 : " + mo + "원");

	}

}
