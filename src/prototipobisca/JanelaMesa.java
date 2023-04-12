
package prototipobisca;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.Timer;
import org.netbeans.lib.awtextra.AbsoluteConstraints;

/**
 * Esta janela exibe a mesa de jogo para a bisca. Esta classe implementa as
 * funções necessárias para os eventos de uma partida, que são:
 * 1) Apresentação das cartas distribuídas aos jogadores, do baralho ao centro e da carta-trunfo.
 * 2) Seleção de carta para jogar (primeiro clique para selecionar; segundo clique para jogar).
 * 3) Visualização das cartas jogadas.
 * 4) Ocultação das cartas jogadas (fim da rodada).
 * 
 * @author Alexandre Romanelli
 */
public class JanelaMesa extends javax.swing.JFrame {
    
    private static String txtNomeJogador;
    private Baralho baralho;
    /**
     * As cartas que foram distribuídas ao jogador que está usando a instância corrente do programa.
     * Adiante, o jogador que usa esta instância será chamado de "este jogador".
     */
    private ArrayList<Baralho.EstruturaCarta> cartasNaMaoDesteJogador;
    
    private int numeroDeJogadores;
    
    /**
     * Índice que este jogador ocupa na lista de jogadores no contexto global
     * (como foram atribuídos pelo host).
     */
    private int indiceGlobalDesteJogador;
    
    /**
     * Labels dos nomes dos jogadores para exibição na mesa.
     */
    private ArrayList<JLabel> nomesJogadores;
    
    /**
     * Lista de elementos que são listas de labels para exibir as cartas nas
     * mãos dos jogadores.
     */
    private ArrayList<ArrayList<JLabel>> maosJogadores;
    
    /**
     * Indica o slot da carta pré-selecionada para jogar, ou -1 se não houver pré-seleção.
     */
    private int slotPreSelecaoCarta;
    
    /**
     * Labels para exibir os indicadores de espera por jogada.
     */
    private ArrayList<JLabel> indicadoresDeEsperaPorJogada;
    
    /**
     * Labels para exibir as cartas jogadas à mesa pelos jogadores.
     */
    private ArrayList<JLabel> cartasJogadas;
    
    private JLabel exibicaoMonteBaralho;
    private JLabel exibicaoCartaTrunfo;
    
