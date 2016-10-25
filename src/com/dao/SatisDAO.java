package com.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.model.Satis;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

public class SatisDAO {
	private static Connection con = null;
	private static PreparedStatement psmt = null;
	private static ResultSet rs = null;

	public static ArrayList<Satis> tumSatislariGetir() throws SQLException {
		ArrayList<Satis> tumSatislar = new ArrayList<Satis>();
		try {
			con = ConnectionDAO.getConnection();
			psmt = (PreparedStatement) con.prepareStatement("Select * from Satis;");
			rs = psmt.executeQuery();
			while (rs.next()) {
				Satis satis = new Satis();
				satis.setSatisID(rs.getInt(1));
				satis.setUrunID(rs.getInt(2));
				satis.setUserID(rs.getInt(3));
				satis.setSatisTarih(rs.getString(4));
				satis.setAdet(rs.getInt(5));
				tumSatislar.add(satis);
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
		return tumSatislar;
	}
}
