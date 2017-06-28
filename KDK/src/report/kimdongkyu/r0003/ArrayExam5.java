package report.kimdongkyu.r0003;

public class ArrayExam5 {
	public int checkNum(int[] a) {
		int random = (int) (Math.random() * 6) + 1;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == random) {
				random = (int) (Math.random() * 6) + 1;
				i = -1;
			}
		}
		return random;
	}

	public static void main(String[] args) {
		/*
		 * int[] a = new int[10];
		 * 
		 * // for (int i = 1; i <= 10; i++) { // a[i - 1] = 11 - i; // a[index]
		 * // System.out.println(a[i - 1]); }
		 */

		int[] lotte = new int[6];
		ArrayExam5 ae5 = new ArrayExam5();
		for (int i = 0; i < 6; i++) {
			lotte[i] = ae5.checkNum(lotte);
		}

		/*
		 * for (int i = 0; i < 6; i++) {
		 * 
		 * int random = (int) (Math.random() * 6) + 1;
		 *  lotte[i] = random;
		 * 
		 * for (int j = i; j >= 0; j--) {
		 *  if (j < 6 && lotte[j] == lotte[i] && i		 * != j) { 
		 *  j = 0; i--; } } }
		 */
		for (int i = 0; i < 6; i++) {
			System.out.println((i + 1) + "번째 로또번호는 : " + lotte[i]);
		}
	}
}
