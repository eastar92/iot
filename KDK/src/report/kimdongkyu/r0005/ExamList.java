package report.kimdongkyu.r0005;

import java.util.ArrayList;

public class ExamList {

	public static void main(String[] args) {
		ArrayList<Cal> list = new ArrayList<Cal>(); // List ⊃ ArrayList, <Cal>만
													// 넣을거야
		for (int i = 0; i < 4; i++) {
			Cal c = new Cal(i);
			list.add(c); // 순차적으로
		}
		for (int i = 0; i < 4; i++) {
			Cal c2 = list.get(i); //<Cal>을 선언했기에 return 없이 꺼낼 수 있음.
			System.out.println(c2.a);
		}
	}
}
