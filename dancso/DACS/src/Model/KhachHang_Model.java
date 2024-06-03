/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
    
import java.util.Date;

public class KhachHang_Model {
    int ID;
    String ten, cccd, email, sdt;
    private boolean gioitinh;
    private Date ngaysinh;

    public KhachHang_Model(int ID, String ten, String cccd, String email, String sdt, Date ngaysinh,boolean gioitinh) {
        super();
        this.ID = ID;
        this.ten = ten;
        this.cccd = cccd;
        this.email = email;
        this.sdt = sdt;
        ngaysinh = ngaysinh;
        gioitinh = gioitinh;
    }

    public KhachHang_Model() {
        super();
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getCccd() {
        return cccd;
    }

    public void setCccd(String cccd) {
        this.cccd = cccd;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

 
    public boolean isGioitinh() {
		return gioitinh;
	}
	public void setGioitinh(boolean gioiTinh) {
		gioitinh = gioiTinh;
	}

    public Date getNgaysinh() {
		return ngaysinh;
	}
	public void setNgaysinh(Date ngaySinh) {
		ngaysinh = ngaySinh;
	}

    @Override
    public String toString() {
        return "KhachHang_Model{" + "ID=" + ID + ", ten=" + ten + ", cccd=" + cccd + ", email=" + email + ", sdt=" + sdt + ", gioitinh=" + gioitinh + ", ngaysinh=" + ngaysinh + '}';
    }

  public void setNgaySinh(long time) {
		// TODO Auto-generated method stub
		
	}
    
}
