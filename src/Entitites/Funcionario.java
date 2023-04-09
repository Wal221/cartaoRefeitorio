package Entitites;

public class Funcionario extends Pessoa{
    private String senha;

    public Funcionario(String nome, String cpf, int idade, String senha) {
        super(nome, cpf, idade);
        this.senha = senha;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void realizaCadastro(){

    }

    public Double adicionaSaldo(){
        return null;
    }
}
