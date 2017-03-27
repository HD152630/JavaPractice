package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *   |_ CarTest2
 * 1. 개요 : 자바 실습 과제4-2
 * 2. 작성일 : 2017. 3. 23.
 * </pre>
 *
 * @author 		: Administrator
 * @version		: 1.0
 */
public class CarTest2 {
	public static void main(String[] args) {
		Car2 hyundea = new Car2("현대자동차", "제네시스", "검정색", 225, 50000000);
		Car2 kia = new Car2("기아자동차", "K7", "흰색", 246, 40000000);
		Car2 samsung = new Car2("삼성자동차", "SM7", "회색", 200, 38000000);
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
