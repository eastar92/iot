package report.kimdongkyu.r0005;

public class Cal {
	// 인트 타입 2개의 파라메터 변수를 받는 생성자를 하나 만들어 주세요.
	// 클래스안에 인트 타입의 변수 2개를 선언해주시고
	// 클래스 안에 변수(멤버변수.클래스 어디든지 갈 수 있음)2개에 생성자에서 받은 파라메터 변수의 값을 대입하여
	// printPlus라는 함수에서 2개의 변수를 더한 값을 출력해주세요.
	// 클래스안에 스트링타입의 연산자를 저장하는 변수를 선언
	// 생성자에서 연산자를 저장하는 로직을 만들고
	// printCal()이라는 함수를 만들어 해당 함수를 호출하였을때 알맞은 연산이 되는 프로그램을 만들어주세요.

	String c;
	int a;
	int b;

	Cal(int a) {
		//System.out.println(a + "인트형 변수 파라메터를 한개를 가진 생성자를 호출하셨네요");
		this.a = a;
	}

	Cal(int a, int b, String c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	void printPlus() {
		System.out.println("더한값 = " + (a + b));
	}

	void printCal() {
		if (c.equals("+")) { // 클래스와 클래스를 비교할 때는 ==이 안된다.(메모리를 비교하게됨). equals를
								// 사용하면 값을 비교함.
			System.out.println(a + " + " + b + " = " + (a + b));
		} else if (c.equals("-")) {
			System.out.println("뺀 값 = " + (a - b));
		} else if (c.equals("*")) {
			System.out.println("곱한 값 = " + (a * b));
		} else if (c.equals("/")) {
			System.out.println("나눈 값 = " + (a / b));
		}
	}

	public static void main(String[] args) {
		Cal c = new Cal(2, 3, "+");
		c.printCal();
		c = new Cal(2, 3, "-");
		c.printCal();
		c = new Cal(2, 3, "*");
		c.printCal();
		c = new Cal(2, 3, "/");
		c.printCal();
	}
}
