package TrabalhandoComFuncoes;

import java.util.Scanner;

public class main {
    public static void main(String[] args){


        pessoa funcionario1 = new pessoa();
        Scanner scn = new Scanner(System.in);
        System.out.println("Digite o nome do funcionário: ");
        funcionario1.nome = scn.nextLine();
        System.out.println("Digite a idade do funcionário: ");
        funcionario1.idade = scn.nextInt();
        System.out.println("Digite o tempo de experiencia (em anos) do funcionário: ");
        funcionario1.tempoDeExperiencia = scn.nextDouble();


        if (funcionario1.tempoDeExperiencia < 2){
            funcionario1.Junior();
        } else if (funcionario1.tempoDeExperiencia > 2 && funcionario1.tempoDeExperiencia < 5) {
            funcionario1.Pleno();
        } else {
            funcionario1.Senior();
    }

    }
}
