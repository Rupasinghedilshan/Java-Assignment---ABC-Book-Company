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


public class New_stockCon extends javax.swing.JFrame {

    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    int xMouse;
    int yMouse;
    
    public New_stockCon() {
        initComponents();
        tabledata();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        ID = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtPass = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        table1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Minimize = new javax.swing.JLabel();
        Close = new javax.swing.JLabel();
        Dragg = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102)));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });
        jPanel1.setLayout(null);

        jButton1.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jButton1.setText("Create");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(510, 330, 80, 30);
        jPanel1.add(ID);
        ID.setBounds(520, 70, 190, 30);
        jPanel1.add(txtName);
        txtName.setBounds(520, 120, 190, 30);
        jPanel1.add(txtPass);
        txtPass.setBounds(520, 170, 190, 30);

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel1.setText("User ID");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(400, 80, 60, 17);

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel2.setText("User Name ");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(400, 130, 80, 17);

        jLabel3.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel3.setText("Password");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(400, 180, 70, 17);

        table1.setBackground(new java.awt.Color(153, 153, 153));
        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "User Name", "Password"
            }
        ));
        jScrollPane2.setViewportView(table1);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(390, 220, 340, 91);

        jButton2.setText("Exit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(590, 380, 60, 20);

        jButton3.setText("Back");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(450, 380, 70, 20);

        jPanel2.setBackground(new java.awt.Color(102, 0, 102));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Calibri", 0, 30)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Add new Stock controller ");

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/abc/book/comapany/2User.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel4)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(98, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(96, 96, 96))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 340, 420);

        Minimize.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Minimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/abc/book/comapany/mini2.png"))); // NOI18N
        Minimize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                MinimizeMouseReleased(evt);
            }
        });
        jPanel1.add(Minimize);
        Minimize.setBounds(650, 10, 32, 28);

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
        Close.setBounds(690, 10, 32, 32);

        Dragg.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                DraggMouseDragged(evt);
            }
        });
        Dragg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                DraggMousePressed(evt);
            }
        });
        jPanel1.add(Dragg);
        Dragg.setBounds(10, 0, 640, 40);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 740, 420);

        setSize(new java.awt.Dimension(740, 421));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

       try{
           String sql = "INSERT INTO stock_controller"+"(User_ID, User_Name, Password)"+"VALUES (?,?,?)";
           conn=DriverManager.getConnection("jdbc:mysql://localhost/abc_book_company","root","");
           pst = conn.prepareStatement(sql);
           pst.setString(1,ID.getText());
           pst.setString(2,txtName.getText());
           pst.setString(3,txtPass.getText());
           
           pst.executeUpdate();
           
           JOptionPane.showMessageDialog(null, "Successfully created!");
           
       } catch(Exception ex){ 
           JOptionPane.showMessageDialog(null, "Enter Valid Details!");
       }
       tabledata();
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int x=JOptionPane.showConfirmDialog(this,"Do you want to Exit?");
        if(x==JOptionPane.YES_OPTION){
        System.exit(0);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Create_user u1=new Create_user();
        u1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void MinimizeMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinimizeMouseReleased
        this.setState(Administrator.ICONIFIED);
    }//GEN-LAST:event_MinimizeMouseReleased

    private void CloseMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseMouseReleased
        System.exit(0);
    }//GEN-LAST:event_CloseMouseReleased

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        
    }//GEN-LAST:event_jPanel1MousePressed

    private void DraggMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DraggMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        
        this.setLocation(x  -xMouse, y - yMouse);
    }//GEN-LAST:event_DraggMouseDragged

    private void DraggMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DraggMousePressed
        xMouse=evt.getX();
        yMouse=evt.getY();
    }//GEN-LAST:event_DraggMousePressed
    
    public void tabledata(){
        try{
            conn=DriverManager.getConnection("jdbc:mysql://localhost/abc_book_company","root","");
            String sql = "SELECT * FROM stock_controller";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            table1.setModel(DbUtils.resultSetToTableModel(rs));
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
            java.util.logging.Logger.getLogger(New_stockCon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(New_stockCon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(New_stockCon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(New_stockCon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new New_stockCon().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Close;
    private javax.swing.JLabel Dragg;
    private javax.swing.JTextField ID;
    private javax.swing.JLabel Minimize;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable table1;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPass;
    // End of variables declaration//GEN-END:variables
}
