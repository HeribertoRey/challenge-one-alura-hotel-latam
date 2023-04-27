package controller;

import java.sql.Connection;

import ConnectionFactory.ConnectionBase;
import DAO.HuespedesDAO;
import modelo.Huespedes;

public class HuespedesController {

	private HuespedesDAO huespedesDao;
	
	public HuespedesController() {
		Connection con = new ConnectionBase().conectarBase();
		this.huespedesDao =  new HuespedesDAO(con);
	}
	
	
	
	public void guardar(Huespedes huespedes) {
		this.huespedesDao.guardar(huespedes);
	}
}
