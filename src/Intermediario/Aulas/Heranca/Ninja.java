package Intermediario.Aulas.Heranca;

public class Ninja {
    String nome;
    String aldeia;
    int idade;

    //criando metodo publico personalizado:

    //metodo void

    /*
    * O metodo void n retorna valor nenhum!
    * */

    public void SharinganAtivado() {
        System.out.println("O Sharingan ativou!!");
    }

    /*
    * Metodo String
    * Tem que retornar uma String
    * */
    public String euSouUmNinja() {
        return "Olá, eu sou um ninja";
    }

    /*
    * Metodo int
    * Tem que retornar um int
    * */
    public int anosParaSerHokage(int idadeMinimaParaSerHokage) {
        return idadeMinimaParaSerHokage - idade;
    }


}
