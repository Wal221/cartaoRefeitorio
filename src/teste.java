import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class teste {
    public static void main(String[] args) {

        //Realize as matriculas dos alunos , de forma que diferencie as categorias uns dos outros
        // e não tenha matriculas iguais na lista preciso incrementalo de forma correta
        // e verificar se em um registros não a uma matricula iguals
        List<teste> alunos = new ArrayList<>();

        for (int i =0; i < 4; i++){
            int a =2;
            teste teste = new teste();
            teste.setMatricula(2022);

            if(alunos.size() >= 1){


            }
            a++;

            alunos.add(teste);


        }

        System.out.println(alunos);
    }

    int matricula;
    int anoLetivo = 2022;
   private static int contador = 0;
    int i = 0;

    public void setMatricula(int ano) {
        Random rand = new Random(1);

        if (ano != anoLetivo && anoLetivo > 0) {
            contador = 0;
            contador++;
            matricula = (ano * 10000) + contador;
        } else if (ano == anoLetivo && anoLetivo > 0) {
            contador++;
            matricula = (ano * 10000) + contador;
        } else {
            contador = 1;
            matricula = (ano * 10000) + contador;
        }
    }
    public int getMatricula(){
          return  matricula;
    }

     /*
    public Integer matriRepetida(List<teste> lista){

        // e verificar se em um registros não a uma matricula iguals
        for (int i = 0 ; i < lista.size(); i++){
            if(lista.get(i).contador == 1 ){

            }

        }
    }

      */

    @Override
    public String toString() {
        return
                "matricula = " + getMatricula() +"\n"
                ;
    }
}

