package report.kimdongkyu.r0007;

public class Exam7 {
	// private 접근제어자를 사용하여 int a,b,c 3개의 변수를 선언해주세요
	// Exam7 생성자에서 위의 3개의 변수의 값을 바꿔주세요
	// a,b,c 값을 리턴하는 함수 3개를 만들어주세요
	// Exam8 클래스를 생성하여 Exam7에 선언된 a,b,c 값을 받아 출력하는 예제를 작성해주세요
	private int a;
	private int b;
	private int c;

	Exam7(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	int sA() {
		return a;
	}

	int sB() {
		return b;
	}

	int sC() {
		return c;
	}
}
