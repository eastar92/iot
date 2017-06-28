package report.kimdongkyu.r0002;


public class ArrayExam3 {

	public int[] getArrayVar(int initNum, int maxNum) {
		// initNum으로 시작해서 maxNum으로 종료되는 반복문을 사용하여
		// 배열변수 a 값을 집어넣고 a를 출력해
		// 단 출력은 main 함수에서 출력

		int[] a = new int[maxNum - initNum]; // []개의 방을 만들다

		for (int i = initNum - initNum; i < maxNum - initNum; i++) {
			a[i] = i + 1;
		}
		return a;

	}

	public static void main(String[] args) {
		ArrayExam3 a3 = new ArrayExam3();
			
		int[] a = a3.getArrayVar(0, 5);
		
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

	}

}
