/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package VIEW;

import controller.QuanLyTheMuonController;

/**
 *
 * @author KIM THOA
 */
public class JPanelTM extends javax.swing.JPanel {

    /**
     * Creates new form JPanelTM
     */
    public JPanelTM() {
        initComponents();
        QuanLyTheMuonController controller =new QuanLyTheMuonController(jPaneltable, jbtthem, jtftimkiem, jbtlammoi);

        controller.setDataToTable();
        controller.setEvent();
        jPaneltable.setBackground(new java.awt.Color(255, 255, 255));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jtftimkiem = new javax.swing.JTextField();
        jbttiemkiem = new javax.swing.JButton();
        jbtthem = new javax.swing.JButton();
        jPaneltable = new javax.swing.JPanel();
        jbtlammoi = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jtftimkiem.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jbttiemkiem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/find.png"))); // NOI18N
        jbttiemkiem.setText("Tìm kiếm");

        jbtthem.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jbtthem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/image-gallery.png"))); // NOI18N
        jbtthem.setText("Thêm thẻ mượn");
        jbtthem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtthemActionPerformed(evt);
            }
        });

        jPaneltable.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPaneltableLayout = new javax.swing.GroupLayout(jPaneltable);
        jPaneltable.setLayout(jPaneltableLayout);
        jPaneltableLayout.setHorizontalGroup(
            jPaneltableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 945, Short.MAX_VALUE)
        );
        jPaneltableLayout.setVerticalGroup(
            jPaneltableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 288, Short.MAX_VALUE)
        );

        jbtlammoi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/refresh-button.png"))); // NOI18N
        jbtlammoi.setText("Làm mới");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jbtthem)
                .addGap(229, 229, 229)
                .addComponent(jtftimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbttiemkiem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbtlammoi)
                .addContainerGap(92, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPaneltable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtftimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbttiemkiem)
                            .addComponent(jbtlammoi)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jbtthem)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPaneltable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(12, 12, 12))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jbtthemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtthemActionPerformed
        // TODO add your handling code here:
//        JFrameThemKH jframe = new JFrameThemKH(new KhachHang_Model());
//        jframe.setVisible(true);
    }//GEN-LAST:event_jbtthemActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPaneltable;
    private javax.swing.JButton jbtlammoi;
    private javax.swing.JButton jbtthem;
    private javax.swing.JButton jbttiemkiem;
    private javax.swing.JTextField jtftimkiem;
    // End of variables declaration//GEN-END:variables
}
