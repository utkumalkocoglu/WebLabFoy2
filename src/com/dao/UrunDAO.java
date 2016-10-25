package com.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.model.Urun;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

public class UrunDAO {
	private static Connection con = null;
	private static PreparedStatement psmt = null;
	private static ResultSet rs = null;

	public static ArrayList<Urun> tumUrunleriGetir() throws SQLException {
		ArrayList<Urun> tumUrunler = new ArrayList<Urun>();
		try {
			con = ConnectionDAO.getConnection();
			psmt = (PreparedStatement) con.prepareStatement("Select * from Urun;");
			rs = psmt.executeQuery();
			while (rs.next()) {
				Urun urun = new Urun();
				urun.setUrunID(rs.getInt(1));
				urun.setUrunAd(rs.getString(2));
				urun.setUrunAciklama(rs.getString(3));
				urun.setFiyat(rs.getInt(4));
				tumUrunler.add(urun);
				System.out.println(urun.getUrunAciklama());
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
		return tumUrunler;
	}
}
