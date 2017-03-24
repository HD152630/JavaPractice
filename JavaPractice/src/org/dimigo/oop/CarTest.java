package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *   |_ CarTest
 * 1. 개요 : 자바 실습 과제4
 * 2. 작성일 : 2017. 3. 23.
 * </pre>
 *
 * @author 		: Administrator
 * @version		: 1.0
 */
public class CarTest {
	public static void main(String[] args) {
		Car hyundea = new Car();
		Car kia = new Car();
		Car samsung = new Car();
		hyundea.setCompany("현대자동차");
		hyundea.setModel("제네시스");
		hyundea.setColor("검정색");
		hyundea.setMaxSpeed(225);
		hyundea.setPrice(50000000);
		kia.setCompany("기아자동차");
		kia.setModel("K7");
		kia.setColor("흰색");
		kia.setMaxSpeed(246);
		kia.setPrice(40000000);
		samsung.setCompany("삼성자동차");
		samsung.setModel("SM7");
		samsung.setColor("회색");
		samsung.setMaxSpeed(200);
		samsung.setPrice(38000000);
		System.out.println("<<자동차 목록>>");
		System.out.println("제조사명 : " + hyundea.getCompany());
		System.out.println("모델명 : " + hyundea.getModel());
		System.out.println("색상 : " + hyundea.getColor());
		System.out.println("최대속도 : " + hyundea.getMaxSpeed()+"km");
		System.out.println("가격 : " + String.format("%,d원", hyundea.getPrice()));
		System.out.println();
		System.out.println("제조사명 : " + kia.getCompany());
		System.out.println("모델명 : " + kia.getModel());
		System.out.println("색상 : " + kia.getColor());
		System.out.println("최대속도 : " + kia.getMaxSpeed() + "km");
		System.out.println("가격 : " + String.format("%,d원", kia.getPrice()));
		System.out.println();
		System.out.println("제조사명 : " + samsung.getCompany());
		System.out.println("모델명 : " + samsung.getModel());
		System.out.println("색상 : " + samsung.getColor());
		System.out.println("최대속도 : " + samsung.getMaxSpeed() + "km");
		System.out.println("가격 : " + String.format("%,d원", samsung.getPrice()));
	}
}
