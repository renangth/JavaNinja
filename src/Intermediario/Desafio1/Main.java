package Intermediario.Desafio1;

public class Main {
    public static void main(String[] args) {

        InteraçaoMenu interagirComMenu = new InteraçaoMenu();
        Menu exibindoMenu = new Menu();
        while (interagirComMenu.entrada != 4){
            //exibindo o menu
            exibindoMenu.ExibirMenu();
            //fazendo a funcao de interaçao com o menu
            interagirComMenu.InteragirComMenu();
        }



















/*        Menu menuInterativo = new Menu();
        menuInterativo.MenuInterativo(); */



    }
}
