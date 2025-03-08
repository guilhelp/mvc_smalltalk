package org.example;

import org.example.classeObj.Pessoa;

public class Main {
    public static void main(String[] args) {

        // objeto: é uma instancia da classe, então pegando o mesmo exemplo da Classe Pessoa

        // aqui criamos o objeto da classe pessoa, e já definimos por meio do construtor os seus valores
        Pessoa p = new Pessoa("Guilherme", "08/02/2006", 19, 1.75);

        // é possível utilizar os métodos que criamos na criacao da classe
        p.mostrarPessoa();
        p.beberAgua();
        p.falar();


    }
}




