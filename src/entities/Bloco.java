package entities;

import interfaces.ComandoPorta;

import java.util.ArrayList;
import java.util.List;

public class Bloco implements ComandoPorta {
    private int docentes;
    private final List<Equipamento> equipamentos;

    public Bloco() {
        this.docentes = 0;
        this.equipamentos = new ArrayList<>();
    }

    @Override
    public void executar(boolean entrada) {
        if (entrada) {
            this.entrada();
        } else {
            this.saida();
        }
        System.out.println("Docentes na sala nesse momento: " + this.docentes);
    }

    private void entrada() {
        if (this.docentes == 0) {
            System.out.println("Entrada do primeiro docente");
            this.ligarEquipamentos();
        } else {
            System.out.println("Notificando entrada de docente");
        }
        this.docentes++;
    }

    private void saida() {
        if (this.docentes > 0) {
            if (this.docentes == 1) {
                System.out.println("Notificando saída do último docente.");
                this.desligarEquipamentos();
            } else {
                System.out.println("Notificando saída de docente.");
            }
            this.docentes--;
        }
    }

    private void ligarEquipamentos() {
        System.out.println("Ligando todos os equipamentos");
        for (Equipamento equipamento : this.equipamentos) {
            equipamento.ligar();
        }
    }

    private void desligarEquipamentos() {
        System.out.println("Desligando todos os equipamentos");
        for (Equipamento equipamento : this.equipamentos) {
            equipamento.desligar();
        }
    }

    public void adicionarEquipamento(Equipamento equipamento) {
        this.equipamentos.add(equipamento);
    }

    public void removeEletronico(Equipamento equipamento) {
        this.equipamentos.remove(equipamento);
    }
}
