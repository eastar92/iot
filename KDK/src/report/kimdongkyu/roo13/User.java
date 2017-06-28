package report.kimdongkyu.roo13;

public class User {
	private InterfaceExam ie;

	User(int a) {
		if (a == 1) {
			ie = new Plus(); // Test
		} else {
			ie = new Minus(); // Exam
		}
	}

	User(String operator) {
		if (operator.equals("+")) {
			ie = new Plus();
		} else if (operator.equals("-")) {
			ie = new Minus();
		} else if (operator.equals("*")) {
			ie = new Multiple();
		} else if (operator.equals("/")) {
			ie = new Division();
		} else {
			System.out.println("연산자 잘못 입력했어");
		}
	}

	public InterfaceExam getInterfaceExam() {
		return ie;
	}

	public static void main(String[] args) {
		InterfaceExam ie = new Minus(); // 인터페이스는 생성자가 없음 new InterfaceExam() xxxx
		InterfaceExam ie2 = new Plus();

		String str = ie.getString();
		System.out.println(str);
		String str2 = ie2.getString();
		System.out.println(str2);

		InterfaceExam2 ie3 = new Plus();
		int a = ie3.getInt();
		System.out.println(a);
		ie3.setInt(a);
		System.out.println("");
		System.out.println("");
		System.out.println("");
		//////////////////////////////////////////////////////////////////////////////

		User u = new User(2);
		// InterfaceExam2 ie2 = u.getInterfaceExam(); // InterfaceExam2 ≠ InterfaceExam
		InterfaceExam ie4 = u.getInterfaceExam();
		ie4.setString("아아아아");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		////////////////////////////////////////////////////////////////////////////////

		User u2 = new User("+");
		InterfaceExam ie5 = u2.getInterfaceExam();
		int result = ie5.cal(3, 4);
		System.out.println(result);

		u2 = new User("-");
		ie5 = u2.getInterfaceExam();
		result = ie5.cal(3, 4);
		System.out.println(result);
		
		u2 = new User("*");
		ie5 = u2.getInterfaceExam();
		result = ie5.cal(3, 4);
		System.out.println(result);
		
		u2 = new User("/");
		ie5 = u2.getInterfaceExam();
		result = ie5.cal(3, 4);
		System.out.println(result);
	}
}
