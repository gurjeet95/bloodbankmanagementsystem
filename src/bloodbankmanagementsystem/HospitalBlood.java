/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bloodbankmanagementsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author gurjeet_singh
 */
public class HospitalBlood extends javax.swing.JFrame {
private String name;
    /** Creates new form HospitalBlood */
    public HospitalBlood() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
     public HospitalBlood(String name) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.name=name;
        this.getInformation();
    }
     void getInformation(){
         try
{

  Connection con= DriverManager.getConnection("jdbc:mysql://localhost:8889/bloodbank","root","root");
  PreparedStatement smt=con.prepareStatement("select * from hospitalbloodavailable where hospital_name='"+name+"'");

DefaultTableModel Table=(DefaultTableModel)table.getModel();
ResultSet result=smt.executeQuery();

while(result.next())
{

int b=result.getInt(2);
int c=result.getInt(3);
int d=result.getInt(4);
int e=result.getInt(5);
int f=result.getInt(6);
int g=result.getInt(7);
int h=result.getInt(8);
int i=result.getInt(9);
Object tabledata[]={b,c,d,e,f,g,h,i};
Table.addRow(tabledata);
}      
}
catch(Exception e)
{
System.out.println(e);
}
    }
    

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        CloseButton = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        minimizeButton = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(192, 57, 43));

        CloseButton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        CloseButton.setForeground(new java.awt.Color(255, 255, 255));
        CloseButton.setText("X");
        CloseButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CloseButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CloseButtonMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Available Blood");

        minimizeButton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        minimizeButton.setForeground(new java.awt.Color(255, 255, 255));
        minimizeButton.setText("-");
        minimizeButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        minimizeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizeButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(326, Short.MAX_VALUE)
                .addComponent(minimizeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(CloseButton)
                .addGap(20, 20, 20))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(34, 34, 34)
                    .addComponent(jLabel2)
                    .addContainerGap(183, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CloseButton)
                    .addComponent(minimizeButton))
                .addGap(23, 23, 23))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(41, Short.MAX_VALUE)
                    .addComponent(jLabel2)
                    .addGap(21, 21, 21)))
        );

        jPanel2.setBackground(new java.awt.Color(44, 62, 80));

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "A+", "B+", "O+", "AB+", "A-", "B-", "O-", "AB-"
            }
        ));
        jScrollPane2.setViewportView(table);
        if (table.getColumnModel().getColumnCount() > 0) {
            table.getColumnModel().getColumn(1).setResizable(false);
            table.getColumnModel().getColumn(2).setResizable(false);
            table.getColumnModel().getColumn(3).setResizable(false);
            table.getColumnModel().getColumn(5).setResizable(false);
        }

        jButton1.setBackground(new java.awt.Color(192, 57, 43));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Back");
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(jButton1)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CloseButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseButtonMouseClicked
        System.exit(0);
    }//GEN-LAST:event_CloseButtonMouseClicked

    private void minimizeButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeButtonMouseClicked
        this.setState(Home.ICONIFIED);
    }//GEN-LAST:event_minimizeButtonMouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
       HospitalHome page = new HospitalHome(name);
       page.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_jButton1MouseClicked

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
            java.util.logging.Logger.getLogger(HospitalBlood.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HospitalBlood.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HospitalBlood.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HospitalBlood.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HospitalBlood().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CloseButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel minimizeButton;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables

}
