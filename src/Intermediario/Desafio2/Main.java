package Intermediario.Desafio2;

public class Main {
    public static void main(String[] args) {


        NinjaAvancado Renan = new NinjaAvancado("Renan", 18, "Bola de Fogo", "Bola de Fogo Invisível");
        Renan.MostrarInformacoes();
        Renan.ExecutarHabilidades();

        System.out.println("---------------------");

        NinjaAvancado Sasuke = new NinjaAvancado("Sasuke", 19, "Poder do vento", "Furacao");
        Sasuke.MostrarInformacoes();
        Sasuke.ExecutarHabilidades();

        System.out.println("---------------------");

        NinjaBasico Daniel = new NinjaBasico("Daniel", 17, "Clone das Sombras");
        Daniel.MostrarInformacoes();
        Daniel.ExecutarHabilidades();
    }
}
