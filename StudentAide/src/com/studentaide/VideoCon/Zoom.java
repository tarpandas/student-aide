
package com.studentaide.VideoCon;

import com.studentaide.FrontPage;
import java.awt.Desktop;
import java.awt.Toolkit;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Zoom extends javax.swing.JFrame {

    public Zoom() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("Project_Icon.png")));
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        CreateMeet1 = new javax.swing.JButton();
        Web1 = new javax.swing.JButton();
        EnterMeet1 = new javax.swing.JButton();
        Note1 = new javax.swing.JLabel();
        EnterMeet1_T = new javax.swing.JLabel();
        CreateMeet1_T = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Zoom");
        setAlwaysOnTop(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(181, 195, 236));

        CreateMeet1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/studentaide/VideoCon/New_Zoom.JPG"))); // NOI18N
        CreateMeet1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CreateMeet1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        CreateMeet1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateMeet1ActionPerformed(evt);
            }
        });

        Web1.setBackground(new java.awt.Color(0, 0, 250));
        Web1.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        Web1.setForeground(new java.awt.Color(250, 250, 250));
        Web1.setText("Visit Website");
        Web1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Web1ActionPerformed(evt);
            }
        });

        EnterMeet1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/studentaide/VideoCon/Join_Zoom.JPG"))); // NOI18N
        EnterMeet1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        EnterMeet1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        EnterMeet1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnterMeet1ActionPerformed(evt);
            }
        });

        Note1.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        Note1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Note1.setText("Note: Clicking any option minimizes the window and opens a browser tab");

        EnterMeet1_T.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        EnterMeet1_T.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EnterMeet1_T.setText("Enter Meeting");
        EnterMeet1_T.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        CreateMeet1_T.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        CreateMeet1_T.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CreateMeet1_T.setText("Start Meeting");

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/studentaide/VideoCon/Zoom_ICO.JPG"))); // NOI18N
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(Note1, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(188, 188, 188)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Web1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(EnterMeet1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EnterMeet1_T, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CreateMeet1_T, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CreateMeet1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(53, 53, 53))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(EnterMeet1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CreateMeet1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EnterMeet1_T)
                    .addComponent(CreateMeet1_T))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Web1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(Note1)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Web1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Web1ActionPerformed

        this.setExtendedState(Zoom.ICONIFIED);
        try {
            Desktop.getDesktop().browse(new URL("https://zoom.us").toURI());

        } catch (MalformedURLException ex) {
            Logger.getLogger(Zoom.class.getName()).log(Level.SEVERE, null, ex);
        } catch (URISyntaxException ex) {
            Logger.getLogger(Zoom.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Zoom.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_Web1ActionPerformed

    private void CreateMeet1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateMeet1ActionPerformed
        this.setExtendedState(Zoom.ICONIFIED);
        try {
            Desktop.getDesktop().browse(new URL("https://zoom.us/start/videomeeting").toURI());

        } catch (MalformedURLException ex) {
            Logger.getLogger(Zoom.class.getName()).log(Level.SEVERE, null, ex);
        } catch (URISyntaxException ex) {
            Logger.getLogger(Zoom.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Zoom.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_CreateMeet1ActionPerformed

    private void EnterMeet1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnterMeet1ActionPerformed

        this.setExtendedState(Zoom.ICONIFIED);
        try {
            Desktop.getDesktop().browse(new URL("https://zoom.us/join").toURI());

        } catch (MalformedURLException ex) {
            Logger.getLogger(Zoom.class.getName()).log(Level.SEVERE, null, ex);
        } catch (URISyntaxException ex) {
            Logger.getLogger(Zoom.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Zoom.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_EnterMeet1ActionPerformed

    public static void main(String args[]) {

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
            java.util.logging.Logger.getLogger(Zoom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Zoom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Zoom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Zoom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>


        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Zoom().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CreateMeet1;
    private javax.swing.JLabel CreateMeet1_T;
    private javax.swing.JButton EnterMeet1;
    private javax.swing.JLabel EnterMeet1_T;
    private javax.swing.JLabel Note1;
    private javax.swing.JButton Web1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    public void setVisible(String atrue) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
