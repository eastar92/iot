package report.kimdongkyu.r0003;

public class ArrayExam6 {

	// public int[] getArrVar(int length, int initNum, int maxNum) {
	public int[] getArrVar(int[] params) {
		int[] a = new int[params[0]];
		for (int i = params[1]; i <= params[2]; i++) {
			a[i] = (i + 1) * 2;
		}
		return a;
	}// public int -> return 으로 메인에서 받을 수 있음

	public void printArrVar(int[] a) {
		for (int i = 1; i <= 10; i++) {

			System.out.println(a[i - 1]);
		} // void -> return이 없음. 실행하고 그냥 끝
	}

	public static void main(String[] args) {
		ArrayExam6 a6 = new ArrayExam6();
		int[] params = { 10, 0, 9 };
		int[] a = a6.getArrVar(params);
		a6.printArrVar(a);

	}
}
