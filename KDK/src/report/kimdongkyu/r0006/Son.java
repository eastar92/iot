package report.kimdongkyu.r0006;

//오버라이딩-재정의/ 오버로딩-같은 함수를 다르게 인식하게 만드는거
public class Son extends Father { // 상속은 다중상속이 안됨. 상속받은 함수들은 재정의 받을 수 있음
	int a;

	// Father 함수가 여기 있다고 생각하면 됨
	// int getAge(){}가 있음

	int getAge() { // 이제 위에 있던 Father의 getAge가 새로 재 정의됨
		age = 25;
		return age;
	}

	public static void main(String[] args) {
		Son s = new Son();
		s.a = 3;
		System.out.println(s.address); // Sun의 s로도 address가 호출 됨. extends

		System.out.println(s.age); // Father의 age 65
		System.out.println(s.getAge()); // Sun에서 재 정의한 25가 나옴.
		System.out.println(s.age); // 위에서 재정의되어 Sun의 age 25가 나옴

		Father f = new Father();
		System.out.println(f.address);
		// System.out.println(s.address1); // address1을 찾을 수 없음. Father에서 남에게 주기
		// 싫다고 잠금(Private). Father만 사용 가능

		System.out.println(s.getAddress()); // 숨긴 address1을 찾아오는 방법
		s.setAddress("서울시 노원구"); // 숨긴 address1의 값을 바꾸는 방법
		System.out.println(s.getAddress());

	}
}
