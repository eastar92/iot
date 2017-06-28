package report.kimdongkyu.r0005;

public class Cal2 {
	// int 형 변수 num1, num2 2개를 멤버변수로(클래스안에서 생성)
	// String형 변수 operator1개를 생성
	// printPlus(), printMinus(), printMultiple(), printDivision()
	// Cal2(int num1, int num2, String operator) 생성자를 선언하여
	// 각각의 멤버변수에 대입해주세요
	// 그리고 위의 함수를 호출했을 때 원하는 결과를 출력해주세요.

	int num1;
	int num2;
	String operator;

//	Cal2() {
//	}

	Cal2(int num1, int num2, String operator) {
		this.num1 = num1;
		this.num2 = num2;
		this.operator = operator;
//		Cal2 c2 = new Cal2();
//		if (operator.equals("+")) {
//			c2.printPlus();
//		} else if (operator.equals("-")) {
//			c2.printMinus();
//		} else if (operator.equals("*")) {
//			c2.printMultiple();
//		} else if (operator.equals("/")) {
//			c2.printDivision();
//		} else {
//			System.out.println("ㄴㄴ");
//		}
	}

	void printPlus() {
		System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
	}

	void printMinus() {
		System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
	}

	void printMultiple() {
		System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
	}

	void printDivision() {
		System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
	}

	public static void main(String[] args) {
		Cal2 c2 = new Cal2(2, 3, "+");
		c2.printPlus();
		 c2 = new Cal2(2, 3, "-");
		c2.printMinus();
		 c2 = new Cal2(2, 3, "*");
		c2.printMultiple();
		 c2 = new Cal2(2, 3, "/");
		c2.printDivision();
		
	}
}
