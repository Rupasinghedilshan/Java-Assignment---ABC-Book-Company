package abc.book.comapany;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;



public class Book_Man extends javax.swing.JFrame {

    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    int xMouse;
    int yMouse;
    
    public Book_Man() {
        initComponents();
    
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        language = new javax.swing.JComboBox<>();
        Drag = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Minimize = new javax.swing.JLabel();
        Close = new javax.swing.JLabel();
        btnView = new javax.swing.JButton();
        txtID = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtISBN = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtPrice = new javax.swing.JTextField();
        Search = new javax.swing.JButton();
        clear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 51)));
        jPanel1.setLayout(null);

        jButton1.setText("Add Book");
        jButton1.setBorder(null);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(360, 320, 100, 30);

        jButton2.setText("Delete Book");
        jButton2.setBorder(null);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(470, 320, 100, 30);

        btnUpdate.setText("Update Book");
        btnUpdate.setBorder(null);
        btnUpdate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        jPanel1.add(btnUpdate);
        btnUpdate.setBounds(580, 320, 110, 30);

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/abc/book/comapany/14.png"))); // NOI18N
        jButton4.setText("Close");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(690, 420, 110, 30);

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/abc/book/comapany/05.png"))); // NOI18N
        jButton5.setText("Back");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);
        jButton5.setBounds(380, 420, 110, 30);

        jPanel2.setBackground(new java.awt.Color(102, 0, 102));

        jLabel6.setFont(new java.awt.Font("Calibri", 0, 29)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Books");

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/abc/book/comapany/07.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(69, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 360, 460);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("Language         :");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(380, 270, 110, 15);

        language.setBackground(new java.awt.Color(204, 204, 204));
        language.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sinhala", "English", "Tamil" }));
        language.setBorder(null);
        language.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(language);
        language.setBounds(508, 260, 240, 30);

        Drag.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                DragMouseDragged(evt);
            }
        });
        Drag.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                DragMousePressed(evt);
            }
        });
        jPanel1.add(Drag);
        Drag.setBounds(0, 0, 710, 40);

        jLabel5.setFont(new java.awt.Font("Calibri", 1, 28)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("Managing Books");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(500, 40, 200, 44);

        Minimize.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Minimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/abc/book/comapany/mini2.png"))); // NOI18N
        Minimize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                MinimizeMouseReleased(evt);
            }
        });
        jPanel1.add(Minimize);
        Minimize.setBounds(750, 10, 32, 28);

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
        Close.setBounds(780, 10, 32, 32);

        btnView.setText("View Books Info");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });
        jPanel1.add(btnView);
        btnView.setBounds(440, 370, 130, 30);

        txtID.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jPanel1.add(txtID);
        txtID.setBounds(510, 100, 232, 30);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Book ID            :");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(380, 110, 110, 15);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Book Name       :");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(380, 150, 110, 15);

        txtName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        jPanel1.add(txtName);
        txtName.setBounds(510, 140, 232, 30);

        txtISBN.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtISBN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtISBNActionPerformed(evt);
            }
        });
        jPanel1.add(txtISBN);
        txtISBN.setBounds(510, 180, 232, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("ISBN No           :");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(380, 190, 110, 14);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Book Price        :");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(380, 230, 110, 15);

        txtPrice.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPriceActionPerformed(evt);
            }
        });
        jPanel1.add(txtPrice);
        txtPrice.setBounds(510, 220, 232, 30);

        Search.setText("Search Book");
        Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchActionPerformed(evt);
            }
        });
        jPanel1.add(Search);
        Search.setBounds(700, 320, 100, 30);

        clear.setText("Clear");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });
        jPanel1.add(clear);
        clear.setBounds(620, 370, 120, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 818, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 458, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(818, 458));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        new StockConMenu().setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        int x=JOptionPane.showConfirmDialog(this,"Do you want to Exit?");
        if(x==JOptionPane.YES_OPTION){
        System.exit(0);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
       // if 
        //   (txtName.getText().equals("")||txtISBN.getText().equals(null)||txtPrice.getText().equals(null) )
       // {
         //   JOptionPane.showMessageDialog(this, "Please fill the empty fields!");
        try{
           String sql = "INSERT INTO books"+"(Book_ID, Book_Name, ISBN_No, Book_Price, Language)"+"VALUES (?,?,?,?,?)";
           conn=DriverManager.getConnection("jdbc:mysql://localhost/abc_book_company","root","");
           pst = conn.prepareStatement(sql);
           pst.setString(1,txtID.getText());
           pst.setString(2,txtName.getText());
           pst.setString(3,txtISBN.getText());
           pst.setString(4,txtPrice.getText());
           pst.setString(5,language.getSelectedItem().toString());
        
           pst.executeUpdate();
           
           JOptionPane.showMessageDialog(null, "Book Successfully added!");
           
       } catch(Exception ex){ 
           //JOptionPane.showMessageDialog(null, "Please Add the correct details!");
       }
        if(txtID.getText().isEmpty()||txtName.getText().isEmpty()||txtISBN.getText().isEmpty()||txtPrice.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Please FILL all the fields!");
        }
            
      
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try{
           String sql = "DELETE FROM books WHERE Book_ID=?";
           conn=DriverManager.getConnection("jdbc:mysql://localhost/abc_book_company","root","");
           pst = conn.prepareStatement(sql);
           pst.setString(1,txtID.getText());
           pst.executeUpdate();
           
           JOptionPane.showMessageDialog(null, "Successfully Deleted!");
           
       } catch(Exception ex){ 
           JOptionPane.showMessageDialog(null, "Failed!");
       }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        try{
           String sql = "UPDATE books SET Book_ID=?,Book_Name=?,ISBN_No=?,Book_Price=?,Language=? WHERE Book_ID=?";
           conn=DriverManager.getConnection("jdbc:mysql://localhost/abc_book_company","root","");
           pst = conn.prepareStatement(sql);
           pst.setString(1,txtID.getText());
           pst.setString(2,txtName.getText());
           pst.setString(3,txtISBN.getText());
           pst.setString(4,txtPrice.getText());
           pst.setString(5,language.getSelectedItem().toString());
           pst.setString(6,txtID.getText());

           pst.executeUpdate();
           
           JOptionPane.showMessageDialog(null, "Successfully Updated!");
           
       } catch(HeadlessException | SQLException ex){ 
           JOptionPane.showMessageDialog(null, "Enter valid details!");
       }
        if(txtID.getText().isEmpty()||txtName.getText().isEmpty()||txtISBN.getText().isEmpty()||txtPrice.getText().isEmpty()||language.getSelectedItem().toString().isEmpty()){
            JOptionPane.showMessageDialog(null, "Please FILL all the fields!");
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void MinimizeMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinimizeMouseReleased
        this.setState(Administrator.ICONIFIED);
    }//GEN-LAST:event_MinimizeMouseReleased

    private void CloseMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseMouseReleased
        System.exit(0);
    }//GEN-LAST:event_CloseMouseReleased

    private void DragMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DragMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        
        this.setLocation(x  -xMouse, y - yMouse);
    }//GEN-LAST:event_DragMouseDragged

    private void DragMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DragMousePressed
        xMouse=evt.getX();
        yMouse=evt.getY();
    }//GEN-LAST:event_DragMousePressed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        new ViewBooks().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnViewActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtISBNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtISBNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtISBNActionPerformed

    private void txtPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPriceActionPerformed

    private void SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchActionPerformed
        
        String srch=txtID.getText();
            try{
                
                String sql = "SELECT * FROM books WHERE Book_ID='"+srch+"'";
                conn=DriverManager.getConnection("jdbc:mysql://localhost/abc_book_company","root","");
                pst = conn.prepareStatement(sql);
                rs = pst.executeQuery();
                
                if(rs.isBeforeFirst()){
                    while(rs.next()){

                        txtName.setText(rs.getString(2));
                        txtISBN.setText(rs.getString(3));
                        txtPrice.setText(rs.getString(4));
                        language.setSelectedItem(rs.getString(5));
                    }
                }
                
                }catch(Exception ex){
                JOptionPane.showMessageDialog(null, "ID Not exist");
                }
    }//GEN-LAST:event_SearchActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        txtID.setText("");
        txtName.setText("");
        txtISBN.setText("");
        txtPrice.setText("");
    }//GEN-LAST:event_clearActionPerformed

     
     
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
            java.util.logging.Logger.getLogger(Book_Man.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Book_Man.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Book_Man.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Book_Man.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Book_Man().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Close;
    private javax.swing.JLabel Drag;
    private javax.swing.JLabel Minimize;
    private javax.swing.JButton Search;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnView;
    private javax.swing.JButton clear;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JComboBox<String> language;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtISBN;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPrice;
    // End of variables declaration//GEN-END:variables
}
