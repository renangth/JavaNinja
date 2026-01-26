package Basico.Resumao;

public class resumo {
    public static void main(String[] args) {
        // tipagem de dados:

        String string = "renan";
        char Char = 'A';
        boolean booleano = true;
        int inteiro = 10;
        double flutuante = 10.0;
        long longo = 999999;
        short curto = 1;

        //boilerplate = atalhos dentro da ide pra fazer comandos como print, class...
        // shortcuts = atalhos de teclado para a ide

        //condicionais:
        if (inteiro < 20) {
            System.out.println("é menor que 20");
        } else{
            System.out.println("é menor que 20");
        }

        while (inteiro > 0) {
            System.out.println(inteiro);
            inteiro--;
        }
        //laço de repetiçao
        for (int i = 0; i < longo; i++) {
            System.out.println(i);
        }
    }
}
