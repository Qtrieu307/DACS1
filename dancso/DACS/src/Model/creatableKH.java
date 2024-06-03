/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;


import java.util.List;

import javax.swing.table.DefaultTableModel;

import Model.TheMuon;

public class creatableKH {
    public DefaultTableModel setTableUser(List<KhachHang_Model> listItem, String[] listColum) {
        DefaultTableModel dtm = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }

            @Override
            public Class<?> getColumnClass(int columnIndex) {
                return columnIndex == 7 ? Boolean.class : String.class;
            }
        };

        dtm.setColumnIdentifiers(listColum);

        // Check if listItem is not null before processing
        if (listItem != null) {
            for (int i = 0; i < listItem.size(); i++) {
                KhachHang_Model kh = listItem.get(i);
                Object[] obj = new Object[listColum.length];
                obj[0] = kh.getID();
           //[1] = i + 1;
           //     obj[1]=(i+1);
                obj[1] =kh.getTen();
                obj[2] = kh.getCccd();
                obj[3] = kh.getSdt();
                obj[4] = kh.getEmail();
                obj[5] =kh.getNgaysinh();
                obj[6] =kh.isGioitinh()==true ? "Nam":"Nữ";

                dtm.addRow(obj);
            }
        }

        return dtm;
    }
}

