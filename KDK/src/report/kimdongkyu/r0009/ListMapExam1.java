package report.kimdongkyu.r0009;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class ListMapExam1 {

	public static void main(String[] args) {
		ArrayList<HashMap<String, Object>> pointAl = new ArrayList<HashMap<String, Object>>();
		HashMap<String, Object> pointHm = new HashMap<String, Object>();
		// object로 선언하고 클래스는 String.가능
		Scanner scan = new Scanner(System.in);
		System.out.println("이름");
		String name = scan.nextLine();
		System.out.println("나이");
		String age = scan.nextLine();
		System.out.println("성별");
		String gender = scan.nextLine();
		pointHm.put("name", name);
		pointHm.put("age", Integer.parseInt(age));
		pointHm.put("gender", gender);

		pointAl.add(pointHm);
		for (HashMap<String, Object> pointHm1 : pointAl) {
			System.out.println(pointHm1);

		}
	}
}
