package TrabalhandoComFuncoes;

public class pessoa {
    int idade;
    String nome;
    Double tempoDeExperiencia;

    public void Senior() {
        System.out.println("tem mais de 5 anos de experiencia, é senior!");
    }

    public void Pleno(){
        System.out.println("tem mais de 2 anos de experiencia e menos de 5, é pleno!");
    }

    public void Junior(){
        System.out.println("tem menos de 2 anos de experiencia, é junior!");
    }
}
