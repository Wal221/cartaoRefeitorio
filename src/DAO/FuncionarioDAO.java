package DAO;

import DTO.Funcionario;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FuncionarioDAO {
    public Connection FuncionarioDAO (){
        Connection conn = null;
        try {
            String url = "jdbc:mysql://localhost:3306/bancoteste";
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(url + "?userTimezone=true&serverTimezone=UTC&useSSL=false", "root", "6037");
        }catch (SQLException e){
            JOptionPane.showMessageDialog(null,"FuncionarioDAO"+ e.getMessage());

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return  conn;
    }
    public void salvaFuncionario(Funcionario funcionario){
        // Lógica para salvar o funcionario no banco de dados
        // Utilize a conexão "connection" para executar as operações necessárias
        // ...

    }
}
