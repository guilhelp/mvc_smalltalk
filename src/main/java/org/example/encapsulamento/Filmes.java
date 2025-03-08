package org.example.encapsulamento;

// basicamente, consistem e ocultar o estado interno do objeto, permintindo o acesso a ele apenas por métodos específicos

// aqui é criado a classe Filmes
public class Filmes {

    // é criado os atributos da classe de forma privada (acessível apenas dentro da classe)
    private String nome;
    private String autor;
    private String descricao;

    // é criado o construtor
    public Filmes(String nome, String autor, String descricao) {
        this.nome = nome;
        this.autor = autor;
        this.descricao = descricao;
    }

    // são criados os métodos para acessar (getter) e modificar (setter) cada atributo

    // get -> retorna o valor próprio da string
    // setter -> recebe o valor, e modifica o valor original pelo recebido

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
