import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	public Connection recuperaConexao() throws SQLException {
		return DriverManager.getConnection(
				"jdbc:mysql://localhost:33061/loja_virtual?useTimezone=true&serverTimezone=UTC", "root", "L@ercio25");
	}
}
