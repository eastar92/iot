package com.test.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.HashMap;

import com.test.common.DBConn2;

public class UserService {
	Connection con = null;
	PreparedStatement ps = null;

	public boolean insertUser(HashMap<String, String> hm) {

		try {
			con = DBConn2.getCon();
			String sql = "insert into user_info(user_id, user_pwd, user_name, class_name,age)";
			sql += "values(?,?,?,?,?)";

			ps = con.prepareStatement(sql);
			ps.setString(1, hm.get("id"));
			ps.setString(2, hm.get("pwd"));
			ps.setString(3, hm.get("name"));
			ps.setString(4, hm.get("class_num"));
			ps.setString(5, hm.get("age"));
			int result = ps.executeUpdate();
			if (result == 1) {
				con.commit();
				return true;
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				ps.close();
				DBConn2.closeCon();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return false;
	}

	public boolean deleteUser(String user_num) {
		try {
			String sql = "delete from user_info where num = ?";
			con = DBConn2.getCon();
			ps = con.prepareStatement(sql);
			ps.setString(1, user_num);

			int result = ps.executeUpdate();
			if (result == 1) {
				con.commit();
				return true;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				ps.close();
				DBConn2.closeCon();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return false;
	}

	public boolean updateUser() {
		try {
			String sql = "update user_info set user_name = '홍길동' where num = 1";
			con = DBConn2.getCon();
			ps = con.prepareStatement(sql);
			// ps.setString();

			int result = ps.executeUpdate();
			if (result == 1) {
				con.commit();
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				ps.close();
				DBConn2.closeCon();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return false;

	}
}
