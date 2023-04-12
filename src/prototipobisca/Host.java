/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package prototipobisca;

import java.net.InetAddress;
import prototipobisca.Baralho.Carta;
import prototipobisca.Baralho.Naipe;

public interface Host{
  void registrarPlayer(InetAddress endereco, String nome);

  void iniciarJogo();

  void CancelarJogo();

  void relizarSelecaoDeTrunfo(Naipe n, int OrdinalCarta);

  void informarTrinfoDaPartida(Naipe naipeTrunfo, Carta cartaTrunfo);

  void distribuirCartasParaRodada();

  void registrarJogada(int indiceJogador, int indiceCarta);
 
  void informarJogadorAtual(int indiceJogador);
  
  void anunciarVendedorDaRodada(int indiceJogador);
  
  void anunciarApuracaoDaPartida(int pontosDuplaComHost, int pontosOutraDupla, int placarDuplaComHost, int PlacarOutraDupla);
  
}