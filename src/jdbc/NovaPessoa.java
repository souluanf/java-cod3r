package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class NovaPessoa {
    public static void main(String[] args) throws SQLException {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o nome: ");
        String nome = scanner.nextLine();

        Connection connection = FabricaConexao.getConnection();

        String sql = "INSERT INTO pessoas(nome) values (?)";
        PreparedStatement stmt = connection.prepareStatement(sql);
        stmt.setString(1,nome);
//        stmt.setInt(2,100);

        stmt.execute();
        System.out.println("Pessoa incluída com suceso!");

        scanner.close();
    }
}
