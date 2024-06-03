/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import Model.KhachHang_Model;
import VIEW.JFrameThemKH;

import VIEW.JPanelKH;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;



import com.toedter.calendar.JDateChooser;
import javax.swing.JFrame;
import service.KHService;
import service.KHServiceiplm;

public class KHController  {

	private JButton  btnSave;
	private JTextField jtfID;
	private JTextField jtfTen;
	private JTextField jtfcccd;
	private JTextField jtfsdt;
        private JTextField jtfemail;
	private  JDateChooser dateChooser;
	private JRadioButton rdbtnNam;
	private JRadioButton rdbtNu;
	private JLabel jlbMsg;
	private JButton btndelete;
	
	 private KHService bin=null;

	
	private KhachHang_Model user=null;
	

    public KHController(JButton btnSave, JTextField jtfID, JTextField jtfTen, JTextField jtfcccd, JTextField jtfsdt, JTextField jtfemail, JDateChooser dateChooser, JRadioButton rdbtnNam, JRadioButton rdbtNu, JLabel jlbMsg, JButton btndelete) {
        super();
        this.btnSave = btnSave;
        this.jtfID = jtfID;
        this.jtfTen = jtfTen;
        this.jtfcccd = jtfcccd;
        this.jtfsdt = jtfsdt;
        this.jtfemail = jtfemail;
        this.dateChooser = dateChooser;
        this.rdbtnNam = rdbtnNam;
        this.rdbtNu = rdbtNu;
        this.jlbMsg = jlbMsg;
        this.btndelete = btndelete;
        this.bin=new KHServiceiplm();
    }
	
	
	public void setView(KhachHang_Model user) {
	    this.user = user;
	    
	    // Set data to various UI components
	    jtfID.setText(String.valueOf(user.getID())) ;
	    jtfTen.setText(user.getTen());
	    jtfcccd.setText(user.getCccd() );
	    jtfsdt.setText(user.getSdt() );
            jtfemail.setText(user.getEmail() );
	    dateChooser.setDate(user.getNgaysinh());

	    // Set radio button based on gender
	    if (user.isGioitinh()) {
	        rdbtnNam.setSelected(true);
	    } else {
	        rdbtNu.setSelected(false);
	    }
	   
	    	
	    }
        
public void setEvent() {
	btnSave.addMouseListener(new MouseAdapter() {
		@Override
		public void mouseClicked(MouseEvent e) {
			try {
//				 if (isSosachdamuonGreaterThanSosachdatra(user.getSosachdamuon(), user.getSosachdatra())) {
//                   jlbMsg.setText("Số Sách Đã Mượn Phải Lớn Hơn Hoặc Bằng Số Sách Đã Trả. Vui Lòng Nhập Lại");}
                if (!NoNull()) {
                    jlbMsg.setText("Vui Lòng Nhập Dữ Liệu Bắt Buộc !!!!");
                } 
                if (!isValidEmail(user.getEmail()
                )){
                    jlbMsg.setText("Email Phải Chứa @");
                }
////                	 if (isSosachdamuonGreaterThanSosachdatra(user.getSosachdamuon(), user.getSosachdatra())) {
////                         jlbMsg.setText("Số Sách Đã Mượn Phải Lớn Hơn Hoặc Bằng Số Sách Đã Trả. Vui Lòng Nhập Lại");
//                    user.setTenNguoiMuon(jtfTenNguoiMuon.getText().trim());
//                    user.setSosachdamuon(Integer.parseInt(jtfSoSachDaMuon.getText()));
//                    user.setSosachdatra(Integer.parseInt(jtfSoSachDaTra.getText()));
//                    user.setNgaySinh(new java.sql.Date(dateChooser.getDate().getTime()));
//                    user.setGioiTinh(rdbtnNam.isSelected());
//
//                   
//                   
//                     { 

                                                user.setTen(jtfTen.getText().trim());
						
						user.setCccd(jtfcccd.getText().trim());
                                                user.setSdt(jtfsdt.getText().trim());
                                                user.setEmail(jtfemail.getText().trim());
                                                user.setNgaysinh(new java.sql.Date(dateChooser.getDate().getTime()));
                                                user.setGioitinh(rdbtnNam.isSelected());
                                                if (showDialog()) {
                            int ID = bin.createOrUpdate(user);
                            if (ID != 0) {
                                user.setID(ID);
                                jtfID.setText(String.valueOf(user.getID()));
                                jlbMsg.setText("Xử lý cập nhật dữ liệu thành công! Vui lòng làm mới lại bảng");
                                new JPanelKH();
                            } else {
                                System.out.println(".mouseClicked()");
                                jlbMsg.setText("Có lỗi xảy ra, vui lòng thử lại!");
                            }
                        }
                       
//                    }
//                }
            } catch (Exception e2) {
                // Handle exceptions
                jlbMsg.setText(e2.toString());
                System.out.println(e2.toString());
            }
	
			}
			
		
		@Override
		public void mouseEntered(MouseEvent e) {
			btnSave.setBackground(new Color(0, 153, 255));
			
		}
		@Override
		public void mouseExited(MouseEvent e) {
			
			btnSave.setBackground(new Color(176,224,230));
			
		}
	}

	);

	btndelete.addMouseListener(new MouseAdapter() {
	    @Override
	    public void mouseClicked(MouseEvent e) {
	        int response = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete?", "Confirmation", JOptionPane.YES_NO_OPTION);
	        if (response == JOptionPane.YES_OPTION) {
	            try {
	                bin.delete(user);
	                JOptionPane.showMessageDialog(null, "Xóa Thành Công Vui Lòng Cập Nhập Lại Trang <3");
	                System.out.println("Delete Successful");
	                new JFrameThemKH(user).dispose();
                      
					new JPanelKH();
	                
	            } catch (Exception ex) {
	                ex.printStackTrace();
	                JOptionPane.showMessageDialog(null, "Error deleting record: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
	            }
	        }
	    }
	    @Override
	    public void mouseEntered(MouseEvent e) {
	    	btndelete.setBackground(new Color(0, 153, 255));
	    	super.mouseEntered(e);
	    }
	    @Override
	    public void mouseExited(MouseEvent e) {
	    	btndelete.setBackground(new Color(176,224,230));	    	
	    }
	});
	
}
   public boolean NoNull () {
	   return jtfTen.getText() != null && !jtfTen.getText().equalsIgnoreCase(""); 
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

