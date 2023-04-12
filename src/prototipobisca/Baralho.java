package prototipobisca;

import java.awt.Image;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.ImageIcon;

/**
 *
 * @author alexandre-kde
 */
public class Baralho {
    // naipe
    public enum Naipe {
        Copas,
        Espadas,
        Ouros,
        Paus
    }
    
    // carta
    public enum Carta {
        As,
        Dois,
        Tres,
        Quatro,
        Cinco,
        Seis,
        Sete,
        Dama,
        Valete,
        Rei
    }
    
    public class EstruturaCarta {
        public Naipe naipe;
        public Carta carta;
        public EstruturaCarta(Naipe n, Carta c) {
            naipe = n;
            carta = c;
        }
        public EstruturaCarta(int indiceCarta) {
            int indNaipe = indiceCarta / 10;
            int indCarta = indiceCarta % 10;
            naipe = Naipe.values()[indNaipe];
            carta = Carta.values()[indCarta];
        }
        public int obtemIndiceCarta() {
            return naipe.ordinal() * 10 + carta.ordinal();
        }
        /*public static int obtemIndiceCarta(Naipe n, Carta c) {
            return n.ordinal() * 10 + c.ordinal();
        }*/
    }
    
    // lista de cartas+naipe
    private ArrayList<EstruturaCarta> listaCartas;
    private ArrayList<ImageIcon> listaIcones;
    
    public Baralho() {
        listaCartas = new ArrayList<>();
        listaIcones = new ArrayList<>();
        
        for (Naipe n : Naipe.values()) {
            for (Carta c : Carta.values()) {
                EstruturaCarta ec = new EstruturaCarta(n, c);
                listaCartas.add(ec);
                listaIcones.add(getIcone(n, c));
            }
        }
    }
    
    public int obtemIndiceCarta(Naipe n, Carta c) {
        return n.ordinal() * 10 + c.ordinal();
    }
    
    public ImageIcon obtemIconeCarta(Naipe n, Carta c) {
        int indice = obtemIndiceCarta(n, c);
        return listaIcones.get(indice);
    }
    
    public ImageIcon obtemIconeCarta(int indiceCarta) {
        return listaIcones.get(indiceCarta);
    }
    
    public void embaralhar() {
        Collections.shuffle(listaCartas);
    }
    
    public EstruturaCarta retirarCarta() {
        return listaCartas.remove(listaCartas.size() - 1);
    }
    
    public void devolverCartas(ArrayList<EstruturaCarta> cartas) {
        listaCartas.addAll(cartas);
    }
    
    private ImageIcon getIcone(Naipe n, Carta c) {
        String nomeArquivoIcone = getNomeArquivoIcone(n, c);
        ImageIcon icone = new ImageIcon(getClass().getResource(nomeArquivoIcone));
        Image imagem = icone.getImage();
        Image novaImagem = imagem.getScaledInstance(60, 87, Image.SCALE_SMOOTH);
        icone = new ImageIcon(novaImagem);
        return icone;
    }
    
    private String getNomeArquivoIcone(Naipe n, Carta c) {
        String strNaipe = getStrNaipe(n);
        String strCarta = getStrCarta(c);
        String op = "";
        if (c == Carta.Valete || c == Carta.Dama || c == Carta.Rei) {
            op = "_en";
        }
        return "/img/" + strCarta + "_of_" + strNaipe + op + ".svg.png";
    }
    
    private String getStrNaipe(Naipe n) {
        switch (n) {
            case Copas:
                return "hearts";
            case Espadas:
                return "spades";
            case Ouros:
                return "diamonds";
            case Paus:
                return "clubs";
        }
        return null;
    }
    
    private String getStrCarta(Carta c) {
        switch (c) {
            case As:
                return "01";
            case Dois:
                return "02";
            case Tres:
                return "03";
            case Quatro:
                return "04";
            case Cinco:
                return "05";
            case Seis:
                return "06";
            case Sete:
                return "07";
            case Valete:
                return "Jack";
            case Dama:
                return "Queen";
            case Rei:
                return "King";
        }
        return null;
    }
}
