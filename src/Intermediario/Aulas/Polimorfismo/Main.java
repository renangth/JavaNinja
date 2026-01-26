package Intermediario.Aulas.Polimorfismo;

public class Main {
    public static void main(String[] args) {
         // naruto
        Uzumaki naruto = new Uzumaki();
        naruto.nome = "Naruto";
        naruto.idade = 18;
        naruto.aldeia = "aldeia da folha";
        naruto.HabilidadeEspecial();

        // sasuke
        Uchiha sasuke = new Uchiha();
        sasuke.nome = "Sasuke";
        sasuke.idade = 18;
        sasuke.aldeia = "aldeia da folha";
        sasuke.HabilidadeEspecial();

    }
}
