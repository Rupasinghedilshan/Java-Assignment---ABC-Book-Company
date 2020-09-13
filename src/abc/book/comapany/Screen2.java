/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abc.book.comapany;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;


public class Screen2 extends javax.swing.JFrame {
    private Connection conn;
    private Statement st;
    private ResultSet rs;
    private String sql = "";

    int xMouse;
    int yMouse;
    
    public Screen2() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSlider1 = new javax.swing.JSlider();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        Admin_btn = new javax.swing.JButton();
        stc_btn = new javax.swing.JButton();
        csh_btn = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        Minimize = new javax.swing.JLabel();
        Close = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/abc/book/comapany/User2.png"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204)));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/abc/book/comapany/3user.png"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/abc/book/comapany/2User.png"))); // NOI18N

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/abc/book/comapany/04.png"))); // NOI18N
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));

        Admin_btn.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        Admin_btn.setText("Administrator");
        Admin_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Admin_btnActionPerformed(evt);
            }
        });

        stc_btn.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        stc_btn.setText("Stock Controller");
        stc_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stc_btnActionPerformed(evt);
            }
        });

        csh_btn.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        csh_btn.setText("Cashier");
        csh_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                csh_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(Admin_btn)
                .addGap(103, 103, 103)
                .addComponent(stc_btn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(csh_btn)
                .addGap(98, 98, 98))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Admin_btn)
                    .addComponent(stc_btn)
                    .addComponent(csh_btn))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(0, 153, 153));

        Minimize.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Minimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/abc/book/comapany/mini2.png"))); // NOI18N
        Minimize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                MinimizeMouseReleased(evt);
            }
        });

        Close.setForeground(new java.awt.Color(255, 255, 255));
        Close.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/abc/book/comapany/if_ic_close.png"))); // NOI18N
        Close.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                CloseMouseReleased(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Calibri", 0, 44)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("                        User SignUp");
        jLabel4.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel4MouseDragged(evt);
            }
        });
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel4MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(Minimize, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Close, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Minimize, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Close))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/abc/book/comapany/2User.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(294, 294, 294)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 292, Short.MAX_VALUE))
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(jLabel1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 710, 420);

        setSize(new java.awt.Dimension(710, 420));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Admin_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Admin_btnActionPerformed
        Screen3_AdminLoging s3a=new Screen3_AdminLoging();
        s3a.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Admin_btnActionPerformed

    private void stc_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stc_btnActionPerformed
        Screen3_StockCon_Log s3b=new Screen3_StockCon_Log();
        s3b.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_stc_btnActionPerformed

    private void csh_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_csh_btnActionPerformed
        Screen3_Cas_Log s3c=new Screen3_Cas_Log();
        s3c.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_csh_btnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Screen1 s1=new Screen1();
        s1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void MinimizeMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinimizeMouseReleased
        this.setState(Screen2.ICONIFIED);
    }//GEN-LAST:event_MinimizeMouseReleased

    private void jLabel4MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        
        this.setLocation(x  -xMouse, y - yMouse);
    }//GEN-LAST:event_jLabel4MouseDragged

    private void jLabel4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MousePressed
        xMouse=evt.getX();
        yMouse=evt.getY();
    }//GEN-LAST:event_jLabel4MousePressed

    private void CloseMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseMouseReleased
        System.exit(0);
    }//GEN-LAST:event_CloseMouseReleased

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(Screen2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Screen2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Screen2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Screen2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Screen2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Admin_btn;
    private javax.swing.JLabel Close;
    private javax.swing.JLabel Minimize;
    private javax.swing.JButton csh_btn;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JButton stc_btn;
    // End of variables declaration//GEN-END:variables
}
