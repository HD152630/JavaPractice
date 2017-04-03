/**
 * 
 */
package org.dimigo.oop;

import java.util.Scanner;

/**
 * <pre>
 * org.dimigo.oop
 *   |_ Question
 * 1. 개요 : 자바 수행 과제5
 * 2. 작성일 : 2017. 4. 3.
 * </pre>
 *
 * @author 		: Administrator
 * @version		: 1.0
 */
public class Question {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] questions = {"가장 좋아하는 가수는?", "가장 좋아하는 배우는?", "가장 좋아하는 과목은?"};
		String[] answers = {"볼빨간사춘기", "공유", "응용 프로그래밍"};
		String correct = "정답입니다!";
		String wrong = "틀렸습니다!";
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < answers.length; i++) {
			System.out.println(i+1 +". "+questions[i]);
			String answer = scanner.nextLine();
			System.out.println(answers[i].equals(answer)? correct : wrong);
		}
		scanner.close();
		System.out.println("<<결과 출력>>");
		for (int i = 0; i < answers.length; i++) {
			StringBuilder sb = new StringBuilder(questions[i]);
			sb.append(" ").append(answers[i]).append("입니다.");
			System.out.println(sb.toString());
		}
		
	}

}
