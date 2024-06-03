/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import Controller.classFormat;
import Model.KhachHang_Model;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import service.KHServiceiplm;
import java.util.Date;

public class KHDaoImplements  implements KHDao{

	@Override
	public List<KhachHang_Model> getList() {
		 List<KhachHang_Model> list = new ArrayList<>();

	        try (Connection connection = DBconnection.getConnection()) {
	            String sql = "SELECT * FROM dacs.qluser";
	            try (PreparedStatement ps = connection.prepareStatement(sql);
	                 ResultSet rs = ps.executeQuery()) {

	                while (rs.next()) {
	                	KhachHang_Model kh = new KhachHang_Model();
	                	kh.setID(rs.getInt("ID"));
	                	kh.setTen(rs.getString("Ten"));
	                	kh.setCccd(rs.getString("CCCD"));
	                	kh.setSdt(rs.getString("SDT"));
	                	kh.setEmail(rs.getString("Email"));
                                kh.setNgaysinh(rs.getDate("NgaySinh"));
	                	kh.setGioitinh(rs.getBoolean("GioiTinh"));
                                
	                    list.add(kh);
	                }
	            }

	        } catch (SQLException ex) {
	            ex.printStackTrace();
	        }

	        return list;
		
	}


	@Override
	public int createOrUpdate(KhachHang_Model kh) {
	    try {
	        Connection connection = DBconnection.getConnection();

	        String sql = "INSERT INTO `dacs`.`qluser` (`ID`, `Ten`, `CCCD`, `SDT`, `Email`, `NgaySinh`, `GioiTinh`)"
	                    + "VALUES (?,?,?,?,?,?,?) "
	                    + "ON DUPLICATE KEY UPDATE ID = VALUES(ID), Ten = VALUES(Ten), CCCD = VALUES(CCCD), SDT = VALUES(SDT), Email = VALUES(Email), NgaySinh = VALUES(NgaySinh), GioiTinh = VALUES(GioiTinh);";    
                     

	        PreparedStatement ps = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

	        ps.setInt(1, kh.getID());
	        ps.setString(2, kh.getTen());
	        ps.setString(3, kh.getCccd());
	        ps.setString(4, kh.getSdt());
	        ps.setString(5, kh.getEmail());
	        ps.setDate(6, new java.sql.Date(kh.getNgaysinh().getTime()));
//                ps.setDate(6,classFormat.covertDateToDateSql((Date) kh.getNgaysinh()));
                ps.setBoolean(7, kh.isGioitinh());
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
	    }

	    return 0;
	}

	
	 

	@Override
	public int delete(KhachHang_Model kh) {
		// TODO Auto-generated method stubtry {
        Connection connection = DBconnection.getConnection();
        String sql = "DELETE FROM `dacs`.`qluser` WHERE (`ID` = ?)";

        System.out.println(sql);

        try (PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setInt(1, kh.getID());  // Assuming MaThe is a string, adjust accordingly
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

