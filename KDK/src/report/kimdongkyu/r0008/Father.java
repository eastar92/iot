package report.kimdongkyu.r0008;

public class Father {

	Father() {
		// Father(int a) 하려면 = this(1);
		System.out.println("기본 아빠 생정자");
	}

	Father(int a) {
		System.out.println("오버로딩으로 추가한 아빠 생정자 호출");
	}
}
