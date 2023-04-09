package Estudent.Category;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        Interno interno = new Interno("Walmir","708.45",15,0,true,"Interno");

        System.out.println("Qual ano letivo que entrou na instituição");
        int ano = ler.nextInt();
        interno.setMatricula(ano);

        System.out.println(interno);

        interno.gravar("C://Users//Administrador//Desktop//alunoo.txt");

    }
}
