package org.example.Interf;

// interface: define um contrato de métodos que as classes devem implementar

// aqui é criado uma interface imprimivel, que define os documentos que são imprimiveis
public interface Imprimivel {

    public void imprimir(); // método sem implementação, quem vai implementar são a que subclasses
}

// aqui é criado a classe Certificado, que quer dizer que é documento imprimivel
class Certificado implements Imprimivel {

    // como define contrato com a interface imprimivel, a classe é obrigada a implementar o método imprimir, com sua própria implementação
    @Override
    public void imprimir() {
        System.out.println("Imprimindo formulário...");
    }
}







