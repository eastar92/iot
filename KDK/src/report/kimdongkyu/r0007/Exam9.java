package report.kimdongkyu.r0007;

import java.util.Scanner;

public class Exam9 {

	private int a;
	private int b;
	private int result;
	Scanner scan = new Scanner(System.in);

	public Exam9() {// 생성자는 초기값 선언할때 많이 사용
		scanA();
		scanB();
	}

	public void scanA() {
		System.out.println("초기값을 입력해주세요 : ");
		a = Integer.parseInt(scan.nextLine());
	}

	public void scanB() {
		System.out.println("최대값을 입력해주세요 : ");
		b = Integer.parseInt(scan.nextLine());
	}

	public void doLoop() {
		for (int i = a; i <= b; i++) {

			result = result + i;
		}
	}

	public int result() {
		return result;
	}
}
