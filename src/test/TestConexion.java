package test;

import java.sql.Connection;
import java.sql.SQLException;

import ConnectionFactory.ConnectionBase;

public class TestConexion {
	
	public static void main(String[] args) throws SQLException {
		ConnectionBase con = new ConnectionBase();
		Connection cone =  con.conectarBase();
		
		System.out.println("Conexion Exitosa");
		
		cone.close();
		
		System.out.println("Conexion Cerrada");
	}

}
