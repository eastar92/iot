package report.kimdongkyu.r0010;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MapExam extends HashMap {
	MapExam() {
	}

	public String put(String key) {
		if (!containsKey(key)) {
			put(key, "test");
			return "잘들어갔어요";
		}
		return "이미 있어 임마";
	}

	public String toString() {
		String result = "";
		List<String> keys = new ArrayList<>(keySet());
		for (int i = 0; i < keys.size(); i++) {
			String key = keys.get(i);
			Object value = (Object) get(key);
			result += "[" + key + "," + value + "]";
		}
		if (result.equals("")) {
			result = "아무것도 없어";
		}
		return result;
	}

	public static void main(String[] args) {
		MapExam me = new MapExam();
//		me.put("A군", 50);
//		me.put("B군", 60);
//		me.put("C군", 60);
//		me.put("D군", 60);
		String result = me.put("abc");
		System.out.println(me); // {}가 안나오게 하려면. 1. HashMap에 들어가서 수정하는거... 2.
								// 재정의 하는법
		System.out.println(result);

	}
}
