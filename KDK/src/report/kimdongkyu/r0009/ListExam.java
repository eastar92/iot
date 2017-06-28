package report.kimdongkyu.r0009;

import java.util.ArrayList;

public class ListExam {

	public static void main(String[] args) {
		ArrayList<String> arrList = new ArrayList<String>();
		for (int i = 3; i >= 0; i--) {
			arrList.add("" + (int)(Math.random()*45+1));
		}
		for (int i = 0; i < arrList.size(); i++) {
		System.out.println(arrList.get(i));
		}
/*		Collections.sort(arrList); //sort 오름차순

		for (int i = 0; i < arrList.size(); i++) {
			System.out.println(arrList.get(i)); // 출력했는데, 22, 36,39,6 순으로 나옴. 이유는 String이라 첫쨋짜리 2,3,3,6 순으로 정렬. 
		}*/

//		Collections.reverse(arrList); // reverse 내림차순
//
//		for (int i = 0; i < arrList.size(); i++) {
//			System.out.println(arrList.get(i));
//		}
	}
}
