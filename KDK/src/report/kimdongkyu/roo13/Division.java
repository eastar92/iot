package report.kimdongkyu.roo13;

public class Division implements InterfaceExam, InterfaceExam2 {
	public String getString() {
		return "Test의 getString()함수 호출";
	}

	public void setString(String str) {
		System.out.println("Test의 setString()함수 호출" + str);
	}

	public int getInt() {
		System.out.println("Test의 getInt함수 호출");
		return 0;
	}

	public void setInt(int str) {
		System.out.println("Test의 setInt함수 호출 " + str);

	}

	public int cal(int a, int b) {

		return a / b;
	}

}
