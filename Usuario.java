import java.util.ArrayList;

public class Usuario {
    private String nome;
    private int idade;
    private String email;
    private String endereco;
    private String telefone;

    public Usuario(String nome, int idade, String email, String endereco, String telefone) {
        this.nome = nome;
        this.idade = idade;
        this.email = email;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    // Getters e setters aqui (opcional)

    @Override
    public String toString() {
        return "Nome: " + nome + ", Idade: " + idade + ", Email: " + email + ", Endereço: " + endereco + ", Telefone: " + telefone;
    }
}
