package report.kimdongkyu.r0007;

import java.util.Scanner;

public class ArrExam2 {
	// Scanner클래스의 nextLine()함수를 사용하여 초기값과 맥스값을 입력받아주세요.
	// 위에서 받은 초기값부터 맥스값까지 반복하는 반복문을 작성해주세요
	// 스트링 배열변수를 선언해주세요
	// 해당배열변수의 방의 갯수는 위에서 받은 초기값과 맥스값으로 계산해야 에러가 나지 않습니다.
	// 해당반복문에서 Scanner클래스의 nextLine()함수를 사용하여 위에서 선언한
	// 스트링 배열변수에 0번째 인덱스부터 마지막방의 인덱스까지 값을 받아주세요
	// 다음 반복문에서 스트링배열변수가 가진 모든방의 값을 출력해주세요

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("초기값 : ");
		String a = scan.nextLine();
		System.out.print("최대값 : ");
		String b = scan.nextLine();

		int i = Integer.parseInt(a);
		int j = Integer.parseInt(b);
		int[] s = new int[j - i + 1];

		for (int k = 0; k < s.length; k++) {
			System.out.print(s.length + "개 숫자 중 " + (k + 1) + "번째 숫자를 입력하시오. ");
			String c = scan.nextLine();
			s[k] = Integer.parseInt(c);
		}
		for (int t = 0; t < s.length; t++) {
			System.out.println((t + 1) + "번째 숫자 = " + s[t]);
		}

	}
}
