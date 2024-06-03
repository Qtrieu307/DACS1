/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;


import java.util.List;

import javax.swing.table.DefaultTableModel;

import Model.TheMuon;

public class Createtable {
    public DefaultTableModel setTableTheMuon(List<TheMuon> listItem, String[] listColum) {
        DefaultTableModel dtm = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }

            @Override
            public Class<?> getColumnClass(int columnIndex) {
                return columnIndex == 6 ? Boolean.class : String.class;
            }
        };

        dtm.setColumnIdentifiers(listColum);

        // Check if listItem is not null before processing
        if (listItem != null) {
            for (int i = 0; i < listItem.size(); i++) {
                TheMuon theMuon = listItem.get(i);
                Object[] obj = new Object[listColum.length];
                obj[0] = theMuon.getMaThe();
           //[1] = i + 1;
           //     obj[1]=(i+1);
                obj[1] =theMuon.getTenNguoiMuon();
                obj[2] = theMuon.getSosachdamuon();
                obj[3] = theMuon.getSosachdatra();
               
                obj[4] =theMuon.isGioiTinh()==true ? "Nam":"Nữ";
                obj[5] =theMuon.getNgaySinh();

                dtm.addRow(obj);
            }
        }

        return dtm;
    }
}
