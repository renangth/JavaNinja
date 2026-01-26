package Intermediario.Aulas.AbstracaoEPolimorfismo;

public class Main {
    static void main(String[] args) {
        Uchiha Sasuke = new Uchiha();
        Sasuke.nome = "Sasuke";
        Sasuke.idade = 20;
        Sasuke.aldeia = "Aldeia da Folha";
        Sasuke.SharinganAtivado();

       /* Uzumaki Naruto = new Uzumaki();
        Naruto.nome = "Naruto";
        Naruto.idade = 18;
        Naruto.aldeia = "Aldeia da Folha";
        Naruto.HabilidaeEspecial();
        Naruto.EstrategiaDeBatalhaNinja();*/

        Hatake Kakashi = new Hatake();
        Kakashi.nome = "Kakashi";
        Kakashi.SharinganAtivado();
        Kakashi.ninjaDeElite();
    }
}
