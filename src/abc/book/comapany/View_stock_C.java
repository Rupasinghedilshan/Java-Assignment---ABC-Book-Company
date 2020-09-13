/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abc.book.comapany;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author USER
 */
public class View_stock_C extends javax.swing.JFrame {

    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    int xMouse;
    int yMouse;
    public View_stock_C() {
        initComponents();
        tabledata();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_stock = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        Minimize = new javax.swing.JLabel();
        Close = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204)));
        jPanel1.setLayout(null);

        jPanel6.setBackground(new java.awt.Color(0, 0, 102));
        jPanel6.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel6MouseDragged(evt);
            }
        });
        jPanel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel6MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 610, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel6);
        jPanel6.setBounds(0, 0, 610, 30);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/abc/book/comapany/05.png"))); // NOI18N
        jButton3.setText("Back");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(165, 330, 100, 30);

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/abc/book/comapany/09.png"))); // NOI18N
        jButton4.setText("LogOut");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(400, 330, 100, 30);

        jPanel7.setBackground(new java.awt.Color(0, 204, 204));

        table_stock.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Stock ID", "Book ID", "No of Quantity"
            }
        ));
        jScrollPane1.setViewportView(table_stock);

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("VIEW Stock");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(127, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(125, 125, 125))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(269, 269, 269)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );

        jPanel1.add(jPanel7);
        jPanel7.setBounds(0, 70, 680, 240);

        Minimize.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Minimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/abc/book/comapany/mini2.png"))); // NOI18N
        Minimize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                MinimizeMouseReleased(evt);
            }
        });
        jPanel1.add(Minimize);
        Minimize.setBounds(610, 0, 32, 28);

        Close.setForeground(new java.awt.Color(255, 255, 255));
        Close.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/abc/book/comapany/if_ic_close.png"))); // NOI18N
        Close.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                CloseMouseReleased(evt);
            }
        });
        jPanel1.add(Close);
        Close.setBounds(640, 0, 32, 32);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 681, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setSize(new java.awt.Dimension(681, 391));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel6MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();

        this.setLocation(x  -xMouse, y - yMouse);
    }//GEN-LAST:event_jPanel6MouseDragged

    private void jPanel6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MousePressed
        xMouse=evt.getX();
        yMouse=evt.getY();
    }//GEN-LAST:event_jPanel6MousePressed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        new Cashier_menu().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        int x=JOptionPane.showConfirmDialog(this,"Are you sure to Logout?");
        if(x==JOptionPane.YES_OPTION){

            Screen3_Cas_Log s3c=new Screen3_Cas_Log();
            s3c.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void MinimizeMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinimizeMouseReleased
        this.setState(Administrator.ICONIFIED);
    }//GEN-LAST:event_MinimizeMouseReleased

    private void CloseMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseMouseReleased
        System.exit(0);
    }//GEN-LAST:event_CloseMouseReleased

    public void tabledata(){
            try{
                conn=DriverManager.getConnection("jdbc:mysql://localhost/abc_book_company","root","");
                String sql = "SELECT * FROM stocks";
                pst = conn.prepareStatement(sql);
                rs = pst.executeQuery();
                table_stock.setModel(DbUtils.resultSetToTableModel(rs));
                
                }catch(Exception ex){
                JOptionPane.showMessageDialog(null, ex);
               }
    }
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
            java.util.logging.Logger.getLogger(View_stock_C.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(View_stock_C.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(View_stock_C.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(View_stock_C.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new View_stock_C().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Close;
    private javax.swing.JLabel Minimize;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table_stock;
    // End of variables declaration//GEN-END:variables
}
