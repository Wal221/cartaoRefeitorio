package Estudent.Category;

import Entitites.Pessoa;
import Estudent.Estudante;

/**
 * A classe estudanteTicket e a unica que recebera alteração no saldo do cartão
 * que sera utilizado para pode fazer a refeição
 * tendo isso em mente , que uma pessoa da categoria ticket estiva cadastrada em um banco de dado
 * o funcionario tera de percorre esse banco de dados com a matricula e verificar se ele e um estudante que
 * tenha que recarregara o cartão

 */
public class EstudanteTicket extends Estudante {


    private Double saldo;

    public EstudanteTicket(String nome, String cpf, int idade, int matricula, boolean foto, String nomCategory, Double saldo) {
        super(nome, cpf, idade, matricula, foto, nomCategory);
        this.saldo = saldo;
    }


    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
}

