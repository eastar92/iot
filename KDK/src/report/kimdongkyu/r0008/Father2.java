package report.kimdongkyu.r0008;

import java.util.Scanner;

public class Father2 {

	int[] a = new int[10];
	Scanner scan;
	String student;
	String k;

	Father2() {
		scan = new Scanner(System.in);
		howMany();
		point();
	}

	void howMany() {
		System.out.print("학생은 총 몇명입니까? ");
		k = scan.nextLine();
		this.a = new int[Integer.parseInt(k)];
	}

	void point() {
		for (int i = 0; i < a.length; i++) {
			System.out.print((i + 1) + "번째 학생의 점수를 입력하세요. ");
			student = scan.nextLine();
			a[i] = Integer.parseInt(student);
		}
		System.out.println("");
	}

	void studentPoint() {
		for (int i = 0; i < a.length; i++) {
			System.out.println((i + 1) + "번째 학생의 점수는 " + a[i] + "점입니다.");
		}
	}

}
