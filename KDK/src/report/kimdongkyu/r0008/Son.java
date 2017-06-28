package report.kimdongkyu.r0008;

public class Son extends Father {

	Son() {
		this(1);// this(int a)이니 Son(int a)로 가는
		// super는 아빠. this 는 나.!
		System.out.println("기본 아들 생성자");
	}

	Son(int a) {
		// 아빠 호출이 먼저
		super(1);
		System.out.println("오버로딩으로 추가한 아들 생성자 호출");
	}

	public static void main(String[] args) {
		Son s = new Son();
		System.out.println(s);
	}
}

// 실행 -> Son생성자 ->Son()으로 이동. 근데 실은 Son()이 Father()를 호출하고 있어서 실행하기 전에 Father로 이동
// -> 아빠 생성자 호출 -> 아들 생성자 호출// 무조건 위를 먼저 호출. 아빠가 위다.

// 기본 아빠 -> 오버로딩 아들 -> 기본 아들