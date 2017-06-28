package report.kimdongkyu.r0005;

public class Robot {
	String name;
	int age;

	public Robot(String name, int age) {
		this.name = name;
		this.age = age;

	}

	void doKick() {
		System.out.println(age + "살 " + name + "이가 발차기를 하다.");
	}

	void doRun() {
		System.out.println(age + "살 " + name + "이가 달리기를 하다.");
	}

	void doChange() {
		System.out.println(age + "살 " + name + "이가 변신을 하다.");
	}

	public static void main(String[] args) {

		Robot r = new Robot("지로봇", 4);
		r.doKick();
		r.doRun();
		r.doChange();
	}
}
