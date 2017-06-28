package report.kimdongkyu.r0002;



public class Test {

	public void printMultipleTable(int initNum, int maxNum) {

		for (int i = initNum; i <= maxNum; i++) {
			int a = initNum;

			for (a = initNum; a <= (maxNum-1); a++) {
				System.out.print(a + " X " + i + " = " + (a * i) + ",");
			}

			System.out.println(a + " X " + i + " = " + (a * i));
		}
	}

	public static void main(String[] args) {

		Test t1 = new Test();
		int num1 = 1;
		int num2 = 5;

		t1.printMultipleTable(num1, num2);
		
	
	}
}