import entities.Docente;
import entities.Equipamento;
import entities.Porta;
import entities.Bloco;

public class Main {
    public static void main(String[] args) {
        // Criação dos objetos necessários
        Porta porta = new Porta();

        Equipamento lampada1 = new Equipamento("lampada central");
        Equipamento lampada2 = new Equipamento("lampada secundaria");
        Equipamento arcondicionado = new Equipamento("arcondicionado");

        Bloco bloco = new Bloco();

        bloco.adicionarEquipamento(lampada1);
        bloco.adicionarEquipamento(lampada2);
        bloco.adicionarEquipamento(arcondicionado);

        porta.entrar(bloco);

        // Criação dos docentes
        Docente docente1 = new Docente("Docente 1");
        Docente docente2 = new Docente("Docente 2");
        Docente docente3 = new Docente("Docente 3");
        Docente docente4 = new Docente("Docente 4");

        // Docentes entram no bloco
        docente1.entrarNoBloco(porta);
        System.out.println();
        docente2.entrarNoBloco(porta);
        System.out.println();
        docente3.entrarNoBloco(porta);
        System.out.println();
        docente4.entrarNoBloco(porta);


        docente1.sairDoBloco(porta);
        System.out.println();
        docente2.sairDoBloco(porta);
        System.out.println();
        docente3.sairDoBloco(porta);
        System.out.println();
        docente4.sairDoBloco(porta);
    }
}