package report.kimdongkyu.r0009;

public class Son extends Father {

	public String toString() {
		return "아부지 아들입니다";
	}

	public static void main(String[] args) {
		Father f = new Father();
		System.out.println(f); // 애비다 ->  오버라이딩 ctrl c +ctrl v
		Son s = new Son();
		System.out.println(s); // extends로 무조건 아빠를 먼저 읽음 -> '애비다' -> '아부지 아들입니다' 
		Father fs = new Son(); // Father ⊃ Son 이어서 사용 가능,  Son = new Father은 불가능
		System.out.println(fs);
	}
}
