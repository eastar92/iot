package report.kimdongkyu.r0009;

import java.util.ArrayList;
import java.util.HashMap;

public class ListMapExam {

	// 스트링, 인티져로 구성된 HashMap 변수를 선언해주세요
	// HashMap 변수명은 pointHm이라고 해주세요
	// pointHm에 학생의 이름(키)값과 점수(벨류)값을 10개 넣어주세요
	// 학생이름은 A군,B군,C군,,,,으로 입력해주세요
	// 해당 pointHm을 ArrayList에 추가해주세요
	// 반복문을 사용하여 ArrayList에 추가된 pointHm을 출력해주세요

	public static void main(String[] args) {
		ArrayList<HashMap<String, Integer>> pointAl = new ArrayList<HashMap<String, Integer>>();

		for (int i = 0; i < 10; i++) {
			HashMap<String, Integer> pointHm = new HashMap<String, Integer>();
			pointHm.put("" + i, i);
			pointAl.add(pointHm);

		}
		for (HashMap<String, Integer> pointHm : pointAl) {
			System.out.println(pointHm);
		}
	}
}
