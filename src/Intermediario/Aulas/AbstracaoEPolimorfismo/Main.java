package Intermediario.Aulas.AbstracaoEPolimorfismo;

public class Main {
    static void main(String[] args) {

        //Criando Sasuke
        Uchiha Sasuke = new Uchiha("Sasuke", "aldeia da folha", 19, 10, NIvelNInja.KAGE);
        Sasuke.HabilidaeEspecial();
        Sasuke.SharinganAtivado();
        Sasuke.EstrategiaDeBatalhaNinja();
        Sasuke.InteligenciaDeCombate();
        Sasuke.InteligenciaDeCombate(170);


        Uzumaki Naruto = new Uzumaki("Naruto", "aldeia da folha", 18, 7, NIvelNInja.KAGE);
        Naruto.EstrategiaDeBatalhaNinja();
        Naruto.HabilidaeEspecial();

        Hatake Kakashi = new Hatake("Hatake", "aldeia da folha", 40, 31, NIvelNInja.KAGE);
        Kakashi.SharinganAtivado();
        Kakashi.ninjaDeElite();
        Kakashi.EstrategiaDeBatalhaNinja();
    }
}