    /**
     * Usado para teste do protótipo da janela de interface da mesa de jogo.
     * 
     * @param ind
     * @param cartas 
     */
    private void simulaJogadaDeAdversario(int ind, ArrayList<Baralho.EstruturaCarta> cartas) {
        final int indGlobalAdversario = (indiceGlobalDesteJogador + ind + 1) % 4;
        atualizaExibicaoIndicadorDeEsperaPorJogada(indGlobalAdversario, true);
        final int indAdversario = ind;
        final JanelaMesa janela = this;
        ActionListener executaJogadaAdversario = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                exibeJogada(indGlobalAdversario, cartas.get(indAdversario).obtemIndiceCarta());
                atualizaExibicaoIndicadorDeEsperaPorJogada(indGlobalAdversario, false);
                if (indAdversario < 2) {
                    simulaJogadaDeAdversario(indAdversario + 1, cartas);
                } else {
                    Timer t = new Timer(1000, new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            ocultaCartasJogadas();
                            JanelaPlacarJogo placar = new JanelaPlacarJogo();
                            placar.setVisible(true);
                        }
                    });
                    t.setRepeats(false);
                    t.start();
                }
            }
        };
        Timer t = new Timer(2000, executaJogadaAdversario);
        t.setRepeats(false);
        t.start();
    }
    
    /**
     * Usado para teste do protótipo da janela de interface da mesa de jogo.
     */
    private void simulaJogadasDeAdversarios() {
        // obtém cartas para jogar
        ArrayList<Baralho.EstruturaCarta> cartas = new ArrayList<>();
        for (int i = 0; i < 6; ++i) { // pega as 6 primeiras cartas (3 foram exibidas para este jogador, as demais serão jogadas pelos adversários)
            cartas.add(baralho.retirarCarta());
        }
        baralho.devolverCartas(cartas); // recoloca as cartas no baralho (mas fica com as referências no array list cartas)
        for (int i = 0; i < 3; ++i) { // remove 3 cartas do início deste array list, para ficar apenas com as que serão jogadas pelos adversários
            cartas.remove(0);
        }

        simulaJogadaDeAdversario(0, cartas);
    }
    
    /**
     * Este construtor da classe JanelaMesa carrega os arquivos de imagem para a memória,
     * cria os labels para exibição das cartas na mesa (nas mãos dos jogadores, jogadas, ou
     * no centro da mesa), inclui esses labels no frame e ajusta suas posições de acordo com 
     * os parâmetros da classe PosicoesDosElementosNaMesa, organiza os labels em listas para 
     * facilitar a manipulação, e executa o método para configuração da manipulação de eventos.
     * 
     * @param numeroDeJogadores o número de jogadores que participarão do jogo.
     * @param indiceGlobalDesteJogador o número sequencial deste jogador na lista de jogadores no host.
     * @param strNomesJogadores um ArrayList com os nomes dos jogadores em strings.
     */
    public JanelaMesa(int numeroDeJogadores, int indiceGlobalDesteJogador,
            ArrayList<String> strNomesJogadores) {
        initComponents();
        this.setTitle("Bisca - Mesa de Jogo");
        getContentPane().setBackground(new java.awt.Color(0, 102, 0));

        ImageIcon iconeFundoVertical = new ImageIcon(getClass().getResource("/img/verso_vertical.png"));
        Image imagem = iconeFundoVertical.getImage();
        Image novaImagem = imagem.getScaledInstance(PosicoesDosElementosNaMesa.ComprimentoCartaVertical, 
                PosicoesDosElementosNaMesa.AlturaCartaVertical, Image.SCALE_SMOOTH);
        iconeFundoVertical = new ImageIcon(novaImagem);

        ImageIcon iconeFundoHorizontal = new ImageIcon(getClass().getResource("/img/verso_horizontal.png"));
        imagem = iconeFundoHorizontal.getImage();
        novaImagem = imagem.getScaledInstance(PosicoesDosElementosNaMesa.AlturaCartaVertical, 
                PosicoesDosElementosNaMesa.ComprimentoCartaVertical, Image.SCALE_SMOOTH);
        iconeFundoHorizontal = new ImageIcon(novaImagem);

        ImageIcon iconeLoading = new ImageIcon(getClass().getResource("/img/loading-buffering.gif"));
        
        baralho = new Baralho();
        cartasNaMaoDesteJogador = new ArrayList<>();
        this.numeroDeJogadores = numeroDeJogadores;
        this.indiceGlobalDesteJogador = indiceGlobalDesteJogador;
        nomesJogadores = new ArrayList<>(4);
        maosJogadores = new ArrayList<>(4);
        for (int i = 0; i < 4; ++i) {
            maosJogadores.add(new ArrayList<>());
        }
        indicadoresDeEsperaPorJogada = new ArrayList<>(4);
        cartasJogadas = new ArrayList<>(4);
        
        Font fontNomeJogador = new Font(Font.SANS_SERIF, Font.PLAIN, 23);
        for (int i = 0; i < 4; ++i) {
            JLabel jLabel_NomeJogador = new JLabel(strNomesJogadores.get((indiceGlobalDesteJogador + i) % 4));
            jLabel_NomeJogador.setFont(fontNomeJogador);
            jLabel_NomeJogador.setForeground(Color.black);
            getContentPane().add(jLabel_NomeJogador, 
                    new AbsoluteConstraints(PosicoesDosElementosNaMesa.PosNomesJogadores[i].x, 
                            PosicoesDosElementosNaMesa.PosNomesJogadores[i].y));
            if (numeroDeJogadores == 2 && i % 2 != 0) {
                jLabel_NomeJogador.setVisible(false);
            }
            nomesJogadores.add(jLabel_NomeJogador);

            int comprimento = PosicoesDosElementosNaMesa.ComprimentoCartaVertical;
            int altura = PosicoesDosElementosNaMesa.AlturaCartaVertical;

            JLabel jLabel_Carta = new JLabel();
            int x = PosicoesDosElementosNaMesa.PosCartasJogadas[i].x;
            int y = PosicoesDosElementosNaMesa.PosCartasJogadas[i].y;
            getContentPane().add(jLabel_Carta, 
                    new AbsoluteConstraints(x, y, comprimento, altura));
            jLabel_Carta.setVisible(false);
            cartasJogadas.add(jLabel_Carta);
            
            if (i == 1 || i == 3) {
                comprimento = PosicoesDosElementosNaMesa.AlturaCartaVertical;
                altura = PosicoesDosElementosNaMesa.ComprimentoCartaVertical;
            }

            for (int j = 0; j < 3; ++j) {
                jLabel_Carta = new JLabel();
                if (i == 1 || i == 3) {
                    jLabel_Carta.setIcon(iconeFundoHorizontal);
                } else if (i == 2) {
                    jLabel_Carta.setIcon(iconeFundoVertical);
                }
                x = PosicoesDosElementosNaMesa.PosCartasMaosJogadores[i][j].x;
                y = PosicoesDosElementosNaMesa.PosCartasMaosJogadores[i][j].y;
                getContentPane().add(jLabel_Carta, 
                        new AbsoluteConstraints(x, y, comprimento, altura));
                jLabel_Carta.setVisible(false);
                maosJogadores.get(i).add(jLabel_Carta);
            }
            
            JLabel jLabel_Loading = new JLabel(iconeLoading);
            x = PosicoesDosElementosNaMesa.PosLoadingJogadores[i].x;
            y = PosicoesDosElementosNaMesa.PosLoadingJogadores[i].y;
            getContentPane().add(jLabel_Loading,
                    new AbsoluteConstraints(x, y, 
                            PosicoesDosElementosNaMesa.ComprimentoLoading, 
                            PosicoesDosElementosNaMesa.AlturaLoading));
            jLabel_Loading.setVisible(false);
            indicadoresDeEsperaPorJogada.add(jLabel_Loading);
        }
        
        slotPreSelecaoCarta = -1;
        defineEventListenerCartasDesteJogador();
        
        exibicaoMonteBaralho = new JLabel(iconeFundoHorizontal);
        int x = PosicoesDosElementosNaMesa.PosBaralho.x;
        int y = PosicoesDosElementosNaMesa.PosBaralho.y;
        getContentPane().add(exibicaoMonteBaralho, 
                new AbsoluteConstraints(x, y, 
                        PosicoesDosElementosNaMesa.AlturaCartaVertical, 
                        PosicoesDosElementosNaMesa.ComprimentoCartaVertical));
        exibicaoMonteBaralho.setVisible(false);
        
        exibicaoCartaTrunfo = new JLabel();
        x = PosicoesDosElementosNaMesa.PosCartaTrunfo.x;
        y = PosicoesDosElementosNaMesa.PosCartaTrunfo.y;
        getContentPane().add(exibicaoCartaTrunfo, 
                new AbsoluteConstraints(x, y, 
                        PosicoesDosElementosNaMesa.ComprimentoCartaVertical, 
                        PosicoesDosElementosNaMesa.AlturaCartaVertical));
        exibicaoCartaTrunfo.setVisible(false);

        this.pack();
        this.setSize(624, 660);
    }

    /**
     * Mapeia os índices dos jogadores no contexto global (como foram atribuídos
     * pelo host) para os índices dos jogadores no contexto global (como estão
     * apresentados na mesa do ponto de vista deste jogador).
     * 
     * @param indiceGlobal é a posição que o jogador ocupa na lista de jogadores no host.
     * @return a posição que o jogador indicado pelo índice global ocupa na lista local.
     */
    private int indiceLocal(int indiceGlobal) {
        if (numeroDeJogadores == 4) {
            return (indiceGlobal + 4 - indiceGlobalDesteJogador) % 4; // ver tabela abaixo
            // IGJ: indiceGlobalDesteJogador
            // IG: indiceGlobal
            // IL: indiceLocal
            // IGJ  IG  IL
            //   0   0   0
            //   0   1   1
            //   0   2   2
            //   0   3   3
            //   1   0   3
            //   1   1   0
            //   1   2   1
            //   1   3   2
            //   2   0   2
            //   2   1   3
            //   2   2   0
            //   2   3   1
            //   3   0   1
            //   3   1   2
            //   3   2   3
            //   3   3   0
        } else { // if (numeroDeJogadores == 2)
            return indiceGlobal == indiceGlobalDesteJogador ? 0 : 2;
        }
    }
    
    /**
     * Ajusta a exibição da carta pré-selecionada, para destacá-la das demais.
     * A carta é pré-selecionada através do clique no label que a exibe na janela.
     * 
     * @param slot indica qual é a posição ocupada pela carta pré-selecionada entre as
     *             três vagas para exibição de cartas na mão deste jogador.
     */
    public void atualizaPreSelecaoCarta(int slot) {
        if (slotPreSelecaoCarta >= 0) {
            // remover pré-seleção anterior
            maosJogadores.get(0).get(slotPreSelecaoCarta).setBounds(
                    PosicoesDosElementosNaMesa.PosCartasMaosJogadores[0][slotPreSelecaoCarta].x, 
                    PosicoesDosElementosNaMesa.PosCartasMaosJogadores[0][slotPreSelecaoCarta].y, 
                    PosicoesDosElementosNaMesa.ComprimentoCartaVertical, 
                    PosicoesDosElementosNaMesa.AlturaCartaVertical);
        }
        if (slot != slotPreSelecaoCarta) {
            // remover carta do slot indicado e re-adicionar na posição de destaque
            maosJogadores.get(0).get(slot).setBounds(
                            PosicoesDosElementosNaMesa.PosCartasMaosJogadores[0][slot].x, 
                            PosicoesDosElementosNaMesa.PosCartasMaosJogadores[0][slot].y - PosicoesDosElementosNaMesa.DeslocamentoCartaMaoPreSelecionada, 
                            PosicoesDosElementosNaMesa.ComprimentoCartaVertical, 
                            PosicoesDosElementosNaMesa.AlturaCartaVertical);
            slotPreSelecaoCarta = slot;
        } else {
            executaJogada(slot);
            slotPreSelecaoCarta = -1;
        }
    }
    
    /**
     * Toma uma carta da mão do jogador e a exibe na posição próxima às cartas deste jogador.
     * [TO DO] Além disso, também aciona o método que trata do processamento desta jogada (informa
     * aos demais jogadores qual foi a jogada efetuada e registra a jogada para fins de
     * análise do vencedor da rodada e posterior cálculo de pontuação da partida).
     * 
     * @param slot posição ocupada pela carta selecionada para jogar.
     */
    private void executaJogada(int slot) {
        int indiceCarta = cartasNaMaoDesteJogador.get(slot).obtemIndiceCarta();
        
        // processa jogada
        // ...
        
        // exibe jogada
        exibeJogada(indiceGlobalDesteJogador, indiceCarta);
        
        // apenas para teste:
        simulaJogadasDeAdversarios();
    }
    
    /**
     * Configura a manipulação de eventos de clique sobre os labels que exibem as
     * cartas na mão deste jogador.
     */
    private void defineEventListenerCartasDesteJogador() {
        final JanelaMesa autoreferencia = this;
        for (int i = 0; i < 3; ++i) {
            final int slot = i;
            maosJogadores.get(0).get(i).addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    autoreferencia.atualizaPreSelecaoCarta(slot);
                }
            });
        }
    }

    /**
     * Faz a atualização do número de cartas exibidas na mão de um jogador.
     * 
     * @param indiceGlobalJogador o número sequencial do jogador na lista de jogadores no host.
     * @param numeroCartas o número de cartas que devem ser exibidas na mão do jogador indicado.
     */
    public void atualizaNumeroCartasMaoJogador(int indiceGlobalJogador, int numeroCartas) {
        int indLocal = indiceLocal(indiceGlobalJogador);
        for (int i = 0; i < 3; ++i) {
            maosJogadores.get(indLocal).get(i).setVisible(i < numeroCartas);
        }
    }
    
    /**
     * Faz a atualização da exibição do baralho e da carta-trunfo no centro da janela.
     * 
     * @param baralhoVisivel indica se o baralho deve estar visível.
     * @param cartaTrunfoVisivel indica se a carta-trunfo deve estar visível.
     * @param indiceCartaTrunfo indica qual é a carta que deve ser exibida como carta-trunfo.
     */
    public void atualizaExibicaoBaralho(boolean baralhoVisivel, boolean cartaTrunfoVisivel, int indiceCartaTrunfo) {
        exibicaoMonteBaralho.setVisible(baralhoVisivel);
        exibicaoCartaTrunfo.setIcon(baralho.obtemIconeCarta(indiceCartaTrunfo));
        exibicaoCartaTrunfo.setVisible(baralhoVisivel);
    }
    
    /**
     * Oculta as cartas jogadas na mesa.
     */
    public void ocultaCartasJogadas() {
        for (int i = 0; i < 4; ++i) {
            cartasJogadas.get(i).setVisible(false);
        }
    }
    
    /**
     * Conta o número de cartas que estão exibidas na mão de um jogador.
     * 
     * @param indiceGlobalJogador o número sequencial do jogador na lista de jogadores no host.
     * @return o número de cartas que estão atualmente exibidas na mão do jogador indicado.
     */
    public int numeroCartasExibidasMaoJogador(int indiceGlobalJogador) {
        int indLocal = indiceLocal(indiceGlobalJogador);
        int contagem = 0;
        for (int i = 0; i < 3; ++i) {
            if (maosJogadores.get(indLocal).get(i).isVisible()) {
                ++contagem;
            }
        }
        return contagem;
    }
    
    /**
     * Exibe ou oculta o indicador de espera por jogada, que é uma imagem animada para
     * mostrar ao usuário quem é o jogador da vez.
     * 
     * @param indiceGlobalJogador o número sequencial do jogador na lista de jogadores no host.
     * @param visivel informa se o indicador será exibido ou ocultado.
     */
    public void atualizaExibicaoIndicadorDeEsperaPorJogada(int indiceGlobalJogador, boolean visivel) {
        for (JLabel labelIndicador : indicadoresDeEsperaPorJogada) {
            labelIndicador.setVisible(false);
        }
        indicadoresDeEsperaPorJogada.get(indiceLocal(indiceGlobalJogador)).setVisible(visivel);
    }
    
    /**
     * Mostra a carta jogada por um jogador no label correspondente.
     * 
     * @param indiceGlobalJogador o número sequencial do jogador na lista de jogadores no host.
     * @param indiceCarta indica qual é a carta que deve ser exibida.
     */
    public void exibeJogada(int indiceGlobalJogador, int indiceCarta) {
        int indLocal = indiceLocal(indiceGlobalJogador);
        
        if (indiceGlobalJogador != indiceGlobalDesteJogador) {
            int numeroCartasMaoJogador = numeroCartasExibidasMaoJogador(indiceGlobalJogador);
            atualizaNumeroCartasMaoJogador(indiceGlobalJogador, numeroCartasMaoJogador - 1);
        } else {
            for (int i = 0; i < cartasNaMaoDesteJogador.size(); ++i) {
                int indCarta = cartasNaMaoDesteJogador.get(i).obtemIndiceCarta();
                if (indCarta == indiceCarta) {
                    for (int j = i + 1; j < cartasNaMaoDesteJogador.size(); ++j) {
                        maosJogadores.get(0).get(j - 1).setIcon(maosJogadores.get(0).get(j).getIcon());
                    }
                    maosJogadores.get(0).get(cartasNaMaoDesteJogador.size() - 1).setVisible(false);
                    cartasNaMaoDesteJogador.remove(i);
                    break;
                }
            }
        }
        cartasJogadas.get(indLocal).setIcon(baralho.obtemIconeCarta(indiceCarta));
        cartasJogadas.get(indLocal).setVisible(true);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 102, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void executaTesteDePrototipo() {
        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Astolfo");
        nomes.add("Ernesto");
        nomes.add("Agripina");
        nomes.add("Rosivalda");
        
        JanelaMesa janela = new JanelaMesa(4, 0, nomes);
        janela.setVisible(true);

        janela.baralho.embaralhar();

        ActionListener exibeBaralho = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                janela.atualizaExibicaoBaralho(true, true, 
                        janela.baralho.obtemIndiceCarta(Baralho.Naipe.Espadas, Baralho.Carta.Cinco));
            }
        };
        Timer t = new Timer(800, exibeBaralho);
        t.setRepeats(false);
        t.start();

        janela.cartasNaMaoDesteJogador.add(janela.baralho.retirarCarta());
        janela.cartasNaMaoDesteJogador.add(janela.baralho.retirarCarta());
        janela.cartasNaMaoDesteJogador.add(janela.baralho.retirarCarta());

        janela.baralho.devolverCartas(janela.cartasNaMaoDesteJogador);

        for (int i = 0; i < janela.numeroDeJogadores; ++i) {
            final int indJogador = i; // variável final definida por exigência do acesso feito de dentro da inner class anônima a seguir
            for (int j = 0; j < 3; ++j) {
                final int indCartaMao = j; // variável final definida por exigência do acesso feito de dentro da inner class anônima a seguir
                ActionListener entregaCartaJogador = new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if (indJogador == janela.indiceGlobalDesteJogador) {
                            Baralho.Naipe n = janela.cartasNaMaoDesteJogador.get(indCartaMao).naipe;
                            Baralho.Carta c = janela.cartasNaMaoDesteJogador.get(indCartaMao).carta;
                            janela.maosJogadores
                                    .get(0)
                                    .get(indCartaMao)
                                    .setIcon(janela.baralho.obtemIconeCarta(n, c));
                            janela.maosJogadores
                                    .get(0)
                                    .get(indCartaMao)
                                    .setVisible(true);
                        } else {
                            janela.atualizaNumeroCartasMaoJogador(janela.indiceLocal(indJogador), 
                                    indCartaMao + 1);
                        }
                    }
                };
                Timer t1 = new Timer(800 + (250 * (i * 3 + j + 1)), entregaCartaJogador);
                t1.setRepeats(false);
                t1.start();
            }
        }

        ActionListener iniciaEsperaPorJogada = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                janela.atualizaExibicaoIndicadorDeEsperaPorJogada(janela.indiceGlobalDesteJogador, true);
            }
        };
        Timer t2 = new Timer(4000, iniciaEsperaPorJogada);
        t2.setRepeats(false);
        t2.start();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
