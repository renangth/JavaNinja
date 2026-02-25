package Intermediario.Aulas.Records;

public record NinjaRecord(String nome, String cpf) implements MostrarDados{

    public void ExibirDados() {
        System.out.println("Nome do cadastrado: " + nome);
        System.out.println("Cpf do cadastrado: " + cpf());
        System.out.println("====================");
    }
}
