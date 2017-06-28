package report.kimdongkyu.r0005;

public class Exam {

	public static void main(String[] args) {
		// Robot클래스가 가지고 있는 3가지 함수를 호출해서 결과값을 출력해주세요
		// 단 로봇의 이름은 지로봇, 나이는 10살입니다.
		// Cal 클래스를 사용하여 더하기 빼기 나누기 곱하기 연산을 출력해주세요.
		// 단 첫번째 변수는 10, 두번째 변수는 2 입니다.

		// Robot r = new Robot("지로봇", 10);
		// r.doKick();
		// r.doRun();
		// r.doChange();

		int i = 0;
		int j = 11;
		for (int k = 1; k <= 10; k++) {
			i = i + 1;
			j = j - 1;
			Cal c = new Cal(i, j, "+");
			c.printCal();

		}
	}
}
