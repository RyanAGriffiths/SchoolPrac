/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import backend.User;

/**

 @author Ryang
 */
public class Overview extends javax.swing.JFrame
{

    /**
     Creates new form overview
     */
    public Overview()
    {
        //welcomeLabel.setText("Hey," + User.class.getName());
        initComponents();
        
    }

    /**
     This method is called from within the constructor to initialize the form.
     WARNING: Do NOT modify this code. The content of this method is always
     regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        welcomeLabel = new javax.swing.JLabel();
        LineupsButton = new javax.swing.JButton();
        practiceButton1 = new javax.swing.JButton();
        MatchesButton = new javax.swing.JButton();
        manageTeamButton = new javax.swing.JButton();
        logMatchesButton = new javax.swing.JButton();
        logPracticeButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        playerList = new javax.swing.JList<>();
        logoutButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        welcomeLabel.setText("Hey, user ;)");

        LineupsButton.setText("Lineups");
        LineupsButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                LineupsButtonActionPerformed(evt);
            }
        });

        practiceButton1.setText("Practices");
        practiceButton1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                practiceButton1ActionPerformed(evt);
            }
        });

        MatchesButton.setText("Matches");
        MatchesButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                MatchesButtonActionPerformed(evt);
            }
        });

        manageTeamButton.setText("Manage Team");
        manageTeamButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                manageTeamButtonActionPerformed(evt);
            }
        });

        logMatchesButton.setText("Log Matches");
        logMatchesButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                logMatchesButtonActionPerformed(evt);
            }
        });

        logPracticeButton.setText("Log Practice");
        logPracticeButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                logPracticeButtonActionPerformed(evt);
            }
        });

        playerList.setModel(new javax.swing.AbstractListModel<String>()
        {
            String[] strings = { "Player 1", "Player 2", "Player 3", "Player 4", "Player 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(playerList);

        logoutButton.setText("logout");
        logoutButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                logoutButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(welcomeLabel))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logoutButton)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(practiceButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MatchesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LineupsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(logMatchesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(manageTeamButton, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(logPracticeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(welcomeLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(practiceButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(logPracticeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LineupsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(manageTeamButton, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(MatchesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(logMatchesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(logoutButton)
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void practiceButton1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_practiceButton1ActionPerformed
    {//GEN-HEADEREND:event_practiceButton1ActionPerformed
        new Practices().setVisible(true);
        dispose();
    }//GEN-LAST:event_practiceButton1ActionPerformed

    private void logPracticeButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_logPracticeButtonActionPerformed
    {//GEN-HEADEREND:event_logPracticeButtonActionPerformed
        new LogPractice().setVisible(true);
        dispose();
    }//GEN-LAST:event_logPracticeButtonActionPerformed

    private void LineupsButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_LineupsButtonActionPerformed
    {//GEN-HEADEREND:event_LineupsButtonActionPerformed
        new Lineups().setVisible(true);
        dispose();
    }//GEN-LAST:event_LineupsButtonActionPerformed

    private void manageTeamButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_manageTeamButtonActionPerformed
    {//GEN-HEADEREND:event_manageTeamButtonActionPerformed
        new ManageTeam().setVisible(true);
        dispose();
    }//GEN-LAST:event_manageTeamButtonActionPerformed

    private void MatchesButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_MatchesButtonActionPerformed
    {//GEN-HEADEREND:event_MatchesButtonActionPerformed
        new Matches().setVisible(true);
        dispose();
    }//GEN-LAST:event_MatchesButtonActionPerformed

    private void logMatchesButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_logMatchesButtonActionPerformed
    {//GEN-HEADEREND:event_logMatchesButtonActionPerformed
        new LogMatch().setVisible(true);
        dispose();
    }//GEN-LAST:event_logMatchesButtonActionPerformed

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_logoutButtonActionPerformed
    {//GEN-HEADEREND:event_logoutButtonActionPerformed
        new Login().setVisible(true);
        dispose();
    }//GEN-LAST:event_logoutButtonActionPerformed

    /**
     @param args the command line arguments
     */
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(Overview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(Overview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(Overview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(Overview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new Overview().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LineupsButton;
    private javax.swing.JButton MatchesButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton logMatchesButton;
    private javax.swing.JButton logPracticeButton;
    private javax.swing.JButton logoutButton;
    private javax.swing.JButton manageTeamButton;
    private javax.swing.JList<String> playerList;
    private javax.swing.JButton practiceButton1;
    private javax.swing.JLabel welcomeLabel;
    // End of variables declaration//GEN-END:variables
}
