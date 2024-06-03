/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package VIEW;

import Model.DanhMucBean;

import controller.ChuyenMangHinh;
import controller.DangNhapContoller;

import java.awt.BorderLayout;
import java.awt.Container;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author KIM THOA
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form zzz
     */

    public Main() {
        initComponents();
        JPanel jpntrangchu = new JPanelTrangchu();
        JPanel jpnqlthemuon = new JPanelTM();
        JPanel jpnqlsach = new JPanelBook();
        JPanel jpnqluser = new JPanelKH();
        JPanel jpnthongke = new PanelThongKe();
        ChuyenMangHinh chuyenMangHinh =new ChuyenMangHinh(jpnmain);
//        chuyenMangHinh.setView(jpntrangchu, jlbcheckchu);
        List<DanhMucBean> listItem =new ArrayList<>() ;
        listItem.add(new DanhMucBean("TrangChu",jpntrangchu,jlbcheckchu));
        listItem.add(new DanhMucBean("QuanLyTheMuon",jpnqlthemuon,jlbadminchu));
        listItem.add(new DanhMucBean("QuanLySach",jpnqlsach,jlbbookchu));
        listItem.add(new DanhMucBean("user",jpnqluser,jlbuserchu));
        listItem.add(new DanhMucBean("ThongKe",jpnthongke,jlbadminchu1));	
        chuyenMangHinh.setEvent(listItem);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpnleft = new javax.swing.JPanel();
        jpnlogo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jpnitems = new javax.swing.JPanel();
        jpnitemion = new javax.swing.JPanel();
        jlbcheck = new javax.swing.JLabel();
        jlbbook = new javax.swing.JLabel();
        jlbuser = new javax.swing.JLabel();
        jlbadmin = new javax.swing.JLabel();
        jlbsearch = new javax.swing.JLabel();
        jpnitemchu = new javax.swing.JPanel();
        jlbcheckchu = new javax.swing.JLabel();
        jlbbookchu = new javax.swing.JLabel();
        jlbuserchu = new javax.swing.JLabel();
        jlbadminchu = new javax.swing.JLabel();
        jlbadminchu1 = new javax.swing.JLabel();
        jpnicons = new javax.swing.JPanel();
        jpniconsetting = new javax.swing.JPanel();
        settingicon = new javax.swing.JLabel();
        settingchu = new javax.swing.JLabel();
        jpnright = new javax.swing.JPanel();
        jlbtime = new javax.swing.JPanel();
        jpnmain = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpnleft.setBackground(new java.awt.Color(0, 204, 255));

        jpnlogo.setBackground(new java.awt.Color(255, 255, 255));
        jpnlogo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 153), 2));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo2.png"))); // NOI18N

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 204, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("LIBRARY");

        javax.swing.GroupLayout jpnlogoLayout = new javax.swing.GroupLayout(jpnlogo);
        jpnlogo.setLayout(jpnlogoLayout);
        jpnlogoLayout.setHorizontalGroup(
            jpnlogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnlogoLayout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jpnlogoLayout.setVerticalGroup(
            jpnlogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jpnitems.setBackground(new java.awt.Color(0, 204, 255));

        jpnitemion.setBackground(new java.awt.Color(255, 255, 255));
        jpnitemion.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jlbcheck.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/home (1).png"))); // NOI18N

        jlbbook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/books.png"))); // NOI18N

        jlbuser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reading.png"))); // NOI18N

        jlbadmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/analytics.png"))); // NOI18N

        jlbsearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/credit.png"))); // NOI18N

        javax.swing.GroupLayout jpnitemionLayout = new javax.swing.GroupLayout(jpnitemion);
        jpnitemion.setLayout(jpnitemionLayout);
        jpnitemionLayout.setHorizontalGroup(
            jpnitemionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnitemionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnitemionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlbcheck, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbbook, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbuser, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbadmin, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpnitemionLayout.setVerticalGroup(
            jpnitemionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnitemionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbcheck, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jlbbook, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jlbuser, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jlbsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlbadmin, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(114, 114, 114))
        );

        jpnitemchu.setBackground(new java.awt.Color(255, 255, 255));
        jpnitemchu.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jlbcheckchu.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jlbcheckchu.setText("TRANG CHỦ");

        jlbbookchu.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jlbbookchu.setText("SÁCH");
        jlbbookchu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlbbookchuMouseClicked(evt);
            }
        });

        jlbuserchu.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jlbuserchu.setText("ĐỘC GIẢ");
        jlbuserchu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlbuserchuMouseClicked(evt);
            }
        });

        jlbadminchu.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jlbadminchu.setText("THẺ MƯỢN");

        jlbadminchu1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jlbadminchu1.setText("THỐNG KÊ");

        javax.swing.GroupLayout jpnitemchuLayout = new javax.swing.GroupLayout(jpnitemchu);
        jpnitemchu.setLayout(jpnitemchuLayout);
        jpnitemchuLayout.setHorizontalGroup(
            jpnitemchuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnitemchuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnitemchuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlbcheckchu, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                    .addComponent(jlbadminchu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlbbookchu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlbadminchu1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlbuserchu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jpnitemchuLayout.setVerticalGroup(
            jpnitemchuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnitemchuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbcheckchu, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jlbbookchu, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jlbuserchu, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlbadminchu, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jlbadminchu1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63))
        );

        jpnicons.setBackground(new java.awt.Color(255, 255, 255));

        jpniconsetting.setBackground(new java.awt.Color(255, 255, 255));

        settingicon.setBackground(new java.awt.Color(255, 255, 255));
        settingicon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logout.png"))); // NOI18N

        javax.swing.GroupLayout jpniconsettingLayout = new javax.swing.GroupLayout(jpniconsetting);
        jpniconsetting.setLayout(jpniconsettingLayout);
        jpniconsettingLayout.setHorizontalGroup(
            jpniconsettingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpniconsettingLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(settingicon, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jpniconsettingLayout.setVerticalGroup(
            jpniconsettingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpniconsettingLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(settingicon, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        settingchu.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        settingchu.setText("Đăng xuất");
        settingchu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                settingchuMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jpniconsLayout = new javax.swing.GroupLayout(jpnicons);
        jpnicons.setLayout(jpniconsLayout);
        jpniconsLayout.setHorizontalGroup(
            jpniconsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpniconsLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jpniconsetting, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(settingchu, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpniconsLayout.setVerticalGroup(
            jpniconsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpniconsLayout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addGroup(jpniconsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpniconsetting, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpniconsLayout.createSequentialGroup()
                        .addComponent(settingchu)
                        .addGap(29, 29, 29))))
        );

        javax.swing.GroupLayout jpnitemsLayout = new javax.swing.GroupLayout(jpnitems);
        jpnitems.setLayout(jpnitemsLayout);
        jpnitemsLayout.setHorizontalGroup(
            jpnitemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnitemsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnitemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpnicons, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jpnitemsLayout.createSequentialGroup()
                        .addComponent(jpnitemion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                        .addComponent(jpnitemchu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jpnitemsLayout.setVerticalGroup(
            jpnitemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnitemsLayout.createSequentialGroup()
                .addContainerGap(69, Short.MAX_VALUE)
                .addGroup(jpnitemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jpnitemion, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jpnitemchu, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addComponent(jpnicons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jpnleftLayout = new javax.swing.GroupLayout(jpnleft);
        jpnleft.setLayout(jpnleftLayout);
        jpnleftLayout.setHorizontalGroup(
            jpnleftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnleftLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnleftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpnlogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpnitems, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jpnleftLayout.setVerticalGroup(
            jpnleftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnleftLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jpnlogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jpnitems, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jpnleft, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 270, -1));

        jpnright.setBackground(new java.awt.Color(0, 204, 255));
        jpnright.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(204, 204, 204)));

        jlbtime.setBackground(new java.awt.Color(255, 255, 255));
        jlbtime.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 153), 2));
        jlbtime.setLayout(new java.awt.BorderLayout());

        jpnmain.setBackground(new java.awt.Color(255, 255, 255));
        jpnmain.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jpnmain.setPreferredSize(new java.awt.Dimension(983, 320));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/thu vien.jpg"))); // NOI18N

        javax.swing.GroupLayout jpnmainLayout = new javax.swing.GroupLayout(jpnmain);
        jpnmain.setLayout(jpnmainLayout);
        jpnmainLayout.setHorizontalGroup(
            jpnmainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jpnmainLayout.setVerticalGroup(
            jpnmainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jpnrightLayout = new javax.swing.GroupLayout(jpnright);
        jpnright.setLayout(jpnrightLayout);
        jpnrightLayout.setHorizontalGroup(
            jpnrightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnrightLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbtime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(976, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnrightLayout.createSequentialGroup()
                .addGap(0, 6, Short.MAX_VALUE)
                .addComponent(jpnmain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jpnrightLayout.setVerticalGroup(
            jpnrightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnrightLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jlbtime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jpnmain, javax.swing.GroupLayout.PREFERRED_SIZE, 542, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(jpnright, new org.netbeans.lib.awtextra.AbsoluteConstraints(267, -7, 990, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jlbbookchuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbbookchuMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jlbbookchuMouseClicked

    private void jlbuserchuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbuserchuMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jlbuserchuMouseClicked

    private void settingchuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingchuMouseClicked
        // TODO add your handling code here:
        this.dispose();
        DangNhapContoller k = new DangNhapContoller();
    k.hien();
       
    }//GEN-LAST:event_settingchuMouseClicked

    /**
     * @param args the command line arguments
     */
    public void onLoginSuccess() {
            java.awt.EventQueue.invokeLater(() -> { 
        JFrame frame = new Main();
            JPanel bin =new ClockPanel();
             frame.setTitle("LIBRARY");
            jlbtime.setLayout(new BorderLayout());
            jlbtime.add(bin,BorderLayout.CENTER);
            frame.setLocationRelativeTo(null);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setResizable(false);
            frame.setVisible(true);
            
            System.out.println("VIEW.Main.main()");
        });
        // Code to execute on successful login
    }
    public static void main(String[] args) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
          java.awt.EventQueue.invokeLater(() -> { 
        JFrame frame = new Main();
            JPanel bin =new ClockPanel();
               frame.setTitle("LIBRARY");
            jlbtime.setLayout(new BorderLayout());
            jlbtime.add(bin,BorderLayout.CENTER);
            frame.setLocationRelativeTo(null);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setResizable(false);
            frame.setVisible(true);
            
            System.out.println("VIEW.Main.main()");
        });
          
    }
    private static javax.swing.JPanel jlbtime;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jlbadmin;
    private javax.swing.JLabel jlbadminchu;
    private javax.swing.JLabel jlbadminchu1;
    private javax.swing.JLabel jlbbook;
    private javax.swing.JLabel jlbbookchu;
    private javax.swing.JLabel jlbcheck;
    private javax.swing.JLabel jlbcheckchu;
    private javax.swing.JLabel jlbsearch;

    private javax.swing.JLabel jlbuser;
    private javax.swing.JLabel jlbuserchu;
    private javax.swing.JPanel jpnicons;
    private javax.swing.JPanel jpniconsetting;
    private javax.swing.JPanel jpnitemchu;
    private javax.swing.JPanel jpnitemion;
    private javax.swing.JPanel jpnitems;
    private javax.swing.JPanel jpnleft;
    private javax.swing.JPanel jpnlogo;
    private javax.swing.JPanel jpnmain;
    private javax.swing.JPanel jpnright;
    private javax.swing.JLabel settingchu;
    private javax.swing.JLabel settingicon;
    // End of variables declaration//GEN-END:variables
}