/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1_bmtt;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import sun.util.logging.PlatformLogger;

/**
 *
 * @author Administrator
 */
public class CEASAR extends javax.swing.JFrame {

    /**
     * Creates new form CEASAR
     */
    public CEASAR() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtvanban = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        txtkhoa = new javax.swing.JTextField();
        btnghifile = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtmahoa = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        btndencypt = new javax.swing.JButton();
        btnmofile = new javax.swing.JButton();
        btnencypt = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Chương Trình Mã Hóa/ Giải Mã Ceasar Cipher");

        jLabel2.setText("PlainText");

        txtvanban.setColumns(20);
        txtvanban.setRows(5);
        jScrollPane1.setViewportView(txtvanban);

        jLabel3.setText("Khóa");

        btnghifile.setText("Ghi File");
        btnghifile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnghifileActionPerformed(evt);
            }
        });

        txtmahoa.setColumns(20);
        txtmahoa.setRows(5);
        jScrollPane2.setViewportView(txtmahoa);

        jLabel4.setText("Cipher Text");

        btndencypt.setText("^Dencypt^");
        btndencypt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndencyptActionPerformed(evt);
            }
        });

        btnmofile.setText("Mở File");
        btnmofile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmofileActionPerformed(evt);
            }
        });

        btnencypt.setText("Encypt");
        btnencypt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnencyptActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane2)
                                    .addComponent(jScrollPane1)
                                    .addComponent(txtkhoa, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(btnencypt)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
                                        .addComponent(btnghifile)
                                        .addGap(47, 47, 47)))))))
                .addContainerGap(38, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(btndencypt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnmofile)
                .addGap(76, 76, 76))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtkhoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnghifile)
                    .addComponent(btnencypt))
                .addGap(11, 11, 11)
                .addComponent(jLabel4)
                .addGap(1, 1, 1)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btndencypt)
                    .addComponent(btnmofile))
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btndencyptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndencyptActionPerformed
        int k = Integer.valueOf(this.txtkhoa.getText());
        String br = this.txtmahoa.getText();
        this.txtvanban.setText(mahoa(br,-k));
    }//GEN-LAST:event_btndencyptActionPerformed
    char mahoakt(char c, int k){
       if(!Character.isLetter(c))return c;
       return(char)((((Character.toUpperCase(c)-'A')+k)%26 +26)%26+'A');
    }
    private void btnencyptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnencyptActionPerformed
        int k =  Integer.valueOf(this.txtkhoa.getText());
        String br = this.txtvanban.getText();
        this.txtmahoa.setText(mahoa(br,k));
    }//GEN-LAST:event_btnencyptActionPerformed
    private String mahoa(String br,int k){
        String kq = "";
        int n = br.length();
        for(int i=0;i<n;i++)kq+=mahoakt(br.charAt(i),k);
        return kq;
    }
    private void btnghifileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnghifileActionPerformed
        try{
            BufferedWriter bw = null;
            String fileName  = "C:\\Dulieu.txt";
            String s = txtmahoa.getText();
            bw = new BufferedWriter(new FileWriter(fileName));
            bw.write(s);
            bw.close();
            JOptionPane.showMessageDialog(null,"Da ghi File Thanh Cong !!!");
        }catch(IOException ex){
           Logger.getLogger(CEASAR.class.getName()).log(Level.SEVERE,null,ex);
        }
    }//GEN-LAST:event_btnghifileActionPerformed

    private void btnmofileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmofileActionPerformed
         try{
            BufferedReader br = null;
            String fileName  = "C:\\Dulieu.txt";
            br = new BufferedReader(new FileReader(fileName));
            StringBuffer sb = new StringBuffer();
            JOptionPane.showMessageDialog(null,"Da mo File Thanh Cong !!!");
            char[] ca = new char[5];
            while(br.ready()){
              int len = br.read(ca);
              sb.append(ca,0,len);
            }
            br.close();
            System.out.println("du lieu la:" + " " +sb);
            String chuoi = sb.toString();
            txtvanban.setText(chuoi);
        }catch(IOException ex){
           Logger.getLogger(CEASAR.class.getName()).log(Level.SEVERE,null,ex);
        }
    }//GEN-LAST:event_btnmofileActionPerformed
    
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
            java.util.logging.Logger.getLogger(CEASAR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CEASAR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CEASAR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CEASAR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CEASAR().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btndencypt;
    private javax.swing.JButton btnencypt;
    private javax.swing.JButton btnghifile;
    private javax.swing.JButton btnmofile;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField txtkhoa;
    private javax.swing.JTextArea txtmahoa;
    private javax.swing.JTextArea txtvanban;
    // End of variables declaration//GEN-END:variables
}
