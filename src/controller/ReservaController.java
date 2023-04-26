package controller;

import java.sql.Connection;

import ConnectionFactory.ConnectionBase;
import DAO.ReservaDAO;
import modelo.Reserva;

public class ReservaController {

	private ReservaDAO reservaD;
	

	public ReservaController() {
		Connection con = new ConnectionBase().conectarBase();
		this.reservaD = new ReservaDAO(con);
	}
	
	public void guardar(Reserva reserva) {
		this.reservaD.guardar(reserva);
	}
	
}
