package report.kimdongkyu.r0006;

public class Father {
	String address = "서울시 강서구 가양동";
	int age = 65;
	String name = "박철수";

	private String address1 = "경기도 성남시 분당구";

	int getAge() {
		return age;
	}

	String getAddress() {
		return address1;
	}
	
	void setAddress(String address1){
		this.address1 = address1;
	}

	public static void main(String[] args) {

	}
}
