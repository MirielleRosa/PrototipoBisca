/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package prototipobisca;

import javax.swing.JOptionPane;

/**
 *
 * @author alexandre-kde
 */
public class JanelaPlacarJogo extends javax.swing.JFrame {

    /**
     * Creates new form TelaInicial
     */
    public JanelaPlacarJogo() {
        initComponents();
        //solicitarNomeJogador();
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Confirmar = new javax.swing.JButton();
        pPlacar = new javax.swing.JPanel();
        lNomeJogador1Placar = new javax.swing.JLabel();
        lNomeJogador3Placar = new javax.swing.JLabel();
        lPlacarDupla1 = new javax.swing.JLabel();
        lNomeJogador2Placar = new javax.swing.JLabel();
        lNomeJogador4Placar = new javax.swing.JLabel();
        lPlacarDupla2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(220, 210, 179));

        Confirmar.setBackground(new java.awt.Color(204, 204, 204));
        Confirmar.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        Confirmar.setText("OK");
        Confirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmarActionPerformed(evt);
            }
        });

        pPlacar.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3), "PLACAR", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Symbol", 0, 18))); // NOI18N
        pPlacar.setOpaque(false);

        lNomeJogador1Placar.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lNomeJogador1Placar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lNomeJogador1Placar.setText("Jogador 1");

        lNomeJogador3Placar.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lNomeJogador3Placar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lNomeJogador3Placar.setText("Jogador 3");

        lPlacarDupla1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lPlacarDupla1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lPlacarDupla1.setText("0");

        lNomeJogador2Placar.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lNomeJogador2Placar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lNomeJogador2Placar.setText("Jogador 2");

        lNomeJogador4Placar.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lNomeJogador4Placar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lNomeJogador4Placar.setText("Jogador 4");

        lPlacarDupla2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lPlacarDupla2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lPlacarDupla2.setText("0");

        javax.swing.GroupLayout pPlacarLayout = new javax.swing.GroupLayout(pPlacar);
        pPlacar.setLayout(pPlacarLayout);
        pPlacarLayout.setHorizontalGroup(
            pPlacarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pPlacarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pPlacarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lNomeJogador1Placar, javax.swing.GroupLayout.DEFAULT_SIZE, 452, Short.MAX_VALUE)
                    .addComponent(lNomeJogador3Placar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lPlacarDupla1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lNomeJogador2Placar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lNomeJogador4Placar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lPlacarDupla2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pPlacarLayout.setVerticalGroup(
            pPlacarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pPlacarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lNomeJogador1Placar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lNomeJogador3Placar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lPlacarDupla1)
                .addGap(12, 12, 12)
                .addComponent(lNomeJogador2Placar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lNomeJogador4Placar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lPlacarDupla2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Confirmar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pPlacar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(pPlacar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(Confirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmarActionPerformed
        JanelaPlacarJogo.this.dispose();
    }//GEN-LAST:event_ConfirmarActionPerformed

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
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JanelaPlacarJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JanelaPlacarJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JanelaPlacarJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JanelaPlacarJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JanelaPlacarJogo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Confirmar;
    private javax.swing.JLabel lNomeJogador1Placar;
    private javax.swing.JLabel lNomeJogador2Placar;
    private javax.swing.JLabel lNomeJogador3Placar;
    private javax.swing.JLabel lNomeJogador4Placar;
    private javax.swing.JLabel lPlacarDupla1;
    private javax.swing.JLabel lPlacarDupla2;
    private javax.swing.JPanel pPlacar;
    // End of variables declaration//GEN-END:variables
}
