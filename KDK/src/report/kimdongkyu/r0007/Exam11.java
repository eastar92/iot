package report.kimdongkyu.r0007;

public class Exam11 {
	// a 와 b값을 초기화 하는 Exam11생성자를 만들어주세요
	// a와 b값을 더하기. 빼기. 곱하기. 나누기 하는 함수를 각각 4개 작성해주시고
	// 해당 연산결과는 printResult()라는 함수를 호출했을 때 나오는 프로그램을 작성해주세요
	// 호출은 Exam12클래스를 만들어서 그 안에서 해주시기 바랍니다.
	protected int a; //상속받은 클래스에서 접근하기 위해 프로텍티드
	protected int b;
	int result;

	
	public Exam11(int a, int b, String c) {
		this.a = a;
		this.b = b;
		if (c.equals("+")) {
			plus();
		} else if (c.equals("-")) {
			minus();
		} else if (c.equals("*")) {
			multiple();
		} else if (c.equals("/")) {
			division();
		} else {
			System.out.println("틀렸어");
		}
	}

	protected void printResult() {	
		System.out.println(result);
	}

	protected void plus() {
		result = a + b;
	}

	protected void minus() {
		result = a - b;
	}

	protected void multiple() {
		result = a * b;
	}

	protected void division() {
		result = a / b;
	}
}
