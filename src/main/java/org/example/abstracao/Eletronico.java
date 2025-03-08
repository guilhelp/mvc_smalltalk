package org.example.abstracao;

// basicamente a abstracao utiliza de classes abstratas ou interfaces

// aqui é criada uma classe abstrata chamada Eletronico, que define o comportamento comum dos eletronicos
public abstract class Eletronico {

    // aqui são criadas métodos que serão implementadas pelas classes filhas da abstrata
    public abstract void ligar();
    public abstract void desligar();
}

// é criada a classe Video game, que herda a classe Eletronico
class VideoGame extends Eletronico {

    // é implementado os métodos abstratos criados na classe abstrata
    public void ligar() {
        System.out.println("Vídeo game - Ligado!"); // é feita a implementação específica dos métodos abstratos
    }
    public void desligar() {
        System.out.println("Vídeo game - Desligado!"); // é feita a implementação específica dos métodos abstratos
    }
}





