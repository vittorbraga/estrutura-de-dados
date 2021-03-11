package estruturadedados;

public class Pessoa {
    String nome;
    String sobrenome;
    int idade;
    
    public String nomeCompleto() {
        return nome + " " + sobrenome;
    }
}
