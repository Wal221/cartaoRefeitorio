package Estudent;

import Entitites.Pessoa;

public abstract class Estudante extends Pessoa {
    /**
     * @anotação chave Primaria do meu banco de dados
     */
    private int matricula;

    private boolean foto;

    private String nomCategory;

    public Estudante(String nome, String cpf, int idade, int matricula, boolean foto, String nomCategory) {
        super(nome, cpf, idade);
        this.matricula = matricula;
        this.foto = foto;
        this.nomCategory= nomCategory;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
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
