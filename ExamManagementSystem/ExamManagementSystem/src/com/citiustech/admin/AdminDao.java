package com.citiustech.admin;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.citiustech.student.ConnectionProvider;

public class AdminDao {

	public static boolean validateAdmin(String username, String passwd) {
		// TODO Auto-generated method stub
		boolean flag = false;

		try {

			Connection con = ConnectionProvider.createConnection();
			String query = "select * from admin where username = ? and  password = ?";
			// System.out.println(query);
			// Statement stmt = con.createStatement();
			PreparedStatement pstmt = con.prepareStatement(query);

			pstmt.setString(1, username);
			pstmt.setString(2, passwd);

			ResultSet set = pstmt.executeQuery();

			while (set.next()) {
				flag = true;
				Admin.adminId=set.getInt(1);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return flag;
	}

}
