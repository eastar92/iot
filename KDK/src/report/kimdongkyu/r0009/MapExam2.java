package report.kimdongkyu.r0009;

import java.util.HashMap;
import java.util.Iterator;

public class MapExam2 {

	HashMap<String, Integer> hm;

	MapExam2() {
		hm = new HashMap<String, Integer>();
	}

	public static void main(String[] args) {
		MapExam2 me = new MapExam2();
		me.hm.put("1", 1); // a(1) = 1;
		me.hm.put("1", 2); // a(1) = 2; 이랑 같은 말. 1번키는 오로지 하나
		me.hm.put("2", 3);
		me.hm.put("3", 4);
		me.hm.put("4", 5);
		me.hm.put("5", 6);
		System.out.println(me.hm.get("1"));
		System.out.println("");

		// 모든 방의 값을 알고 싶을 때.사용하는 아이터레이터
		Iterator it = me.hm.keySet().iterator();
		while (it.hasNext()) {
			String key = (String) it.next();
			System.out.print(key + ",");
			System.out.println(me.hm.get(key));
		}
		System.out.println("");
		// 키가 있는지 없는지 확인하는 명령어
		System.out.println(me.hm.containsKey("6"));

	}
}
