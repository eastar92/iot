package report.kimdongkyu.r0006;

public class NewExam {

	public static void main(String[] args) {
		String str1 = "a";// """new String("a")""""가 어디선가 알아서 만들어짐. a는 주소값을
							// 갖고있음.
		String str2 = "a";// a가 한번 만들어진 뒤라 ""위 주소에 있는 a""가 들어가짐
		// == Stirng str2 = str1; 이랑 같은 얘기

		System.out.println(str1 == str2); // ==은 값을 비교하지 않음 주소값을 비교. 값은
											// .equals함수

		str1 = new String("b"); // 주소값 만듦
		str2 = new String("b");// 또 새로운 주소값을 만듦

		System.out.println(str1 == str2); // 서로 다른 주소값.

		System.out.println("adsf".equals("adsf")); // ==도 같은 주소. "adsf"를 쓰자마자
													// 어디선가 주소가 생겼음. 뒤에껄 같은 주소라고
													// 입력 String 쓸 때는 equals를
													// 쓰는걸로 습관을 들여라

	}
}
