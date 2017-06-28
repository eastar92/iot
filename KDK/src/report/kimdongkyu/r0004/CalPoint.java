package report.kimdongkyu.r0004;

import java.util.Scanner;

public class CalPoint {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int result = 0;
		double[] ab = new double[6];

		for (int i = 0; i < ab.length; i++) {
			System.out.println((i + 1) + "번 학생의 성적을 입력하시오    : ");
			String stu = scan.nextLine();
			ab[i] = Integer.parseInt(stu);
			result += ab[i];
		}
		System.out.print("총합은 : " + result);
		double aver = (result) / ab.length;
		System.out.println("  평균은 : " + aver);

		for (int i = 0; i < ab.length; i++) {
			for (int j = i + 1; j < ab.length; j++) {
				if (ab[i] < ab[j]) {
					double tmp = ab[i];
					ab[i] = ab[j];
					ab[j] = tmp;

				}
			}

		}
		for (int i = 0; i < ab.length; i++) {
			System.out.println((i + 1) + "등의 점수는 " + ab[i]);
		}
	}
}

/*
 * System.out.println("A 성적을 입력하시오  :"); String a = scan.nextLine();
 * System.out.println("B 성적을 입력하시오  :"); String b = scan.nextLine();
 * System.out.println("C 성적을 입력하시오  :"); String c = scan.nextLine();
 * System.out.println("D 성적을 입력하시오  :"); String d = scan.nextLine();
 * System.out.println("E 성적을 입력하시오  :"); String e = scan.nextLine();
 * System.out.println("F 성적을 입력하시오  :"); String f = scan.nextLine();
 * 
 * int pointA = Integer.parseInt(a); int pointB = Integer.parseInt(b); int
 * pointC = Integer.parseInt(c); int pointD = Integer.parseInt(d); int pointE =
 * Integer.parseInt(e); int pointF = Integer.parseInt(f);
 * 
 * int ave = (pointA + pointB + pointC + pointD + pointE + pointF) / 6;
 * System.out.println("평균은  = " + ave);
 */
