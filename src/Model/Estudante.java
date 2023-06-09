package Model;

import Model.Pessoa;

import java.util.Random;

public abstract class Estudante extends Pessoa {
    /**
     * @anotação chave Primaria do meu banco de dados
     */
    private static int contador = 0;

    private int matricula;

    private boolean foto;

    private String nomCategory;


    /**@return esse construtor cria um objeto do tipo estudante
     * e objetos que herdam dessa classe
     * introduzi o metodo set matricula no propio construtor para a matricula ser gerada automaticamente
     * ja que o metodo que a gera tbm e no propio setMatricula
     */
    public Estudante(String nome, String cpf, int idade, int matricula, boolean foto, String nomCategory) {
        super(nome, cpf, idade);
        //this.matricula = matricula;
        setMatricula(matricula);
        this.foto = foto;
        this.nomCategory= nomCategory;
    }

    public int getMatricula() {
        return matricula;
    }



    /**
     * @return Esse metodo retorna a matricula do alunos
     * gerada de forma sequencial de acordo com o ano letivo em que ele esta
     * ou do ano letivo em que ele foi matriculado na escola
     */
    public void setMatricula(int ano) {
    }

    public boolean isFoto() {
        return foto;
    }

    public void setFoto(boolean foto) {
        this.foto = foto;
    }

    public String getNomCategory() {
        return nomCategory;
    }

    public void setNomCategory(String nomCategory) {
        this.nomCategory = nomCategory;
    }

    public void numeroRefeições(){

    }

    public int numCategoria(){


        return  0;
    }



    @Override
    public String toString() {
        return "Estudante{" +
                "matricula=" + matricula +
                ", foto=" + foto +
                ", nomCategory='" + nomCategory + '\'' +
                '}';
    }
}
