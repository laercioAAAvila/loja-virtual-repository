import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestaListagem {

	public static void main(String[] args) throws SQLException {
		ConnectionFactory connectionFactory = new ConnectionFactory();
		Connection con = connectionFactory.recuperaConexao();
		
		Statement stm = con.createStatement();
		stm.execute("SELECT * FROM PRODUTO");
		
		ResultSet rst =  stm.getResultSet();
		
		while(rst.next()) {
			Integer id = rst.getInt(1);
			String nome = rst.getString(2);
			String descricao = rst.getString(3);
			System.out.println("Id:"+id+", nome: "+nome+", descrição: "+descricao+".");
		}
		
		
		
		con.close();
	}

}
