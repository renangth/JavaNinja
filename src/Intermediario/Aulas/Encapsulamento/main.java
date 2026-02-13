package Intermediario.Aulas.Encapsulamento;

public class main {
    public static void main (String[] args) {

        System.out.println("--------- Naruto Uzumaki ---------");
        Uzumaki Naruto = new Uzumaki("Narutinho", "Aldeia da Folha", 17, 50, 2.10);
        Naruto.exibirInformacoes();
        Naruto.setNome("Naruto Uzumaki");
        System.out.println("=====================");
        Naruto.exibirInformacoes();

        System.out.println("--------- Sasuke Uchiha ---------");
        Uchiha Sasuke = new Uchiha("Sasukinho", "Aldeia da Folha", 20, 78, 2.80);
        Sasuke.exibirInformacoes();
        Sasuke.setNome("Sasuke Uchiha");
        System.out.println("=====================");
        Sasuke.exibirInformacoes();

        Missoes missao1 = new Missoes("Treinar socos", RankDeMissoes.D);
        missao1.exibirDetalhes();
    }
}
