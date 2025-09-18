package Pacotes;
// a Sum (antiga dona do JAVA) empresa que gerenciava o JAVA,
// criou um padrão para pacotes -> br.com.[nome do pacote]

import Pacotes.Videos.Filme; // importou da pasta 'filmes', fala td o path

import Pacotes.Videos.*; // com esse import importamos todas as classes

import Pacotes.gui.botoes.*;
public class Main {

    Filme filme = new Filme();
    Pacotes.Videos.Filme filme2 = new Pacotes.Videos.Filme();
    // para ir percorrendo entre pacotes, usamos o '.'
    Anime anime = new Anime();
    BotaoPlay bplay = new BotaoPlay();
}