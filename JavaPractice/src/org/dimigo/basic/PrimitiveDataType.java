package org.dimigo.basic;

/**
 * <pre>
 * org.dimigo.basic
 *   |_ PrimitiveDataType
 * 1. 개요 : 아이유 프로필 출력하기
 * 2. 작성일 : 2017. 3. 9.
 * </pre>
 *
 * @author 		: Administrator
 * @version		: 1.0
 */
public class PrimitiveDataType {

	
	public static void main(String[] args) {
		String name = "아이유";
		int age = 25; 
		boolean isMale = false;
		double height = 161.8;
		float weight = 44.3F;
		char bloodType = 'A';
		String check;
		check = isMale ? "남자" : "여자";
		System.out.printf("이름 : %s\n성별 : %s\n나이 : %d세\n키 : %.1fcm\n몸무게 : %.1fkg\n혈액형 : %c\n",
				name, check, age, height, weight, bloodType);
	}

}
