package entities;

public class Docente {
    private String nome;

    public Docente(String nome) {
        this.nome = nome;
    }

    public void entrarNoBloco(Porta porta) {
        porta.adicionarDocente(this);
    }

    public void sairDoBloco(Porta porta) {
        porta.removerDocente(this);
    }
}