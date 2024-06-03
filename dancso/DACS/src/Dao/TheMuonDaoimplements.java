package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import Model.TheMuon;

public class TheMuonDaoimplements implements TheMuonDao {

    @Override
    public List<TheMuon> getList() {
    List<TheMuon> list = new ArrayList<>();

        try (Connection connection = DBconnection.getConnection()) {
            String sql = "SELECT * FROM dacs.qlthemuon";
            try (PreparedStatement ps = connection.prepareStatement(sql);
                 ResultSet rs = ps.executeQuery()) {

                while (rs.next()) {
                    TheMuon muon = new TheMuon();
                    muon.setMaThe(rs.getInt("MaThe"));
                    muon.setTenNguoiMuon(rs.getString("TenNguoiMuon"));
                    muon.setSosachdamuon(rs.getInt("SoSachDaMuon"));
                    muon.setSosachdatra(rs.getInt("SoSachDaTra"));
                    muon.setGioiTinh(rs.getBoolean("GioiTinh"));
                    muon.setNgaySinh(rs.getDate("NgaySinh"));
                    list.add(muon);
                }
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
            System.out.println("Dao.TheMuonDaoimplements.getList()");
        }

        return list;
    }


    @Override
    public int createOrUpdate(TheMuon theMuon) {
        try {
            Connection connection = DBconnection.getConnection(); 

            String sql = "INSERT INTO dacs.qlthemuon(`MaThe`, `TenNguoiMuon`, `SoSachDaMuon`, `SoSachDaTra`, `GioiTinh`, `NgaySinh`) "
                       + "VALUES (?, ?, ?, ?, ?, ?) "
                       + "ON DUPLICATE KEY UPDATE MaThe = VALUES(MaThe), TenNguoiMuon = VALUES(TenNguoiMuon), "
                       + "SoSachDaMuon = VALUES(SoSachDaMuon), SoSachDaTra = VALUES(SoSachDaTra), "
                       + "GioiTinh = VALUES(GioiTinh), NgaySinh = VALUES(NgaySinh);";

            // Specify RETURN_GENERATED_KEYS
            PreparedStatement ps = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setInt(1, theMuon.getMaThe());
            ps.setString(2, theMuon.getTenNguoiMuon());
            ps.setInt(3, theMuon.getSosachdamuon());
            ps.setInt(4, theMuon.getSosachdatra());
            ps.setBoolean(5, theMuon.isGioiTinh());
            ps.setDate(6, new java.sql.Date(theMuon.getNgaySinh().getTime()));

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
                        System.out.println("Dao.TheMuonDaoimplements.getList()");

        }
        
        return 0;
    }


    public int delete(TheMuon theMuon) {
        try {
            Connection connection = DBconnection.getConnection();
            String sql = "DELETE FROM `dacs`.`qlthemuon` WHERE MaThe = ?";

            System.out.println(sql);

            try (PreparedStatement ps = connection.prepareStatement(sql)) {
                ps.setString(1, ""+theMuon.getMaThe());  // Assuming MaThe is a string, adjust accordingly
                int rowsAffected = ps.executeUpdate();
                System.out.println("Số hàng bị ảnh hưởng: " + rowsAffected);
                return rowsAffected;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println(e.toString());
        }
        return 0;
    }




}

