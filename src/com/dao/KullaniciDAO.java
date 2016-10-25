package com.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.model.Kullanici;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

public class KullaniciDAO {
	private static Connection con = null;
	private static PreparedStatement psmt = null;
	private static ResultSet rs = null;

	public static ArrayList<Kullanici> tumKullanicileriGetir() throws SQLException {
		ArrayList<Kullanici> tumKullaniciler = new ArrayList<Kullanici>();
		try {
			con = ConnectionDAO.getConnection();
			psmt = (PreparedStatement) con.prepareStatement("Select * from Kullanici;");
			rs = psmt.executeQuery();
			while (rs.next()) {
				Kullanici kullanici = new Kullanici();
				kullanici.setUserID(rs.getInt(1));
				kullanici.setPassword(rs.getString(2));
				tumKullaniciler.add(kullanici);
			}
			con.close();
		} catch (SQLException ex) {
			ex.printStackTrace();
		} finally {
			try {
				con.close();
				psmt.close();
				rs.close();
			} catch (SQLException e) {

				e.printStackTrace();
			}
		}
		return tumKullaniciler;
	}
}
