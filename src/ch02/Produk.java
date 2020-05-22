package ch02;

import java.util.Date;

public class Produk{
	String barcode;
	String nama;
	Date tanggalkedaluarsa;
	double harga;
	
	public String getBarcode(){
		return barcode;
	}
	
	public String getNama(){
		return nama;
	}
	
	public Date getTanggalkedaluarsa(){
		return tanggalkedaluarsa;
	}
	
	public double getHarga(){
		return harga;
	}
}