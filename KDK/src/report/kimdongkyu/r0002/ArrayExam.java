package report.kimdongkyu.r0002;


public class ArrayExam {

	public void printMultipleTable(int[] a, int[] b) {

		for (int i = 0; i < a.length; i++) {
			int c = 0;

			for (c = 0; c < b.length-1; c++) {
				System.out.print(a[c] + " X " + b[i] + " = " + a[c] * b[i] + ",");
			}
			
			System.out.println(a[c] + " X " + b[i] + " = " + (a[c] * b[i]));

		}
	}

	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int[] b = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		// System.out.println("a의 길이 = " + a.length);
		// System.out.println("b의 길이 = " + b.length);


		ArrayExam t = new ArrayExam();
		t.printMultipleTable(a, b);
	}

}
