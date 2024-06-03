/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

public class Book_Model {
   int ID,soluong;
   double gia;
   String MaSach, ten, theloai, tacgia;
    public Book_Model(int ID, String MaSach, int soluong, double gia, String ten, String theloai, String tacgia) {
        this.ID = ID;
        this.MaSach = MaSach;
        this.soluong = soluong;
        this.gia = gia;
        this.ten = ten;
        this.theloai = theloai;
        this.tacgia = tacgia;
    }
    public Book_Model() {
    }
    
    public String getMaSach() {
        return MaSach;
    }

    public void setMaSach(String MaSach) {
        this.MaSach = MaSach;
    }

    public int getSoluong() {
        return soluong;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getTheloai() {
        return theloai;
    }

    public void setTheloai(String theloai) {
        this.theloai = theloai;
    }

    public String getTacgia() {
        return tacgia;
    }

    public void setTacgia(String tacgia) {
        this.tacgia = tacgia;
    }

    @Override
    public String toString() {
        return "Book_Model{" + "ID=" + ID + ", soluong=" + soluong + ", gia=" + gia + ", MaSach=" + MaSach + ", ten=" + ten + ", theloai=" + theloai + ", tacgia=" + tacgia + '}';
    }

  
}
