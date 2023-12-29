/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Nomor2;

/**
 *
 * @author USER
 */
public class KonversiNilaiMatkul extends javax.swing.JFrame {

    /**
     * Creates new form KonversiNilaiMatkul
     */
    public KonversiNilaiMatkul() {
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
        angka = new javax.swing.JTextField();
        huruf = new javax.swing.JTextField();
        KonversiAngka = new javax.swing.JButton();
        KonversiHuruf = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Angka");

        jLabel2.setText("Huruf");

        angka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                angkaActionPerformed(evt);
            }
        });

        huruf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hurufActionPerformed(evt);
            }
        });

        KonversiAngka.setText("Konversi ke huruf");
        KonversiAngka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KonversiAngkaActionPerformed(evt);
            }
        });

        KonversiHuruf.setText("Konversi ke angka");
        KonversiHuruf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KonversiHurufActionPerformed(evt);
            }
        });

        jButton1.setText("Hapus");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(angka, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(huruf, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(KonversiAngka, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(KonversiHuruf, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(61, 61, 61))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(153, 153, 153))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(angka, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(KonversiAngka))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(huruf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(KonversiHuruf)))
                .addGap(47, 47, 47)
                .addComponent(jButton1)
                .addContainerGap(61, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void KonversiHurufActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KonversiHurufActionPerformed
        String nilai = huruf.getText();
        angka.setText(nilaiAngka(nilai));
      
    }//GEN-LAST:event_KonversiHurufActionPerformed

    private void KonversiAngkaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KonversiAngkaActionPerformed
        int nilai = Integer.parseInt(angka.getText());
        huruf.setText(nilaiHuruf(nilai));
            
        
    }//GEN-LAST:event_KonversiAngkaActionPerformed

    private void hurufActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hurufActionPerformed
        
    }//GEN-LAST:event_hurufActionPerformed
    
    private String nilaiHuruf(int nilai) {
        String Huruf;
        
        if(nilai <=100 && nilai >= 85) {
            Huruf = "A";
        }else if (nilai <= 85 && nilai >=80) {
            Huruf = "A-";
        }else if (nilai <= 79 && nilai >=75) {
            Huruf = "B+";
        }else if (nilai <= 74 && nilai >= 70) {
            Huruf = "B";
        }else if (nilai >= 69 && nilai >= 65) {
            Huruf = "B-";
        }else if ( nilai >= 64 && nilai >= 50) {
            Huruf = "C";
        }else if (nilai <= 49 && nilai >= 40) {
            Huruf = "D";
        }else if (nilai <= 39 && nilai >= 0) {
            Huruf = "E";
        }else {
            Huruf = "Nilai tidak valid";
        }
        return Huruf;
    }
    
    private String nilaiAngka(String nilai) {
        String Angka;
        
        if (nilai.equalsIgnoreCase("A")) {
            Angka = "85-100";
        }else if (nilai.equalsIgnoreCase("A-")) {
            Angka = "80-84";
        }else if (nilai.equalsIgnoreCase("B+")) {
            Angka = "75-79";
        }else if (nilai.equalsIgnoreCase("B")) {
            Angka = "70-74";
        }else if (nilai.equalsIgnoreCase("B-")) {
            Angka = "65-69";
        }else if (nilai.equalsIgnoreCase("C")) {
            Angka = "50-54";
        }else if (nilai.equalsIgnoreCase("D")) {
            Angka = "40-49";
        }else if (nilai.equalsIgnoreCase("E")) {
            Angka = "0-40";
        }else{
            Angka = "Huruf tidak valid";
        }
        return Angka;
        
    }
    private void angkaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_angkaActionPerformed
        
    }//GEN-LAST:event_angkaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        angka.setText("");
        huruf.setText("");
        angka.requestFocus();
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
            java.util.logging.Logger.getLogger(KonversiNilaiMatkul.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KonversiNilaiMatkul.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KonversiNilaiMatkul.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KonversiNilaiMatkul.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KonversiNilaiMatkul().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton KonversiAngka;
    private javax.swing.JButton KonversiHuruf;
    private javax.swing.JTextField angka;
    private javax.swing.JTextField huruf;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
