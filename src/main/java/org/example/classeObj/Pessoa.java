package org.example.classeObj;

// basicamente a classe é um molde ou modelo para criar objetos, normalmente são exemplos da vida real

// aqui é criado a classe Pessoa
public class Pessoa {

    // são criados atributos que toda pessoa tem
    // atributo: variável que representa o estado de um objeto
    private String nome;
    private String data_aniversario;
    private Integer idade;
    private Double altura;

    // aqui criamos um construtor que será utilizado na criacao do objeto
    public Pessoa(String nome, String data_aniversario, Integer idade, Double altura) {
        this.nome = nome;
        this.data_aniversario = data_aniversario;
        this.idade = idade;
        this.altura = altura;
    }

    // dessa forma, conseguimos criar um objeto Pessoa, com as características de cada atributo

    // além disso, podemos criar métodos, que são ações que uma pessoa pode fazer
    public void falar() {
        System.out.println("Pessoa falando!");
    }
    public void beberAgua() {
        System.out.println("Pessoa bebendo água!");
    }

    // método: é uma funcao que vai definir o comportamento para os objetos, permitindo a manipulação dos atributos
    public void mostrarPessoa() {
        System.out.println("Nome: " + nome + " Data de aniversário: " + data_aniversario + " Idade: " + idade + " Altura: " + altura);
    }

    // obs: a classe pode ser herdade, onde todas as características dela passam para uma subclasse

}
