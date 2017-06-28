package report.kimdongkyu.r0008;

public class Son1 extends Father1 {
	// 아빠 클래스에서 값을 str1과 str2를 scanner클래스의 nextLine()를 사용하여 값을 입력받아주세요
	// 숫자값을 입력받아 정수로 변환해주시고
	// 첫번째값은 반복문에 초기값, 두번재값은 반복문의 맥스값
	// 반복문만큼 i의 값을 출력하는 함수를 아빠 클래스에 선언해주시고
	// 아들클래스에서 호출하여 결과값을 나타내주세요.

	Son1() {
	}

	public static void main(String[] args) {
		Son1 s = new Son1();
		s.printLoop();
	}
}
