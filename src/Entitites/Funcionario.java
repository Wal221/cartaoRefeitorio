package Entitites;

import Estudent.Estudante;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Funcionario extends Pessoa{

    /** O funcionario devera receber o ano em que o aluno entrou na instituição
     * para gerar a matricula e cadastrala no banco de dados de acordo com  a
     * sua categoria
     * Para isso o funcionario deve fazer uma composição com o estudante podendo utilizar o metodo setMatricula
     * sendo gerado e adiconado no banco de dados(E uma possibilidade)
     */
    private String senha;

    private List<Estudante> estudantes = new ArrayList<>();

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


   /* public void cadastroEstudante(){
        estudantes.get()
    }

    */
    public List<Estudante> getEstudantes() {
        return estudantes;
    }


    public void addEstudante(Estudante estudante, String caminho){

        estudantes.add(estudante);
        try {
            FileWriter writer = new FileWriter(caminho,true);
            writer.write("Aluno: "+ estudante.getNomCategory() + " \n Matricula " + estudante.getMatricula()+"\n" );
            writer.close();
            System.out.println("Dados gravados");
        } catch (IOException e) {
            e.printStackTrace();

        }

    }
    public void removeEstudante(Estudante estudante){
        estudantes.remove(estudante);

    }

    public Double adicionaSaldo(){
        return null;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "senha='" + senha + '\'' +
                ", estudantes=" + estudantes +
                '}';
    }
}
