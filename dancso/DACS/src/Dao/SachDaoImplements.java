/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import Model.Book_Model;
import Model.TheMuon;

public class SachDaoImplements  implements SachDao{

	@Override
	public List<Book_Model> getList() {
		 List<Book_Model> list = new ArrayList<>();

	        try (Connection connection = DBconnection.getConnection()) {
	            String sql = "SELECT * FROM dacs.qlsach";
	            try (PreparedStatement ps = connection.prepareStatement(sql);
	                 ResultSet rs = ps.executeQuery()) {

	                while (rs.next()) {
	                	Book_Model sach = new Book_Model();
	                	sach.setMaSach(rs.getString("MaSach"));
	                	sach.setTen(rs.getString("TenSach"));
	                	sach.setTacgia(rs.getString("TenTacGia"));
	                	sach.setTheloai(rs.getString("TheLoai"));
	                	sach.setSoluong(rs.getInt("SoLuong"));
	                	sach.setGia(rs.getDouble("GiaTien"));
                                sach.setID(rs.getInt("ID"));
	                    list.add(sach);
	                }
	            }

	        } catch (SQLException ex) {
	            ex.printStackTrace();
	        }

	        return list;
		
	}


	@Override
	public int createOrUpdate(Book_Model sach) {
	    try {
	        Connection connection = DBconnection.getConnection();

	        String sql = 
"INSERT INTO `dacs`.`qlsach` (`MaSach`, `TenSach`, `TenTacGia`, `TheLoai`, `SoLuong`, `GiaTien`,`ID`) "
+ "VALUES (?, ?, ?, ?, ?, ?,?) "
+ "ON DUPLICATE KEY UPDATE MaSach = VALUES(MaSach), TenSach = VALUES(TenSach), TenTacGia = VALUES(TenTacGia), TheLoai = VALUES(TheLoai), SoLuong = VALUES(SoLuong), GiaTien = VALUES(GiaTien)";


	        PreparedStatement ps = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

	        ps.setString(1, sach.getMaSach());
	        ps.setString(2, sach.getTen());
	        ps.setString(3, sach.getTacgia());
	        ps.setString(4, sach.getTheloai());
	        ps.setInt(5, sach.getSoluong());
	        ps.setDouble(6, sach.getGia());
                ps.setInt(7, sach.getID());
	        ps.execute();

	        ResultSet rs = ps.getGeneratedKeys();
	        int generatedKey = 0;

	        if (rs.next()) {
	            generatedKey = rs.getInt(1);
	        }

	        rs.close();
	        ps.close();
	        connection.close();

	        return generatedKey;
	    } catch (SQLException ex) {
	        ex.printStackTrace();
                System.out.println("Dao.Sach");
	    }

	    return 0;
	}

	
	 

	@Override
	public int delete(Book_Model sach) {
		// TODO Auto-generated method stubtry {
        Connection connection = DBconnection.getConnection();
        String sql = "DELETE FROM `dacs`.`qlsach` WHERE (`MaSach` = ?)";

        System.out.println(sql);

        try (PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setString(1, sach.getMaSach());  // Assuming MaThe is a string, adjust accordingly
            int rowsAffected = ps.executeUpdate();
            System.out.println("Số hàng bị ảnh hưởng: " + rowsAffected);
            return rowsAffected;
        }
   catch ( SQLException e) {
	// TODO: handle exception
	   e.printStackTrace();
}
		return 0;
	}



}

