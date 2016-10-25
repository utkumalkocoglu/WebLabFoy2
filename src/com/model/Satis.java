package com.model;

public class Satis {
	private int satisID;
	private int urunID;
	private int userID;
	private String satisTarih;
	private int adet;

	public Satis() {
		super();
	}

	public Satis(int satisID, int urunID, int userID, String satisTarih, int adet) {
		super();
		this.satisID = satisID;
		this.urunID = urunID;
		this.userID = userID;
		this.satisTarih = satisTarih;
		this.adet = adet;
	}

	public int getSatisID() {
		return satisID;
	}

	public void setSatisID(int satisID) {
		this.satisID = satisID;
	}

	public int getUrunID() {
		return urunID;
	}

	public void setUrunID(int urunID) {
		this.urunID = urunID;
	}

	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

	public String getSatisTarih() {
		return satisTarih;
	}

	public void setSatisTarih(String satisTarih) {
		this.satisTarih = satisTarih;
	}

	public int getAdet() {
		return adet;
	}

	public void setAdet(int adet) {
		this.adet = adet;
	}

}
