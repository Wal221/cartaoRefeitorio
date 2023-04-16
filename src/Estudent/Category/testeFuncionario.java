package Estudent.Category;

import Entitites.Funcionario;
import Estudent.Estudante;

import java.util.Scanner;

public class testeFuncionario {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        Funcionario funcionario = new Funcionario("Hugo", "53533", 31, "Hugo321");

        Interno interno ; //new Interno("Juca", "3893", 13, 2023,true,"interno");
        Interno walmir ; //new Interno("walmir", "345", 15, 2023,true,"Ensino medio");

        for(int i = 0 ; i < 2 ; i++){
            String name = ler.next();
            String cpf = ler.next();
            int idade  = ler.nextInt();
            int matricula = ler.nextInt();
            String category = ler.next();
            interno = new Interno(name, cpf, idade,matricula, true, category);


            funcionario.addEstudante(interno,"src/Estudent/Category/interno");

        }










    }
}
