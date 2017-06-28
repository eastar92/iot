package common;

public class ExamA {

	public static void main(String[] args) {

		DBConn dbc = new DBConn();
		dbc.a = 3;
		System.out.println(dbc.a);
		System.out.println(DBConn.a);
		DBConn.a = 4;
		System.out.println(dbc.a);
		dbc = new DBConn(); // 새로 지정하면 다시 a=1로 초기화가 된다??
		System.out.println(dbc.a); // static는 다시 초기화되지 않는다!
		// 한번 바뀌면 이 시스템 안에서 관련된 모든 것들 다 바뀐다.

	}
}
