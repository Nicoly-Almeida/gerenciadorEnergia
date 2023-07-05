package entities;

import interfaces.ComandoPorta;

public abstract class Equipamento extends Bloco implements ComandoPorta {
    private String nome;
    private boolean ligado;

    public Equipamento(String nome) {
        this.nome = nome;
        this.ligado = false;
    }

    public void ligar() {
        this.ligado = true;
        System.out.println(nome + " ligado.");
    }

    public void desligar() {
        this.ligado = false;
        System.out.println(nome + " desligado.");
    }

    public boolean estaLigado() {
        return ligado;
    }
}

