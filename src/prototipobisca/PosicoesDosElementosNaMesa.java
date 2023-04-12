package prototipobisca;

import java.awt.Point;

/**
 *
 * @author alexandre-zorin
 */
public class PosicoesDosElementosNaMesa {
    public static final int ComprimentoCartaVertical = 60;
    public static final int AlturaCartaVertical = 87;
    
    public static final int ComprimentoLoading = 32;
    public static final int AlturaLoading = 32;
    
    public static final Point PosNomeTopo = new Point(252, 10);
    public static final Point PosNomeEsquerda = new Point(30, 402);
    public static final Point PosNomeDireita = new Point(470, 402);
    public static final Point PosNomeAbaixo = new Point(252, 585);
    
    public static final Point PosLoadingTopo = new Point(165, 68);
    public static final Point PosLoadingEsquerda = new Point(60, 153);
    public static final Point PosLoadingDireita = new Point(527, 153);
    public static final Point PosLoadingAbaixo = new Point(165, 516);
    
    public static final Point PosCartaMaoTopo1 = new Point(220, 41);
    public static final Point PosCartaMaoTopo2 = new Point(280, 41);
    public static final Point PosCartaMaoTopo3 = new Point(340, 41);
    
    public static final Point PosCartaMaoEsquerda1 = new Point(32, 208);
    public static final Point PosCartaMaoEsquerda2 = new Point(32, 268);
    public static final Point PosCartaMaoEsquerda3 = new Point(32, 328);
    
    public static final Point PosCartaMaoDireita1 = new Point(500, 208);
    public static final Point PosCartaMaoDireita2 = new Point(500, 268);
    public static final Point PosCartaMaoDireita3 = new Point(500, 328);
    
    public static final Point PosCartaMaoAbaixo1 = new Point(220, 488);
    public static final Point PosCartaMaoAbaixo2 = new Point(280, 488);
    public static final Point PosCartaMaoAbaixo3 = new Point(340, 488);
    public static final int DeslocamentoCartaMaoPreSelecionada = 10;
    
    public static final Point PosCartaJogadaTopo = new Point(281, 146);
    public static final Point PosCartaJogadaEsquerda = new Point(169, 256);
    public static final Point PosCartaJogadaDireita = new Point(396, 256);
    public static final Point PosCartaJogadaAbaixo = new Point(281, 375);
    
    public static final Point PosBaralho = new Point(266, 282);
    public static final Point PosCartaTrunfo = new Point(280, 254);
    
    public static final Point[] PosNomesJogadores = { PosNomeAbaixo, PosNomeDireita, PosNomeTopo, PosNomeEsquerda };
    
    public static final Point[][] PosCartasMaosJogadores = {
        { PosCartaMaoAbaixo1, PosCartaMaoAbaixo2, PosCartaMaoAbaixo3 },
        { PosCartaMaoDireita1, PosCartaMaoDireita2, PosCartaMaoDireita3 },
        { PosCartaMaoTopo1, PosCartaMaoTopo2, PosCartaMaoTopo3 },
        { PosCartaMaoEsquerda1, PosCartaMaoEsquerda2, PosCartaMaoEsquerda3 }
    };
    
    public static final Point[] PosLoadingJogadores = { PosLoadingAbaixo, PosLoadingDireita, PosLoadingTopo, PosLoadingEsquerda };
    
    public static final Point[] PosCartasJogadas = { PosCartaJogadaAbaixo, PosCartaJogadaDireita, PosCartaJogadaTopo, PosCartaJogadaEsquerda };
}
