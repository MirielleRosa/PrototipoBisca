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
public class JanelaHospedagem extends javax.swing.JFrame {

    private static String nomeJogadores;
    public JanelaHospedagem() {
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
        tpIpGerenciador1 = new javax.swing.JTextPane();
        jogadoresConectados = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        txtJogadoresConectados = new javax.swing.JTextPane();
        IniciarJogo = new javax.swing.JButton();

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

        jScrollPane3.setViewportView(tpIpGerenciador1);

        gerenciador.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, 130, 23));

        jogadoresConectados.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Jogadores Conectados"));
        jogadoresConectados.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane5.setViewportView(txtJogadoresConectados);

        jogadoresConectados.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 470, 140));

        IniciarJogo.setBackground(new java.awt.Color(204, 204, 204));
        IniciarJogo.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        IniciarJogo.setText("Iniciar Jogo");
        IniciarJogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MesaIniciarJogo(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(gerenciador, javax.swing.GroupLayout.PREFERRED_SIZE, 496, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(IniciarJogo, javax.swing.GroupLayout.PREFERRED_SIZE, 496, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jogadoresConectados, javax.swing.GroupLayout.PREFERRED_SIZE, 496, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(gerenciador, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jogadoresConectados, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(IniciarJogo, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MesaIniciarJogo(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MesaIniciarJogo
        JanelaMesa.executaTesteDePrototipo(); 
    }//GEN-LAST:event_MesaIniciarJogo

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
            java.util.logging.Logger.getLogger(JanelaHospedagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JanelaHospedagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JanelaHospedagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JanelaHospedagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new JanelaHospedagem().setVisible(true);
            }
        });
    }
    private String receber;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton IniciarJogo;
    private javax.swing.JLabel cod;
    private javax.swing.JPanel gerenciador;
    private javax.swing.JLabel ipGerenciador;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JPanel jogadoresConectados;
    private javax.swing.JTextPane tpIpGerenciador;
    private javax.swing.JTextPane tpIpGerenciador1;
    private javax.swing.JTextPane txtJogadoresConectados;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the receber
     */
    public String getReceber() {
        return receber;
    }

    /**
     * @param receber the receber to set
     */
    public void setReceber(String receber) {
        this.receber = receber;
    }

    /**
     * @return the IniciarJogo
     */
    public javax.swing.JButton getIniciarJogo() {
        return IniciarJogo;
    }

    /**
     * @param IniciarJogo the IniciarJogo to set
     */
    public void setIniciarJogo(javax.swing.JButton IniciarJogo) {
        this.IniciarJogo = IniciarJogo;
    }

    /**
     * @return the cod
     */
    public javax.swing.JLabel getCod() {
        return cod;
    }

    /**
     * @param cod the cod to set
     */
    public void setCod(javax.swing.JLabel cod) {
        this.cod = cod;
    }

    /**
     * @return the gerenciador
     */
    public javax.swing.JPanel getGerenciador() {
        return gerenciador;
    }

    /**
     * @param gerenciador the gerenciador to set
     */
    public void setGerenciador(javax.swing.JPanel gerenciador) {
        this.gerenciador = gerenciador;
    }

    /**
     * @return the ipGerenciador
     */
    public javax.swing.JLabel getIpGerenciador() {
        return ipGerenciador;
    }

    /**
     * @param ipGerenciador the ipGerenciador to set
     */
    public void setIpGerenciador(javax.swing.JLabel ipGerenciador) {
        this.ipGerenciador = ipGerenciador;
    }

    /**
     * @return the jScrollPane2
     */
    public javax.swing.JScrollPane getjScrollPane2() {
        return jScrollPane2;
    }

    /**
     * @param jScrollPane2 the jScrollPane2 to set
     */
    public void setjScrollPane2(javax.swing.JScrollPane jScrollPane2) {
        this.jScrollPane2 = jScrollPane2;
    }

    /**
     * @return the jScrollPane3
     */
    public javax.swing.JScrollPane getjScrollPane3() {
        return jScrollPane3;
    }

    /**
     * @param jScrollPane3 the jScrollPane3 to set
     */
    public void setjScrollPane3(javax.swing.JScrollPane jScrollPane3) {
        this.jScrollPane3 = jScrollPane3;
    }

    /**
     * @return the jScrollPane5
     */
    public javax.swing.JScrollPane getjScrollPane5() {
        return jScrollPane5;
    }

    /**
     * @param jScrollPane5 the jScrollPane5 to set
     */
    public void setjScrollPane5(javax.swing.JScrollPane jScrollPane5) {
        this.jScrollPane5 = jScrollPane5;
    }

    /**
     * @return the jogadoresConectados
     */
    public javax.swing.JPanel getJogadoresConectados() {
        return jogadoresConectados;
    }

    /**
     * @param jogadoresConectados the jogadoresConectados to set
     */
    public void setJogadoresConectados(javax.swing.JPanel jogadoresConectados) {
        this.jogadoresConectados = jogadoresConectados;
    }

    /**
     * @return the tpIpGerenciador
     */
    public javax.swing.JTextPane getTpIpGerenciador() {
        return tpIpGerenciador;
    }

    /**
     * @param tpIpGerenciador the tpIpGerenciador to set
     */
    public void setTpIpGerenciador(javax.swing.JTextPane tpIpGerenciador) {
        this.tpIpGerenciador = tpIpGerenciador;
    }

    /**
     * @return the tpIpGerenciador1
     */
    public javax.swing.JTextPane getTpIpGerenciador1() {
        return tpIpGerenciador1;
    }

    /**
     * @param tpIpGerenciador1 the tpIpGerenciador1 to set
     */
    public void setTpIpGerenciador1(javax.swing.JTextPane tpIpGerenciador1) {
        this.tpIpGerenciador1 = tpIpGerenciador1;
    }

    /**
     * @return the txtJogadoresConectados
     */
    public javax.swing.JTextPane getTxtJogadoresConectados() {
        return txtJogadoresConectados;
    }

    /**
     * @param txtJogadoresConectados the txtJogadoresConectados to set
     */
    public void setTxtJogadoresConectados(javax.swing.JTextPane txtJogadoresConectados) {
        this.txtJogadoresConectados = txtJogadoresConectados;
    }
    
}
