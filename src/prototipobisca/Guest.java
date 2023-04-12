/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package prototipobisca;

import java.net.InetAddress;
import prototipobisca.Baralho.Carta;
import prototipobisca.Baralho.Naipe;
/**
 *
 * @author 20211si031
 */
public interface Guest {
    
    void solicitarIngresso(InetAddress enderecoHost, String codigo, String nome);

    void infomarOpcaoDeSelecaoDeTrunfo(int opcao);
    
    void receberInformacaoTrunfo();

    void receberCartas();
    
    void informarJogada(Naipe n, Carta c);
    
    void recerberInformarcaoJogadorAtural(int indiceJogador);

    void receberInformacaoJogada(int indiceJogador, Naipe n, Carta c);
    
    void receberInformacaoPontosEPlacar(int pontosDuplaComHost, int pontosOutraDupla, int placarDuplaComHost, int placarOutraDupla);
    
}
