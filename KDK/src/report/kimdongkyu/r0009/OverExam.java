package report.kimdongkyu.r0009;

public class OverExam {

	public String toString() {
		return "어머?";
	}

	public static void main(String[] args) {
		OverExam oe = new OverExam();
		System.out.println(oe);
		// println이 기본적으로 toString을 호출. 조상과 같은 object클래스에 선언되어 있음. toString을
		// 선언하면 object이 아닌 내 클래스에 있는 toString을 바라봄. 이것이 오버라이딩!
		
		// toString(int a){
		// return "어머?"} 이것은 오버로딩. 같은 클래스안에 있는 것

	}
}
