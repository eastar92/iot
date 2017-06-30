package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import common.DBConn2;

public class TestDAO {

	List<Map> userlist = new ArrayList<Map>();

	public boolean insertTest(String sql) {
		try {
			Scanner scan = new Scanner(System.in);
			HashMap<String, String> hm = new HashMap<String, String>();
			hm.put("num", scan.nextLine());
			hm.put("title", scan.nextLine());
			hm.put("content", scan.nextLine());
			hm.put("writer", scan.nextLine());
			//hm.put("reg_date", scan.nextLine());
			Connection con = DBConn2.getCon();
			PreparedStatement prestmt = con.prepareStatement(sql);
			prestmt.setString(1, hm.get("num"));
			prestmt.setString(2, hm.get("title"));
			prestmt.setString(3, hm.get("content"));
			prestmt.setString(4, hm.get("writer"));
			//prestmt.setString(5, hm.get("reg_date"));
			userlist.add(hm);
			int result = prestmt.executeUpdate();
			DBConn2.closeCon();
			if (result == 1) {
				return true;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	public List<Map> selectTest(String sql) {
		try {
			Connection con = DBConn2.getCon();
			PreparedStatement prestmt = con.prepareStatement(sql);
			ResultSet rs = prestmt.executeQuery();
			ResultSetMetaData rsmd = rs.getMetaData();
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

	public boolean updateTest() {
		return true;
	}

	public boolean deleteTest() {
		return true;
	}

	public static void main(String[] args) {
		TestDAO td = new TestDAO();
		String sql = "select num, title, content,writer,reg_date from test";
		List<Map> userList = td.selectTest(sql);
		System.out.println("유저리스트 =>> " + userList);

		sql = "insert into test(num, title, content, writer,reg_date) values (?,?,?,?,now());";
		td.insertTest(sql);
		for (int i = 0; i < userList.size(); i++) {
			System.out.println(userList.get(i));
		}
	}
}
