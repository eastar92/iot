package report.kimdongkyu.r0009;

import java.util.HashMap;

public class MapExam {

	public static void main(String[] args) {
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		for (int i = 1; i < 10; i++) {
			hm.put("str", i); // (키, 벨류) ,, ArrayList는 키를 바꿀수가 없으나, 여긴 키와 벨류를 둘
								// 다 쓸
								// 수 있기 때문에 <String, Integer> 두개 선언

			System.out.println(hm.get("str"));
		}

	}
}
