import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestaConexao {

	public static void main(String[] args) throws SQLException {
		Connection connection = DriverManager.getConnection(
				"jdbc:mysql://localhost:33061/loja_virtual?useTimezone=true&serverTimezone=UTC", "root",
				"L@ercio25");
		
		connection.close();

	}

}
