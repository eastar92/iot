package report.kimdongkyu.r0004;


public class Exam2 {

	public static void main(String[] args) {
		// 결과값 a[0] = 1, a[1] =2, a[2]=3,a[3]=4,a[4]=5
		int[] a = new int[5];
		for (int i = 0; i < 5; i++) {
			a[i] = i + 1;
		}
		for (int i = 0; i < 5; i++) {
			System.out.print("a[" + i + "]=" + a[i] + ", ");
		}
	}
}
