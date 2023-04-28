package controller;

import java.sql.Connection;
import java.time.LocalDate;
import java.util.List;

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
	
	public List<Huespedes> mostrarHuesped() {
		return this.huespedesDao.mostrar();
	}
	
	public List<Huespedes> buscarHuesped(String id) {
		return this.huespedesDao.bucarId(id);
	}
	
	public void actualizarH(Integer id, String nombre, String apellido, LocalDate fechaNacimiento, String nacionalidad,
			String telefono, Integer idReserva) {
		this.huespedesDao.ActualizaHuespedes(id, nombre, apellido, fechaNacimiento, nacionalidad, telefono, idReserva);
	}
	
	public void Eliminar(Integer idReserva) {
		this.huespedesDao.Eliminar(idReserva);
	}
}
