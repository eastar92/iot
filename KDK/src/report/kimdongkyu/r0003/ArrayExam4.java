package report.kimdongkyu.r0003;

public class ArrayExam4 {

	public static void main(String[] args) {
		// 메인메소드
		// 반복문 1부터 10까지
		// 2의 배수가 10개 찍히게 2,4,6,,,20
		// 100개의 자리수를 가지고 있는 인트형 배열변수를 만들어주세요
		// 위에 작성 반복문에서 배열변수에 값을 넣어주는데 2의 배수가 들어가게 만들어주세요.
		// 2,4,6,8,10,12...
		int[] a = new int[10];

		for (int i = 1; i <= 10; i++) { 
			a[10 - i] = i * 2;
		}
		for (int i = 1; i <= 10; i++) {
			System.out.println(a[i - 1]);
		}
	}

}
