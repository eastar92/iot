package report.kimdongkyu.r0004;

public class Exam3 {
	int a = 0;
	
	//오버로딩 print(), print(int a)는 서로 다른함수다.
	//생성자는 첫 시작이 대문자. int, void가 없음. 타입이 다르면 계속 생성할 수 있다.
	public Exam3(){
		
	}
	public Exam3(int a){
		a = a; // 여기 안에 있는 a
		this.a = a; // 밖에 있는 class의 a
		
	}
	public void printA(){
		
	}
	public void printA(int a){
		
	}
	public static void main(String[] args){
		Exam3 e = new Exam3();
		System.out.println(e.a);
		int a = 4;
		System.out.println(a);
		
	}
}
