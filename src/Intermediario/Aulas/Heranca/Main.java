package Intermediario.Aulas.Heranca;

public class Main {
    public static void main(String[] args){

        // criar o ninja Naruto - Naruto é um objeto:
        // agora estou criando ele como um Uzumaki (classe especifica)

        Uzumaki Naruto = new Uzumaki();

        Naruto.nome = "Naruto Uzumaki";
        Naruto.idade = 17;
        Naruto.aldeia = "Aldeia da Folha";
        Naruto.ativarSabedoria();

        // criar o Ninja Sasuke - Sasuke é um objeto
        // agora estou criando ele como um Uchiha (classe especifica)

        Uchiha Sasuke = new Uchiha();

        Sasuke.nome = "Sasuke Uchiha";
        Sasuke.idade = 19;
        Sasuke.aldeia = "Aldeia da Folha";
        Sasuke.ativarSharingan();

        // criar a Ninja Hinata - Hinata é um objeto
        // agora estou criando ela como uma Hyuga (classe especifica)

        Hyuga Hinata = new Hyuga();

        Hinata.nome = "Hinata Hyuga";
        Hinata.idade = 17;
        Hinata.aldeia = "Aldeia da Folha";
        Hinata.ativarByakungan();

        // criar a Ninja Sakura - Sakura é um objeto
        // agora estou criando ela como uma Haruno (classe especifica)

        Haruno Sakura = new Haruno();
        Sakura.nome = "Sakura Haruno";
        Sakura.idade = 18;
        Sakura.aldeia = "Aldeia da folha";
        Sakura.ativarCura();




        /*
        // aplicando metodos ao meu objeto:
        *Sassuke.SharinganAtivado();
        Sassuke.euSouUmNinja();
        String chamandoMetodo = Sassuke.euSouUmNinja();
        System.out.println(chamandoMetodo);
        int chamandoInt = Sassuke.anosParaSerHokage(70);
        System.out.println("a sua idade é " + Sassuke.idade + " anos, entao falta " + chamandoInt + " anos para voce conseguir!");
        */



    }
}
