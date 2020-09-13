package abc.book.comapany;

import javax.swing.JOptionPane;


public class Administrator extends javax.swing.JFrame {

    int xMouse;
    int yMouse;
    
    public Administrator() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        Minimize = new javax.swing.JLabel();
        Close = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        logout = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        Menu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 102)));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(153, 0, 102));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/abc/book/comapany/10.png"))); // NOI18N

        jButton2.setBackground(new java.awt.Color(0, 102, 102));
        jButton2.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Managing Users");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(106, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(72, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(360, 70, 380, 300);

        jPanel3.setBackground(new java.awt.Color(0, 102, 102));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/abc/book/comapany/if_user-add_216490.png"))); // NOI18N

        jButton1.setBackground(new java.awt.Color(153, 0, 102));
        jButton1.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Create New Users");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(108, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(96, 96, 96))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(69, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        jPanel1.add(jPanel3);
        jPanel3.setBounds(0, 70, 360, 300);

        Minimize.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Minimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/abc/book/comapany/mini2.png"))); // NOI18N
        Minimize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                MinimizeMouseReleased(evt);
            }
        });
        jPanel1.add(Minimize);
        Minimize.setBounds(640, 10, 32, 28);

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
        Close.setBounds(680, 10, 32, 32);

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Administrator");
        jLabel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel1MouseDragged(evt);
            }
        });
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel1MousePressed(evt);
            }
        });
        jPanel1.add(jLabel1);
        jLabel1.setBounds(80, 0, 560, 70);

        logout.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/abc/book/comapany/09.png"))); // NOI18N
        logout.setText("Log Out");
        logout.setBorder(null);
        logout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });
        jPanel1.add(logout);
        logout.setBounds(10, 10, 74, 30);

        jPanel4.setBackground(new java.awt.Color(0, 51, 153));

        Menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/abc/book/comapany/16.png"))); // NOI18N
        Menu.setText("Main Menu");
        Menu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(324, 324, 324)
                .addComponent(Menu)
                .addContainerGap(305, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Menu, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel4);
        jPanel4.setBounds(0, 370, 740, 60);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 735, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 427, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(735, 427));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void MinimizeMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinimizeMouseReleased
        this.setState(Administrator.ICONIFIED);
    }//GEN-LAST:event_MinimizeMouseReleased

    private void CloseMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseMouseReleased
        System.exit(0);
    }//GEN-LAST:event_CloseMouseReleased

    private void jLabel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();

        this.setLocation(x  -xMouse, y - yMouse);
    }//GEN-LAST:event_jLabel1MouseDragged

    private void jLabel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MousePressed
        xMouse=evt.getX();
        yMouse=evt.getY();
    }//GEN-LAST:event_jLabel1MousePressed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        int x=JOptionPane.showConfirmDialog(this,"Are you sure to Logout?");
        if(x==JOptionPane.YES_OPTION){

            Screen3_AdminLoging s3a=new Screen3_AdminLoging();
            s3a.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_logoutActionPerformed

    private void MenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuActionPerformed
        new Screen1().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_MenuActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        new User_Manage().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new Create_user().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Administrator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Administrator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Administrator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Administrator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Administrator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Close;
    private javax.swing.JButton Menu;
    private javax.swing.JLabel Minimize;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JButton logout;
    // End of variables declaration//GEN-END:variables
}
