package report.kimdongkyu.r0006;

import java.util.Scanner;

public class CalExam {
	// 반복문을 사용하여 Scanner 클래스를 이용해
	// 총 10명의 학생의 점수를 받아주세요
	// 10명의 학생의 총점과 평균을 구해주세요.

	int getGradeFromArray(int[] arrNum, int num) {
		for (int i = 0; i < arrNum.length; i++) {
			if (arrNum[i] == num) {
				return i + 1; // return이면 그냥 끝나서 메인으로 감.
			}
		}
		return -1;// 값을 찾는 로직. 값을 못찾았다고 했을때 보통 -1을 리턴해줌. for문 다 돌았는데 안되더라. 그걸
					// 알려주기 위한
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("반 학생의 수는 몇명입니까?");
		String stu = scan.nextLine();
		int student = Integer.parseInt(stu);

		int[] a = new int[student];
		int[] a1 = new int[student];
		int i;
		double sum = 0;
		for (i = 0; i < a.length; i++) {
			System.out.print((i + 1) + "번 학생의 성적을 입력하세요 :");
			String k = scan.nextLine();
			a[i] = Integer.parseInt(k);
			a1[i] = Integer.parseInt(k);
			sum = sum + a[i];
		}
		System.out.print("총점 = " + sum + ",");
		System.out.println("평균 = " + (sum / a.length));

		for (int j = 0; j < a.length; j++) {
			for (int k = j + 1; k < a.length; k++) {
				if (a[j] < a[k]) {
					int tem = a[k];
					a[k] = a[j];
					a[j] = tem;
				}
			}
		}
		CalExam ce = new CalExam();
		for (i = 0; i < a.length; i++) {
			System.out.println((i + 1) + "등의 점수는 " + a[i] + "점으로," + ce.getGradeFromArray(a1, a[i]) + "번학생이다");

		}
	}
}
