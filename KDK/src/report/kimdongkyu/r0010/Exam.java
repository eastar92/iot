package report.kimdongkyu.r0010;

import java.util.HashMap;

public class Exam {
	public static void main(String[] args) {
		HashMap hm = new HashMap();
		hm.put("tets", "test"); // add는 하나씩 더하는거 꺼내려면 0부터 하나씩 꺼내봄.
		// put은 아무데나 집어 넣는거. 뭘 넣는지 key를 선언. 그걸 찾기 위해.
		
		/*hm.put("연필", "2자루"); 연필이라는 주머니를 만듦
		hm.put("볼펜", "10자루"); 볼펜이라는 주머니를 만듦
		hm.put("볼펜", "5자루"); 이미 있던 볼펜주머니의 데이터를 바꿈. 오버라이딩
		hm.containsKey("지우개"); hm 너 지우개라는 주머니 있어? -> false
		hm.containsKey("연필"); hm 너 연필이라는 주머니 있어? -> true */
		
		System.out.println(hm.containsKey("test")); // key가 있는지 없는지 알려주는 contain
	}
}
