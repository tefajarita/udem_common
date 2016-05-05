package co.com.ensayoMVC.DAO;

import co.com.ensayoMVC.model.ReservaDTO;

public interface ReservaDAO {

	public ReservaDTO findReservaById(int idReserva);
	public void insertReserva();
	
}
