package report.kimdongkyu.roo13;

public class Minus implements InterfaceExam, InterfaceExam2 {

	@Override // 오버라이딩. 재정의하기 위해 자동으로 생성된. 지워도 상관없음.
	public String getString() {
		// TODO Auto-generated method stub
		return "Exam의 getString()함수 호출";
	}

	@Override // @ jvm을 위한 주석 . annotation!!
	public void setString(String str) {
		// TODO Auto-generated method stub //주석. 코멘트 comment
		System.out.println("Exam의 setString()함수 호출" + str);
	}

	@Override
	public int getInt() {
		// TODO Auto-generated method stub
		System.out.println("Exam의 getInt함수 호출");
		return 0;
	}

	@Override
	public void setInt(int str) {
		// TODO Auto-generated method stub
		System.out.println("Exam의 setInt함수 호출" + str);

	}

	public int cal(int a, int b) {

		return a - b;
	}
}
