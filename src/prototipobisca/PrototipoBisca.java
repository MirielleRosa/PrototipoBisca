package prototipobisca;

import java.util.ArrayList;
import javax.swing.JTextField;

/**
 *
 * @author alexandre-kde
 */
public class PrototipoBisca {
   
 
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                JanelaInicial janela = new JanelaInicial();
                janela.setVisible(true);
                
                //JanelaMesa.executaTesteDePrototipo();
            }
        });
    }
    
}
