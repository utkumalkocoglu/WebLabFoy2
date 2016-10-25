package com.model;

public class Urun {
	private int urunID;
	private String urunAd;
	private String urunAciklama;
	private int fiyat;

	public Urun() {
		super();
	}

	public Urun(int urunID, String urunAd, String urunAciklama, int fiyat) {
		super();
		this.urunID = urunID;
		this.urunAd = urunAd;
		this.urunAciklama = urunAciklama;
		this.fiyat = fiyat;
	}

	public int getUrunID() {
		return urunID;
	}

	public void setUrunID(int urunID) {
		this.urunID = urunID;
	}

	public String getUrunAd() {
		return urunAd;
	}

	public void setUrunAd(String urunAd) {
		this.urunAd = urunAd;
	}

	public String getUrunAciklama() {
		return urunAciklama;
	}

	public void setUrunAciklama(String urunAciklama) {
		this.urunAciklama = urunAciklama;
	}

	public int getFiyat() {
		return fiyat;
	}

	public void setFiyat(int fiyat) {
		this.fiyat = fiyat;
	}

}
