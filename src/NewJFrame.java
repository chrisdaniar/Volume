
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Chrisdaniar
 */
public class NewJFrame extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
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

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanjangBalok = new javax.swing.JTextField();
        jLebarBalok = new javax.swing.JTextField();
        jTinggiBalok = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        BtnBalok = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jSisiKubus = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        BtnKubus = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jJariBola = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        BtnBola = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Masukkan Panjang ");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(80, 60, 130, 15);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Masukkan Lebar");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(80, 100, 110, 15);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Masukkan Tinggi");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(80, 140, 120, 15);
        jPanel1.add(jPanjangBalok);
        jPanjangBalok.setBounds(240, 50, 120, 30);
        jPanel1.add(jLebarBalok);
        jLebarBalok.setBounds(240, 90, 120, 30);
        jPanel1.add(jTinggiBalok);
        jTinggiBalok.setBounds(240, 130, 120, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Cm");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(370, 60, 19, 15);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Cm");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(370, 100, 19, 15);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Cm");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(370, 140, 19, 15);

        BtnBalok.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BtnBalok.setText("Hitung");
        BtnBalok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBalokActionPerformed(evt);
            }
        });
        jPanel1.add(BtnBalok);
        BtnBalok.setBounds(190, 200, 90, 23);

        jTabbedPane1.addTab("Balok", jPanel1);

        jPanel3.setLayout(null);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Masukkan Panjang Sisi");
        jPanel3.add(jLabel10);
        jLabel10.setBounds(30, 40, 150, 15);
        jPanel3.add(jSisiKubus);
        jSisiKubus.setBounds(50, 70, 130, 30);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("Cm");
        jPanel3.add(jLabel11);
        jLabel11.setBounds(190, 80, 19, 15);

        BtnKubus.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BtnKubus.setText("Volume");
        BtnKubus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnKubusActionPerformed(evt);
            }
        });
        jPanel3.add(BtnKubus);
        BtnKubus.setBounds(90, 120, 80, 23);

        jTabbedPane1.addTab("Kubus", jPanel3);

        jPanel2.setLayout(null);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Masukkan Panjang Jari-jari");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(30, 40, 180, 15);
        jPanel2.add(jJariBola);
        jJariBola.setBounds(50, 70, 130, 30);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Cm");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(190, 80, 19, 15);

        BtnBola.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BtnBola.setText("Volume");
        BtnBola.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBolaActionPerformed(evt);
            }
        });
        jPanel2.add(BtnBola);
        BtnBola.setBounds(90, 120, 80, 23);

        jTabbedPane1.addTab("Bola", jPanel2);

        getContentPane().add(jTabbedPane1);
        jTabbedPane1.setBounds(0, 60, 540, 290);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Program Pencari Volume Bangun Ruang");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(120, 30, 290, 14);

        setBounds(0, 0, 549, 383);
    }// </editor-fold>//GEN-END:initComponents

    private void BtnBalokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBalokActionPerformed
       int panjang,lebar,tinggi;
       panjang=Integer.parseInt(jPanjangBalok.getText());
       lebar=Integer.parseInt(jLebarBalok.getText());
       tinggi=Integer.parseInt(jTinggiBalok.getText());
       int hasil=panjang*lebar*tinggi;
       try{
           JOptionPane.showMessageDialog(null,"Volume Balok Adalah :"+hasil,"luas",
                   JOptionPane.INFORMATION_MESSAGE);
       }catch (Exception e){
           JOptionPane.showMessageDialog(null,"Error : "+hasil,"Gagal",
                   JOptionPane.WARNING_MESSAGE);
       }
    }//GEN-LAST:event_BtnBalokActionPerformed

    private void BtnKubusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnKubusActionPerformed
        int sisi;
        sisi=Integer.parseInt(jSisiKubus.getText());
        int hasil=sisi*sisi*sisi;
        
        try{
            JOptionPane.showMessageDialog(null,"Luas Permukaan Kubus Adalah :"+hasil,"luas",
                   JOptionPane.INFORMATION_MESSAGE);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error :"+hasil,"Gagal",
                   JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_BtnKubusActionPerformed

    private void BtnBolaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBolaActionPerformed
        float jari;
        jari=Integer.parseInt(jJariBola.getText());
        float hasil1=(float) (4/3*3.14*jari*jari*jari);
        
        try{
            JOptionPane.showMessageDialog(null,"Luas Permukaan Bola Adalah :"+hasil1,"luas",
                   JOptionPane.INFORMATION_MESSAGE);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error :"+e,"gagal",
                   JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_BtnBolaActionPerformed

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnBalok;
    private javax.swing.JButton BtnBola;
    private javax.swing.JButton BtnKubus;
    private javax.swing.JTextField jJariBola;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jLebarBalok;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jPanjangBalok;
    private javax.swing.JTextField jSisiKubus;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTinggiBalok;
    // End of variables declaration//GEN-END:variables
}
