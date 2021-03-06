/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fronteira;

/**
 *
 * @author rebeca
 */
public class TelaDiario extends javax.swing.JFrame {

    public TelaDiario() {
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

        jMenuBar1 = new javax.swing.JMenuBar();
        jM_voltar = new javax.swing.JMenu();
        jM_diario = new javax.swing.JMenu();
        jMI_obter = new javax.swing.JMenuItem();
        jMI_LancarFaltas = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela Diario");

        jM_voltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fronteira/back.png"))); // NOI18N
        jM_voltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jM_voltarMouseClicked(evt);
            }
        });
        jM_voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jM_voltarActionPerformed(evt);
            }
        });
        jMenuBar1.add(jM_voltar);

        jM_diario.setText("Diário");

        jMI_obter.setText("Obter Diario Turma");
        jMI_obter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMI_obterActionPerformed(evt);
            }
        });
        jM_diario.add(jMI_obter);

        jMI_LancarFaltas.setText("Lancar Faltas");
        jMI_LancarFaltas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMI_LancarFaltasActionPerformed(evt);
            }
        });
        jM_diario.add(jMI_LancarFaltas);

        jMenuItem2.setText("Obter Faltas do Aluno");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jM_diario.add(jMenuItem2);

        jMenuItem1.setText("Remover Falta Aluno");
        jM_diario.add(jMenuItem1);

        jMenuBar1.add(jM_diario);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 698, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 352, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jM_voltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jM_voltarMouseClicked
        dispose();
    }//GEN-LAST:event_jM_voltarMouseClicked

    private void jM_voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jM_voltarActionPerformed
        dispose();
    }//GEN-LAST:event_jM_voltarActionPerformed

    private void jMI_obterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMI_obterActionPerformed
        new TelaRelatorioDeFaltas();
    }//GEN-LAST:event_jMI_obterActionPerformed

    private void jMI_LancarFaltasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMI_LancarFaltasActionPerformed
             //new TelaChamadaJTable ();
        TelaChamada frame = new TelaChamada();  
        //frame.setDefaultCloseOperation( EXIT_ON_CLOSE );  
        frame.pack();  
        frame.setVisible(true);
        
    }//GEN-LAST:event_jMI_LancarFaltasActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaDiario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaDiario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaDiario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaDiario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaDiario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem jMI_LancarFaltas;
    private javax.swing.JMenuItem jMI_obter;
    private javax.swing.JMenu jM_diario;
    private javax.swing.JMenu jM_voltar;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    // End of variables declaration//GEN-END:variables
}



