package controller;

import DAO.ReservaDAO;
import modelo.Reserva;

public class ReservaController {

	private ReservaDAO reservaD;
	

	public ReservaController(ReservaDAO reservaD) {
		super();
		this.reservaD = reservaD;
	}
	
	public void guardar(Reserva reserva) {
		this.reservaD.guardar(reserva);
	}
	
}
