/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import Dao.SachDaoImplements;
import Model.Book_Model;
import VIEW.JFrameThemSach;
import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Date;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import service.SachService;
import service.Sachseriviceiplm;

public class sachcontroller {
     private JButton btnsave ;
     private JTextField jtfID;
     private JTextField jtfMaSach;
     private JTextField jtfTenSach;
     private JTextField jtfTenTacGia;
     private JTextField jtfTheLoai;
     private JTextField jtfSoLuong;
     private JTextField jtfGiaTien;
     private JLabel jlbMsg;
 	 private JButton btndelete;
 	 
 	 private Book_Model sach =null;
 	 private SachService sachService=null;
	public sachcontroller(JButton btnsave,JTextField jtfID, JTextField jtfMaSach, JTextField jtfTenSach, JTextField jtfTenTacGia,
			JTextField jtfTheLoai, JTextField jtfSoLuong, JTextField jtfGiaTien, JLabel jlbMsg, JButton btndelete) {
		super();
		this.btnsave = btnsave;
		this.jtfID=jtfID;
		this.jtfMaSach = jtfMaSach;
		this.jtfTenSach = jtfTenSach;
		this.jtfTenTacGia = jtfTenTacGia;
		this.jtfTheLoai = jtfTheLoai;
		this.jtfSoLuong = jtfSoLuong;
		this.jtfGiaTien = jtfGiaTien;
		this.jlbMsg = jlbMsg;
		this.btndelete = btndelete;
		this.sachService =new Sachseriviceiplm();
	}
	public void setView(Book_Model sach) {
		this.sach =sach;
		jtfID.setText(String.valueOf(sach.getID()));
		jtfTenSach.setText(sach.getTen());
		jtfMaSach.setText(sach.getMaSach());
		jtfTenTacGia.setText(sach.getTacgia());
                jtfTheLoai.setText(sach.getTheloai());
		jtfSoLuong.setText(String.valueOf(sach.getSoluong()));
		jtfGiaTien.setText(String.valueOf(sach.getGia()));
		
	}
	public void setEvent() {
		btnsave.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					if(!NoNull()) {
						jlbMsg.setText("Vui Lòng Nhập Dữ Liệu Bắt Buộc !!!!");
					
					}
                                       
                                        else {
                                              
						sach.setMaSach(jtfMaSach.getText().trim());
						sach.setTen(jtfTenSach.getText().trim());
						sach.setTacgia(jtfTenTacGia.getText().trim());
                                                sach.setTheloai(jtfTheLoai.getText().trim());
                                                sach.setSoluong(Integer.parseInt(jtfSoLuong.getText()));
                                                sach.setGia(Double.parseDouble(jtfGiaTien.getText()));
//                                                sach.setID(Integer.parseInt(jtfID.getText()));
//                                                sachService.createOrUpdate(sach);
					if (showDialog()) {
						int ID =sachService.createOrUpdate(sach);
						if (ID!=0) {
							sach.setID(ID);
							jtfID.setText(String.valueOf(sach.getMaSach()));
							jlbMsg.setText("Xử lý cập nhật dữ liệu thành công! Vui lòng làm mới lại bảng");
							
							new JFrameThemSach(sach);
							
						}
						else {
							jlbMsg.setText("Có lỗi xảy ra, vui lòng thử lại!");
						}
					}
					}
				} catch(Exception e2) {
					jlbMsg.setText(e2.toString());
					System.out.println(e2.toString()+"bin");
				}
				
			}
//			@Override;
			public void mouseEntered(MouseEvent e) {
				btnsave.setBackground(new Color(0, 153, 255));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnsave.setBackground(new Color(176,224,230));
			}
		});
               
		btndelete.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int response = JOptionPane.showConfirmDialog(null, "Bạn Có Muốn Xóa Không ?", "Confirmation", JOptionPane.YES_NO_OPTION);
		        if (response == JOptionPane.YES_OPTION) {
		            try {
		                sachService.delete(sach);
		                JOptionPane.showMessageDialog(null, "Xóa Thành Công Vui Lòng Cập Nhập Lại Trang <3");
		                System.out.println("Delete Successful");
		            } catch (Exception ex) {
		                ex.printStackTrace();
		                JOptionPane.showMessageDialog(null, "Error deleting record: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
		            }
		        }
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				btndelete.setBackground(new Color(0, 153, 255));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btndelete.setBackground(new Color(176,224,230));
			}
		});
	}
	
		
	 public boolean NoNull () {
		   return jtfTenSach.getText() != null && !jtfTenSach.getText().equalsIgnoreCase(""); 
	   }

	   private boolean showDialog() {
	       int dialogResult = JOptionPane.showConfirmDialog(null,
	               "Bạn muốn cập nhật dữ liệu hay không?", "Thông báo", JOptionPane.YES_NO_OPTION);
	       return dialogResult == JOptionPane.YES_OPTION;
	   }
	  
	   
	   public java.sql.Date covertDateToDateSql(Date d) {
	       return new java.sql.Date(d.getTime());
	   }
            private boolean isValidEmail(String email) {
        return email.contains("@");
    }

    private boolean isValidPhoneNumber(String phoneNumber) {
        return phoneNumber.matches("\\d+");
    }
 	 
}
