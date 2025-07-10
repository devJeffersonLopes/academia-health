package factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    private static final String URL = "jdbc:mysql://localhost:3306/academiahealth";

    private static final String USER = "root";

    private static final String PASSWORD = "";

    public static Connection getConnection() {
	try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(URL, USER, PASSWORD);
        
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao tentar conexão ao banco de dados", e);
            
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("o driver JDBC não foi encontrado", e);
            
        }
    }

}