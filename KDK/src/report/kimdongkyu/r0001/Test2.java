package report.kimdongkyu.r0001;

import java.util.Scanner;

public class Test2 {
	int a = 0;
	int b = 0;
	int c = 0;

	// 占쏙옙 占쌥븝옙占쏙옙占쏙옙 占쏙옙占쏙옙占싹댐옙 占쌉쇽옙 printLoop() printLoopReverse()占쏙옙占쏙옙 c占쏙옙 占쏙옙占쏙옙占쏙옙占? 占쏙옙占싶곤옙占쏙옙 占쏙옙占?
	// 占쌘듸옙占쏙옙 占쌜쇽옙占쏙옙占쌍쇽옙占쏙옙
	public void printLoop() {
		for (int i = a; i <= b; i++) {
			if (i % c == 0) {
				System.out.println(i);
			} else {
				System.out.print(i + ",");
			}
		}
	}

	public void printLoopReverse() {
		for (int i = a; i >= b; i--) {
			if (i % c == 1) {
				System.out.println(i);
			} else {
				System.out.print(i + ",");
			}
		}
	}

	public static void main(String[] args) {
		Test2 t2 = new Test2();
		Scanner scan = new Scanner(System.in);

		System.out.println("占쏘개占쏙옙占쏙옙 占쏙옙트 :");
		String c = scan.nextLine();
		int num = Integer.parseInt(c);
		

		t2.a = 1;
		t2.b = 100;
		t2.c = num;
		t2.printLoop();

		t2.a = 100;
		t2.b = 1;
		t2.printLoopReverse();
	}
}
