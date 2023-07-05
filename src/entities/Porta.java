package entities;

import java.util.ArrayList;
import java.util.List;

import interfaces.ComandoPorta;

public class Porta {
    private List<ComandoPorta> comandoPortaList;
    
    public Porta() {
        this.comandoPortaList = new ArrayList<>();
    }

    public void adicionarDocente(Docente docente) {
    	System.out.println("Registrando ENTRADA de docente.");
        for (ComandoPorta comandoPorta : this.comandoPortaList) {
            comandoPorta.executar(true);
        }
        
    }

    public void removerDocente(Docente docente) {
    	System.out.println("Registrando SA�DA de docente.");
        for (ComandoPorta comandoPorta : this.comandoPortaList) {
            comandoPorta.executar(false);
        }
    }

    public void entrar(ComandoPorta comandoPorta) {
        this.comandoPortaList.add(comandoPorta);
    }

    public void sair(ComandoPorta comandoPorta) {
        this.comandoPortaList.remove(comandoPorta);
    }

}