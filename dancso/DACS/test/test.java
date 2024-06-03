
import View.DangNhap;
import javax.swing.JFrame;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author KIM THOA
 */
public class test {
    public static void main(String[] args) {
        JFrame dn = new DangNhap();
        dn.setTitle("Đăng nhập");
        dn.setVisible(true);
        dn.setLocationRelativeTo(null);
        dn.setResizable(false);
        dn.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
    }
}
