package report.kimdongkyu.roo13;

public interface InterfaceExam {

	int a = 1;// interface 무조건 final
	/*
	 * public int getInt (){ // interface에서는 정의만 가능 // return 0; }
	 */

	public String getString(); //

	public void setString(String str); // 안에다가 어떤 것도 집어 넣을 수 없음

	/*public InterfaceExam(){ // 안에 아무것도 없음. 생성자가 있을 필요가 없음.
		
	}*/
	
	//인터페이스는 다중상속이 가능함
	
	public int cal(int a, int b);

	
}
