package Intermediario.Aulas.Generic;

public class Main {
    public static void main(String[] args) {


        // criando equipamentos 
        EquipamentosNinja kunai = new EquipamentosNinja("Kunai");
        EquipamentosNinja shuriken = new EquipamentosNinja("Shuriken");
        EquipamentosNinja pergaminho = new EquipamentosNinja("Pergaminho");

        // usando a bolsa generica pra guardar os equipamentos
        BolsaGenerica<EquipamentosNinja> bolsaGenerica = new BolsaGenerica<>();
        bolsaGenerica.adicionarEquipamentos(shuriken);
        bolsaGenerica.adicionarEquipamentos(kunai);
        bolsaGenerica.adicionarEquipamentos(pergaminho);

        System.out.println(bolsaGenerica);
    }
}