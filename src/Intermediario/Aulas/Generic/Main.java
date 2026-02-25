package Intermediario.Aulas.Generic;

public class Main {
    public static void main(String[] args) {

        BolsaGenerica<Object> bolsaGenerica = new BolsaGenerica<>();
        bolsaGenerica.adicionarFerramenta(new Shuriken(10));
        bolsaGenerica.adicionarFerramenta(new Pergaminho("Invocaçao da  raposa de 9 caldas"));
        bolsaGenerica.adicionarFerramenta(new Kunai("Kunai elétrica"));

        System.out.println("===== Itens da Bolsa Ninja =====");
        bolsaGenerica.mostrarFerramentas();
    }
}