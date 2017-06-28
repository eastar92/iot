package report.kimdongkyu.r0012;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class DataTypeExam5 {
	Scanner scan = new Scanner(System.in);

	public HashMap getHashMap() {
		HashMap hm = new HashMap();
		System.out.print("클래스 : ");
		hm.put("클래스", scan.nextLine());
		System.out.print("이름 : ");
		hm.put("이름", (scan.nextLine()));
		System.out.print("나이 : ");
		hm.put("나이", (scan.nextLine()));
		System.out.print("성별 : ");
		hm.put("성별", (scan.nextLine()));
		return hm;
	}

	public static void main(String[] args) {
		ArrayList<HashMap> numList = new ArrayList<HashMap>();
		DataTypeExam5 d5 = new DataTypeExam5();
		for (int i = 0; i < 2; i++) {
			numList.add(d5.getHashMap());
		}

		for (HashMap hm1 : numList) {
			System.out.print(hm1.get("클래스") + ",");
			System.out.print(hm1.get("이름") + ",");
			System.out.print(hm1.get("나이") + ",");
			System.out.println(hm1.get("성별"));
		}

	}
}
