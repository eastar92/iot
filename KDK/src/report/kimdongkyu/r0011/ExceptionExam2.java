package report.kimdongkyu.r0011;

import java.util.Scanner;

public class ExceptionExam2 {
	// 10개의 방을 가지고 있는 int형 배열변수 arrNum을
	// ExcptionExam2 멤버변수로 선언해주세요.
	// for문을 돌며 scanner 클래스의 nextLine() 함수를 이용하여 아무런 값이나 입력해주세요
	// 단 for문을 돌며 문자값이 입력 됐을 때 에러메시지를 나오게 해주세요.
	// 에러가 나면 다시 입력하게 하려면?
	final int initNum;
	int[] arrNum;

	ExceptionExam2(int initNum){
		this.initNum = initNum;
	}
	public static void main(String[] args) {

		ExceptionExam2 ee2 = new ExceptionExam2(10);
		ee2.arrNum = new int[ee2.initNum];
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < ee2.arrNum.length; i++) {
			try {
				System.out.print((i + 1) + "번 입력 :");
				ee2.arrNum[i] = Integer.parseInt(scan.nextLine());
			} catch (Exception e) {
				System.out.println("문자 입력 오류");
				i = i - 1;
			}
		}
		for (int i = 0; i < ee2.arrNum.length; i++) {
			System.out.println(ee2.arrNum[i]);
		}

	}
}
