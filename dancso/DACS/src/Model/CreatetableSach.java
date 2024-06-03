/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.List;

import javax.swing.table.DefaultTableModel;
import javax.swing.table.DefaultTableModel;

import Model.Book_Model;

public class CreatetableSach {
	
	   public static DefaultTableModel setTableSach(List<Book_Model> listItem, String[] listColum) {
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
	                Book_Model sach = listItem.get(i);
	                Object[] obj = new Object[listColum.length];
	                obj[0] =sach.getID();
                        obj[1] = sach.getMaSach();
	                obj[2] =sach.getTen();
	                obj[3] = sach.getTacgia();
                        obj[4] = sach.getTheloai();
	                obj[5] =sach.getSoluong();
                        obj[6] = sach.getGia();

	                dtm.addRow(obj);
	            }
	        }

	        return dtm;
	    }
	}



