package Estudent.Category;

import Estudent.Estudante;

import java.io.FileWriter;
import java.io.IOException;

public class Interno extends Estudante {
    private static int contador = 0;
    int matricula;

    public Interno(String nome, String cpf, int idade, int matricula, boolean foto,String nomCategoria) {
        super(nome, cpf, idade, matricula, foto,nomCategoria );
    }


    @Override
    public void setMatricula(int ano) {

        int anoLetivo = 2022;

        if (ano != anoLetivo && anoLetivo > 0) {
            contador = 0;
            contador++;
          this.matricula = (ano * 10000) + contador;
        } else if (ano == anoLetivo && anoLetivo > 0) {
            contador++;
           this.matricula = (ano * 10000) + contador;
        } else {
            contador = 1;
            this.matricula = (ano * 10000) + contador;
        }
    }

    @Override
    public int getMatricula() {
        return matricula;
    }

    @Override
    public String toString() {
        return
                "matricula = " + matricula  + "\n"+
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
