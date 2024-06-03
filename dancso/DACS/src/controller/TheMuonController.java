/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Date;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;


import service.TheMuonSeriviceiplm;
import service.TheMuonService;
import Model.Createtable;
import Model.TheMuon;
import VIEW.JFrameSuaTM;
import VIEW.JPanelTM;
import com.toedter.calendar.JDateChooser;

public class TheMuonController  {

	private JButton  btnSave;
	private JTextField jtfMaThe;
	private JTextField jtfTenNguoiMuon;
	private JTextField jtfSoSachDaMuon;
	private JTextField jtfSoSachDaTra;
	private  JDateChooser dateChooser;
	private JRadioButton rdbtnNam;
	private JRadioButton rdbtNu;
	private JLabel jlbMsg;
	private JButton btndelete;
	
	
	
	private TheMuon theMuon=null;
	private TheMuonService muonService=null;
	public TheMuonController(JButton btnSave, JTextField jtfMaThe, JTextField jtfTenNguoiMuon,
			JTextField jtfSoSachDaMuon, JTextField jtfSoSachDaTra, JDateChooser dateChooser, JRadioButton rdbtnNam,
			JRadioButton rdbtNu,JLabel jlbMsg,JButton btndelete) {
		super();
		this.btnSave = btnSave;
		this.jtfMaThe = jtfMaThe;
		this.jtfTenNguoiMuon = jtfTenNguoiMuon;
		this.jtfSoSachDaMuon = jtfSoSachDaMuon;
		this.jtfSoSachDaTra = jtfSoSachDaTra;
		this.dateChooser = dateChooser;
		this.rdbtnNam = rdbtnNam;
		this.rdbtNu = rdbtNu;
		this.jlbMsg= jlbMsg;
		this.btndelete =btndelete;
		this.muonService =new TheMuonSeriviceiplm();
		
				
		
		
		
	}
	
	public TheMuonController() {
		super();
	}

	public void setView(TheMuon theMuon) {
	    this.theMuon = theMuon;
	    
	    // Set data to various UI components
	    jtfMaThe.setText("#"+theMuon.getMaThe()) ;
	    jtfTenNguoiMuon.setText(theMuon.getTenNguoiMuon());
	    jtfSoSachDaMuon.setText(""+theMuon.getSosachdamuon() );
	    jtfSoSachDaTra.setText(""+theMuon.getSosachdatra() );
	 //   JDateChooser.
	    dateChooser.setDate(theMuon.getNgaySinh());

	    // Set radio button based on gender
	    if (theMuon.isGioiTinh()) {
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
				 if (isSosachdamuonGreaterThanSosachdatra(theMuon.getSosachdamuon(), theMuon.getSosachdatra())) {
                   jlbMsg.setText("Số Sách Đã Mượn Phải Lớn Hơn Hoặc Bằng Số Sách Đã Trả. Vui Lòng Nhập Lại");}
                              
                if (!NoNull()) {
                    jlbMsg.setText("Vui Lòng Nhập Dữ Liệu Bắt Buộc !!!!");
                } else {
//                	 if (isSosachdamuonGreaterThanSosachdatra(theMuon.getSosachdamuon(), theMuon.getSosachdatra())) {
//                         jlbMsg.setText("Số Sách Đã Mượn Phải Lớn Hơn Hoặc Bằng Số Sách Đã Trả. Vui Lòng Nhập Lại");
                    theMuon.setTenNguoiMuon(jtfTenNguoiMuon.getText().trim());
                    theMuon.setSosachdamuon(Integer.parseInt(jtfSoSachDaMuon.getText()));
                    theMuon.setSosachdatra(Integer.parseInt(jtfSoSachDaTra.getText()));
                    theMuon.setNgaySinh(new java.sql.Date(dateChooser.getDate().getTime()));
                    theMuon.setGioiTinh(rdbtnNam.isSelected());

                   
                   
                     {
                        if (showDialog()) {
                            int ID = muonService.createOrUpdate(theMuon);
                            if (ID != 0) {
                                theMuon.setMaThe(ID);
                                jtfMaThe.setText("#" + theMuon.getMaThe());
                                jlbMsg.setText("Xử lý cập nhật dữ liệu thành công! Vui lòng làm mới lại bảng");
                                new JPanelTM();
                            } else {
                                jlbMsg.setText("Có lỗi xảy ra, vui lòng thử lại!");
                                System.out.println(".mouseClicked()");
                                        
                            }
                        }
                    }
                }
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
	                muonService.delete(theMuon);
	                JOptionPane.showMessageDialog(null, "Xóa Thành Công Vui Lòng Cập Nhập Lại Trang <3");
	                System.out.println("Delete Successful");
	                new JFrameSuaTM(theMuon).dispose();
					new JPanelTM();
	                
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
	   return jtfTenNguoiMuon.getText() != null && !jtfTenNguoiMuon.getText().equalsIgnoreCase(""); 
   }

   private boolean showDialog() {
       int dialogResult = JOptionPane.showConfirmDialog(null,
               "Bạn muốn cập nhật dữ liệu hay không?", "Thông báo", JOptionPane.YES_NO_OPTION);
       return dialogResult == JOptionPane.YES_OPTION;
   }
  
   
   public java.sql.Date covertDateToDateSql(Date d) {
       return new java.sql.Date(d.getTime());
   }
   private boolean isSosachdamuonGreaterThanSosachdatra(int sosachdamuon, int sosachdatra) {
       return sosachdamuon < sosachdatra;
   }
	
    private boolean isValidEmail(String email) {
        return email.contains("@");
    }

    private boolean isValidPhoneNumber(String phoneNumber) {
        return phoneNumber.matches("\\d+");
    }
}

 