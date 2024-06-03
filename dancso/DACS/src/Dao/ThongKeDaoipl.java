package Dao;

import Model.Book_Model;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Model.Book_Model;
import Model.TheMuon;

public class ThongKeDaoipl implements ThongKeDao {
	  

	@Override
//	public List<TheMuon> getList() {
//		Connection connection =DBconnection.getConnection();
//		String sql ="SELECT sum(SoSachDaMuon) as\" SỐ Sách Đã Mượn\"  ,sum( SoSachDaTra) as\" SỐ Sách Đã Trả\"  from qlthemuon \r\n"
//				+ " ";
//		List <TheMuon> list =new ArrayList<>();
//		try {
//			PreparedStatement ps =(PreparedStatement) connection.prepareStatement(sql);
//			 ResultSet rs = ps.executeQuery();
//	            while (rs.next()) {
//	            	TheMuon theMuon =new TheMuon();
//	            	theMuon.setSosachdamuon(rs.getInt("SoSachDaMuon"));
//	            	theMuon.setSosachdatra(rs.getInt("SoSachDaTra"));
//	            	list.add(theMuon);
//	            	
//	            }
//	            ps.close();
//	            rs.close();
//	            connection.close();
//		} catch (Exception e) {
//			e.printStackTrace();
//			System.out.println(e.toString());
//		}
//		return null;
//	}
	public List<TheMuon> getList() {
	    Connection connection = DBconnection.getConnection();
	    String sql = "SELECT sum(SoSachDaMuon) as\" SỐ Sách Đã Mượn\" , sum(SoSachDaTra) as\" SỐ Sách Đã Trả\" from qlthemuon";
	    List<TheMuon> list = new ArrayList<>();

	    try (PreparedStatement ps = connection.prepareStatement(sql);
	         ResultSet rs = ps.executeQuery()) {

	        while (rs.next()) {
	            TheMuon theMuon = new TheMuon();
	            theMuon.setSosachdamuon(rs.getInt("SỐ Sách Đã Mượn"));
	            theMuon.setSosachdatra(rs.getInt("SỐ Sách Đã Trả"));
	            list.add(theMuon);
	        }

	    } catch (SQLException e) {
	        e.printStackTrace();
	        System.out.println(e.toString());
	    } 

	    return list;
	}

	@Override
	public List<Book_Model> getListSach() {
		
		   Connection connection = DBconnection.getConnection();
		    String sql = "SELECT TenSach,SoLuong FROM dacs.qlsach;";
		    List<Book_Model> listsach = new ArrayList<>();

		    try (PreparedStatement ps = connection.prepareStatement(sql);
		         ResultSet rs = ps.executeQuery()) {

		        while (rs.next()) {
		           Book_Model sach =new Book_Model();
		           sach.setTen(rs.getString("TenSach"));
	                sach.setSoluong(rs.getInt("SoLuong"));
		           listsach.add(sach);
		        }

		    } catch (SQLException e) {
		        e.printStackTrace();
		        System.out.println(e.toString()+"bin");
		    } finally {
		        try {
		            if (connection != null) {
		                connection.close();
		            }
		        } catch (SQLException e) {
		            e.printStackTrace();
		        }
		    }

		    return listsach;
		
	}
	


}

