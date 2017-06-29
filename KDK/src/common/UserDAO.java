package common;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class UserDAO {

	List<HashMap> userlist = new ArrayList<HashMap>();
	public List<HashMap> doSelect(String sql) {
		try {
			Connection con = DBConn2.getCon();
			PreparedStatement prestmt = con.prepareStatement(sql);
			ResultSet rs = prestmt.executeQuery();
			ResultSetMetaData rsmd = rs.getMetaData(); // num id pwd name age를
														// 배열처럼 갖고 있는것
			System.out.println("첫번째 정보는 " + rsmd.getColumnName(1)); // 첫번째 정보는
																	// num
			System.out.println("컬럼 갯수는 " + rsmd.getColumnCount()); // 컬럼 갯수를 카운트
			while (rs.next()) {
				HashMap hm = new HashMap();
				int colCount = rsmd.getColumnCount();
				for (int i = 1; i <= colCount; i++) {
					String colName = rsmd.getColumnName(i);
					hm.put(colName, rs.getString(colName));
				}
				userlist.add(hm);
			}
			DBConn2.closeCon();
			return userlist;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public List<HashMap> doInsert(String sql) {
		try{
		Scanner scan = new Scanner(System.in);
		HashMap<String, String> hm = new HashMap<String,String>();
		hm.put("id", scan.nextLine());
		hm.put("pwd", scan.nextLine());
		hm.put("name", scan.nextLine());
		hm.put("age", scan.nextLine());
		hm.put("class_num", scan.nextLine());
		Connection con = DBConn2.getCon();
		PreparedStatement prestmt = con.prepareStatement(sql);
		prestmt.setString(1, hm.get("id"));
		prestmt.setString(2, hm.get("pwd"));
		prestmt.setString(3, hm.get("name"));
		prestmt.setString(4, hm.get("age"));
		prestmt.setString(5, hm.get("class_num"));
		userlist.add(hm);
		int result = prestmt.executeUpdate();
		DBConn2.closeCon();
		if(result == 1){
			return userlist;
		}
	}catch(Exception e){
		e.printStackTrace();
	}
		return null;
	}

	public static void main(String[] args) {
		UserDAO ud = new UserDAO();
		String sql = "select num, id, pwd, name, age, class_num from user_info";
		List<HashMap> userList = ud.doSelect(sql);
		/*System.out.println("유저 리스트 >> " + userList);
		sql = "select num ,id, pwd, name, age from user_info";
		userList = ud.doSelect(sql);
		System.out.println("유저 인포리스트>> " + userList);*/

		sql = "insert into user_info(id, pwd, name, age,class_num) values  (?,?,?,?,?);";
		userList = ud.doInsert(sql);
		for(int i = 0; i <= userList.size(); i++){
			System.out.println(userList.get(i));
		}
	}

}
