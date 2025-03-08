package org.example.heranca;

// herança: basicamente, consiste em um classe herda as características de outra classe

// aqui é criado a classe Veiculos; será a classe que será herdada
public class Veiculos {

    // aqui são criados os atributos que todos os veículos possuem
    private String modelo;
    private String marca;
    private Integer ano;

    // aqui são criados os métodos que todos os veículos fazem, como acelerar e parar
    public void acelerar() {
        System.out.println("Acelerando...");
    }

    public void parar() {
        System.out.println("Parou!");
    }

}

// aqui é criado a classe carro, que herda todas as características da classe veiculos (atributos e métodos)
class Carro extends Veiculos {

    // aqui a classe pode tanto utilizar das características da classe principal, como atribuir nova
    public void buzinar() {
        System.out.println("O carro está buzinando");
    }
}



