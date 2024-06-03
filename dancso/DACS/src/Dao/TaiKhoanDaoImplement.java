/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

/**
 *
 * @author phamn
 */

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import Dao.TaiKhoanDao.TaiKhoanDAO;
import Model.TheMuon;
import Model.User;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public abstract class TaiKhoanDaoImplement implements TaiKhoanDAO{
    
//  @Override
//    public List<User> getList() {
//    List<User> list = new ArrayList<>();
//
//        try (Connection connection = DBconnection.getConnection()) {
//            String sql = "SELECT * FROM cuoiky1.tai_khoan";
//            try (PreparedStatement ps = connection.prepareStatement(sql);
//                 ResultSet rs = ps.executeQuery()) {
//
//                while (rs.next()) {
////                    TheMuon muon = new TheMuon();
////                    muon.setMaThe(rs.getInt("MaThe"));
////                    muon.setTenNguoiMuon(rs.getString("TenNguoiMuon"));
////                    muon.setSosachdamuon(rs.getInt("SoSachDaMuon"));
////                    muon.setSosachdatra(rs.getInt("SoSachDaTra"));
////                    muon.setGioiTinh(rs.getBoolean("GioiTinh"));
////                    muon.setNgaySinh(rs.getDate("NgaySinh"));
////                    list.add(muon);
//                      User taiKhoan = new User();
//	                
//	                taiKhoan.setName(rs.getString("Ho Ten"));
//	              
//	                taiKhoan.setPass(rs.getString("Password"));
//                        taiKhoan.setUser(rs.getString("User"));
//                        taiKhoan.setMail(rs.getString("Mail"));
//                        taiKhoan.setTinh_trang(rs.getBoolean("Tinh_Trang"));
//                        list.add(taiKhoan);
//                }
//            }
//
//        } catch (SQLException ex) {
//            ex.printStackTrace();
//            System.out.println("Dao.TheMuonDaoimplements.getList()");
//        }
//
//        return list;
//    }

	public User login(String User, String Password) {
		Connection connection =DBconnection.getConnection();
		 String sql = "SELECT * FROM dacs.tai_khoan WHERE User LIKE ? AND Password LIKE ?";
	        User taiKhoan = null;
	        try {
	            PreparedStatement ps = (PreparedStatement) connection.prepareStatement(sql);
	            ps.setString(1, User);
	            ps.setString(2, Password );
	            ResultSet rs = ps.executeQuery();
	            if (rs.next()) {
	                 taiKhoan = new User();
	                
	                taiKhoan.setName(rs.getString("Ho Ten"));
	              
	                taiKhoan.setPass(rs.getString("Password"));
                         taiKhoan.setUser(rs.getString("User"));
                        taiKhoan.setMail(rs.getString("Mail"));
                        taiKhoan.setTinh_trang(rs.getBoolean("Tinh_Trang"));
	                
	                
	            }
	            ps.close();
	            connection.close();
	            return taiKhoan;
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
		return null;
	}
//     INSERT INTO `cuoiky1`.`tai_khoan` (`User`, `Password`, `Ho Ten`, `Mail`, `Tinh_Trang`) VALUES ('1', '2', '3', '4', '1');
         public int dangky(User user) {
        try {
            Connection connection = DBconnection.getConnection(); 

            String sql =  "INSERT INTO dacs.tai_khoan(`User`, `Password`, `Ho Ten`, `Mail`, `Tinh_Trang`) "
                       + "VALUES (?, ?, ?, ?, ?);  ";

            // Specify RETURN_GENERATED_KEYS
            PreparedStatement ps = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setString(1, user.getUser());
            ps.setString(2, user.getPass());
            ps.setString(3, user.getName());
            ps.setString(4, user.getMail());
            ps.setInt(5, 1);

            // Execute update
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
                        System.out.println("kkiki");

        }
        
        return 0;
    }
         public boolean isUsernameTaken(User user) {
    boolean isTaken = false;
    Connection conn = null;
    PreparedStatement pstmt = null;
    ResultSet rs = null;

    try {
       Connection connection = DBconnection.getConnection(); 
        pstmt = connection.prepareStatement("SELECT * FROM tai_khoan WHERE User = ?");
        pstmt.setString(1, user.getUser());
        rs = pstmt.executeQuery();

        if (rs.next()) {
            isTaken = true;
        }
    } catch (SQLException ex) {
        ex.printStackTrace();
    } finally {
        try {
            if (rs != null) rs.close();
            if (pstmt != null) pstmt.close();
            if (conn != null) conn.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    return isTaken;
}
	

}