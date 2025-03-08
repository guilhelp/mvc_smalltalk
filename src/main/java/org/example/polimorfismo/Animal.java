package org.example.polimorfismo;

// polimorfismo: basicamente, permite que métodos com o mesmo nome se comportem de maneira diferentes em classes diferentes

// aqui é criado a classe Animal, que será herdada
public class Animal {

    // este método é um característica que todo animal faz, emitir algum som, entretanto, cada animal faz um som diferente
    public void fazerSom() {
        System.out.println("O animal fez um som");
    }
}

// aqui é criado a classe Gato que herda as características de Animal
class Gato extends Animal {

    // nesse exemplo, a classe gato utiliza o mesmo método da classe animal, mas o gato faz um som diferente dos outros animais
    // que seria o "Miau", portanto, foi utilizado o mesmo nome do método, mas com comportamento diferente
    public void fazerSom() {
        System.out.println("Miau!");
    }
}




