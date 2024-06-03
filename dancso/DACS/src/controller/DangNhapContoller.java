/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

/**
 *
 * @author phamn
 */

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import Model.User;
import VIEW.ClockPanel;
import VIEW.Main;
import service.TaiKhoanService;
import service.TaiKhoanServiceImplements;
import View.Dangkyframe;
import View.DangNhap;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JPasswordField;

public class DangNhapContoller {

     private DangNhap dangnhap;
     private JButton btnsubmit;
     private JTextField jtfdangnhap;
     private JTextField jtfmatkhau;
     private JLabel jlnmsg;
     private JLabel jlbDangKy;
     
     private TaiKhoanService taiKhoanService=null;
	public DangNhapContoller(JButton btnsubmit, JTextField jtfdangnhap, JPasswordField jtfmatkhau, JLabel jlnmsg, DangNhap dangnhap,JLabel jlbDangKy) {
		super();
		this.btnsubmit = btnsubmit;
		this.jtfdangnhap = jtfdangnhap;
		this.jtfmatkhau = jtfmatkhau;
		this.jlnmsg = jlnmsg;

		this.taiKhoanService=new TaiKhoanServiceImplements();
		this.dangnhap =dangnhap;
		this.jlbDangKy =jlbDangKy;
		
	}

    public DangNhapContoller() {
    }
        
        public void hien(){
            JFrame dn = new DangNhap();
             dn.setTitle("Đăng nhập");
                dn.setVisible(true);
                dn.setLocationRelativeTo(null);
                dn.setResizable(false);
                dn.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        }
	public void setEvent() {
		  jtfmatkhau.addKeyListener(new KeyAdapter() {
                    @Override
	            public void keyPressed(KeyEvent e) {
	                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
	                	try {
		                    if (jtfdangnhap.getText().length() == 0
		                            || jtfmatkhau.getText().length() == 0) {
		                    	jlnmsg.setText("Vui lòng nhập dữ liệu bắt buộc!");
		                    } else {
		                        User taiKhoan = taiKhoanService.login(jtfdangnhap.getText(), jtfmatkhau.getText());
		                        if (taiKhoan != null) {
                                            if (!taiKhoan.isTinh_trang()) {
                                                jlnmsg.setText("Tài khoản của bạn đang bị tạm khóa!");
                                            } else {
                                                
                                                dangnhap.dispose();
                                            
                                                
                                            }
                                        } else {
                                            jlnmsg.setText("Tên đăng nhập và mật khẩu không đúng!");
                                            
                                        }
		                    }
		                } catch (Exception ex) {
		                jlnmsg.setText(ex.toString());
		                System.out.println(ex);
		                }
	                }
	            }
	        });
		btnsubmit.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
		                    if (jtfdangnhap.getText().length() == 0
		                            || jtfmatkhau.getText().length() == 0) {
		                    	jlnmsg.setText("Vui lòng nhập dữ liệu bắt buộc!");
		                    } else {
		                        User taiKhoan = taiKhoanService.login(jtfdangnhap.getText(), jtfmatkhau.getText());
		                        if (taiKhoan != null) {
                                            if (!taiKhoan.isTinh_trang()) {
                                                jlnmsg.setText("Tài khoản của bạn đang bị tạm khóa!");
                                            } else {
                                                
                                                dangnhap.dispose();
                                               Main main = new Main();
                                               main.onLoginSuccess();
//    mainFrame.setVisible(true);
                                               
////                                                main.getClockPane().Start();
//                                                main.setTitle("LIBRARY");
//                                                main.setVisible(true);
//                                                main.setLocationRelativeTo(null);
//                                                main.setResizable(false);
//                                                main.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
//                                                
                                                
                                                
                                                
                                            }
                                        } else {
                                            jlnmsg.setText("Tên đăng nhập và mật khẩu không đúng!");
                                            
                                        }
		                    }
	                } catch (Exception ex) {
	                jlnmsg.setText(ex.toString());
	                System.out.println(ex);
	                }
				
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				btnsubmit.setBackground(new Color(200,125,30));
				super.mouseEntered(e);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				 btnsubmit.setBackground(new Color(176,224,230));
				super.mouseExited(e);
			}
		
		});
		jlbDangKy.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dangnhap.dispose();
				Dangkyframe frame= new Dangkyframe();
				
				frame.setResizable(false);
                                frame.setLocationRelativeTo(null);
               
                                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				frame.setTitle("Đăng Ký Tài Khoản");
                                frame.setVisible(true);
				super.mouseClicked(e);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				jlbDangKy.setBackground(Color.red);
				super.mouseEntered(e);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				jlbDangKy.setBackground(Color.blue);
				super.mouseExited(e);
			}
		});
	}
     
}
