package Estudent.Category;

import Entitites.Funcionario;
import Estudent.Estudante;

import java.util.Scanner;

public class testeFuncionario {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        Funcionario funcionario = new Funcionario("Hugo", "53533", 31, "Hugo321");

        Interno interno = new Interno("Juca", "3893", 13, 2023,true,"interno");
        Interno walmir = new Interno("walmir", "345", 15, 2023,true,"Ensino medio");



       // interno.setMatricula(2022);
        //walmir.setMatricula(2022);

        funcionario.addEstudante(interno,"src/Estudent/Category/interno");
        funcionario.addEstudante(walmir,"src/Estudent/Category/interno");






    }
}
