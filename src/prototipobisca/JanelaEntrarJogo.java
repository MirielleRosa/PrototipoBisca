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
public class JanelaEntrarJogo extends javax.swing.JFrame {

    /**
     * Creates new form TelaInicial
     */
    public JanelaEntrarJogo() {
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

        gerenciador = new javax.swing.JPanel();
        ipGerenciador = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tpIpGerenciador = new javax.swing.JTextPane();
        cod = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tplpCod = new javax.swing.JTextPane();
        EntrarNoJogo = new javax.swing.JButton();
        CarregandoHost = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(220, 210, 179));

        gerenciador.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Gerenciador"));
        gerenciador.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ipGerenciador.setText("Ip do Gerenciador: ");
        gerenciador.add(ipGerenciador, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, 23));

        jScrollPane2.setViewportView(tpIpGerenciador);

        gerenciador.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 170, 23));

        cod.setText("Código:");
        gerenciador.add(cod, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, -1, 23));

        jScrollPane3.setViewportView(tplpCod);

        gerenciador.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, 130, 23));

        EntrarNoJogo.setBackground(new java.awt.Color(204, 204, 204));
        EntrarNoJogo.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        EntrarNoJogo.setText("Entrar no Jogo");
        EntrarNoJogo.setActionCommand("Entrar no jogo");
        EntrarNoJogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MesaEntrarNoJogo(evt);
            }
        });

        CarregandoHost.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        CarregandoHost.setText("Aguardando host...");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(49, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(CarregandoHost, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gerenciador, javax.swing.GroupLayout.DEFAULT_SIZE, 489, Short.MAX_VALUE)
                    .addComponent(EntrarNoJogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(51, 51, 51))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(gerenciador, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(EntrarNoJogo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(CarregandoHost, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MesaEntrarNoJogo(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MesaEntrarNoJogo
        JanelaMesa.executaTesteDePrototipo();
    }//GEN-LAST:event_MesaEntrarNoJogo
    
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
            java.util.logging.Logger.getLogger(JanelaEntrarJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JanelaEntrarJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JanelaEntrarJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JanelaEntrarJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new JanelaEntrarJogo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CarregandoHost;
    private javax.swing.JButton EntrarNoJogo;
    private javax.swing.JLabel cod;
    private javax.swing.JPanel gerenciador;
    private javax.swing.JLabel ipGerenciador;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextPane tpIpGerenciador;
    private javax.swing.JTextPane tplpCod;
    // End of variables declaration//GEN-END:variables
}
