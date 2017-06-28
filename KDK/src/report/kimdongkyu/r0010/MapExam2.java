package report.kimdongkyu.r0010;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MapExam2 extends HashMap {
	// HashMap을 상속받아주세요
	// key타입은 String, 밸류타입은 Integer로 선언해주세요
	// 키는 아무거나 넣어도 되지만 밸류는 숫자만 입력해야합니다
	// 총 10개의 키값을 생성해주세요.
	// toString()함수를 오버라이딩 해서
	// 해당 해쉬맵이 가지고 있는 전체 숫자를 더한 값을 출력해주세요.
	
	public String toString() {
		String result = "";
		List<String> keyList = new ArrayList<String>(keySet());
		
		int a=0;
		for (int i = 0; i < keyList.size(); i++) {
			String key = keyList.get(i);
			Integer value = (Integer) get(key);
			a = a + value;
			result = String.valueOf(a);
			
		}
		if(result.equals("")){
			result = "아무것도 없어";
		}
		return result;
	}
	
	public static void main(String[] args) {
		MapExam2 e2 = new MapExam2();
		String result;
		for(int i = 1; i <=10; i++){
			result = (String)e2.put(i+"", i);
		}
		System.out.println(e2);

		
		
	}
}
