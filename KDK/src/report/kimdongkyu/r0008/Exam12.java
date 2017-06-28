package report.kimdongkyu.r0008;

import report.kimdongkyu.r0007.Exam11;

public class Exam12 extends Exam11 {
	
	Exam12(int a, int b, String c){
		super(a,b,c);
//		this.a = a;
//		this.b = b;
//		if (c.equals("+")) {
//			plus();
//		} else if (c.equals("-")) {
//			minus();
//		} else if (c.equals("*")) {
//			multiple();
//		} else if (c.equals("/")) {
//			division();
//		} else {
//			System.out.println("틀렸어");
//		}
	}

	public static void main(String[] args) {
		Exam12 e12 = new Exam12(1,2,"+");
		e12.printResult();
	}
}
