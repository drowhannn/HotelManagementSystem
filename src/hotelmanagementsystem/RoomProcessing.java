/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelmanagementsystem;

/**
 *
 * @author Savita
 */
public class RoomProcessing extends javax.swing.JFrame {

    /**
     * Creates new form BookCancel
     */
    public RoomProcessing() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jLabel1 = new javax.swing.JLabel();
        Add = new javax.swing.JRadioButton();
        Remove = new javax.swing.JRadioButton();
        RoomBooking = new javax.swing.JRadioButton();
        CancelBooking = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        Back = new javax.swing.JMenu();
        Home = new javax.swing.JMenu();
        Exit = new javax.swing.JMenu();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1360, 780));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Monotype Corsiva", 1, 36)); // NOI18N
        jLabel1.setText("Room Processing");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(460, 120, 260, 30);

        Add.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Add.setText("Add Room");
        Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddActionPerformed(evt);
            }
        });
        getContentPane().add(Add);
        Add.setBounds(420, 330, 150, 20);

        Remove.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Remove.setText("Remove Room");
        Remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoveActionPerformed(evt);
            }
        });
        getContentPane().add(Remove);
        Remove.setBounds(680, 320, 127, 25);

        RoomBooking.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        RoomBooking.setText("Room Booking");
        RoomBooking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RoomBookingActionPerformed(evt);
            }
        });
        getContentPane().add(RoomBooking);
        RoomBooking.setBounds(420, 230, 150, 20);

        CancelBooking.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        CancelBooking.setText("Cancel Booking");
        CancelBooking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelBookingActionPerformed(evt);
            }
        });
        getContentPane().add(CancelBooking);
        CancelBooking.setBounds(680, 230, 131, 25);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setText("Next");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(560, 450, 100, 30);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hotelmanagementsystem/Vastu-for-room-size.jpg"))); // NOI18N
        jLabel3.setMaximumSize(new java.awt.Dimension(1366, 768));
        jLabel3.setMinimumSize(new java.awt.Dimension(1366, 768));
        jLabel3.setPreferredSize(new java.awt.Dimension(1366, 768));
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 1366, 768);

        Back.setText("Back");
        Back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackMouseClicked(evt);
            }
        });
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });
        jMenuBar1.add(Back);

        Home.setText("Home");
        Home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HomeMouseClicked(evt);
            }
        });
        Home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeActionPerformed(evt);
            }
        });
        jMenuBar1.add(Home);

        Exit.setText("Exit");
        Exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExitMouseClicked(evt);
            }
        });
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });
        jMenuBar1.add(Exit);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RemoveActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
          if(RoomBooking.isSelected())
        {
           ShowAvailableRooms SAR = new ShowAvailableRooms();
           SAR.setVisible(true);
           this.setVisible(false);
        }
        else if(CancelBooking.isSelected())
        {
            BookingCancel BC = new BookingCancel();
            BC.setVisible(true);
            this.setVisible(false);
        }
        else if(Add.isSelected())
        {
           AddRoom AR = new AddRoom();
           AR.setVisible(true);
           this.setVisible(false);
        }
        else if(Remove.isSelected())
        {
            RemoveRoom RR = new RemoveRoom();
            RR.setVisible(true);
            this.setVisible(false);
        }
           
                     
    }//GEN-LAST:event_jButton1ActionPerformed

    private void AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddActionPerformed
    
    private void HomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeActionPerformed
        // TODO add your handling code here:
          
    }//GEN-LAST:event_HomeActionPerformed

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_ExitActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_BackActionPerformed

    private void HomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeMouseClicked
        // TODO add your handling code here:
          HomeMenu HM = new HomeMenu();
            HM.setVisible(true);
            this.setVisible(false);
    }//GEN-LAST:event_HomeMouseClicked

    private void BackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackMouseClicked
        // TODO add your handling code here:
        new HomeMenu().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BackMouseClicked

    private void ExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitMouseClicked
        // TODO add your handling code here:
       this.setVisible(false);
    }//GEN-LAST:event_ExitMouseClicked

    private void RoomBookingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RoomBookingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RoomBookingActionPerformed

    private void CancelBookingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelBookingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CancelBookingActionPerformed

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
            java.util.logging.Logger.getLogger(RoomProcessing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RoomProcessing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RoomProcessing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RoomProcessing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RoomProcessing().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Add;
    private javax.swing.JMenu Back;
    private javax.swing.JRadioButton CancelBooking;
    private javax.swing.JMenu Exit;
    private javax.swing.JMenu Home;
    private javax.swing.JRadioButton Remove;
    private javax.swing.JRadioButton RoomBooking;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
