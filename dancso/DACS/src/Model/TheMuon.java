/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;


import java.util.Date;

public class TheMuon {
	private int MaThe;
	private String TenNguoiMuon ;
	private int sosachdamuon;
	private int sosachdatra;
	private boolean GioiTinh;
	private Date NgaySinh;
	public TheMuon(int maThe, String tenNguoiMuon, int sosachdamuon, int sosachdatra, boolean gioiTinh, Date ngaySinh) {
		super();
		MaThe = maThe;
		TenNguoiMuon = tenNguoiMuon;
		this.sosachdamuon = sosachdamuon;
		this.sosachdatra = sosachdatra;
		GioiTinh = gioiTinh;
		NgaySinh = ngaySinh;
	}
	public TheMuon() {
		super();
	}
	public int getMaThe() {
		return MaThe;
	}
	public void setMaThe(int maThe) {
		MaThe = maThe;
	}
	public String getTenNguoiMuon() {
		return TenNguoiMuon;
	}
	public void setTenNguoiMuon(String tenNguoiMuon) {
		TenNguoiMuon = tenNguoiMuon;
	}
	public int getSosachdamuon() {
		return sosachdamuon;
	}
	public void setSosachdamuon(int sosachdamuon) {
		this.sosachdamuon = sosachdamuon;
	}
	public int getSosachdatra() {
		return sosachdatra;
	}
	public void setSosachdatra(int sosachdatra) {
		this.sosachdatra = sosachdatra;
	}
	public boolean isGioiTinh() {
		return GioiTinh;
	}
	public void setGioiTinh(boolean gioiTinh) {
		GioiTinh = gioiTinh;
	}
	public Date getNgaySinh() {
		return NgaySinh;
	}
	public void setNgaySinh(Date ngaySinh) {
		NgaySinh = ngaySinh;
	}
	@Override
	public String toString() {
		return "TheMuon MaThe=" + MaThe + ", TenNguoiMuon=" + TenNguoiMuon + ", sosachdamuon=" + sosachdamuon
				+ ", sosachdatra=" + sosachdatra + ", GioiTinh=" + GioiTinh + ", NgaySinh=" + NgaySinh + "";
	}
	public void setNgaySinh(long time) {
		// TODO Auto-generated method stub
		
	}
	
	
}
