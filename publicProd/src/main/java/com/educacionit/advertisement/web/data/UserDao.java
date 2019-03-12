package com.educacionit.advertisement.web.data;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class UserDao {

	private Connection conn;

	public UserDao(Connection conn) {
		this.conn = conn;
	}

	public User login(String email, String password) {
		User u = null;
		try {
			Statement st = this.conn.createStatement();
			ResultSet rs = st.executeQuery(
					"SELECT * FROM users where email = '" + email + "' and password = '" + password + "'");
			while (rs.next()) {
				u = new User(rs.getString("email"), rs.getString("password"), rs.getString("name"),
						rs.getString("last_name"));
				break;
			}

		} catch (Exception e) {
			throw new DataException(e);
		}
		return u;
	}

}
