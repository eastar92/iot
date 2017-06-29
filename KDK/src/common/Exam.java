package common;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Exam {
	public List<?> doSelect(){ // <?> 물음표는 아무거나 써도 
		return null;
	}

	public List<String> getUserIDLists(String name) {
		// String result = "";
		List<String> userlist = new ArrayList<String>();
		try {
			Connection con = DBConn2.getCon();
			String sql = "select * from user";
			if (!name.equals("")) {
				sql += " where name = ?";
			}
			PreparedStatement prestmt = con.prepareStatement(sql); // sql 하얀 화면
																	// //나와 연결한
																	// con과 통화
			if (!name.equals("")) {
				prestmt.setString(1, name);
			}
			ResultSet rs = prestmt.executeQuery(); // F9나온 상태. 나오기 전. 나온걸 rs에 저장
			while (rs.next()) {
				userlist.add(rs.getString(1) + ',' + rs.getString(2) + ',' + rs.getString(3) + ',' + rs.getString(4)+ ',' + rs.getString(5)); // 0번째가
				// 아니라
				// 1번째부터
				// rs.getString(1)+','+rs.getString(2)+','+rs.getString(3) ===>
				// test, test , 홍길동
			}
			DBConn2.closeCon(); // 다하면 전화를 끊어야함
			return userlist; // 리스트를 보냄
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public boolean insertUser() {
		try {
			Scanner scan = new Scanner(System.in);
			HashMap<String, String> valueHm = new HashMap<String,String>();
			valueHm.put("id", scan.nextLine());
			valueHm.put("pwd", scan.nextLine());
			valueHm.put("name", scan.nextLine());
			valueHm.put("age", scan.nextLine());
			
			Connection con = DBConn2.getCon();
			String sql = "insert into user(id, pwd, name, age)values(?,?,?,?)"; // 입력할거야
			PreparedStatement prestmt = con.prepareStatement(sql);
			prestmt.setString(1,valueHm.get("id"));
			prestmt.setString(2,valueHm.get("pwd"));
			prestmt.setString(3,valueHm.get("name"));
			prestmt.setString(4,valueHm.get("age"));
			
			int result = prestmt.executeUpdate(); // 몇개의 로우에 영향을 미치나? -> 하나. ->
													// result = 1;
			DBConn2.closeCon();
			if (result == 1) {
				return true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	public boolean deleteUser(int num) {
		try {
			Connection con = DBConn2.getCon();
			String sql = "delete from user  where num =" + num;
			PreparedStatement prestmt = con.prepareStatement(sql);
			int result = prestmt.executeUpdate();
			DBConn2.closeCon();
			if (result > 0) {
				return true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	public static void main(String[] args) {
		Exam e = new Exam();
		if(e.insertUser()){
			System.out.println("유저에 들어갔다");
		}
		
		boolean isDel = e.deleteUser(21);
		if (isDel) {
			System.out.println("삭제되었다");
			
		}
		List<String> userList = e.getUserIDLists("");
		for (int i = 0; i < userList.size(); i++) {
			System.out.println(userList.get(i));
		}

		
	}
}
