<%@ page import="com.dao.*"%>
<%@ page import="com.model.*"%>
<%@ page import="java.util.ArrayList" %>
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Veritabanındaki veriler</title>
</head>
<body>
	<table>
		<thead>
			<tr>
				<th>Ürün Adı</th>
				<th>Açıklama</th>
				<th>Fiyat</th>
			</tr>
		</thead>
		<tbody>
			<% ArrayList<Urun> urunler = UrunDAO.tumUrunleriGetir();%>
			<% for(Urun urun: urunler){ %>
			<tr class="odd gradeX">
				<td><%=urun.getUrunAd() %></td>
				
				<td><%=urun.getUrunAciklama()%></td>
				<td><%=urun.getFiyat()%></td>
			</tr>
			<%} %>

		</tbody>
	</table>
	
	</br>
	<table>
		<thead>
			<tr>
				<th>Ürün id</th>
				<th>User id</th>
				<th>satisTarih</th>
				<th>satis_adet</th>
			</tr>
		</thead>
		<tbody>
			<% ArrayList<Satis> satislar = SatisDAO.tumSatislariGetir();%>
			<% for(Satis satis: satislar){ %>
			<tr class="odd gradeX">
				<td><%=satis.getUrunID() %></td>
				
				<td><%=satis.getUserID()%></td>
				<td><%=satis.getSatisTarih()%></td>
				<td class="center"><%=satis.getAdet()%></td>
			</tr>
			<%} %>

		</tbody>
	</table>
	</br>
	<table>
		<thead>
			<tr>
				<th>User id</th>
				<th>Password</th>
			</tr>
		</thead>
		<tbody>
			<% ArrayList<Kullanici> kullanicilar = KullaniciDAO.tumKullanicileriGetir();%>
			<% for(Kullanici kullanici: kullanicilar){ %>
			<tr class="odd gradeX">
				<td><%=kullanici.getUserID() %></td>
				
				<td><%=kullanici.getPassword()%></td>
			</tr>
			<%} %>

		</tbody>
	</table>


</body>
</html>