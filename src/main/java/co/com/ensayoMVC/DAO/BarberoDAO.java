package co.com.ensayoMVC.DAO;



import java.util.List;

import co.com.ensayoMVC.model.BarberoDTO;

public interface BarberoDAO {
	public BarberoDTO findBarberoById(String barberoCedula);
	public List<BarberoDTO> listBarberosPorLugar (int lugar);
	public List<BarberoDTO> listBarbero();
}
