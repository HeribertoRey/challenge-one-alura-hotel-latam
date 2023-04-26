package ConnectionFactory;

import java.sql.Connection;
import java.sql.SQLException;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class ConnectionBase {

	public ComboPooledDataSource dataSou;
	

	public ConnectionBase() {
		ComboPooledDataSource comboPool = new ComboPooledDataSource();
		comboPool.setJdbcUrl("jdbc:mysql://localhost/proyecto_alura_hotel?useTimeZone=true&serverTimeZone=UTC");
		comboPool.setUser("root");
		comboPool.setPassword("@lurA2023");


		this.dataSou = comboPool;
	}

	public Connection conectarBase() {
		try {
			return this.dataSou.getConnection();
		} catch (SQLException e) {
			System.out.println("Error de Conexion");
			throw new RuntimeException(e);
		}

	}
}
