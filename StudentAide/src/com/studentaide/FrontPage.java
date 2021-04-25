
package com.studentaide;

import com.studentaide.VideoCon.GoogleMeet;
import com.studentaide.VideoCon.Zoom;
import com.studentaide.Class2.EnglishGrammar1_2;
import com.studentaide.Class1.EnvironmentalScience1_1;
import java.awt.*;

public class FrontPage extends javax.swing.JFrame {

    public FrontPage() {
        initComponents();
        imageset();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        Contents_M = new javax.swing.JMenu();
        Class1_M1 = new javax.swing.JMenu();
        EVS1_M1 = new javax.swing.JMenu();
        EVS1_MI1_C1 = new javax.swing.JMenuItem();
        Contents_S1 = new javax.swing.JPopupMenu.Separator();
        Class2_M1 = new javax.swing.JMenu();
        ENG2_M1 = new javax.swing.JMenu();
        ENG2_MI1_C1 = new javax.swing.JMenuItem();
        MCQs_M = new javax.swing.JMenu();
        Class1_M2 = new javax.swing.JMenu();
        EVS1_M2 = new javax.swing.JMenu();
        EVS1_MI2_C1 = new javax.swing.JMenuItem();
        MCQs_S1 = new javax.swing.JPopupMenu.Separator();
        Class2_M2 = new javax.swing.JMenu();
        ENG2_M2 = new javax.swing.JMenu();
        ENG2_MI2_C1 = new javax.swing.JMenuItem();
        VC_M = new javax.swing.JMenu();
        Zoom_MI = new javax.swing.JMenuItem();
        VC_S1 = new javax.swing.JPopupMenu.Separator();
        GoogleMeet_MI = new javax.swing.JMenuItem();
        Help_M = new javax.swing.JMenu();
        About_MI = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Student Aide");
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(240, 240, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jLabel1.setText("Features:");

        jLabel2.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jLabel2.setText("1. The application is targetted towards the school kids.");

        jLabel3.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jLabel3.setText("2. The application is supposed to provide appropiate study contents and MCQs based on each Chapter to students from each grade.");

        jLabel5.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jLabel5.setText("Thank you!");

        jLabel6.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jLabel6.setText("3. Go to Content tab from the menu bar to access the lessons (Limited content for project purposes).");

        jLabel7.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jLabel7.setText("4. Go to MCQs tab from the menu bar to access chapter based MCQs (Limited content for project purposes).");

        jLabel8.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jLabel8.setText("5.  Video Conferences can also be either initialised or be joined from this application. (For online classes and staffs members).");

        jPanel2.setBackground(new java.awt.Color(255, 255, 51));

        jLabel4.setFont(new java.awt.Font("Bahnschrift", 0, 36)); // NOI18N
        jLabel4.setText("StudentAide application Prototype");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 629, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(58, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 492, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 563, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 641, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 527, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );

        Contents_M.setText("Contents");

        Class1_M1.setText("Class 1");

        EVS1_M1.setText("Environmental Science");

        EVS1_MI1_C1.setText("Chapter 1 - Means of Transport");
        EVS1_MI1_C1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EVS1_MI1_C1ActionPerformed(evt);
            }
        });
        EVS1_M1.add(EVS1_MI1_C1);

        Class1_M1.add(EVS1_M1);

        Contents_M.add(Class1_M1);
        Contents_M.add(Contents_S1);

        Class2_M1.setText("Class 2");

        ENG2_M1.setText("English");

        ENG2_MI1_C1.setText("Chapter 1 - Nouns");
        ENG2_MI1_C1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ENG2_MI1_C1ActionPerformed(evt);
            }
        });
        ENG2_M1.add(ENG2_MI1_C1);

        Class2_M1.add(ENG2_M1);

        Contents_M.add(Class2_M1);

        jMenuBar1.add(Contents_M);

        MCQs_M.setText("MCQs");

        Class1_M2.setText("Class 1");

        EVS1_M2.setText("Environmental Science");

        EVS1_MI2_C1.setText("Chapter 1 - Means of Transport");
        EVS1_MI2_C1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EVS1_MI2_C1ActionPerformed(evt);
            }
        });
        EVS1_M2.add(EVS1_MI2_C1);

        Class1_M2.add(EVS1_M2);

        MCQs_M.add(Class1_M2);
        MCQs_M.add(MCQs_S1);

        Class2_M2.setText("Class 2");

        ENG2_M2.setText("English");

        ENG2_MI2_C1.setText("Chapter 1 - Nouns");
        ENG2_MI2_C1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ENG2_MI2_C1ActionPerformed(evt);
            }
        });
        ENG2_M2.add(ENG2_MI2_C1);

        Class2_M2.add(ENG2_M2);

        MCQs_M.add(Class2_M2);

        jMenuBar1.add(MCQs_M);

        VC_M.setText("Video Conferences");

        Zoom_MI.setText("Zoom");
        Zoom_MI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Zoom_MIActionPerformed(evt);
            }
        });
        VC_M.add(Zoom_MI);
        VC_M.add(VC_S1);

        GoogleMeet_MI.setText("Google Meet");
        GoogleMeet_MI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GoogleMeet_MIActionPerformed(evt);
            }
        });
        VC_M.add(GoogleMeet_MI);

        jMenuBar1.add(VC_M);

        Help_M.setText("Help");

        About_MI.setText("About");
        About_MI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                About_MIActionPerformed(evt);
            }
        });
        Help_M.add(About_MI);

        jMenuBar1.add(Help_M);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void About_MIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_About_MIActionPerformed
        // TODO add your handling code here:
        new M_About().setVisible(true);
    }//GEN-LAST:event_About_MIActionPerformed

    private void EVS1_MI1_C1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EVS1_MI1_C1ActionPerformed
        new EnvironmentalScience1_1().setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_EVS1_MI1_C1ActionPerformed

    private void EVS1_MI2_C1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EVS1_MI2_C1ActionPerformed
        new A_EVS1ques_1("Modes of Transport").setVisible(true);
        this.setExtendedState(FrontPage.ICONIFIED);
    }//GEN-LAST:event_EVS1_MI2_C1ActionPerformed

    private void ENG2_MI1_C1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ENG2_MI1_C1ActionPerformed
        // TODO add your handling code here:
        new EnglishGrammar1_2().setVisible(true);
        this.setExtendedState(FrontPage.ICONIFIED);
    }//GEN-LAST:event_ENG2_MI1_C1ActionPerformed

    private void ENG2_MI2_C1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ENG2_MI2_C1ActionPerformed
        // TODO add your handling code here:
        B_ENGG1ques_2 a=new B_ENGG1ques_2("Noun");
        a.setVisible(true);
        this.setExtendedState(FrontPage.ICONIFIED);
    }//GEN-LAST:event_ENG2_MI2_C1ActionPerformed

    private void Zoom_MIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Zoom_MIActionPerformed
        this.setExtendedState(FrontPage.ICONIFIED);
        new Zoom().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_Zoom_MIActionPerformed

    private void GoogleMeet_MIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GoogleMeet_MIActionPerformed
        // TODO add your handling code here:
        this.setExtendedState(FrontPage.ICONIFIED);
        new GoogleMeet().setVisible(true);
    }//GEN-LAST:event_GoogleMeet_MIActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrontPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem About_MI;
    private javax.swing.JMenu Class1_M1;
    private javax.swing.JMenu Class1_M2;
    private javax.swing.JMenu Class2_M1;
    private javax.swing.JMenu Class2_M2;
    private javax.swing.JMenu Contents_M;
    private javax.swing.JPopupMenu.Separator Contents_S1;
    private javax.swing.JMenu ENG2_M1;
    private javax.swing.JMenu ENG2_M2;
    private javax.swing.JMenuItem ENG2_MI1_C1;
    private javax.swing.JMenuItem ENG2_MI2_C1;
    private javax.swing.JMenu EVS1_M1;
    private javax.swing.JMenu EVS1_M2;
    private javax.swing.JMenuItem EVS1_MI1_C1;
    private javax.swing.JMenuItem EVS1_MI2_C1;
    private javax.swing.JMenuItem GoogleMeet_MI;
    private javax.swing.JMenu Help_M;
    private javax.swing.JMenu MCQs_M;
    private javax.swing.JPopupMenu.Separator MCQs_S1;
    private javax.swing.JMenu VC_M;
    private javax.swing.JPopupMenu.Separator VC_S1;
    private javax.swing.JMenuItem Zoom_MI;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables

    private void imageset() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("Project_Icon.png")));
    }


}
