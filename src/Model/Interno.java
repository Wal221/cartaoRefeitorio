package Model;

import Model.Estudante;

import java.io.FileWriter;
import java.io.IOException;

public class Interno extends Estudante {


    public Interno(String nome, String cpf, int idade, int matricula, boolean foto,String nomCategoria) {
        super(nome, cpf, idade, matricula, foto,nomCategoria );
    }





    @Override
    public String toString() {
        return
                "matricula = " +getMatricula() + "\n"+
                        "Categoria = "+getNomCategory() +"\n"
                ;
    }
    public void gravar(String caminho) {
        try {
            FileWriter writer = new FileWriter(caminho,true);
            writer.write("Aluno: "+getNomCategory() + "\n" + "Matricula: " + getMatricula());
            writer.close();
            System.out.println("Dados gravados");
        } catch (IOException e) {
            e.printStackTrace();

        }
    }
}
