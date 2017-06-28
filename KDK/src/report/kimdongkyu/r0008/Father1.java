package report.kimdongkyu.r0008;

import java.util.Scanner;

//아빠 클래스에서 값을 str1과 str2를 scanner클래스의 nextLine()를 사용하여 값을 입력받아주세요
// 숫자값을 입력받아 정수로 변환해주시고
// 첫번째값은 반복문에 초기값, 두번재값은 반복문의 맥스값
// 반복문만큼 i의 값을 출력하는 함수를 아빠 클래스에 선언해주시고
// 아들클래스에서 호출하여 결과값을 나타내주세요
public class Father1 {

	int a = 3;
	int b;
	Scanner scan;
	String str1, str2;

	Father1() {
		scan = new Scanner(System.in);
		inputFormScanner1();
		inputFormScanner2();
		castStringToInt();
	}

	void castStringToInt() {
		this.a = Integer.parseInt(str1);
		this.b = Integer.parseInt(str2);
	}

	void inputFormScanner1() {
		System.out.print("시작값 ");
		str1 = scan.nextLine();
	}

	void inputFormScanner2() {
		System.out.print("최대값 ");
		str2 = scan.nextLine();
	}
	
	void printLoop(){
		for (int i = this.a; i <= this.b; i++) {
			System.out.println(i);
		}
	}
}
