package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import common.DBConn2;

public class TestDAO_Ans {

	public boolean insertTest() {
		try {
			String writer = "6";
			Connection con = DBConn2.getCon();
			String sql = "select * from user_info where num=" + writer;
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				sql = "insert into test(num, title, content, writer, reg_date)";
				sql += "values (?,?,?,?,?)";
				ps = con.prepareStatement(sql);
				ps.setString(1, "6");
				ps.setString(2, "게시물6");
				ps.setString(3, "내용6");
				ps.setString(4, writer);
				Date d = new Date();
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
				ps.setString(5, sdf.format(d));
				int result = ps.executeUpdate();
				if (result == 1) {

					return true;
				}
			} else {
				System.out.println(writer + "번호를 가진 사람이 user_info 테이블에 읎다");
				return false;
			}
			DBConn2.closeCon();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	public List<Map> selectTest() {
		List<Map> testList = new ArrayList<Map>();
		try {
			Connection con = DBConn2.getCon();

			String sql = "select te.*, ui.id, ui.name from user_info as ui ,test as te";
			sql += " where te.writer = ui.num;";

			PreparedStatement ps = con.prepareStatement(sql);

			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Map hm = new HashMap();
				hm.put("num", rs.getString("num"));
				hm.put("title", rs.getString("title"));
				hm.put("content", rs.getString("content"));
				hm.put("writer", rs.getString("writer"));
				hm.put("reg_date", rs.getString("reg_date"));
				hm.put("id", rs.getString("id"));
				hm.put("name", rs.getString("name"));
				testList.add(hm);
			}
			DBConn2.closeCon();
			return testList;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public boolean updateTest() {
		return true;
	}

	public boolean deleteTest(int num) {
		try {
			Connection con = DBConn2.getCon();
			String sql = "select from test where num = " + num;
			PreparedStatement prestmt = con.prepareStatement(sql);
			ResultSet rs = prestmt.executeQuery();
			if (rs.next()) {
				sql = "(select * from user_info where num= )" + num;
				sql += "(select writer from test where num = )";
				int result = prestmt.executeUpdate();
				if (result == 1) {
					System.out.println("못지워");
					return false;
				}
			} else {
				return true;
			}
			DBConn2.closeCon();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	public static void main(String[] args) {
		TestDAO_Ans tdao = new TestDAO_Ans();
		if (tdao.insertTest()) {
			System.out.println("테스트에 입력 되었습니다.");
		}
		System.out.println("");

		tdao.deleteTest(2);

		System.out.println("");
		System.out.println("");
		List<Map> list = tdao.selectTest();
		for (Map m : list) {
			System.out.println(m);
		}

	}
}
